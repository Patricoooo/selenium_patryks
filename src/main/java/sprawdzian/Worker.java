package sprawdzian;

import java.util.ArrayList;

public class Worker {

    public static void main(String[] args) {
        Tool tool = new Tool("Mlotek");
        tool.useTool();

        java.util.List<Tool> narzedzia = new ArrayList<>();
        narzedzia.add(new Tool("Srubokret"));
        narzedzia.add(new Tool("pila"));
        narzedzia.add(new Tool( "wiertara"));
        narzedzia.add(new Tool("Nozyce"));
        narzedzia.add(new Tool( "kombinerki"));

       for (Tool t: narzedzia){
           t.useTool();
    }

}
}

