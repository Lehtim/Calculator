package Package_Calculator;

/**
 * Created by tim_l on 14.11.2016.
 */
public class Arithmetics {
    private String strLHS = "";
    private String strRHS = "";
    private String strOperand = "";
    private boolean isLHSSet = false;
    private boolean isCalculated = false;
    private int codeSystem = 0; // 0 -> decimal, 1 -> binary, 2 -> hexadecimal

    public String getStrLHS(){
        return strLHS;
    }

    public String getStrRHS(){
        return strRHS;
    }

    public String getStrOperand(){
        return strOperand;
    }

    public void writeNumber(String sNumber){
        if(isLHSSet || isCalculated){
            if(!strOperand.isEmpty()) {
                strRHS += sNumber;
            }
        }
        else{
            strLHS += sNumber;
        }
    }

    public void writeOperand(String sOperand){
        if (!isLHSSet) {
            strOperand = sOperand;
            isLHSSet = true;
            isCalculated = false;
        }
        else if(!strRHS.isEmpty() && !strOperand.isEmpty()){
            this.calculate();
            strOperand = sOperand;
        }
        else{
            strOperand = sOperand;
        }
    }

    public void doWork(){
        if(!(strLHS.isEmpty() || strRHS.isEmpty() || strOperand.isEmpty())){
            this.calculate();
        }
        else if(strRHS.isEmpty()){
            strOperand = "";
        }
    }

    public void square(){
        int oldCodeSystem = codeSystem;
        changeCodeSystem(0); //change CodeSystem to decimal
        if(isLHSSet){
            if(!strRHS.isEmpty()){
                int intRHS = Integer.parseInt(strRHS);
                intRHS = intRHS * intRHS;
                strRHS = String.valueOf(intRHS);
            }
        }
        else{
            if(!strLHS.isEmpty()){
                int intLHS = Integer.parseInt(strLHS);
                intLHS = intLHS * intLHS;
                strLHS = String.valueOf(intLHS);
            }
        }
        changeCodeSystem(oldCodeSystem); //change CodeSystem to CodeSystem in before
    }

    public void squareRoot(){
        int oldCodeSystem = codeSystem;
        changeCodeSystem(0); //change CodeSystem to decimal
        if(isLHSSet){
            if(!strRHS.isEmpty()){
                int intRHS = Integer.parseInt(strRHS);
                intRHS = (int)Math.sqrt(intRHS);
                strRHS = String.valueOf(intRHS);
            }
        }
        else{
            if(!strLHS.isEmpty()){
                int intLHS = Integer.parseInt(strLHS);
                intLHS = (int)Math.sqrt(intLHS);
                strLHS = String.valueOf(intLHS);
            }
        }
        changeCodeSystem(oldCodeSystem); //change CodeSystem to CodeSystem in before
    }

    public void changeCodeSystem(int aSystem){
        switch(aSystem){
            case 0:     strLHS = decimalForm(strLHS);
                        strRHS = decimalForm(strRHS);
                        break;
            case 1:     strLHS = binaryForm(strLHS);
                        strRHS = binaryForm(strRHS);
                        break;
            case 2:     strLHS = hexadecimalForm(strLHS);
                        strRHS = hexadecimalForm(strRHS);
                        break;
            default:    System.exit(2);
                        break;
        }
        codeSystem = aSystem;
    }

    public void clearAll(){
        strLHS = "";
        strRHS = "";
        strOperand = "";
        isLHSSet = false;
        isCalculated = false;
    }

    public void clear(){
        if(isLHSSet){
           strRHS = "";
        }
        else{
           strLHS = "";
           isCalculated = false;
        }
    }

    public void goBack(){
        if(isLHSSet){
            strRHS = this.deleteLastCharOfString(strRHS);
        }
        else{
            strLHS = this.deleteLastCharOfString(strLHS);
        }
    }

    private void calculate(){
        int oldCodeSystem = codeSystem;
        changeCodeSystem(0); //change CodeSystem to decimal
        int intRHS = Integer.parseInt(strRHS);
        int intLHS = Integer.parseInt(strLHS);
        switch (strOperand){
            case "+":   intLHS += intRHS;
                        break;
            case "-":   intLHS -= intRHS;
                        break;
            case "*":   intLHS *= intRHS;
                        break;
            case "/":   intLHS /= intRHS;
                        break;
            default:    System.exit(2);
                        break;
        }
        strLHS = String.valueOf(intLHS);
        strRHS = "";
        strOperand = "";
        isCalculated = true;
        isLHSSet = false;
        changeCodeSystem(oldCodeSystem); //change CodeSystem to CodeSystem in before
    }

