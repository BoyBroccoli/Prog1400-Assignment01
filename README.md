# Prog1400-Assignment01
#Prog1400 OOP Assignment01

## Program – Fantasy Hockey
You have been asked to write a Java console application to track and gather statistics for a fantasy hockey league.
The application requirements are as follows:
 The league has 3 teams with 3 players per team.
 The user will be presented with a set of data entry options for 3 teams of 3 players (see console output
below)
o For teams, gather the team name
o For players, gather the player name, number of goals and number of assists
o Validation: Names must be at least 3 characters long. Numbers must be zero or greater.
##  After gathering all the data, you will generate 2 reports (See example below):
o A team stats report that displays the following:
 Total goals and assists for the team.
 Team Budget and Rating based on number of assists and goals.
o A team will be given a random budget when created. The budget must be between zero and
$100000. The report must output the budget dollar amount to 2 decimal places.
o The team rating is calculated using the following formula:
 3 stars (***) – the total goals and assists is greater than 20
 2 stars (**) – the total goals and assists is greater than or equal to 10
 1 star (*) – the total goals and assists is greater than zero
 0 stars – the total goals and assists is zero
o The Stats per player report will report the player team name, their name, the player number of
goals, assists and the total (see below).
##  Program Organization: Make 3 Java classes: A Team class, A Player class and a Main class that launches
the application, gathers input and displays output. Team and Player should have appropriate properties
for their types. These classes should also have appropriate methods like outputPlayerDetails() etc.
Examples and Testing
In the section below, you will be presented with console output of a successful execution of a sample solution to
the program, which should help demonstrate how your input/output on the program should work. In addition to
the sample values used in the screenshot(s), there should be validation on all inputs. You can expect your
instructor to grade your assignment by trying different values than below. In other words, you should thoroughly
test your code before submitting!
## Sample Output - Make sure your program can output data exactly as shown below. Bold Text is for user entry.
FANTASY HOCKEY APPLICATION
TEAM ENTRY
================================
Enter name for team # 1:
Ron's Top Picks
Enter name for team # 2:
Best Team Around
Enter name for team # 3:
My Random Picks
## PLAYER ENTRY
================================
Enter players for Ron's Top Picks:
Enter name for player # 1:
Jane Smith
Enter number of goals for Jane Smith:
5
Enter number of assists for Jane Smith:
2
Enter name for player # 2:
...
## REPORT: Stats per Team
================================
Ron's Top Picks: G - 66 A - 63 Total - 129 Budget -
$69596.13
Rating: *** stars
Best Team Around:G - 2 A - 3 Total - 5 Budget -
$26706.63
Rating: ** stars
My Random Picks: G - 13 A - 13 Total - 26 Budget
- $50519.41
Rating: *** stars
## REPORT: Stats per Player
================================
Ron's Top Picks
Jane Smith: G - 10 A - 5 Total - 15
Ron's Top Picks
Jack Jones: G - 30 A - 10 Total - 40
Ron's Top Picks
Tim Hockey: G - 16 A - 18 Total - 34
Ron's Top Picks
Mike Sears: G - 10 A - 30 Total - 40
Best Team Around
Jacob Jackson: G - 1 A – 0 Total - 1
Best Team Around
Mahalia Roberts: G – 0 A - 2 Total - 2
Best Team Around
Sally Sampson: G - 1 A – 1 Total - 2
Best Team Around
Seigfried Smith: G - 0 A - 0 Total - 0
My Random Picks
Joe Murphy: G - 5 A - 3 Total - 8
My Random Picks
Ivor Callaly: G – 3 A - 7 Total - 10
My Random Picks
Rory Kirby: G - 1 A - 1 Total - 2
My Random Picks
Sheila Moriarty: G - 4 A - 2 Total - 6
