#include <iostream>
#include "point.h"
#include "line.h"

using namespace std;

int main()
{
    Line line(1,1,2,2);
    Line line2 = line;
    line2.SetLine(6,6,8,8);
    line.print();
    line2.print();

    return 0;
}