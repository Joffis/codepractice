#include "point.h"
#include <iostream>

using namespace std;

Point::Point(): x_(0), y_(0)
{
    cout << "Point luotu " << this << endl;
}

Point::Point(int x, int y): x_(x), y_(y)
{
    cout << "Point luotu " << this << endl;
}

Point::~Point()
{
    cout << "Point vapautettu " << this << endl;
}

void Point::SetX(int x)
{
    x_ = x;
}

int Point::GetX()
{
    return x_;
}

void Point::SetY(int y)
{
    y_ = y;
}

int Point::GetY()
{
    return y_;
}

void Point::tulosta()
{
    cout << "Point X: " << GetX() << ", Y: " << GetY() << endl;
}