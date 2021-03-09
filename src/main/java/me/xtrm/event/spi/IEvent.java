package me.xtrm.event.spi;

/**
 * Base interface for any event fired trough the eventbus
 * @author xTrM_
 */
public interface IEvent {

    /** Call the event on the main eventbus */
    void call();

    /**
     * @return if the event is cancelled
     */
    boolean isCancelled();

    /**
     * @param cancelled
     * 		if the event is cancelled
     */
    void setCancelled(boolean cancelled);

    /**
     * @return if the event is cancellable
     */
    default boolean isCancellable() {
        return getClass().getDeclaredAnnotation(Cancellable.class) != null;
    }

}