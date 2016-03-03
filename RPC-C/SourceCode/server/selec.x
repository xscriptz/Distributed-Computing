struct list{
        string str<>;
        string strr<>;
};
struct listt{
        string st<>;
};
program SELPROG{
        version SELVER{
        string fil() =1;
        string rev(listt) = 2;
        string enc(listt) = 3;
        string del(listt) = 4;
        string conc(list) = 5;
        } = 1;
} = 300;
