import java.util.Scanner;

public class Elements {
    private String[] cation;
    private String[] cationAnswers;
    private String[] anion;
    private String[] anionAnswers;
    private String[] molecular;
    private String[] molecularAnswers;
    private String[] specialMolecularElements;
    private String[] specialMolecularElementsAnswers;

    public Elements() {
        cation = new String[]{"H+1", "Li+1", "Na+1", "K+1", "Rb+1", "Cs+1", "Be+2", "Mg+2", "Ca+2", "Sr+2", "Fe+3", "Fe+2", "Cu+2", "Cu+1", "Cr+3"};
        cationAnswers = new String[]{"hydrogen ion", "lithium ion", "sodium ion", "potassium ion", "rubidium ion", "cesium ion", "beryllium ion", "magnesium ion", "calcium ion", "strontium ion", "iron(III) ion", "iron(II) ion", "copper(II) ion", "copper(I) ion", "chromium(III) ion"};
        anion = new String[]{"F", "Cl-1", "Br-1", "I-1", "O-2", "S-2", "Se-2", "Te-2", "N-3", "P-3"};
        anionAnswers = new String[]{"flouride", "chloride", "bromide", "iodide", "oxide", "sulfide", "selenide", "telluride", "nitride", "phophide"};
        molecular = new String[]{"He", "Ne", "Ar", "Kr", "Xe"};
        molecularAnswers = new String[]{"helium", "neon", "argon", "krypton", "xenon"};
        specialMolecularElements = new String[]{"I2", "Br2", "Cl2", "F2", "O2", "N2", "H2", "P4", "S8"};
        specialMolecularElementsAnswers = new String[]{"iodine", "bromine", "chlorine", "flourine", "oxygen", "nitrogen", "hydrogen", "phosphorus", "sulfur"};
    }

    public void options() {
        String rules[] = {"Cation", "Anion", "Molecular", "Special Molecular Elements"};
        Scanner in = new Scanner(System.in);

        System.out.println("+---------------+------------------------------+");
        System.out.printf("|%-15s|%-30s|\n", "Number", "Practice");
        for (int i = 0; i < 4; i++) {
            String s1 = "" + (i+1);
            String s2 = "" + rules[i];

            System.out.println("+---------------+------------------------------+");
            System.out.printf("|%-15s|%-30s|\n", s1, s2);
        }
        System.out.println("+---------------+------------------------------+");

        practice();

        in.close();
    }

    public void practice() {
        Scanner in = new Scanner(System.in);
        boolean isDone = false;

        int random;
        String answer;
        String choice = in.nextLine();

        System.out.println("to exit type \"exit\"");

        while (!isDone) {
            if (choice.equals("1") || choice.equalsIgnoreCase("cation")) {
                random = (int) (Math.random() * cation.length);
                System.out.println(cation[random]);
                answer = in.nextLine();

                if (cationAnswers[random].equalsIgnoreCase(answer)){
                    System.out.println("correct");
                } else if (answer.equalsIgnoreCase("exit")) {
                    isDone = true;
                } else {
                    System.out.println("incorrect");
                    System.out.println(cationAnswers[random]);
                }
            } else if (choice.equals("2") || choice.equalsIgnoreCase("anion")) {
                random = (int) (Math.random() * anion.length);
                System.out.println(anion[random]);
                answer = in.nextLine();

                if (anionAnswers[random].equalsIgnoreCase(answer)){
                    System.out.println("correct");
                } else if (answer.equalsIgnoreCase("exit")) {
                    isDone = true;
                } else {
                    System.out.println("incorrect");
                    System.out.println(anionAnswers[random]);
                }
            } else if (choice.equals("3") || choice.equalsIgnoreCase("molecular")) {
                random = (int) (Math.random() * molecular.length);
                System.out.println(molecular[random]);
                answer = in.nextLine();

                if (molecularAnswers[random].equalsIgnoreCase(answer)){
                    System.out.println("correct");
                } else if (answer.equalsIgnoreCase("exit")) {
                    isDone = true;
                } else {
                    System.out.println("incorrect");
                    System.out.println(molecularAnswers[random]);
                }
            } else if (choice.equals("4") || choice.equalsIgnoreCase("special molecular elements")) {
                random = (int) (Math.random() * specialMolecularElements.length);
                System.out.println(specialMolecularElements[random]);
                answer = in.nextLine();

                if (specialMolecularElementsAnswers[random].equalsIgnoreCase(answer)){
                    System.out.println("correct");
                } else if (answer.equalsIgnoreCase("exit")) {
                    isDone = true;
                } else {
                    System.out.println("incorrect");
                    System.out.println(specialMolecularElementsAnswers[random]);
                }
            } else {
                System.out.println("invalid input, type a valid practice test");
                options();
            }
        }

        System.exit(0);
        in.close();
    }

}
