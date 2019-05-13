package com.company;

public enum CategoryInterpreter {
    CHILDRENS{
        @Override
        public double rentCalculator(int days,int bluray){
            double amount = 2.0;
            if(bluray==0) {

                if (days > 2)
                    return amount + (days - 2) * 1.5;
                else
                    return amount;
            }
            else{
                return amount * 3.5;
            }
        }

    }, NEW_RELEASE{
        @Override
        public double rentCalculator(int days,int bluray){
            if(bluray==0)
                return days*3;
            else
                return days*3.5;
        }

    }, REGULAR{
        @Override
        public double rentCalculator(int days, int bluray){
            double amount = 1.5;
            if(bluray==0){
                if(days>3)
                    return amount + (days-3)*1.5;
                else
                    return amount;
            }
            else{
                return amount*days*1.25;
            }

        }
    };
    public abstract double rentCalculator(int days, int bluray);
}
