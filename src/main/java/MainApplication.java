
package com.example.googleauth;

import com.google.zxing.WriterException;

import java.io.IOException;
import java.util.Scanner;

import static com.example.googleauth.Utils.generateSecretKey;
import static com.example.googleauth.Utils.getTOTPCode;
import static com.example.googleauth.Utils.getGoogleAuthenticatorBarCode;
import static com.example.googleauth.Utils.createQRCode;
import static com.example.googleauth.Utils.infinityGeneratingCodes;

public class MainApplication {

    public static void main(String[] args) throws IOException, WriterException{
        String secretKey = "BW47LJZ2JAKKNLHKFOPYPDZMJQLOMPJA";
        String username = "james";
        String issuer = "facebook";

        String barcode = getGoogleAuthenticatorBarCode(secretKey, username, issuer);
        String filepath = "../QR.png";
        createQRCode(barcode, filepath, 200, 200);
        infinityGeneratingCodes(secretKey);

//        String lastCode = null;
//        while (true) {
//            String code = getTOTPCode(secretKey);
//            if (!code.equals(lastCode)) {
//                System.out.println(code);
//            }
//            lastCode = code;
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {};
//        }
//
//    }

}}