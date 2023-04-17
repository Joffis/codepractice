#include <iostream>
#include "point.h"
#include "line.h"

using namespace std;

int main()
{
    Point* a1 = new Point(1,2);
    Point* a2 = new Point(4,5);
    
    Line* line = new Line(a1,a2);
    line->print();
    delete line;

    return 0;
}