    
    package Random;

    import java.io.BufferedReader;
    import java.io.File;
    import java.io.FileOutputStream;
    import java.io.FileReader;
    import java.io.IOException;
    import java.io.PrintWriter;
    import java.util.Scanner;
    
    public class Voting {
        public static int i = 1;
    
        @SuppressWarnings("resource")
        public static void main(String[] args) throws IOException {
            while (true) {
                System.out.println("\nVoter Settings:" + "\n1.Add a new voter" + "\n2.List of all the voters"
                        + "\n3.Find a voter by their name" + "\n4.Get info about a specific voter" + "\n5.Exit");
                Scanner s = new Scanner(System.in);
                int choice = s.nextInt();
                switch (choice) {
                case 1:
                    voter.NID();
                    System.out.print("\n");
                    voter.Name();
                    System.out.print("\n");
                    voter.FandHName();
                    System.out.print("\n");
                    voter.Age();
                    System.out.print("\n");
                    voter.Address();
                    System.out.print("\n");
                    voter.Province();
                    System.out.print("\n");
                    voter.file();
                    i++;
                    break;
                case 2:
                    voter.display();
                    break;
                case 3:
                    voter.FBN();
                    break;
                case 4:
                    voter.FBID();
                    break;
                case 5:
                    System.out.println("Exiting the program");
                    System.exit(0);
                    break;
                }
            }
        }
    }
    
    class voter {
        static String n;
        static String fh;
        static int a;
        static String ad;
        static String p;
    
        public static void NID() {
            System.out.println("Your ID: " + Voting.i);
        }
    
        @SuppressWarnings("resource")
        public static void Name() {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your name: ");
            n = s.nextLine();
            System.out.println("Your name: " + n);
        }
    
        @SuppressWarnings("resource")
        public static void FandHName() {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your Father's or Husband's name: ");
            fh = s.nextLine();
            System.out.println("Their name: " + fh);
        }
    
        @SuppressWarnings("resource")
        public static void Age() {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your Age: ");
            a = s.nextInt();
            System.out.println("Your age: " + a);
        }
    
        @SuppressWarnings("resource")
        public static void Address() {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your Address: ");
            ad = s.nextLine();
            System.out.println("Your address: " + ad);
        }
    
        @SuppressWarnings("resource")
        public static void Province() {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your Province: ");
            p = s.nextLine();
            System.out.println("Your province: " + p);
        }
    
        public static void file() {
            try {
                File f = new File("VoterDB.txt");
                PrintWriter pw = new PrintWriter(new FileOutputStream(f, true));
                pw.append(Voting.i + "," + n + "," + fh + "," + a + "," + ad + "," + p + "\n");
                pw.close();
            } catch (Exception e) {
            }
        }
    
        @SuppressWarnings("resource")
        public static void display() {
            try {
                BufferedReader br = new BufferedReader(new FileReader("VoterDB.txt"));
                String s = "";
                while ((s = br.readLine()) != null) {
                    String data[] = new String[6];
                    data = s.split(",");
                    for (int j = 0; j < 6; j++) {
                        System.out.print(data[j] + " ");
                    }
                    System.out.println();
                }
            } catch (Exception e) {
            }
        }
    
        @SuppressWarnings("resource")
        public static void FBN() throws IOException {
            File in = new File("VoterDB.txt");
            FileReader fr = null;
            Scanner n = new Scanner(System.in);
            String name, str;
            System.out.print("\nEnter the name you're seartching for: ");
            name = n.nextLine();
            System.out.print("\n");
            try {
                fr = new FileReader(in);
                BufferedReader br = new BufferedReader(fr);
                while ((str = br.readLine()) != null) {
                    if (str.contains(name)) {
                        System.out.print(str + "\n");
                    }
                }
            } catch (Exception e) {
            } finally {
                fr.close();
            }
        }
    
        @SuppressWarnings("resource")
        public static void FBID() throws IOException {
            File in = new File("VoterDB.txt");
            FileReader fr = null;
            Scanner n = new Scanner(System.in);
            String id, str;
            System.out.print("\nEnter the ID of the voter you're seartching for: ");
            id = n.nextLine();
            System.out.print("\n");
            try {
                fr = new FileReader(in);
                BufferedReader br = new BufferedReader(fr);
                while ((str = br.readLine()) != null) {
                    if (str.contains(id)) {
                        System.out.print(str + "\n");
                    }
                }
            } catch (Exception e) {
            } finally {
                fr.close();
            }
        }
    } 

