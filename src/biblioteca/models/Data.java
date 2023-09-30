package biblioteca.models;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    private Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    private static int maxDias(int mes, int ano) {
        if (mes == 2) 
            return 28 + Boolean.compare(false, (ano % 4 == 0));
        
        return 30 + mes % 2;
    }

    public static Data newData(String data) {
        //verificando se data esta no formato "DD/MM/AAAA"
        String[] s = data.split("/");
        if (s.length != 3)
            return null;
        
        if (s[0].length() != 2 || !s[0].matches("[0-9]+"))
            return null;
            
        if (s[1].length() != 2 || !s[1].matches("[0-9]+"))
            return null;
        
        if (s[2].length() != 4 || !s[2].matches("[0-9]+"))
            return null;
        
        int d = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int a = Integer.parseInt(s[2]);

        if (m < 1 || m > 12)
            return null;
        
        int max = maxDias(m, a);
        if (d < 1 || d > max)
            return null;

        return new Data(d, m, a);
    }

    public void addDias(int dias) {
        int max = maxDias(mes, ano);

        while (dias > 0) {
            if (dias > max) {
                dias -= max - dia + 1;

                dia = 1;
                mes++;
                ano += Boolean.compare(false, (mes == 13));

                max = maxDias(mes, ano);
            }
            else {
                dia += dias;
            }
        }
    }

    public static Data newData(Data data, int dias) {
        Data temp = newData(data.toString());
        temp.addDias(dias);
        return temp;
    }
    
    /*
    * se data1 sucede data2 return 1
    * se forem iguais return 0
    * se data2 sucede data1 return -1
    */
    public static int compareDatas(Data data1, Data data2) {
        if (data1.ano == data2.ano) {
            if (data1.mes == data2.mes) 
                return data1.dia > data2.dia ? 1 : data1.dia == data2.dia ? 0 : -1;

            return data1.mes > data2.mes ? 1 : -1;
        }

        return data1.ano > data2.ano ? 1 : -1;
    }

    private static int toDias(Data data){
        int dias = 0;
        for (int i = 1; i < data.mes; i++) 
            dias += maxDias(i, data.ano);

        return dias + data.dia;
    }

    public static int diffDatas(Data data1, Data data2) {
        int dias1 = toDias(data1);
        int dias2 = toDias(data2);
        int com = compareDatas(data1, data2);

        switch (com) {
            case 1:
                return dias1 - dias2 + 365 + Boolean.compare(false, (data2.ano % 4 == 0));
        
            case -1:
                return dias2 - dias1 + 365 + Boolean.compare(false, (data1.ano % 4 == 0)); 
        }

        return 0;
    }

    @Override
    public String toString() {
        return (dia < 10 ? "0" : "") + dia + "/" + (mes < 10 ? "0" : "") + mes + "/" + ano;
    }
}
