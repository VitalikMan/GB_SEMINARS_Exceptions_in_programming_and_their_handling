package Seminar3;

import java.io.IOException;

public class Counter implements AutoCloseable {

    private int count;
    private boolean isClosed;

    public boolean isClosed () {
        return isClosed;
    }

    public int getCount() {
        return count;
    }
    public void add() throws IOException {
        if (isClosed()) {
            throw new IOException("Ресурс уже закрыт");
        }
        count++;
    }
    public void setClosed(boolean closed) {
        isClosed = closed;
    }
    @Override
    public void close() {
        setClosed(true);
    }

}
