package xyz.chromabeam.engine;

public interface Destroyable extends AutoCloseable {
    void destroy();

    @Override
    default void close() {
        destroy();
    }
}
