import java.util.Scanner;

public class Instructions {
    private String[] molecularRules;
    private String[] ionicRules;
    private String[] specialMolecularElements;
    private String[] specialMolecularCompounds;
    private String[] greekNumericalPrefixes;
    private String[] polyatomicIons;

    public Instructions() {
        molecularRules = new String[]{"Monatomic Molecular Compounds - Named the same as the element", "Binary Molecular Compounds - first element: greek numerical prefix (if prefix is mono then do not include the mono) + element name, second element: greek numerical prefix + element stem + suffix \"-ide\""};
        ionicRules = new String[]{"Monatomic Cation - element name + ion", "Monatomic Anion - element stem + suffix \"-ide\"", "Multivalent Atoms - STOCK SYSTEM: element name + (roman numeral) + ion", "Compounds - cation name + anion name", "Compounds with Multivalent Cations - element name + (roman numeral) + anion"};
        specialMolecularElements = new String[]{"I2 - iodine", "Br2 - bromine", "Cl2 - chlorine", "F2 - flourine", "O2 - oxygen", "N2 - nitrogen", "H2 - hydrogen", "P4 - phosphorus", "S8 - sulfur"};
        specialMolecularCompounds = new String[]{"H2O - water", "C8H18 - octane", "H2O2 - hydrogen peroxide", "C2H5OH - ethanol", "NH3 - ammonia", "C12H22O11 - sucrose", "CH4 - methane", "C6H12O6 - glucose"};
        greekNumericalPrefixes =  new String[]{"mono", "di", "tri", "tetra", "penta", "hexa", "hepta", "octa", "nona", "deca"};
        polyatomicIons =  new String[]{"C2H3O2-1 - acetate", "ClO3-1 - chlorate", "ClO2-1 - chlorite", "CN - cyanide", "H2PO4-1 - dihydrogen phosphate", "HCO3-1 - hydrogen carbonate (bicarbonate)", "HSO4-1 - hydrogen sulfate (bisulfate)", "HS-1 - hydrogren sulfide (bisulfide)", "HSO3-1 - hydrogen sulfite (bisulfite)", "ClO-1, OCl-1 - hypochlorite", "OH-1 - hydroxide", "NO2-1 - nitrite", "NO3-1 - nitrate", "ClO4-1 - perchlorate", "MnO4-1 - permanganate", "SCN-1 - thiocyanate", "CO3-2 - carbonate", "CrO4-2 - chromate", "Cr2O7-2 - dichromate", "HPO4-2 - hydrogen phosphate", "C2O4-2 - oxalate", "O2-2 - peroxide", "SiO3-2 - silicate", "SO4-2 - sulfate", "SO3-2 - sulfite", "S2O3-2 - thiosulfate","BO3-3 - borate", "PO4-3 - phosphate", "P3O10-5 - tripolyphosphate", "NH4+1 - ammonium", "H3O+1 = hydronium", "Hg2+2 - mercury(I)"};
    }

    public void options() {
        String rules[] = {"Molecular Rules", "Ionic Rules", "Special Molecular Elements", "Special Molecular Compounds", "Greek Numerical Prefixes", "Polyatmoic Ions"};
        Scanner in = new Scanner(System.in);

        System.out.println("+---------------+------------------------------+");
        System.out.printf("|%-15s|%-30s|\n", "Number", "Rule");
        for (int i = 0; i < 6; i++) {
            String s1 = "" + (i+1);
            String s2 = "" + rules[i];

            System.out.println("+---------------+------------------------------+");
            System.out.printf("|%-15s|%-30s|\n", s1, s2);
        }
        System.out.println("+---------------+------------------------------+");

        System.out.println("which rule would you like to view");
        String choice = in.nextLine();
        displayInstructions(choice);
    }

    public void displayInstructions(String choice) {
        if (choice.equals("1") || choice.equalsIgnoreCase("molecular Rules")) {
            for (String el : molecularRules) {
                System.out.println(el);
            }
        } else if (choice.equals("2") || choice.equalsIgnoreCase("ionic Rules")) {
            for (String el : ionicRules) {
                System.out.println(el);
            }
        } else if (choice.equals("3") || choice.equalsIgnoreCase("molecular Elements")) {
            for (String el : specialMolecularElements) {
                System.out.println(el);
            }
        } else if (choice.equals("4") || choice.equalsIgnoreCase("special Molecular Compounds")) {
            for (String el : specialMolecularCompounds) {
                System.out.println(el);
            }
        } else if (choice.equals("5") || choice.equalsIgnoreCase("greek Numerical Prefixes")) {
            for (String el : greekNumericalPrefixes) {
                System.out.println(el);
            }
        } else if (choice.equals("6") || choice.equalsIgnoreCase("polyatomic Ions")) {
            for (String el : polyatomicIons) {
                System.out.println(el);
            }
        } else {
            System.out.println("invalid input, type either the number or the name of the instructions you want to view");
            options();
        }
    }
}
