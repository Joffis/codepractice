#include <iostream>
#include "point.h"

using namespace std;

int main()
{
    int x;
    int y;
    cout << "Enter X: ";
    cin >> x;

    cout << "Enter Y: ";
    cin >> y;

    Point* a = new Point(x,y);
    a->printXY();

    delete a;

    return 0;
}