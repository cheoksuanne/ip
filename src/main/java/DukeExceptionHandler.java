public class DukeExceptionHandler {

    public static String handleException(String text) {
        if (text.equals("todo") || text.equals("deadline") || text.equals("event")) {
            NoDescriptionException error = new NoDescriptionException(text);
            return error.toString();

        } else if (!text.contains("todo") || !text.contains("deadline") || !text.contains("event")
            || !text.contains("done")) {
            InvalidInputException error = new InvalidInputException(text);
            return error.toString();
        }

        return null;
    }
}
