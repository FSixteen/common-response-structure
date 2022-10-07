package io.github.fsixteen.common.structure.exceptions;

/**
 * 数据读取异常.<br>
 * 
 * @author FSixteen
 * @since V1.0.0
 */
public class ReadPropertiesException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new runtime exception with the specified detail message and
     * cause.
     * <p>
     * Note that the detail message associated with
     * {@code cause} is <i>not</i> automatically incorporated in
     * this runtime exception's detail message.
     * </p>
     *
     * @param message the detail message.
     * @param cause   the cause.
     * @see java.lang.RuntimeException#RuntimeException(String, Throwable)
     */
    public ReadPropertiesException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message.
     * @see java.lang.RuntimeException#RuntimeException(String)
     */
    public ReadPropertiesException(String message) {
        super(message);
    }

    /**
     * Constructs a new runtime exception with the specified cause and a
     * detail message of <code>(cause==null ? null : cause.toString())</code>
     * (which typically contains the class and detail message of
     * <code>cause</code>). This constructor is useful for runtime exceptions
     * that are little more than wrappers for other throwables.
     *
     * @param cause the cause.
     * @see java.lang.RuntimeException#RuntimeException(Throwable)
     */
    public ReadPropertiesException(Throwable cause) {
        super(cause);
    }

}
