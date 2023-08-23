package org.example.polimorfizm;

public class CultureDemo {
    public static void main(String[] args) {
        Artist beethoven = new Artist();
        Composer mozart = new Composer();
        Painter richer = new Painter();
        Artist someArtist = mozart;
        beethoven.createPieceOfArt();
        mozart.createPieceOfArt();
        richer.createPieceOfArt();
        someArtist.createPieceOfArt();
    }
}
