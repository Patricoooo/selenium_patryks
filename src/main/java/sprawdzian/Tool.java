package sprawdzian;

import java.lang.reflect.Constructor;

public class Tool {
    String toolType;

    public Tool(String toolType) {
        this.toolType = toolType;
    }

    public void useTool() {
        System.out.println(toolType);


    }

}




