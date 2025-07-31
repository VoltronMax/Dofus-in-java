package Models;

public enum Servidores {

    TALKASHA("talkasha"), DRACONIROS("draconiros");


    private String server;

    Servidores(String server) {
        this.server = server;
    }

    public String getServer() {
        return server;
    }

    @Override
    public String toString() {
        return getServer();
    }
}
