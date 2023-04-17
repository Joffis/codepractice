#include <iostream>
#include <vector>

using namespace std;

class Auto
{
private:
    string merkki;
public:
    Auto()
    {
        merkki = "Default";
        cout << "Auto luotu: " << this << endl;
    }
    ~Auto()
    {
        cout << "Auto poistettu: " << this << endl;
    }
    string GetMerkki()
    {
        return merkki;
    }
    void SetMerkki(string model)
    {
        merkki = model;
    }
};

class Asiakas
{
private:
    string nimi;
    int id;
    static int next_id;
    Auto *vuokraAuto;
    bool vuokrattu;
public:
    Asiakas()
    {
        nimi = "Default";
        vuokrattu = false;
        id = Asiakas::next_id++;
        cout << "Asiakas luotu: " << this << endl;
    }
    ~Asiakas()
    {
        cout << "Asiakas poistettu: " << this << endl;
    }
    string GetNimi()
    {
        return nimi;
    }
    int GetId()
    {
        return id;
    }
    void SetNimi(string name)
    {
        nimi = name;
    }
    void setVuokraAuto(Auto* a)
    {
        vuokraAuto = a;
        vuokrattu = true;
    }
    Auto* getVuokraAuto()
    {
        if(vuokrattu)
        {
            return vuokraAuto;
        }
        return 0;
    }
};

int Asiakas::next_id = 0;

class Autovuokraamo
{
private:
    vector<Asiakas*>* asiakkaat;
    vector<Auto*>* autot;
public:
    Autovuokraamo()
    {
        asiakkaat = new vector<Asiakas*>();
        autot = new vector<Auto*>();
        cout << "Autovuokraamo luotu: " << this << endl;
    }
    ~Autovuokraamo()
    {
        delete asiakkaat;
        delete autot;
        cout << "Autovuokraamo poistettu: " << this << endl;
    }
    void lisaaAsiakas(Asiakas* as)
    {
        asiakkaat->push_back(as);
    }
    void lisaaAuto(Auto* au)
    {
        autot->push_back(au);
    }
    void poistaAsiakas(int i)
    {
        delete asiakkaat->at(i);
    }
    void poistaAuto(int i)
    {
        delete autot->at(i);
    }
    Asiakas* haeAsiakas(int id)
    {
        for(unsigned int i=0; i<asiakkaat->size(); i++)
        {
            if(asiakkaat->at(i)->GetId() == id)
            {
                return asiakkaat->at(i);
            }
        }
        return 0;
    }
    void vuokraaAuto(Asiakas* a, Auto* b)
    {
        a->setVuokraAuto(b);
    }
    void tulosta()
    {
        cout << "\nAutovuokraamon Asiakaslista:" << endl;
        for(unsigned int i=0; i<asiakkaat->size(); i++)
        {
            cout << "Nimi: " << asiakkaat->at(i)->GetNimi() << ", ID: " << asiakkaat->at(i)->GetId() << ", Vuokrattu: ";
            if(asiakkaat->at(i)->getVuokraAuto() != 0)
            {
                cout << asiakkaat->at(i)->getVuokraAuto()->GetMerkki();
            }
            else
            {
                cout << "-";
            }
            cout << endl;
        }
        cout << "\nAutovuokraamon Autot:" << endl;
        for(unsigned int i=0; i<autot->size(); i++)
        {
            cout << "Merkki: " << autot->at(i)->GetMerkki() << endl;
        }
        cout << endl;
    }
};

int main()
{
    Autovuokraamo* vuokraamo = new Autovuokraamo();

    Asiakas* as1 = new Asiakas();
    as1->SetNimi("Pasi");
    vuokraamo->lisaaAsiakas(as1);

    Asiakas* as2 = new Asiakas();
    as2->SetNimi("Heikki");
    vuokraamo->lisaaAsiakas(as2);

    Auto* au1 = new Auto();
    au1->SetMerkki("Audi");
    vuokraamo->lisaaAuto(au1);

    Auto* au2 = new Auto();
    au2->SetMerkki("Opel");
    vuokraamo->lisaaAuto(au2);

    vuokraamo->vuokraaAuto(as1,au1);

    vuokraamo->tulosta();

    delete vuokraamo;
    delete as1;
    delete as2;
    delete au1;
    delete au2;
    return 0;
}