package main.java.minifitui;

import minifi.tui.framework.TApplication;
import minifi.tui.framework.demos.DemoApplication;
import minifi.tui.framework.menu.TMenu;
import minifi.tui.framework.menu.TMenuItem;

import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;

class MinifituiApp extends TApplication {

    private static final ResourceBundle i18n = ResourceBundle.getBundle(DemoApplication.class.getName());
    /**
     * Public constructor.
     *
     * @param backendType  Backend that is already ready to go.
     */
    public MinifituiApp(final BackendType backendType) throws UnsupportedEncodingException {
        super(backendType);

        // Add the menus
        TMenu hamburguerMenu = addToolMenu();
        TMenuItem item = hamburguerMenu.addItem(2002, i18n.getString("normal"));
        hamburguerMenu.addSeparator();
        hamburguerMenu.addDefaultItem(TMenu.MID_EXIT);

    }

}
