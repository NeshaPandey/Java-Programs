public class EnumExample{
    public enum players
    {
        p1("Sachin",100),
        p2("Virat",85),
        p3("Dhoni",105),
        p4("Rohit",265);
        private final String name;
        private final int runs;
        players(String name,int runs)
        {
            this.name=name;
            this.runs= runs;
        }
        public int RunScored()
        {
            return runs;
        }
    }
    public static void main(String[] args)
    {
        for(players P:players.values())
        {
            System.out.println(P.name+" Scored "+P.runs);
        }
    }
}
