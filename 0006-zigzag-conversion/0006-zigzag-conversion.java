class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] builders = new StringBuilder[numRows];

        for(int i = 0, x=0, y=0; i < s.length(); i++) {
            StringBuilder builder = builders[y];
            if(builder == null)
                builder = new StringBuilder();
            builder.append(s.charAt(i));
            builders[y] = builder;
            if(y == numRows - 1 || x % (numRows-1) > 0) {
                if(y > 0)
                    y--;
                x++;
            } else
                y++;
        }

        StringBuilder zigstrbldr = new StringBuilder();
        for (StringBuilder builder : builders) {
            String val = builder != null ? builder.toString() : "";
            zigstrbldr.append(val);
        }
        return zigstrbldr.toString();
    }
}