import java.util.Scanner;

public class Compounds {
    private String[] ionic;
    private String[] ionicAnswers;
    private String[] molecular;
    private String[] molecularAnswers;
    private String[] specialMolecular;
    private String[] specialMolecularAnswers;

    public Compounds() {
        ionic = new String[]{"NaCl", "KBr", "CaI2", "CsF", "LiCL", "KC2H3O2", "NaHCO3", "(NH4)Cl", "CaSO4", "Na2O", "CdS", "Mg3N2", "Ca3P2", "Al4C3", "FeCl3", "Hg2O", "HgO", "GaN", "CrCl3", "Fe2S3"};
        ionicAnswers = new String[]{"sodium chloride", "potassium bromide", "calcium iodide", "cesium flouride", "lithium chloride", "potassium acetate", "sodium bicarbonate", "ammonium chloride", "calcium sulfate", "sodium oxide", "cadmium sulfide", "magnesium nitride", "calcium phosphide", "aluminum carbide", "iron(III) oxide", "mercury(I) oxide", "mercury(II) oxide", "iron(III) sulfide", "chromium(III) chloride", "gallium(III) nitride"};
        molecular = new String[]{"SO2", "SO3", "NO2", "N2O4", "N2O5", "BCl3", "SF6", "PF5", "P4O10", "IF7"};
        molecularAnswers = new String[]{"sulfur dioxide", "sulfur trioxide", "nitrogen dioxide", "dinitrogen tetroxide", "dinitrogen pentoxide", "boron trichloride", "sulfur hexaflouride", "phosphorus pentaflouride", "tetraphosphorus decaoxide", "iodine heptaflouride"};
        specialMolecular = new String[]{"H2O", "C8H18", "H2O2", "C2H5OH", "NH3", "C12H22O11", "CH4", "C6H12O6"};
        specialMolecularAnswers = new String[]{"water", "octane", "hydrogen peroxide", "ethanol", "ammonia", "sucrose", "methane", "glucose"};
    }

    public void options() {
        String rules[] = {"Ionic", "Molecular", "Special Molecular"};
        Scanner in = new Scanner(System.in);

        System.out.println("+---------------+------------------------------+");
        System.out.printf("|%-15s|%-30s|\n", "Number", "Practice");
        for (int i = 0; i < 3; i++) {
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
            if (choice.equals("1") || choice.equalsIgnoreCase("ionic")) {
                random = (int) (Math.random() * ionic.length);
                System.out.println(ionic[random]);
                answer = in.nextLine();
                
                if (ionicAnswers[random].equalsIgnoreCase(answer)){
                    System.out.println("correct");
                } else if (answer.equalsIgnoreCase("exit")) {
                    isDone = true;
                } else {
                    System.out.println("incorrect");
                    System.out.println(ionicAnswers[random]);
                }
            } else if (choice.equals("2") || choice.equalsIgnoreCase("molecular")) {
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
            } else if (choice.equals("3") || choice.equalsIgnoreCase("special Molecular")) {
                random = (int) (Math.random() * specialMolecular.length);
                System.out.println(specialMolecular[random]);
                answer = in.nextLine();

                if (specialMolecularAnswers[random].equalsIgnoreCase(answer)){
                    System.out.println("correct");
                } else if (answer.equalsIgnoreCase("exit")) {
                    isDone = true;
                } else {
                    System.out.println("incorrect");
                    System.out.println(specialMolecularAnswers[random]);
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
