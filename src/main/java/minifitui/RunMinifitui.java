package main.java.minifitui;

import minifi.tui.framework.TApplication;

public class RunMinifitui {

    /**
     * Main entry point.
     *
     * @param args Command line arguments
     */
    public static void main(final String [] args) {
        try {
            /*
               Swing is the default backend on Windows unless explicitly
               overridden by jexer.Swing.
             */
            TApplication.BackendType backendType = TApplication.BackendType.XTERM;
            if (System.getProperty("os.name").startsWith("Windows")) {
                backendType = TApplication.BackendType.SWING;
            }
            if (System.getProperty("os.name").startsWith("Mac")) {
                backendType = TApplication.BackendType.SWING;
            }
            if (System.getProperty("jexer.Swing") != null) {
                if (System.getProperty("jexer.Swing", "false").equals("true")) {
                    backendType = TApplication.BackendType.SWING;
                } else {
                    backendType = TApplication.BackendType.XTERM;
                }
            }

            MinifituiApp app = new MinifituiApp(backendType);

            (new Thread(app)).start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