    private String decimalForm(String strNum){
        if(strNum.isEmpty()){
            return strNum;
        }
        int intNum = 0;
        if(codeSystem == 1){
            for(int i = 0; i<strNum.length(); i++){
                intNum += (strNum.charAt(i)-'0') * (int) Math.pow(2, strNum.length()-1-i);
            }
            return String.valueOf(intNum);
        }
        if(codeSystem == 2){
            for(int i = 0; i<strNum.length(); i++){
                int bit = strNum.charAt(i) - '0';
                switch(strNum.charAt(i)){
                    case 'A':   bit = 10;
                                break;
                    case 'B':   bit = 11;
                                break;
                    case 'C':   bit = 12;
                                break;
                    case 'D':   bit = 13;
                                break;
                    case 'E':   bit = 14;
                                break;
                    case 'F':   bit = 15;
                                break;
                }
                intNum += bit * (int) Math.pow(16, strNum.length()-1-i);
            }
            return String.valueOf(intNum);
        }
        return strNum;
    }

    private String binaryForm(String strNum){
        if(strNum.isEmpty()){
            return strNum;
        }
        if(strNum.charAt(0) == '-'){
            strNum = strNum.substring(1, strNum.length());
            System.out.printf("strNum = %s\n", strNum);
        }
        if(codeSystem == 0){
            int intNum = Integer.parseInt(strNum);
            String strBin = "";
            while(intNum > 0){
                char mod = (char) (intNum % 2 + '0');
                strBin = mod + strBin;
                intNum /= 2;
            }
            return strBin;
        }
        if(codeSystem == 2){
            String strBin = "";
            for(int i = 0; i<strNum.length(); i++){
                String bitBlock = "0000";
                switch(strNum.charAt(i)){
                    case '0':   bitBlock = "0000";
                                break;
                    case '1':   bitBlock = "0001";
                                break;
                    case '2':   bitBlock = "0010";
                                break;
                    case '3':   bitBlock = "0011";
                                break;
                    case '4':   bitBlock = "0100";
                                break;
                    case '5':   bitBlock = "0101";
                                break;
                    case '6':   bitBlock = "0110";
                                break;
                    case '7':   bitBlock = "0111";
                                break;
                    case '8':   bitBlock = "1000";
                                break;
                    case '9':   bitBlock = "1001";
                                break;
                    case 'A':   bitBlock = "1010";
                                break;
                    case 'B':   bitBlock = "1011";
                                break;
                    case 'C':   bitBlock = "1100";
                                break;
                    case 'D':   bitBlock = "1101";
                                break;
                    case 'E':   bitBlock = "1110";
                                break;
                    case 'F':   bitBlock = "1111";
                                break;
                    default:    System.exit(2);
                                break;
                }
                strBin += bitBlock;
            }
            return strBin;
        }
        return strNum;
    }

    private String hexadecimalForm(String strNum){
        if(strNum.isEmpty()){
            return strNum;
        }
        if(strNum.charAt(0) == '-'){
            strNum = strNum.substring(1, strNum.length());
            System.out.printf("strNum = %s\n", strNum);
        }
        int intNum = Integer.parseInt(strNum);
        if(codeSystem == 0){
            String strHex = "";
            while(intNum > 0){
                int mod = intNum % 16;
                char bit = (char) (mod + '0');
                switch(mod){
                    case 10:    bit = 'A';
                                break;
                    case 11:    bit = 'B';
                                break;
                    case 12:    bit = 'C';
                                break;
                    case 13:    bit = 'D';
                                break;
                    case 14:    bit = 'E';
                                break;
                    case 15:    bit = 'F';
                                break;
                }
                strHex = bit + strHex;
                intNum /= 16;
            }
            return strHex;
        }
        if(codeSystem == 1){
            String strHex = "";
            String subStr;
            for(int i = 0; i < strNum.length()%4; i++){
                strNum = "0" + strNum;
            }
            while(!strNum.isEmpty()){
                subStr = strNum.substring(strNum.length()-4, strNum.length());
                strNum = strNum.substring(0, strNum.length()-4);
                switch(subStr){
                    case "0000":    strHex = "0" + strHex;
                                    break;
                    case "0001":    strHex = "1" + strHex;
                                    break;
                    case "0010":    strHex = "2" + strHex;
                                    break;
                    case "0011":    strHex = "3" + strHex;
                                    break;
                    case "0100":    strHex = "4" + strHex;
                                    break;
                    case "0101":    strHex = "5" + strHex;
                                    break;
                    case "0110":    strHex = "6" + strHex;
                                    break;
                    case "0111":    strHex = "7" + strHex;
                                    break;
                    case "1000":    strHex = "8" + strHex;
                                    break;
                    case "1001":    strHex = "9" + strHex;
                                    break;
                    case "1010":    strHex = "A" + strHex;
                                    break;
                    case "1011":    strHex = "B" + strHex;
                                    break;
                    case "1100":    strHex = "C" + strHex;
                                    break;
                    case "1101":    strHex = "D" + strHex;
                                    break;
                    case "1110":    strHex = "E" + strHex;
                                    break;
                    case "1111":    strHex = "F" + strHex;
                                    break;
                    default:        System.exit(2);
                                    break;
                }
            }
            return strHex;
        }
        return strNum;
    }

    private String deleteLastCharOfString(String str) {
        if (str != null && str.length() > 0) {
            str = str.substring(0, str.length()-1);
        }
        return str;
    }
}
