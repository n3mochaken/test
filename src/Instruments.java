public class Instruments {
    private String[] musicalInstruments = {"clarinet", "drums", "flute", "guitar", "piano", "saxophone", "trumpet", "violin"};

    public String getMusicalInstruments() {
        int x = (int) (Math.random() * 8);
        return musicalInstruments[x];
    }
}
