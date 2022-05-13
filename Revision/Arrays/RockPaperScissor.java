import java.util.Random;

public class RockPaperScissor {

    int noOfRounds;
    String playerOneName;
    String playerTwoName;

    public RockPaperScissor(int noOfRounds, String playerOneName, String playerTwoName) {
        this.noOfRounds = noOfRounds;
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
    }

    public void RandomAutoRockPaperScissorGame() {
        Thread t = Thread.currentThread();

        System.out.println("Current thread" + t);
        System.out.println("Current thread name" + t.getName());

        t.setName("Sagar's Thread");
        System.out.println("Current thread" + t);
        System.out.println("Current thread name" + t.getName());
        String[] rockPaperScissor = { "Rock", "Paper", "Scissor" };
        Random random = new Random();
        int playerOneWins = 0;
        int playerTwoWins = 0;
        try {
            for (int i = 0; i < noOfRounds; i++) {
                System.out.println("--------------------------");
                System.out.println("Starting new game!!!");
                System.out.println("--------------------------");
                int randomIndex = random.nextInt(rockPaperScissor.length);
                String firstInput = rockPaperScissor[randomIndex];
                System.out.println(playerOneName + ": " + firstInput);
                Thread.sleep(2000);
                randomIndex = random.nextInt(rockPaperScissor.length);
                String secondInput = rockPaperScissor[randomIndex];
                System.out.println(playerTwoName + ": " + secondInput);
                Thread.sleep(1000);
                String output = "";
                if (firstInput.equals("Rock")) {
                    if (secondInput.equals("Scissor")) {
                        output = playerOneName + " wins!!!";
                        playerOneWins++;
                    } else if (secondInput.equals("Rock")) {
                        output = "It's a draw!!!";
                    } else {
                        output = playerTwoName + " wins!!!";
                        playerTwoWins++;
                    }
                }

                else if (firstInput.equals("Paper")) {
                    if (secondInput.equals("Rock")) {
                        output = playerOneName + " wins!!!";
                        playerOneWins++;
                    } else if (secondInput.equals("Paper")) {
                        output = "It's a draw!!!";
                    } else {
                        output = playerTwoName + " wins!!!";
                        playerTwoWins++;
                    }

                } else if (firstInput.equals("Scissor")) {
                    if (secondInput.equals("Paper")) {
                        output = playerOneName + " wins!!!";
                        playerOneWins++;
                    } else if (secondInput.equals("Scissor")) {
                        output = "It's a draw!!!";
                    } else {
                        output = playerTwoName + " wins!!!";
                        playerTwoWins++;
                    }

                }
                System.out.println();
                System.out.println(output);
                System.out.println();

                Thread.sleep(2000);
            }

            System.out.println("--------------------------");
            System.out.println("Final Score!");
            System.out.println(playerOneName + " vs " + playerTwoName);
            System.out.println(playerOneWins + "    :    " + playerTwoWins);

        } catch (Exception e) {
            System.out.println("main thread interrupted");
        }
    }
}
