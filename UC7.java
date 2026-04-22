public class UC7 {


    static class CharacterPattern {
        private char character;
        private String[] pattern;


        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }


        public char getCharacter() {
            return character;
        }


        public String[] getPattern() {
            return pattern;
        }
    }


    public static String[] getOPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }


    public static String[] getPPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }


    public static String[] getSPattern() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }

    public static void main(String[] args) {


        CharacterPattern[] patterns = {
                new CharacterPattern('O', getOPattern()),
                new CharacterPattern('P', getPPattern()),
                new CharacterPattern('S', getSPattern())
        };


        char[] word = {'O', 'O', 'P', 'S'};

        
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word) {
                for (CharacterPattern cp : patterns) {
                    if (cp.getCharacter() == ch) {
                        line.append(cp.getPattern()[i]).append("   ");
                    }
                }
            }

            System.out.println(line);
        }
    }
}