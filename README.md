#**Calendar Generator Program**

**Overview**

The Calendar Generator is a program that generates a calendar for any specified year. This program is written in Java and utilizes simple logic to compute and display the days of each month for the given year. The program is designed to be user-friendly and efficient, providing an accurate representation of the calendar layout.

**Features**

1. Generates the calendar for any year specified by the user.

2. Displays the full calendar with proper alignment of days (Sunday to Saturday).

3. Automatically accounts for leap years.

4. Handles month-specific day counts (28, 29, 30, or 31 days).

**How It Works**

1. Year Input: The user provides the year as input.

2. Leap Year Check: The program checks whether the year is a leap year using the following conditions:

3. A year is a leap year if it is divisible by 4 but not divisible by 100.

4. A year is also a leap year if it is divisible by 400.

5. Day Calculation: The program calculates the total number of days from the year 1900 (reference year) to the specified year. Using this, it determines the starting day of the year.

6. Month Loop: Iterates through all months, determining the number of days in each month based on the leap year status.

7. Calendar Display: Prints the calendar month-by-month, aligning days under the correct days of the week.

**How to Run**

1. Ensure you have Java installed on your system.

2. Compile the program using the following command:

javac Calendar.java

3. Run the program using:

java Calendar

4. Enter the year when prompted.

**Customization**

The program can be extended to include additional features, such as:

1. Highlighting holidays or special events.

2. Generating calendars for multiple years.

**Author**

This program is developed by VEDANG200814(Vedang Chakraborty) to provide an interactive and educational approach to understanding calendar generation and programming logic.
