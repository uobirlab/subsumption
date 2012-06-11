package barc.subsumption;

/**
 * The interface a behavior must implement.
 *
 * @author Jeremiah Via <jxv911@cs.bham.ac.uk>
 */
public interface Behavior extends Runnable {
    /**
     * A check to determine if the behavior can run.
     *
     * @return true if the behavior can run
     */
    public boolean canRun();

    /** Stop the behavior. */
    public void stop();

}
