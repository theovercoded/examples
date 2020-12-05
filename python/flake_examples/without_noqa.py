"""
This file contains several poorly-written statements to demonstrate the Flake8 inspection tool's output.
Expected Output:
    "46 equals 2 = False"
To run Flake8 code inspection, use the following command:
    $ flake8 without_noqa.py
  
The expected warnings are as such:
    flake_example.py:1:1: F401 'os' imported but unused
    flake_example.py:6:1: W293 blank line contains whitespace
    flake_example.py:7:1: E302 expected 2 blank lines, found 1
    flake_example.py:7:1: F811 redefinition of unused 'foo' from line 4
    flake_example.py:9:1: W293 blank line contains whitespace
    flake_example.py:10:1: E305 expected 2 blank lines after class or function definition, found 1
    flake_example.py:10:2: E225 missing whitespace around operator
    flake_example.py:12:33: W292 no newline at end of file
"""
import os


def foo():
    pass
    
def foo():
    pass
    
x=5

print("46 equals 2 = ", 46 == 2)
