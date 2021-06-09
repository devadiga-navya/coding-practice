#
# We want to make a row of bricks that is goal inches long. 
# We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
# Return true if it is possible to make the goal by choosing from the given bricks.
# This is a little harder than it looks and can be done without any loops.
# makeBricks(3, 1, 8) → true
# makeBricks(3, 1, 9) → false
# makeBricks(3, 2, 10) → true
#
def make_bricks(small, big, goal):
  # for checking how much small bricks we needed we use (goal%5)
    if small<(goal%5) or (small+big*5)<goal:
       return False
    else:
       return True
