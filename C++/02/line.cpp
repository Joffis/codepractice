#include "line.h"
#include <iostream>

using namespace std;

Line::Line(Point* begin, Point* end)
{
    begin_ = begin;
    end_ = end;
    cout << "Line luotu " << this << endl;
}

Line::Line(int x1, int y1, int x2, int y2)
{
    begin_ = new Point(x1,y1);
    end_ = new Point(x2,y2);
    cout << "Line luotu " << this << endl;
}

Line::~Line()
{
    delete begin_;
    delete end_;
    cout << "Line vapautettu " << this << endl;
}

void Line::SetLine(int x1, int y1, int x2, int y2)
{
    begin_->SetX(x1);
    begin_->SetY(y1);
    end_->SetX(x2);
    end_->SetY(y2);
}

void Line::print()
{
    cout << "Line begin X: " << begin_->GetX() << ", Y: " << begin_->GetY() << endl;
    cout << "Line end X: " << end_->GetX() << ", Y: " << end_->GetY() << endl;
}