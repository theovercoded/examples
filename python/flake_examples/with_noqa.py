"""
This file contains poorly-written code intended to generate Pep8 warnings when used with the 
Flake8 code inspection tool. This file also contains use of the # noaq directive to show
examples of how warnings can suppressed for specific lines. This code should result in the
following 5 warnings:

    with_noqa.py:6:1: W293 blank line contains whitespace
    with_noqa.py:9:1: W293 blank line contains whitespace
    with_noqa.py:10:1: E305 expected 2 blank lines after class or function definition, found 1
    with_noqa.py:10:4: E261 at least two spaces before inline comment
    with_noqa.py:12:33: W292 no newline at end of file

"""
import os   # noqa: F401 used for comfort only


def foo():
    pass
    
def foo():  # noqa
    pass
    
x=5 # noqa: E225

print("46 equals 2 = ", 46 == 2)
