package TugasPraktikumPemlan01;
    
public class Library {

    public String kategoriBuku;

    public String [][] teknologi;
    public String [][] filsafat;
    public String [][] sejarah;
    public String [][] agama;
    public String [][] psikologi;
    public String [][] politik;
    public String [][] fiksi;

    public library(){
        kategoriBuku = "";
        teknologi = new String[][]{ 
        {"The Art of Computer Programming", "Donald E. Knuth", "1968", "1088"},
        {"The Pragmatic Programmer", "Andrew Hunt, David Thomas", "1999", "352"},
        {"Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "2008", "464"},
        {"Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", "1994", "395"},
        {"You Don't Know JS", "Kyle Simpson", "2014", "400"}
        };
        filsafat = new String[][]{
        {"The Republic", "Plato", "380 BC", "712"},
        {"Meditations", "Marcus Aurelius", "185", "128"},
        {"The Critique of Pure Reason", "Immanuel Kant", "1781", "752"},
        {"Being and Nothingness", "Jean-Paul Sartre", "1943", "400"},
        {"The Alchemist", "Paulo Coelho", "1988", "167"}
        };
        sejarah = new String[][]{
        {"A People's History of the United States", "Howard Zinn", "1980", "728"},
        {"The Guns of August", "Barbara Tuchman", "1962", "464"},
        {"The Rise and Fall of the Third Reich", "William L. Shirer", "1960", "1024"},
        {"The Autobiography of Malcolm X", "Malcolm X, Alex Haley", "1965", "320"},
        {"The Diary of a Young Girl", "Anne Frank", "1952", "126"}
        };
        agama = new String[][]{
        {"The Bible", "Various Authors", "1611", "1544"},
        {"The Qur'an ", "Al-Zaid", "610", "604"},
        {"The Bhagavad Gita", "Krishna", "500 BC", "184"},
        {"The Book of Mormon", "Joseph Smith", "1830", "544"},
        {"The Tao Te Ching", "Lao Tzu", "3rd century BC", "81"}
        };
        psikologi = new String[][]{
        {"Thinking, Fast and Slow", "Daniel Kahneman", "2011", "416"},
        {"The Power of Now", "Eckhart Tolle", "1997", "256"},
        {"The Body Keeps the Score", "Bessel van der Kolk", "2014", "336"},
        {"Emotional Intelligence", "Daniel Goleman", "1995", "384"},
        {"The Art of Loving", "Erich Fromm", "1956", "256"}
        };
        politik = new String[][]{
        {"The Federalist Papers", "Alexander Hamilton, James Madison, John Jay", "1787", "400"},
        {"The Communist Manifesto", "Karl Marx, Friedrich Engels", "1848", "128"},
        {"The Prince", "Niccolò Machiavelli", "1532", "160"},
        {"The Art of War", "Sun Tzu", "500 BC", "144"},
        {"The Federalist", "Alexander Hamilton", "1787", "85"}
        };
        fiksi = new String[][]{
        {"To Kill a Mockingbird", "Harper Lee", "1960", "281"},
        {"1984", "George Orwell", "1949", "328"},
        {"The Great Gatsby", "F. Scott Fitzgerald", "1925", "180"},
        {"The Catcher in the Rye", "J.D. Salinger", "1951", "277"},
        {"The Lord of the Rings", "J.R.R. Tolkien", "1954", "1200"}
        };
    }
    public String [][] getKategori(int kategori){
        switch (kategori) {
            case 1:
                kategoriBuku = "Teknologi";
                return teknologi;
            case 2:
                kategoriBuku = "Filsafat";
                return filsafat;
            case 3:
                kategoriBuku = "Sejarah";
                return sejarah;
            case 4:
                kategoriBuku = "Agama";
                return agama;
            case 5:
                kategoriBuku = "Psikologi";
                return psikologi;
            case 6:
                kategoriBuku = "Politik";
                return politik;
            case 7:
                kategoriBuku = "Fiksi";
                return fiksi;
            case 8:

            default:
                return null;
        }
    }

    public void getBuku(int buku) {
        String [][] bukuKategori = getKategori(buku);
        System.out.println("\nBerikut adalah daftar buku dalam kategori " + kategoriBuku + ":\n");
        for (int i = 0; i < bukuKategori.length; i++) {
            System.out.printf("Judul \t\t\t :%s\n",bukuKategori[i][0]);
            System.out.printf("Penulis \t\t :%s\n",bukuKategori[i][1]);
            System.out.printf("Tahun terbit \t\t :%s\n",bukuKategori[i][2]);
            System.out.printf("Jumlah halaman \t\t :%s\n",bukuKategori[i][3]);
            System.out.println("_______________________________________________________");
        }
    }

    public void tampilkanSemua() {
        for (int i = 1; i <= 7; i++) {
            getBuku(i);
        }
    }
}
