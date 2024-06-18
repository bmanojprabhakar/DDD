package java.com.ddd.bootcamp.domain;

public interface Entity<T> {
    boolean hasSameEntityAs(T obj);
}
