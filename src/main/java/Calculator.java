public class Calculator {


    private int result;



    public void add(int ...params){
        for (int param : params){
            this.result+=param;

        }
    }

    public void multi(int ...params){
        this.result = params[0];
        for(int i = 1; i< params.length;i++){
            result*= params[i];
        }
    }

    public void sub(int ...params) {
        this.result = params[0];
        for (int i = 1; i < params.length; i++) {
            result -= params[i];
        }
    }

    public void div(int ... args) throws MyException{
        if (args.length > 0 ){
            this.result = args[0];
            for (int i = 1;i<args.length;i++){
                if (args[i] == 0){
                    throw new IllegalArgumentException("You try to div by 0. Please change arg!");
                }
                this.result = this.result/args[i];
            }

        }
        else throw new MyException("You should enter args!");
    }

    public int getResult(){
        return this.result;
    }

    public void cleanResult(){
        this.result = 0;
    }
}
