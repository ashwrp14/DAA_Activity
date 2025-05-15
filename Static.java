
static Scanner scanner; 
static boolean flag; 
static int B, H;

static {
    scanner = new Scanner(System.in);
    B = scanner.nextInt();
    H = scanner.nextInt();

    // Check if both B and H are positive
    flag = B > 0 && H > 0;

    if (!flag) {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        System.exit(0); // Terminate the program if either is non-positive
    }
}
//Write your code here

