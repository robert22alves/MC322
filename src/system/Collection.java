package system;

import dStructure_pack.Hash_AVLtree;
import multimedia_pack.Audio_CD;
import multimedia_pack.E_Book;
import multimedia_pack.P_Book;
import multimedia_pack.Video_DVD;

public class Collection {
    private Hash_AVLtree<P_Book> books;
    private Hash_AVLtree<E_Book> ebooks;
    private Hash_AVLtree<Video_DVD> dvds;
    private Hash_AVLtree<Audio_CD> cds;

    public Collection() {
        this.books = new Hash_AVLtree<>(13);
        this.ebooks = new Hash_AVLtree<>(13);
        this.dvds = new Hash_AVLtree<>(13);
        this.cds = new Hash_AVLtree<>(13);
    }

    public void addBook(P_Book book) {
        books.addData(book);
    }

    public void addEbooks(E_Book ebook) {
        ebooks.addData(ebook);
    }

    public void addDVD(Video_DVD dvd) {
        dvds.addData(dvd);
    }

    public void addCD(Audio_CD cd) {
        cds.addData(cd);
    }

    public P_Book returnBook(String title) {
        return books.getData(title);
    }

    public E_Book returnEbook(String title) {
        return ebooks.getData(title);
    }

    public Video_DVD returnDVD(String title) {
        return dvds.getData(title);
    }

    public Audio_CD returnCD(String title) {
        return cds.getData(title);
    }
}
