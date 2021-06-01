package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class modul8 {
    private JTextField textPanen;
    private JTextField textPopulasi;
    private JTextField textPakan;
    private JTextField textUmur;
    private JTextArea textIp;
    private JButton submitButton;
    private JButton clearButton;
    private JLabel labelPopulasi;
    private JLabel labelPanen;
    private JLabel labelPakan;
    private JLabel labelUmur;
    private JPanel panel;
    private JComboBox comboJenis;
    private JLabel labelEkor;
    private JTextField textEkor;
    private JTextField textField1;
    private JTextField textField2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("modul8");
        frame.setContentPane(new modul8().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public modul8() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                float Panen = Float.parseFloat(textPanen.getText());
                float Ekor = Float.parseFloat(textEkor.getText());
                float Pakan = Float.parseFloat(textPakan.getText());
                float Populasi = Float.parseFloat(textPopulasi.getText());
                float Umur = Float.parseFloat(textUmur.getText());

                float Ip = Panen * Panen / (Pakan * Populasi * Umur) * 10000;
                float Bb = Panen / Ekor;
                float Fc = Pakan / Panen;

                String Jenis =comboJenis.getSelectedItem().toString();

                int bonus1 = 0;
                int bonus2 = 0;


                if (Jenis.equals("Close")) {
                    if (Ip > 520) {
                        bonus1 = 267;
                    } else if (Ip > 510) {
                        bonus1 = 263;
                    } else if (Ip > 500) {
                        bonus1 = 259;
                    } else if (Ip > 490) {
                        bonus1 = 255;
                    } else if (Ip > 480) {
                        bonus1 = 249;
                    } else if (Ip > 470) {
                        bonus1 = 247;
                    } else if (Ip > 460) {
                        bonus1 = 243;
                    } else if (Ip > 450) {
                        bonus1 = 239;
                    } else if (Ip > 440) {
                        bonus1 = 235;
                    } else if (Ip > 430) {
                        bonus1 = 229;
                    } else if (Ip > 420) {
                        bonus1 = 227;
                    } else if (Ip > 410) {
                        bonus1 = 223;
                    } else if (Ip > 400) {
                        bonus1 = 219;
                    } else if (Ip > 390) {
                        bonus1 = 215;
                    } else if (Ip > 380) {
                        bonus1 = 211;
                    } else if (Ip > 370) {
                        bonus1 = 207;
                    } else if (Ip > 360) {
                        bonus1 = 203;
                    } else if (Ip > 350) {
                        bonus1 = 199;
                    } else if (Ip > 340) {
                        bonus1 = 195;
                    } else if (Ip > 330) {
                        bonus1 = 189;
                    } else if (Ip > 320) {
                        bonus1 = 185;
                    } else {
                        bonus1 = 181;
                    }

                    if (Bb >= 0.8 && Bb < 1) {
                        if (Fc < 1.10) {
                            bonus2 = 65;
                        } else if (Fc < 1.15) {
                            bonus2 = 60;
                        } else if (Fc < 1.20) {
                            bonus2 = 55;
                        } else if (Fc < 1.25) {
                            bonus2 = 50;
                        } else if (Fc < 1.30) {
                            bonus2 = 40;
                        } else if (Fc < 1.35) {
                            bonus2 = 30;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1 && Bb < 1.2) {
                        if (Fc < 1.15) {
                            bonus2 = 65;
                        } else if (Fc < 1.20) {
                            bonus2 = 60;
                        } else if (Fc < 1.25) {
                            bonus2 = 55;
                        } else if (Fc < 1.30) {
                            bonus2 = 50;
                        } else if (Fc < 1.35) {
                            bonus2 = 40;
                        } else if (Fc < 1.40) {
                            bonus2 = 30;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1.2 && Bb < 1.4) {
                        if (Fc < 1.20) {
                            bonus2 = 65;
                        } else if (Fc < 1.25) {
                            bonus2 = 60;
                        } else if (Fc < 1.30) {
                            bonus2 = 55;
                        } else if (Fc < 1.35) {
                            bonus2 = 50;
                        } else if (Fc < 1.40) {
                            bonus2 = 40;
                        } else if (Fc < 1.43) {
                            bonus2 = 30;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1.4 && Bb < 1.5) {
                        if (Fc < 1.25) {
                            bonus2 = 65;
                        } else if (Fc < 1.30) {
                            bonus2 = 60;
                        } else if (Fc < 1.35) {
                            bonus2 = 55;
                        } else if (Fc < 1.40) {
                            bonus2 = 50;
                        } else if (Fc < 1.43) {
                            bonus2 = 40;
                        } else if (Fc < 1.46) {
                            bonus2 = 30;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1.5 && Bb < 1.6) {
                        if (Fc < 1.27) {
                            bonus2 = 65;
                        } else if (Fc < 1.32) {
                            bonus2 = 60;
                        } else if (Fc < 1.37) {
                            bonus2 = 55;
                        } else if (Fc < 1.42) {
                            bonus2 = 50;
                        } else if (Fc < 1.45) {
                            bonus2 = 40;
                        } else if (Fc < 1.48) {
                            bonus2 = 30;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1.6 && Bb < 1.7) {
                        if (Fc < 1.30) {
                            bonus2 = 65;
                        } else if (Fc < 1.35) {
                            bonus2 = 60;
                        } else if (Fc < 1.40) {
                            bonus2 = 55;
                        } else if (Fc < 1.44) {
                            bonus2 = 50;
                        } else if (Fc < 1.47) {
                            bonus2 = 40;
                        } else if (Fc < 1.49) {
                            bonus2 = 30;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1.7 && Bb < 1.8) {
                        if (Fc < 1.35) {
                            bonus2 = 65;
                        } else if (Fc < 1.40) {
                            bonus2 = 60;
                        } else if (Fc < 1.44) {
                            bonus2 = 55;
                        } else if (Fc < 1.47) {
                            bonus2 = 50;
                        } else if (Fc < 1.49) {
                            bonus2 = 40;
                        } else if (Fc < 1.51) {
                            bonus2 = 30;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1.8 && Bb < 2) {
                        if (Fc < 1.40) {
                            bonus2 = 65;
                        } else if (Fc < 1.44) {
                            bonus2 = 60;
                        } else if (Fc < 1.46) {
                            bonus2 = 55;
                        } else if (Fc < 1.48) {
                            bonus2 = 50;
                        } else if (Fc < 1.50) {
                            bonus2 = 40;
                        } else if (Fc < 1.52) {
                            bonus2 = 30;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 2) {
                        if (Fc < 1.42) {
                            bonus2 = 65;
                        } else if (Fc < 1.46) {
                            bonus2 = 60;
                        } else if (Fc < 1.48) {
                            bonus2 = 55;
                        } else if (Fc < 1.50) {
                            bonus2 = 50;
                        } else if (Fc < 1.51) {
                            bonus2 = 40;
                        } else if (Fc < 1.53) {
                            bonus2 = 30;
                        } else {
                            bonus2 = 0;
                        }

                    } else {
                        bonus2 = 0;
                    }

                } else if (Jenis.equals("Open")){
                    if (Ip > 440) {
                        bonus1 = 460;
                    } else if (Ip > 430) {
                        bonus1 = 455;
                    } else if (Ip > 420) {
                        bonus1 = 450;
                    } else if (Ip > 410) {
                        bonus1 = 445;
                    } else if (Ip > 400) {
                        bonus1 = 440;
                    } else if (Ip > 390) {
                        bonus1 = 435;
                    } else if (Ip > 380) {
                        bonus1 = 430;
                    } else if (Ip > 370) {
                        bonus1 = 425;
                    } else if (Ip > 360) {
                        bonus1 = 420;
                    } else if (Ip > 350) {
                        bonus1 = 415;
                    } else if (Ip > 340) {
                        bonus1 = 410;
                    } else if (Ip > 330) {
                        bonus1 = 405;
                    } else if (Ip > 320) {
                        bonus1 = 400;
                    } else if (Ip > 310) {
                        bonus1 = 395;
                    } else if (Ip > 300) {
                        bonus1 = 390;
                    } else if (Ip > 290) {
                        bonus1 = 385;
                    } else if (Ip > 280) {
                        bonus1 = 380;
                    } else if (Ip > 270) {
                        bonus1 = 375;
                    } else {
                        bonus1 = 370;
                    }

                    if (Bb >= 0.8 && Bb < 1) {
                        if (Fc < 1.10) {
                            bonus2 = 90;
                        } else if (Fc < 1.15) {
                            bonus2 = 80;
                        } else if (Fc < 1.20) {
                            bonus2 = 70;
                        } else if (Fc < 1.25) {
                            bonus2 = 60;
                        } else if (Fc < 1.30) {
                            bonus2 = 50;
                        } else if (Fc < 1.35) {
                            bonus2 = 40;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1 && Bb < 1.2) {
                        if (Fc < 1.15) {
                            bonus2 = 90;
                        } else if (Fc < 1.20) {
                            bonus2 = 80;
                        } else if (Fc < 1.25) {
                            bonus2 = 70;
                        } else if (Fc < 1.30) {
                            bonus2 = 60;
                        } else if (Fc < 1.35) {
                            bonus2 = 50;
                        } else if (Fc < 1.40) {
                            bonus2 = 40;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1.2 && Bb < 1.4) {
                        if (Fc < 1.20) {
                            bonus2 = 90;
                        } else if (Fc < 1.25) {
                            bonus2 = 80;
                        } else if (Fc < 1.30) {
                            bonus2 = 70;
                        } else if (Fc < 1.35) {
                            bonus2 = 60;
                        } else if (Fc < 1.40) {
                            bonus2 = 50;
                        } else if (Fc < 1.43) {
                            bonus2 = 40;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1.4 && Bb < 1.5) {
                        if (Fc < 1.25) {
                            bonus2 = 90;
                        } else if (Fc < 1.30) {
                            bonus2 = 80;
                        } else if (Fc < 1.35) {
                            bonus2 = 70;
                        } else if (Fc < 1.40) {
                            bonus2 = 60;
                        } else if (Fc < 1.43) {
                            bonus2 = 50;
                        } else if (Fc < 1.46) {
                            bonus2 = 40;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1.5 && Bb < 1.6) {
                        if (Fc < 1.27) {
                            bonus2 = 90;
                        } else if (Fc < 1.32) {
                            bonus2 = 80;
                        } else if (Fc < 1.37) {
                            bonus2 = 70;
                        } else if (Fc < 1.42) {
                            bonus2 = 60;
                        } else if (Fc < 1.45) {
                            bonus2 = 50;
                        } else if (Fc < 1.48) {
                            bonus2 = 40;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1.6 && Bb < 1.7) {
                        if (Fc < 1.30) {
                            bonus2 = 90;
                        } else if (Fc < 1.35) {
                            bonus2 = 80;
                        } else if (Fc < 1.40) {
                            bonus2 = 70;
                        } else if (Fc < 1.44) {
                            bonus2 = 60;
                        } else if (Fc < 1.47) {
                            bonus2 = 50;
                        } else if (Fc < 1.49) {
                            bonus2 = 40;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1.7 && Bb < 1.8) {
                        if (Fc < 1.35) {
                            bonus2 = 90;
                        } else if (Fc < 1.40) {
                            bonus2 = 80;
                        } else if (Fc < 1.44) {
                            bonus2 = 70;
                        } else if (Fc < 1.47) {
                            bonus2 = 60;
                        } else if (Fc < 1.49) {
                            bonus2 = 50;
                        } else if (Fc < 1.51) {
                            bonus2 = 40;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1.8 && Bb < 2) {
                        if (Fc < 1.40) {
                            bonus2 = 90;
                        } else if (Fc < 1.44) {
                            bonus2 = 80;
                        } else if (Fc < 1.46) {
                            bonus2 = 70;
                        } else if (Fc < 1.48) {
                            bonus2 = 60;
                        } else if (Fc < 1.50) {
                            bonus2 = 50;
                        } else if (Fc < 1.52) {
                            bonus2 = 40;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 2) {
                        if (Fc < 1.42) {
                            bonus2 = 90;
                        } else if (Fc < 1.46) {
                            bonus2 = 80;
                        } else if (Fc < 1.48) {
                            bonus2 = 70;
                        } else if (Fc < 1.50) {
                            bonus2 = 60;
                        } else if (Fc < 1.51) {
                            bonus2 = 50;
                        } else if (Fc < 1.53) {
                            bonus2 = 40;
                        } else {
                            bonus2 = 0;
                        }

                    } else {
                        bonus2 = 0;
                    }

                } else if (Jenis.equals("Upgrade")) {
                    if (Ip > 520) {
                        bonus1 = 395;
                    } else if (Ip > 510) {
                        bonus1 = 390;
                    } else if (Ip > 500) {
                        bonus1 = 385;
                    } else if (Ip > 490) {
                        bonus1 = 380;
                    } else if (Ip > 480) {
                        bonus1 = 375;
                    } else if (Ip > 470) {
                        bonus1 = 370;
                    } else if (Ip > 460) {
                        bonus1 = 365;
                    } else if (Ip > 450) {
                        bonus1 = 360;
                    } else if (Ip > 440) {
                        bonus1 = 355;
                    } else if (Ip > 430) {
                        bonus1 = 350;
                    } else if (Ip > 420) {
                        bonus1 = 345;
                    } else if (Ip > 410) {
                        bonus1 = 340;
                    } else if (Ip > 400) {
                        bonus1 = 335;
                    } else if (Ip > 390) {
                        bonus1 = 330;
                    } else if (Ip > 380) {
                        bonus1 = 325;
                    } else if (Ip > 370) {
                        bonus1 = 320;
                    } else if (Ip > 360) {
                        bonus1 = 315;
                    } else if (Ip > 350) {
                        bonus1 = 310;
                    } else if (Ip > 340) {
                        bonus1 = 305;
                    } else if (Ip > 330) {
                        bonus1 = 300;
                    } else if (Ip > 320) {
                        bonus1 = 295;
                    } else {
                        bonus1 = 290;
                    }

                    if (Bb >= 0.8 && Bb < 1) {
                        if (Fc < 1.10) {
                            bonus2 = 85;
                        } else if (Fc < 1.15) {
                            bonus2 = 75;
                        } else if (Fc < 1.20) {
                            bonus2 = 65;
                        } else if (Fc < 1.25) {
                            bonus2 = 55;
                        } else if (Fc < 1.30) {
                            bonus2 = 45;
                        } else if (Fc < 1.35) {
                            bonus2 = 35;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1 && Bb < 1.2) {
                        if (Fc < 1.15) {
                            bonus2 = 85;
                        } else if (Fc < 1.20) {
                            bonus2 = 75;
                        } else if (Fc < 1.25) {
                            bonus2 = 65;
                        } else if (Fc < 1.30) {
                            bonus2 = 55;
                        } else if (Fc < 1.35) {
                            bonus2 = 45;
                        } else if (Fc < 1.40) {
                            bonus2 = 35;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1.2 && Bb < 1.4) {
                        if (Fc < 1.20) {
                            bonus2 = 85;
                        } else if (Fc < 1.25) {
                            bonus2 = 75;
                        } else if (Fc < 1.30) {
                            bonus2 = 65;
                        } else if (Fc < 1.35) {
                            bonus2 = 55;
                        } else if (Fc < 1.40) {
                            bonus2 = 45;
                        } else if (Fc < 1.43) {
                            bonus2 = 35;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1.4 && Bb < 1.5) {
                        if (Fc < 1.25) {
                            bonus2 = 85;
                        } else if (Fc < 1.30) {
                            bonus2 = 75;
                        } else if (Fc < 1.35) {
                            bonus2 = 65;
                        } else if (Fc < 1.40) {
                            bonus2 = 55;
                        } else if (Fc < 1.43) {
                            bonus2 = 45;
                        } else if (Fc < 1.46) {
                            bonus2 = 35;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1.5 && Bb < 1.6) {
                        if (Fc < 1.27) {
                            bonus2 = 85;
                        } else if (Fc < 1.32) {
                            bonus2 = 75;
                        } else if (Fc < 1.37) {
                            bonus2 = 65;
                        } else if (Fc < 1.42) {
                            bonus2 = 55;
                        } else if (Fc < 1.45) {
                            bonus2 = 45;
                        } else if (Fc < 1.48) {
                            bonus2 = 35;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1.6 && Bb < 1.7) {
                        if (Fc < 1.30) {
                            bonus2 = 85;
                        } else if (Fc < 1.35) {
                            bonus2 = 75;
                        } else if (Fc < 1.40) {
                            bonus2 = 65;
                        } else if (Fc < 1.44) {
                            bonus2 = 55;
                        } else if (Fc < 1.47) {
                            bonus2 = 45;
                        } else if (Fc < 1.49) {
                            bonus2 = 35;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1.7 && Bb < 1.8) {
                        if (Fc < 1.35) {
                            bonus2 = 85;
                        } else if (Fc < 1.40) {
                            bonus2 = 75;
                        } else if (Fc < 1.44) {
                            bonus2 = 65;
                        } else if (Fc < 1.47) {
                            bonus2 = 55;
                        } else if (Fc < 1.49) {
                            bonus2 = 45;
                        } else if (Fc < 1.51) {
                            bonus2 = 35;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 1.8 && Bb < 2) {
                        if (Fc < 1.40) {
                            bonus2 = 85;
                        } else if (Fc < 1.44) {
                            bonus2 = 75;
                        } else if (Fc < 1.46) {
                            bonus2 = 65;
                        } else if (Fc < 1.48) {
                            bonus2 = 55;
                        } else if (Fc < 1.50) {
                            bonus2 = 45;
                        } else if (Fc < 1.52) {
                            bonus2 = 35;
                        } else {
                            bonus2 = 0;
                        }

                    } else if (Bb >= 2) {
                        if (Fc < 1.42) {
                            bonus2 = 85;
                        } else if (Fc < 1.46) {
                            bonus2 = 75;
                        } else if (Fc < 1.48) {
                            bonus2 = 65;
                        } else if (Fc < 1.50) {
                            bonus2 = 55;
                        } else if (Fc < 1.51) {
                            bonus2 = 45;
                        } else if (Fc < 1.53) {
                            bonus2 = 35;
                        } else {
                            bonus2 = 0;
                        }

                    } else {
                        bonus2 = 0;
                    }

                } else {
                    textIp.setText("Coba lagi");
                }

                float gaji = (Populasi * 180) + (bonus1 * Panen) + (bonus2 * Panen);

                textIp.setText("IP untuk panen saat ini adalah " + String.valueOf(Ip) + ". Dengan gaji anda periode ini adalah Rp " + (Math.round(gaji)));
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanen.setText("");
                textPopulasi.setText("");
                textPakan.setText("");
                textUmur.setText("");
                textIp.setText("");
            }
        });
    }
}

