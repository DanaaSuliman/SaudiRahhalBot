package ArabicChatbot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class MyFirstBot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {

        return "Saudi_Rahhal_Bot";
    }

    @Override
    public String getBotToken() {

        return "1940972961:AAGvYX_dgcAfAXPFPOSS2c3kk-D402-5aAE";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            Message message = update.getMessage();

            if (message.hasText()) {
                String text = message.getText();

                if (text.equals("/start") || text.equals("رجوع")) {
                    //System.out.println("Bot Started...");
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("أهلًا وسهلًا\n أنا في خدمتك، كيف يمكنني مساعدتك؟");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();
                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();


                    keyboardButton1.setText("رحَّال، كن مرشدي السياحي!");
                    keyboardButton2.setText("من أنت؟");
                    keyboardButton3.setText("شكرًا لك!");

                    keyboardRow1.add(keyboardButton3);

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);


                    keyboardRowList.add(keyboardRow1);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);


                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("رحَّال، كن مرشدي السياحي!")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر وجهتك في المملكة العربية السعودية.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton5 = new KeyboardButton();
                    KeyboardButton keyboardButton6 = new KeyboardButton();


                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton7 = new KeyboardButton();
                    KeyboardButton keyboardButton8 = new KeyboardButton();
                    KeyboardButton keyboardButton9 = new KeyboardButton();

                    KeyboardRow keyboardRow4 = new KeyboardRow();
                    KeyboardButton keyboardButton10 = new KeyboardButton();
                    KeyboardButton keyboardButton11 = new KeyboardButton();
                    KeyboardButton keyboardButton12 = new KeyboardButton();
                    KeyboardButton keyboardButton13 = new KeyboardButton();

                    KeyboardRow keyboardRow5 = new KeyboardRow();
                    KeyboardButton keyboardButton14 = new KeyboardButton();


                    keyboardButton1.setText("الرياض");
                    keyboardButton2.setText("مكة المكرمة");
                    keyboardButton3.setText("القصيم");
                    keyboardButton4.setText("المدينة المنورة");
                    keyboardButton5.setText("عسير");
                    keyboardButton6.setText("المنطقة الشرقية");
                    keyboardButton7.setText("حائل");
                    keyboardButton8.setText("تبوك");
                    keyboardButton9.setText("جازان");
                    keyboardButton10.setText("الحدود الشمالية");
                    keyboardButton11.setText("نجران");
                    keyboardButton12.setText("الباحة");
                    keyboardButton13.setText("الجوف");

                    keyboardButton14.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);
                    keyboardRow2.add(keyboardButton6);

                    keyboardRow3.add(keyboardButton7);
                    keyboardRow3.add(keyboardButton8);
                    keyboardRow3.add(keyboardButton9);

                    keyboardRow4.add(keyboardButton10);
                    keyboardRow4.add(keyboardButton11);
                    keyboardRow4.add(keyboardButton12);
                    keyboardRow4.add(keyboardButton13);

                    keyboardRow5.add(keyboardButton14);


                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);
                    keyboardRowList.add(keyboardRow4);
                    keyboardRowList.add(keyboardRow5);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("الرياض")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر وجهتك السياحية من الرياض.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton5 = new KeyboardButton();
                    KeyboardButton keyboardButton6 = new KeyboardButton();


                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton7 = new KeyboardButton();
                    KeyboardButton keyboardButton8 = new KeyboardButton();
                    KeyboardButton keyboardButton9 = new KeyboardButton();

                    KeyboardRow keyboardRow4 = new KeyboardRow();
                    KeyboardButton keyboardButton10 = new KeyboardButton();


                    keyboardButton1.setText("مدينة الرياض");
                    keyboardButton2.setText("الخرج");
                    keyboardButton3.setText("الدوادمي");
                    keyboardButton4.setText("المجمعة");
                    keyboardButton5.setText("الأفلاج");
                    keyboardButton6.setText("شقراء");
                    keyboardButton7.setText("وادي الدواسر");
                    keyboardButton8.setText("الغاط");
                    keyboardButton9.setText("الزلفي");

                    keyboardButton10.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);
                    keyboardRow2.add(keyboardButton6);

                    keyboardRow3.add(keyboardButton7);
                    keyboardRow3.add(keyboardButton8);
                    keyboardRow3.add(keyboardButton9);

                    keyboardRow4.add(keyboardButton10);



                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);
                    keyboardRowList.add(keyboardRow4);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("مدينة الرياض")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في الرياض.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton5 = new KeyboardButton();
                    KeyboardButton keyboardButton6 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton7 = new KeyboardButton();
                    KeyboardButton keyboardButton8 = new KeyboardButton();
                    KeyboardButton keyboardButton9 = new KeyboardButton();
                    KeyboardRow keyboardRow4 = new KeyboardRow();

                    keyboardButton1.setText("الأماكن السياحية - الرياض");
                    keyboardButton2.setText("المنتزهات والترفيه - الرياض");
                    keyboardButton3.setText("التسوق - الرياض");
                    keyboardButton4.setText("المنتجعات والفنادق - الرياض");
                    keyboardButton5.setText("الطبيعة والبيئة - الرياض");
                    keyboardButton6.setText("التراث والثقافة - الرياض");
                    keyboardButton9.setText("الأنشطة - الرياض");

                    keyboardButton7.setText("رجوع");
                    keyboardButton8.setText("المطاعم - الرياض");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);
                    keyboardRow2.add(keyboardButton6);

                    keyboardRow4.add(keyboardButton7);
                    keyboardRow3.add(keyboardButton8);
                    keyboardRow3.add(keyboardButton9);


                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);
                    keyboardRowList.add(keyboardRow4);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("الأماكن السياحية - الرياض")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("ليفيلز");
                    inlineKeyboardButton1.setCallbackData("ليفيلز");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("حدائق الفراولة المعلقة بالعمارية");
                    inlineKeyboardButton2.setCallbackData("حدائق الفراولة المعلقة بالعمارية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("منتجع ريف كافيه");
                    inlineKeyboardButton3.setCallbackData("منتجع ريف كافيه");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("مطعم ومتحف المزرعة التراثي");
                    inlineKeyboardButton4.setCallbackData("مطعم ومتحف المزرعة التراثي");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("ميدان الرماية بالدرعية");
                    inlineKeyboardButton5.setCallbackData("ميدان الرماية بالدرعية");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("عود سكوير");
                    inlineKeyboardButton6.setCallbackData("عود سكوير");

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("الثغر بلازا");
                    inlineKeyboardButton7.setCallbackData("الثغر بلازا");

                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    inlineKeyboardButton8.setText("تركي سكوير");
                    inlineKeyboardButton8.setCallbackData("تركي سكوير");

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
                    inlineKeyboardButton9.setText("البوليفارد");
                    inlineKeyboardButton9.setCallbackData("البوليفارد");

                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
                    inlineKeyboardButton10.setText("يو ووك");
                    inlineKeyboardButton10.setCallbackData("يو ووك");

                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
                    inlineKeyboardButton11.setText("روبين بلازا");
                    inlineKeyboardButton11.setCallbackData("روبين بلازا");

                    InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
                    inlineKeyboardButton12.setText("وودي بارك");
                    inlineKeyboardButton12.setCallbackData("وودي بارك");

                    List<InlineKeyboardButton> inlineKeyboardButtonList7 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();
                    inlineKeyboardButton13.setText("فيورنزا لابيازا");
                    inlineKeyboardButton13.setCallbackData("فيورنزا لابيازا");

                    InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();
                    inlineKeyboardButton14.setText("القرية النجدية");
                    inlineKeyboardButton14.setCallbackData("القرية النجدية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList8 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton15 = new InlineKeyboardButton();
                    inlineKeyboardButton15.setText("مجمع الضيافة");
                    inlineKeyboardButton15.setCallbackData("مجمع الضيافة");

                    InlineKeyboardButton inlineKeyboardButton16 = new InlineKeyboardButton();
                    inlineKeyboardButton16.setText("برج الفيصلية");
                    inlineKeyboardButton16.setCallbackData("برج الفيصلية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList9 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton17 = new InlineKeyboardButton();
                    inlineKeyboardButton17.setText("ذا زون");
                    inlineKeyboardButton17.setCallbackData("ذا زون");

                    InlineKeyboardButton inlineKeyboardButton18 = new InlineKeyboardButton();
                    inlineKeyboardButton18.setText("منطقة 303 بمركز الملك عبدالله المالي");
                    inlineKeyboardButton18.setCallbackData("منطقة 303 بمركز الملك عبدالله المالي");

                    List<InlineKeyboardButton> inlineKeyboardButtonList10 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton19 = new InlineKeyboardButton();
                    inlineKeyboardButton19.setText("شارع التحلية");
                    inlineKeyboardButton19.setCallbackData("شارع التحلية");

                    InlineKeyboardButton inlineKeyboardButton20 = new InlineKeyboardButton();
                    inlineKeyboardButton20.setText("برج المملكة");
                    inlineKeyboardButton20.setCallbackData("برج المملكة");

                    List<InlineKeyboardButton> inlineKeyboardButtonList11 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton21 = new InlineKeyboardButton();
                    inlineKeyboardButton21.setText("واجهة الرياض");
                    inlineKeyboardButton21.setCallbackData("واجهة الرياض");

                    InlineKeyboardButton inlineKeyboardButton22 = new InlineKeyboardButton();
                    inlineKeyboardButton22.setText("ريفر ووك");
                    inlineKeyboardButton22.setCallbackData("ريفر ووك");

                    List<InlineKeyboardButton> inlineKeyboardButtonList12 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton23 = new InlineKeyboardButton();
                    inlineKeyboardButton23.setText("مجمع سدرة");
                    inlineKeyboardButton23.setCallbackData("مجمع سدرة");

                    InlineKeyboardButton inlineKeyboardButton24 = new InlineKeyboardButton();
                    inlineKeyboardButton24.setText("سوق عبيه للأسر المنتجة بالدرعية");
                    inlineKeyboardButton24.setCallbackData("سوق عبيه للأسر المنتجة بالدرعية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList13 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton25 = new InlineKeyboardButton();
                    inlineKeyboardButton25.setText("فيريندا اف اند بي");
                    inlineKeyboardButton25.setCallbackData("فيريندا اف اند بي");

                    InlineKeyboardButton inlineKeyboardButton26 = new InlineKeyboardButton();
                    inlineKeyboardButton26.setText("فورتوري");
                    inlineKeyboardButton26.setCallbackData("فورتوري");

                    List<InlineKeyboardButton> inlineKeyboardButtonList14 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton27 = new InlineKeyboardButton();
                    inlineKeyboardButton27.setText("عالية بلازا");
                    inlineKeyboardButton27.setCallbackData("عالية بلازا");

                    InlineKeyboardButton inlineKeyboardButton28 = new InlineKeyboardButton();
                    inlineKeyboardButton28.setText("ريف سنتر");
                    inlineKeyboardButton28.setCallbackData("ريف سنتر");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton9);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton10);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton11);
                    inlineKeyboardButtonList6.add(inlineKeyboardButton12);

                    inlineKeyboardButtonList7.add(inlineKeyboardButton13);
                    inlineKeyboardButtonList7.add(inlineKeyboardButton14);

                    inlineKeyboardButtonList8.add(inlineKeyboardButton15);
                    inlineKeyboardButtonList8.add(inlineKeyboardButton16);

                    inlineKeyboardButtonList9.add(inlineKeyboardButton17);
                    inlineKeyboardButtonList9.add(inlineKeyboardButton18);

                    inlineKeyboardButtonList10.add(inlineKeyboardButton19);
                    inlineKeyboardButtonList10.add(inlineKeyboardButton20);

                    inlineKeyboardButtonList11.add(inlineKeyboardButton21);
                    inlineKeyboardButtonList11.add(inlineKeyboardButton22);

                    inlineKeyboardButtonList12.add(inlineKeyboardButton23);
                    inlineKeyboardButtonList12.add(inlineKeyboardButton24);

                    inlineKeyboardButtonList13.add(inlineKeyboardButton25);
                    inlineKeyboardButtonList13.add(inlineKeyboardButton26);

                    inlineKeyboardButtonList14.add(inlineKeyboardButton27);
                    inlineKeyboardButtonList14.add(inlineKeyboardButton28);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);
                    inlineButtons.add(inlineKeyboardButtonList5);
                    inlineButtons.add(inlineKeyboardButtonList6);
                    inlineButtons.add(inlineKeyboardButtonList7);
                    inlineButtons.add(inlineKeyboardButtonList8);
                    inlineButtons.add(inlineKeyboardButtonList9);
                    inlineButtons.add(inlineKeyboardButtonList10);
                    inlineButtons.add(inlineKeyboardButtonList11);
                    inlineButtons.add(inlineKeyboardButtonList12);
                    inlineButtons.add(inlineKeyboardButtonList13);
                    inlineButtons.add(inlineKeyboardButtonList14);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("وجهة سياحية أخرى")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر وجهتك في المملكة العربية السعودية.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton5 = new KeyboardButton();
                    KeyboardButton keyboardButton6 = new KeyboardButton();


                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton7 = new KeyboardButton();
                    KeyboardButton keyboardButton8 = new KeyboardButton();
                    KeyboardButton keyboardButton9 = new KeyboardButton();

                    KeyboardRow keyboardRow4 = new KeyboardRow();
                    KeyboardButton keyboardButton10 = new KeyboardButton();
                    KeyboardButton keyboardButton11 = new KeyboardButton();
                    KeyboardButton keyboardButton12 = new KeyboardButton();
                    KeyboardButton keyboardButton13 = new KeyboardButton();

                    KeyboardRow keyboardRow5 = new KeyboardRow();
                    KeyboardButton keyboardButton14 = new KeyboardButton();


                    keyboardButton1.setText("الرياض");
                    keyboardButton2.setText("مكة المكرمة");
                    keyboardButton3.setText("القصيم");
                    keyboardButton4.setText("المدينة المنورة");
                    keyboardButton5.setText("عسير");
                    keyboardButton6.setText("المنطقة الشرقية");
                    keyboardButton7.setText("حائل");
                    keyboardButton8.setText("تبوك");
                    keyboardButton9.setText("جازان");
                    keyboardButton10.setText("الحدود الشمالية");
                    keyboardButton11.setText("نجران");
                    keyboardButton12.setText("الباحة");
                    keyboardButton13.setText("الجوف");

                    keyboardButton14.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);
                    keyboardRow2.add(keyboardButton6);

                    keyboardRow3.add(keyboardButton7);
                    keyboardRow3.add(keyboardButton8);
                    keyboardRow3.add(keyboardButton9);

                    keyboardRow4.add(keyboardButton10);
                    keyboardRow4.add(keyboardButton11);
                    keyboardRow4.add(keyboardButton12);
                    keyboardRow4.add(keyboardButton13);

                    keyboardRow5.add(keyboardButton14);


                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);
                    keyboardRowList.add(keyboardRow4);
                    keyboardRowList.add(keyboardRow5);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("المنتزهات والترفيه - الرياض")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("نادي الفارسة النسائي للفروسية");
                    inlineKeyboardButton1.setCallbackData("نادي الفارسة النسائي للفروسية");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("ذا وي اوت (طريق الهروب)");
                    inlineKeyboardButton2.setCallbackData("ذا وي اوت (طريق الهروب)");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("سفوري لاند (العثيم مول)");
                    inlineKeyboardButton3.setCallbackData("سفوري لاند (العثيم مول)");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("ذا سيكرت روم");
                    inlineKeyboardButton4.setCallbackData("ذا سيكرت روم");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("أحاجي");
                    inlineKeyboardButton5.setCallbackData("أحاجي");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("مركز أسبار الترفيهي");
                    inlineKeyboardButton6.setCallbackData("مركز أسبار الترفيهي");

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("ريسس");
                    inlineKeyboardButton7.setCallbackData("ريسس");

                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    inlineKeyboardButton8.setText("فزز هوا النسائية");
                    inlineKeyboardButton8.setCallbackData("فزز هوا النسائية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
                    inlineKeyboardButton9.setText("واحة المرح (غرناطة مول)");
                    inlineKeyboardButton9.setCallbackData("واحة المرح (غرناطة مول)");

                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
                    inlineKeyboardButton10.setText("جيليتش");
                    inlineKeyboardButton10.setCallbackData("جيليتش");

                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
                    inlineKeyboardButton11.setText("واي فاي بولينج");
                    inlineKeyboardButton11.setCallbackData("واي فاي بولينج");

                    InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
                    inlineKeyboardButton12.setText("فيرستيمنت");
                    inlineKeyboardButton12.setCallbackData("فيرستيمنت");

                    List<InlineKeyboardButton> inlineKeyboardButtonList7 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();
                    inlineKeyboardButton13.setText("الحكير تايم (الربوة)");
                    inlineKeyboardButton13.setCallbackData("الحكير تايم (الربوة)");

                    InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();
                    inlineKeyboardButton14.setText("المدينة الثلجية (العثيم مول)");
                    inlineKeyboardButton14.setCallbackData("المدينة الثلجية (العثيم مول)");

                    List<InlineKeyboardButton> inlineKeyboardButtonList8 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton15 = new InlineKeyboardButton();
                    inlineKeyboardButton15.setText("حديقة الحيوانات بالملز");
                    inlineKeyboardButton15.setCallbackData("حديقة الحيوانات بالملز");

                    InlineKeyboardButton inlineKeyboardButton16 = new InlineKeyboardButton();
                    inlineKeyboardButton16.setText("حديقة مكتبة الملك فهد الوطنية");
                    inlineKeyboardButton16.setCallbackData("حديقة مكتبة الملك فهد الوطنية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList9 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton17 = new InlineKeyboardButton();
                    inlineKeyboardButton17.setText("سباركيز (بانوراما)");
                    inlineKeyboardButton17.setCallbackData("سباركيز (بانوراما)");

                    InlineKeyboardButton inlineKeyboardButton18 = new InlineKeyboardButton();
                    inlineKeyboardButton18.setText("حديقة الأمير عبدالعزيز بن عياف بالحمراء");
                    inlineKeyboardButton18.setCallbackData("حديقة الأمير عبدالعزيز بن عياف");

                    List<InlineKeyboardButton> inlineKeyboardButtonList10 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton19 = new InlineKeyboardButton();
                    inlineKeyboardButton19.setText("حديقة العليا");
                    inlineKeyboardButton19.setCallbackData("حديقة العليا");

                    InlineKeyboardButton inlineKeyboardButton20 = new InlineKeyboardButton();
                    inlineKeyboardButton20.setText("منتزه الملك عبدالله بالملز");
                    inlineKeyboardButton20.setCallbackData("منتزه الملك عبدالله بالملز");

                    List<InlineKeyboardButton> inlineKeyboardButtonList11 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton21 = new InlineKeyboardButton();
                    inlineKeyboardButton21.setText("حديقة الوطن بالمربع");
                    inlineKeyboardButton21.setCallbackData("حديقة الوطن بالمربع");

                    InlineKeyboardButton inlineKeyboardButton22 = new InlineKeyboardButton();
                    inlineKeyboardButton22.setText("منتزهات المربع المفتوحة");
                    inlineKeyboardButton22.setCallbackData("منتزهات المربع المفتوحة");

                    List<InlineKeyboardButton> inlineKeyboardButtonList12 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton23 = new InlineKeyboardButton();
                    inlineKeyboardButton23.setText("الحكير تايم (الملقا)");
                    inlineKeyboardButton23.setCallbackData("الحكير تايم (الملقا)");

                    InlineKeyboardButton inlineKeyboardButton24 = new InlineKeyboardButton();
                    inlineKeyboardButton24.setText("المركز العالمي للبولينج");
                    inlineKeyboardButton24.setCallbackData("المركز العالمي للبولينج");

                    List<InlineKeyboardButton> inlineKeyboardButtonList13 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton25 = new InlineKeyboardButton();
                    inlineKeyboardButton25.setText("منتزه سلام");
                    inlineKeyboardButton25.setCallbackData("منتزه سلام");

                    InlineKeyboardButton inlineKeyboardButton26 = new InlineKeyboardButton();
                    inlineKeyboardButton26.setText("منتزه الملك سلمان البري");
                    inlineKeyboardButton26.setCallbackData("منتزه الملك سلمان البري");

                    List<InlineKeyboardButton> inlineKeyboardButtonList14 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton27 = new InlineKeyboardButton();
                    inlineKeyboardButton27.setText("حلبة ديراب للكارتينج");
                    inlineKeyboardButton27.setCallbackData("حلبة ديراب للكارتينج");

                    InlineKeyboardButton inlineKeyboardButton28 = new InlineKeyboardButton();
                    inlineKeyboardButton28.setText("حديقة معالم العالم");
                    inlineKeyboardButton28.setCallbackData("حديقة معالم العالم");

                    List<InlineKeyboardButton> inlineKeyboardButtonList15 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton29 = new InlineKeyboardButton();
                    inlineKeyboardButton29.setText("ماجيك بلانيت الرياض بارك");
                    inlineKeyboardButton29.setCallbackData("ماجيك بلانيت الرياض بارك");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton9);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton10);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton11);
                    inlineKeyboardButtonList6.add(inlineKeyboardButton12);

                    inlineKeyboardButtonList7.add(inlineKeyboardButton13);
                    inlineKeyboardButtonList7.add(inlineKeyboardButton14);

                    inlineKeyboardButtonList8.add(inlineKeyboardButton15);
                    inlineKeyboardButtonList8.add(inlineKeyboardButton16);

                    inlineKeyboardButtonList9.add(inlineKeyboardButton17);
                    inlineKeyboardButtonList9.add(inlineKeyboardButton18);

                    inlineKeyboardButtonList10.add(inlineKeyboardButton19);
                    inlineKeyboardButtonList10.add(inlineKeyboardButton20);

                    inlineKeyboardButtonList11.add(inlineKeyboardButton21);
                    inlineKeyboardButtonList11.add(inlineKeyboardButton22);

                    inlineKeyboardButtonList12.add(inlineKeyboardButton23);
                    inlineKeyboardButtonList12.add(inlineKeyboardButton24);

                    inlineKeyboardButtonList13.add(inlineKeyboardButton25);
                    inlineKeyboardButtonList13.add(inlineKeyboardButton26);

                    inlineKeyboardButtonList14.add(inlineKeyboardButton27);
                    inlineKeyboardButtonList14.add(inlineKeyboardButton28);

                    inlineKeyboardButtonList15.add(inlineKeyboardButton29);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);
                    inlineButtons.add(inlineKeyboardButtonList5);
                    inlineButtons.add(inlineKeyboardButtonList6);
                    inlineButtons.add(inlineKeyboardButtonList7);
                    inlineButtons.add(inlineKeyboardButtonList8);
                    inlineButtons.add(inlineKeyboardButtonList9);
                    inlineButtons.add(inlineKeyboardButtonList10);
                    inlineButtons.add(inlineKeyboardButtonList11);
                    inlineButtons.add(inlineKeyboardButtonList12);
                    inlineButtons.add(inlineKeyboardButtonList13);
                    inlineButtons.add(inlineKeyboardButtonList14);
                    inlineButtons.add(inlineKeyboardButtonList15);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("التسوق - الرياض")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("سوق القرية الشعبية");
                    inlineKeyboardButton1.setCallbackData("سوق القرية الشعبية");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("سوق حراج بن قاسم الجديد");
                    inlineKeyboardButton2.setCallbackData("سوق حراج بن قاسم الجديد");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("سوق المعيقلية");
                    inlineKeyboardButton3.setCallbackData("سوق المعيقلية");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("سوق الزل الشعبي");
                    inlineKeyboardButton4.setCallbackData("سوق الزل الشعبي");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("الرمال سنتر");
                    inlineKeyboardButton5.setCallbackData("الرمال سنتر");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("أسواق طيبة والعويس الشعبية");
                    inlineKeyboardButton6.setCallbackData("أسواق طيبة والعويس الشعبية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("خريص مول");
                    inlineKeyboardButton7.setCallbackData("خريص مول");

                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    inlineKeyboardButton8.setText("غرناطة مول");
                    inlineKeyboardButton8.setCallbackData("غرناطة مول");

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
                    inlineKeyboardButton9.setText("صحارى مول");
                    inlineKeyboardButton9.setCallbackData("صحارى مول");

                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
                    inlineKeyboardButton10.setText("الرياض قاليري");
                    inlineKeyboardButton10.setCallbackData("الرياض قاليري");

                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
                    inlineKeyboardButton11.setText("أطياف مول");
                    inlineKeyboardButton11.setCallbackData("أطياف مول");

                    InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
                    inlineKeyboardButton12.setText("القصر مول");
                    inlineKeyboardButton12.setCallbackData("القصر مول");

                    List<InlineKeyboardButton> inlineKeyboardButtonList7 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();
                    inlineKeyboardButton13.setText("سنتريا مول");
                    inlineKeyboardButton13.setCallbackData("سنتريا مول");

                    InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();
                    inlineKeyboardButton14.setText("العليا مول");
                    inlineKeyboardButton14.setCallbackData("العليا مول");

                    List<InlineKeyboardButton> inlineKeyboardButtonList8 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton15 = new InlineKeyboardButton();
                    inlineKeyboardButton15.setText("بانوراما مول");
                    inlineKeyboardButton15.setCallbackData("بانوراما مول");

                    InlineKeyboardButton inlineKeyboardButton16 = new InlineKeyboardButton();
                    inlineKeyboardButton16.setText("سلام مول");
                    inlineKeyboardButton16.setCallbackData("سلام مول");

                    List<InlineKeyboardButton> inlineKeyboardButtonList9 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton17 = new InlineKeyboardButton();
                    inlineKeyboardButton17.setText("تالا مول");
                    inlineKeyboardButton17.setCallbackData("تالا مول");

                    InlineKeyboardButton inlineKeyboardButton18 = new InlineKeyboardButton();
                    inlineKeyboardButton18.setText("المكان مول");
                    inlineKeyboardButton18.setCallbackData("المكان مول الرياض");

                    List<InlineKeyboardButton> inlineKeyboardButtonList10 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton19 = new InlineKeyboardButton();
                    inlineKeyboardButton19.setText("رويال مول");
                    inlineKeyboardButton19.setCallbackData("رويال مول");

                    InlineKeyboardButton inlineKeyboardButton20 = new InlineKeyboardButton();
                    inlineKeyboardButton20.setText("مارينا مول");
                    inlineKeyboardButton20.setCallbackData("مارينا مول الرياض");

                    List<InlineKeyboardButton> inlineKeyboardButtonList11 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton21 = new InlineKeyboardButton();
                    inlineKeyboardButton21.setText("النخيل مول");
                    inlineKeyboardButton21.setCallbackData("النخيل مول");

                    InlineKeyboardButton inlineKeyboardButton22 = new InlineKeyboardButton();
                    inlineKeyboardButton22.setText("حياة مول");
                    inlineKeyboardButton22.setCallbackData("حياة مول");

                    List<InlineKeyboardButton> inlineKeyboardButtonList12 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton23 = new InlineKeyboardButton();
                    inlineKeyboardButton23.setText("العثيم مول");
                    inlineKeyboardButton23.setCallbackData("العثيم مول الرياض");

                    InlineKeyboardButton inlineKeyboardButton24 = new InlineKeyboardButton();
                    inlineKeyboardButton24.setText("الحمراء مول");
                    inlineKeyboardButton24.setCallbackData("الحمراء مول");

                    List<InlineKeyboardButton> inlineKeyboardButtonList13 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton25 = new InlineKeyboardButton();
                    inlineKeyboardButton25.setText("الرياض بارك");
                    inlineKeyboardButton25.setCallbackData("الرياض بارك");

                    InlineKeyboardButton inlineKeyboardButton26 = new InlineKeyboardButton();
                    inlineKeyboardButton26.setText("مجمع الفيصلية");
                    inlineKeyboardButton26.setCallbackData("مجمع الفيصلية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList14 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton27 = new InlineKeyboardButton();
                    inlineKeyboardButton27.setText("مجمع المملكة");
                    inlineKeyboardButton27.setCallbackData("مجمع المملكة");




                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton9);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton10);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton11);
                    inlineKeyboardButtonList6.add(inlineKeyboardButton12);

                    inlineKeyboardButtonList7.add(inlineKeyboardButton13);
                    inlineKeyboardButtonList7.add(inlineKeyboardButton14);

                    inlineKeyboardButtonList8.add(inlineKeyboardButton15);
                    inlineKeyboardButtonList8.add(inlineKeyboardButton16);

                    inlineKeyboardButtonList9.add(inlineKeyboardButton17);
                    inlineKeyboardButtonList9.add(inlineKeyboardButton18);

                    inlineKeyboardButtonList10.add(inlineKeyboardButton19);
                    inlineKeyboardButtonList10.add(inlineKeyboardButton20);

                    inlineKeyboardButtonList11.add(inlineKeyboardButton21);
                    inlineKeyboardButtonList11.add(inlineKeyboardButton22);

                    inlineKeyboardButtonList12.add(inlineKeyboardButton23);
                    inlineKeyboardButtonList12.add(inlineKeyboardButton24);

                    inlineKeyboardButtonList13.add(inlineKeyboardButton25);
                    inlineKeyboardButtonList13.add(inlineKeyboardButton26);

                    inlineKeyboardButtonList14.add(inlineKeyboardButton27);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);
                    inlineButtons.add(inlineKeyboardButtonList5);
                    inlineButtons.add(inlineKeyboardButtonList6);
                    inlineButtons.add(inlineKeyboardButtonList7);
                    inlineButtons.add(inlineKeyboardButtonList8);
                    inlineButtons.add(inlineKeyboardButtonList9);
                    inlineButtons.add(inlineKeyboardButtonList10);
                    inlineButtons.add(inlineKeyboardButtonList11);
                    inlineButtons.add(inlineKeyboardButtonList12);
                    inlineButtons.add(inlineKeyboardButtonList13);
                    inlineButtons.add(inlineKeyboardButtonList14);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("الطبيعة والبيئة - الرياض")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("منتزه بحيرة المصانع (وادي حنيفة)");
                    inlineKeyboardButton1.setCallbackData("منتزه بحيرة المصانع (وادي حنيفة)");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("منتزه السد الحجري (وادي حنيفة)");
                    inlineKeyboardButton2.setCallbackData("منتزه السد الحجري (وادي حنيفة)");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("منتزه بحيرة عرقة (وادي حنيفة)");
                    inlineKeyboardButton3.setCallbackData("منتزه بحيرة عرقة (وادي حنيفة)");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("منتزه بحيرة الحاير (وادي حنيفة)");
                    inlineKeyboardButton4.setCallbackData("منتزه بحيرة الحاير (وادي حنيفة)");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("مطل حافة العالم (جبال طويق)");
                    inlineKeyboardButton5.setCallbackData("مطل حافة العالم (جبال طويق)");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("منتزه الثمامة البري");
                    inlineKeyboardButton6.setCallbackData("منتزه الثمامة البري");

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("منتزه وادي نمار");
                    inlineKeyboardButton7.setCallbackData("منتزه وادي نمار");

                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    inlineKeyboardButton8.setText("كهف عين هيت");
                    inlineKeyboardButton8.setCallbackData("كهف عين هيت");



                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("التراث والثقافة - الرياض")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("متحف ديار العز بالمزاحمية");
                    inlineKeyboardButton1.setCallbackData("متحف ديار العز بالمزاحمية");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("الدرعية التاريخية");
                    inlineKeyboardButton2.setCallbackData("الدرعية التاريخية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("مركز الملك عبدالعزيز التاريخي");
                    inlineKeyboardButton3.setCallbackData("مركز الملك عبدالعزيز التاريخي");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("متحف صقر الجزيرة للطيران");
                    inlineKeyboardButton4.setCallbackData("متحف صقر الجزيرة للطيران");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("متحف المشوح للتراث الشعبي");
                    inlineKeyboardButton5.setCallbackData("متحف المشوح للتراث الشعبي");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("مكتبة الملك عبدالعزيز العامة");
                    inlineKeyboardButton6.setCallbackData("مكتبة الملك عبدالعزيز العامة");

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("متحف الحمدان للتراث الشعبي");
                    inlineKeyboardButton7.setCallbackData("متحف الحمدان للتراث الشعبي");

                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    inlineKeyboardButton8.setText("متحف الفيصل للفن الإسلامي");
                    inlineKeyboardButton8.setCallbackData("متحف الفيصل للفن الإسلامي");

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
                    inlineKeyboardButton9.setText("واحة الملك سلمان للعلوم");
                    inlineKeyboardButton9.setCallbackData("واحة الملك سلمان للعلوم");

                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
                    inlineKeyboardButton10.setText("متحف السنين الماضية");
                    inlineKeyboardButton10.setCallbackData("متحف السنين الماضية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
                    inlineKeyboardButton11.setText("متحف العضيب للتراث الشعبي");
                    inlineKeyboardButton11.setCallbackData("متحف العضيب للتراث الشعبي");

                    InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
                    inlineKeyboardButton12.setText("متحف أبا القد التاريخي بالقدية (جبال طويق)");
                    inlineKeyboardButton12.setCallbackData("متحف أبا القد التاريخي");

                    List<InlineKeyboardButton> inlineKeyboardButtonList7 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();
                    inlineKeyboardButton13.setText("منطقة قصر الحكم");
                    inlineKeyboardButton13.setCallbackData("منطقة قصر الحكم");

                    InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();
                    inlineKeyboardButton14.setText("مكتبة الملك فهد الوطنية");
                    inlineKeyboardButton14.setCallbackData("مكتبة الملك فهد الوطنية");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton9);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton10);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton11);
                    inlineKeyboardButtonList6.add(inlineKeyboardButton12);

                    inlineKeyboardButtonList7.add(inlineKeyboardButton13);
                    inlineKeyboardButtonList7.add(inlineKeyboardButton14);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);
                    inlineButtons.add(inlineKeyboardButtonList5);
                    inlineButtons.add(inlineKeyboardButtonList6);
                    inlineButtons.add(inlineKeyboardButtonList7);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الأنشطة - الرياض")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList7 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("جسر المشاهدة Sky View");
                    inlineKeyboardButton1.setCallbackData("جسر المشاهدة");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("سفاري نوفا");
                    inlineKeyboardButton2.setCallbackData("سفاري نوفا");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("Yalla Hike");
                    inlineKeyboardButton3.setCallbackData("Yalla Hike");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("Hike Mania Club");
                    inlineKeyboardButton4.setCallbackData("Hike Mania Club");

                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("Hike Max");
                    inlineKeyboardButton5.setCallbackData("Hike Max");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("Hike Mania Trips");
                    inlineKeyboardButton6.setCallbackData("Hike Mania Trips");

                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("Riyadh Hiking");
                    inlineKeyboardButton7.setCallbackData("Riyadh Hiking");

                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    inlineKeyboardButton8.setText("منتجع الفروسية العالمي");
                    inlineKeyboardButton8.setCallbackData("منتجع الفروسية");

                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
                    inlineKeyboardButton9.setText("حدائق الفراولة المعلقة");
                    inlineKeyboardButton9.setCallbackData("حدائق الفراولة");

                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
                    inlineKeyboardButton10.setText("Doos Karting");
                    inlineKeyboardButton10.setCallbackData("Doos Karting");

                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
                    inlineKeyboardButton11.setText("ميدان ديراب");
                    inlineKeyboardButton11.setCallbackData("ميدان ديراب");

                    InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
                    inlineKeyboardButton12.setText("مغامرة الطيران");
                    inlineKeyboardButton12.setCallbackData("مغامرة الطيران");

                    InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();
                    inlineKeyboardButton13.setText("غرفة الهروب");
                    inlineKeyboardButton13.setCallbackData("غرفة الهروب");

                    InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();
                    inlineKeyboardButton14.setText("للمزيد من الفعاليات والنشاطات");
                    inlineKeyboardButton14.setCallbackData("للمزيد من الفعاليات");



                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton9);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton10);
                    inlineKeyboardButtonList6.add(inlineKeyboardButton11);
                    inlineKeyboardButtonList6.add(inlineKeyboardButton12);
                    inlineKeyboardButtonList7.add(inlineKeyboardButton13);
                    inlineKeyboardButtonList7.add(inlineKeyboardButton14);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);
                    inlineButtons.add(inlineKeyboardButtonList5);
                    inlineButtons.add(inlineKeyboardButtonList6);
                    inlineButtons.add(inlineKeyboardButtonList7);


                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("من أنت؟")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("مرحبًا،\n أنا رحَّال، المتخصص بالسياحة السعودية.\n" +
                                    "وجهتك ودليلك في العديد من المدن؛ حيث تجد الأماكن السياحية، المطاعم، المنتزهات، التسوق، المنتجعات، الطبيعة والترفيه.\n" +
                                    "معك دائمًا وأبدًا في كل مكان، فقط اسألني!\n" +
                                    "سأبذل قصارى جهدي لأخدمك وأنال إحسانك❤️")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();


                    keyboardButton1.setText("رحَّال، كن مرشدي السياحي!");
                    keyboardButton2.setText("شكرًا لك!");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);

                    keyboardRowList.add(keyboardRow1);
                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);


                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("المنتجعات والفنادق - الرياض")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton1.setUrl("https://gathern.co");

                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المطاعم - الرياض")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم الرياض");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g293995-Riyadh_Riyadh_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الخرج")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في الخرج.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton5 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton6 = new KeyboardButton();

                    keyboardButton1.setText("الأماكن السياحية - الخرج");
                    keyboardButton2.setText("التسوق - الخرج");
                    keyboardButton3.setText("المنتجعات والفنادق - الخرج");
                    keyboardButton4.setText("التراث والثقافة - الخرج");

                    keyboardButton6.setText("رجوع");
                    keyboardButton5.setText("المطاعم - الخرج");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);

                    keyboardRow3.add(keyboardButton6);



                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("الأماكن السياحية - الخرج")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("مزرعة ومنتجع وثانه");
                    inlineKeyboardButton1.setCallbackData("مزرعة ومنتجع وثانه");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("غار الإمام تركي بن عبدالله");
                    inlineKeyboardButton2.setCallbackData("غار الإمام تركي بن عبدالله");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("وادي ماوان");
                    inlineKeyboardButton3.setCallbackData("وادي ماوان");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("منتزه برج الخرج");
                    inlineKeyboardButton4.setCallbackData("منتزه برج الخرج");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التسوق - الخرج")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("مجمع الواحة");
                    inlineKeyboardButton1.setCallbackData("مجمع الواحة");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("الحديثي مول");
                    inlineKeyboardButton2.setCallbackData("الحديثي مول");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("سنترو الخرج");
                    inlineKeyboardButton3.setCallbackData("سنترو الخرج");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("العسكر أفينيو");
                    inlineKeyboardButton4.setCallbackData("العسكر أفينيو");

                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("جو مول");
                    inlineKeyboardButton5.setCallbackData("جو مول");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton5);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("التراث والثقافة - الخرج")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("عريش الملك عبدالعزيز التاريخي");
                    inlineKeyboardButton1.setCallbackData("عريش الملك عبدالعزيز التاريخي");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("متحف الموسى بالسلمية");
                    inlineKeyboardButton2.setCallbackData("متحف الموسى بالسلمية");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("قصر الملك عبدالعزيز التاريخي بالسيح");
                    inlineKeyboardButton3.setCallbackData("قصر الملك عبدالعزيز التاريخي");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList.add(inlineKeyboardButton3);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - الخرج")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton1.setUrl("https://gathern.co");

                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المطاعم - الخرج")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم الخرج");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g1816561-Al_Kharj_Riyadh_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("الدوادمي")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في الدوادمي.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();
                    KeyboardButton keyboardButton4 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton5 = new KeyboardButton();

                    keyboardButton1.setText("التراث والثقافة - الدوادمي");
                    keyboardButton2.setText("التسوق - الدوادمي");
                    keyboardButton3.setText("المنتجعات والفنادق - الدوادمي");
                    keyboardButton4.setText("المطاعم - الدوادمي");

                    keyboardButton5.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);

                    keyboardRow2.add(keyboardButton3);
                    keyboardRow2.add(keyboardButton4);

                    keyboardRow3.add(keyboardButton5);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("التسوق - الدوادمي")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("المكان مول");
                    inlineKeyboardButton1.setCallbackData("المكان مول الدوادمي");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("مجمع أفينيوز الدوادمي");
                    inlineKeyboardButton2.setCallbackData("مجمع أفينيوز الدوادمي");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التراث والثقافة - الدوادمي")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("متحف المشوح الأثري");
                    inlineKeyboardButton1.setCallbackData("متحف المشوح الأثري");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("قصر الملك عبدالعزيز التاريخي");
                    inlineKeyboardButton2.setCallbackData("قصر الملك عبدالعزيز");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("نقوش وادي مأسل");
                    inlineKeyboardButton3.setCallbackData("نقوش وادي مأسل");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList.add(inlineKeyboardButton3);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - الدوادمي")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton1.setUrl("https://gathern.co");

                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المطاعم - الدوادمي")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم الدوادمي");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g2628948-Dawadmi_Riyadh_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("المجمعة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في المجمعة.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton5 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton6 = new KeyboardButton();

                    keyboardButton1.setText("الأماكن السياحية - المجمعة");
                    keyboardButton2.setText("التراث والثقافة - المجمعة");
                    keyboardButton3.setText("التسوق - المجمعة");
                    keyboardButton4.setText("المنتجعات والفنادق - المجمعة");
                    keyboardButton5.setText("المطاعم - المجمعة");

                    keyboardButton6.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);

                    keyboardRow3.add(keyboardButton6);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("الأماكن السياحية - المجمعة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("محمية طيور الأمازون بتمير");
                    inlineKeyboardButton1.setCallbackData("محمية طيور الأمازون بتمير");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("محمية الراشد للطيور بالحوطه");
                    inlineKeyboardButton2.setCallbackData("محمية الراشد للطيور بالحوطه");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("منتزه وبحيرة الجزر بجلاجل");
                    inlineKeyboardButton3.setCallbackData("منتزه وبحيرة الجزر بجلاجل");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("وادي المشقر");
                    inlineKeyboardButton4.setCallbackData("وادي المشقر");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التسوق - المجمعة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("كرم مول");
                    inlineKeyboardButton1.setCallbackData("كرم مول");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("المجمعة مول");
                    inlineKeyboardButton2.setCallbackData("المجمعة مول");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التراث والثقافة - المجمعة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("قرية عودة سدير التراثية");
                    inlineKeyboardButton1.setCallbackData("قرية عودة سدير التراثية");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("قرية المهيدب التراثية");
                    inlineKeyboardButton2.setCallbackData("قرية المهيدب التراثية");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("قرية روضة سدير التراثية");
                    inlineKeyboardButton3.setCallbackData("قرية روضة سدير التراثية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("قرية جلاجل القديمة");
                    inlineKeyboardButton4.setCallbackData("قرية جلاجل القديمة");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("قرية حَرمه التراثية");
                    inlineKeyboardButton5.setCallbackData("قرية حَرمه التراثية");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("البلدة القديمة بالمجمعة");
                    inlineKeyboardButton6.setCallbackData("البلدة القديمة بالمجمعة");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - المجمعة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton1.setUrl("https://gathern.co");

                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("المطاعم - المجمعة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم المجمعة");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g2628941-Al_Majmaah_Riyadh_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("الأفلاج")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في الأفلاج.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();

                    keyboardButton1.setText("التراث والثقافة - الأفلاج");
                    keyboardButton2.setText("المنتجعات والفنادق - الأفلاج");

                    keyboardButton4.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);

                    keyboardRow2.add(keyboardButton4);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("التراث والثقافة - الأفلاج")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("متحف بيت الطيبين");
                    inlineKeyboardButton1.setCallbackData("متحف بيت الطيبين");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("جبل التوباد");
                    inlineKeyboardButton2.setCallbackData("جبل التوباد");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("متحف الحزيمي");
                    inlineKeyboardButton3.setCallbackData("متحف الحزيمي");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("قرية العمار التراثية");
                    inlineKeyboardButton4.setCallbackData("قرية العمار التراثية");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - الأفلاج")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton1.setUrl("https://gathern.co");

                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("شقراء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في شقراء.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton5 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton6 = new KeyboardButton();

                    keyboardButton1.setText("التراث والثقافة - شقراء");
                    keyboardButton2.setText("المنتجعات والفنادق - شقراء");
                    keyboardButton3.setText("التسوق - شقراء");
                    keyboardButton4.setText("المطاعم - شقراء");
                    keyboardButton5.setText("الأماكن السياحية - شقراء");

                    keyboardButton6.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);

                    keyboardRow3.add(keyboardButton6);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("التراث والثقافة - شقراء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("سوق حليوه التراثي");
                    inlineKeyboardButton1.setCallbackData("سوق حليوه التراثي");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("قصر السبيعي التاريخي");
                    inlineKeyboardButton2.setCallbackData("قصر السبيعي التاريخي");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("الديرة القديمة بشقراء");
                    inlineKeyboardButton3.setCallbackData("الديرة القديمة بشقراء");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("متحف بيت الحلوان التراثي");
                    inlineKeyboardButton4.setCallbackData("متحف بيت الحلوان التراثي");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("قرية أشيقر التراثية");
                    inlineKeyboardButton5.setCallbackData("قرية أشيقر التراثية");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("قصر العناقر الأثري بثرمداء");
                    inlineKeyboardButton6.setCallbackData("قصر العناقر الأثري بثرمداء");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التسوق - شقراء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("شقراء سكوير");
                    inlineKeyboardButton1.setCallbackData("شقراء سكوير");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("البساتين مول");
                    inlineKeyboardButton2.setCallbackData("البساتين مول");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الأماكن السياحية - شقراء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("بحيرة برودان");
                    inlineKeyboardButton1.setCallbackData("بحيرة برودان");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("ممالح القصب");
                    inlineKeyboardButton2.setCallbackData("ممالح القصب");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("صحراء نفود ثرمداء");
                    inlineKeyboardButton3.setCallbackData("صحراء نفود ثرمداء");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList.add(inlineKeyboardButton3);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - شقراء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton1.setUrl("https://gathern.co");

                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("المطاعم - شقراء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم شقراء");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g3238662-Shaqra_Riyadh_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("وادي الدواسر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في وادي الدواسر.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();

                    keyboardButton1.setText("التراث والثقافة - وادي الدواسر");
                    keyboardButton2.setText("المنتجعات والفنادق - وادي الدواسر");
                    keyboardButton3.setText("المطاعم - وادي الدواسر");

                    keyboardButton4.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("التراث والثقافة - وادي الدواسر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("قصر الملك عبدالعزيز التاريخي بوادي الدواسر");
                    inlineKeyboardButton1.setCallbackData("قصر الملك عبدالعزيز الدواسر");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("متاحف الصادرية");
                    inlineKeyboardButton2.setCallbackData("متاحف الصادرية");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("مدينة الفاو الأثرية");
                    inlineKeyboardButton3.setCallbackData("مدينة الفاو الأثرية");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList.add(inlineKeyboardButton3);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - وادي الدواسر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton1.setUrl("https://gathern.co");

                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("المطاعم - وادي الدواسر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم وادي الدواسر");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g12700909-Wadi_Al_Dwasir_Riyadh_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("الغاط")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في الغاط.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();


                    keyboardButton1.setText("التراث والثقافة - الغاط");
                    keyboardButton2.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);

                    keyboardRowList.add(keyboardRow1);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("التراث والثقافة - الغاط")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("قرية الغاط التراثية");
                    inlineKeyboardButton1.setCallbackData("قرية الغاط التراثية");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("مكتبة الرحمانية العامة");
                    inlineKeyboardButton2.setCallbackData("مكتبة الرحمانية العامة");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("الزلفي")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في الزلفي.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();


                    keyboardButton1.setText("التراث والثقافة - الزلفي");
                    keyboardButton2.setText("المنتجعات والفنادق - الزلفي");
                    keyboardButton3.setText("المطاعم - الزلفي");

                    keyboardButton4.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);


                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("التراث والثقافة - الزلفي")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("قرية السيح التراثية");
                    inlineKeyboardButton1.setCallbackData("قرية السيح التراثية");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("متحف عبدالرحمن الضويحي");
                    inlineKeyboardButton2.setCallbackData("متحف عبدالرحمن الضويحي");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("قرية علقة التراثية");
                    inlineKeyboardButton3.setCallbackData("قرية علقة التراثية");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList.add(inlineKeyboardButton3);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - الزلفي")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton1.setUrl("https://gathern.co");

                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("المطاعم - الزلفي")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم الزلفي");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g12700983-Al_Zulfi_Riyadh_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("المنطقة الشرقية")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر وجهتك السياحية من المنطقة الشرقية.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton5 = new KeyboardButton();
                    KeyboardButton keyboardButton6 = new KeyboardButton();
                    KeyboardButton keyboardButton7 = new KeyboardButton();


                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton8 = new KeyboardButton();



                    keyboardButton1.setText("الدمام");
                    keyboardButton2.setText("الخبر");
                    keyboardButton3.setText("الأحساء");
                    keyboardButton4.setText("الجبيل");
                    keyboardButton5.setText("حفر الباطن");
                    keyboardButton6.setText("القطيف");
                    keyboardButton7.setText("الخفجي");

                    keyboardButton8.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);
                    keyboardRow2.add(keyboardButton6);
                    keyboardRow2.add(keyboardButton7);

                    keyboardRow3.add(keyboardButton8);



                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("الدمام")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في الدمام.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton5 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton6 = new KeyboardButton();
                    KeyboardButton keyboardButton7 = new KeyboardButton();



                    keyboardButton1.setText("الأماكن السياحية - الدمام");
                    keyboardButton2.setText("التسوق - الدمام");
                    keyboardButton3.setText("المنتجعات والفنادق - الدمام");
                    keyboardButton4.setText("التراث والثقافة - الدمام");
                    keyboardButton5.setText("المطاعم - الدمام");
                    keyboardButton7.setText("الأنشطة - الدمام");

                    keyboardButton6.setText("رجوع");


                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);
                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);
                    keyboardRow2.add(keyboardButton7);

                    keyboardRow3.add(keyboardButton6);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الأماكن السياحية - الدمام")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("مطاعم ومقاهي الرواق الشعبي بمجمع الواحة داون تاون");
                    inlineKeyboardButton1.setCallbackData("مطاعم ومقاهي الرواق الشعبي");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("منتزه اللايف بارك (منتزه الملك فهد)");
                    inlineKeyboardButton2.setCallbackData("منتزه اللايف بارك");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("الحكير تايم");
                    inlineKeyboardButton3.setCallbackData("الحكير تايم الدمام");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("الواجهة البحرية");
                    inlineKeyboardButton4.setCallbackData("الواجهة البحرية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("جزيرة المرجان");
                    inlineKeyboardButton5.setCallbackData("جزيرة المرجان");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - الدمام")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton1.setUrl("https://gathern.co");

                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("المطاعم - الدمام")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم الدمام");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g298547-Dammam_Eastern_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("التراث والثقافة - الدمام")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("متحف الفلوة والجوهرة");
                    inlineKeyboardButton1.setCallbackData("متحف الفلوة والجوهرة");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("مطعم ومتحف القرية الشعبية");
                    inlineKeyboardButton2.setCallbackData("مطعم ومتحف القرية الشعبية");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التسوق - الدمام")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("دارين مول");
                    inlineKeyboardButton1.setCallbackData("دارين مول");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("سوق الدمام الشعبي");
                    inlineKeyboardButton2.setCallbackData("سوق الدمام الشعبي");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("العثيم مول");
                    inlineKeyboardButton3.setCallbackData("العثيم مول الدمام");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("مارينا مول");
                    inlineKeyboardButton4.setCallbackData("مارينا مول الدمام");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("الشاطئ مول");
                    inlineKeyboardButton5.setCallbackData("الشاطئ مول");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("حياة بلازا");
                    inlineKeyboardButton6.setCallbackData("حياة بلازا");



                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الأنشطة - الدمام")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("مغامرة الطيران");
                    inlineKeyboardButton1.setCallbackData("مغامرة الطيران");



                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الخبر")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في الخبر.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton5 = new KeyboardButton();
                    KeyboardButton keyboardButton6 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton8 = new KeyboardButton();
                    KeyboardButton keyboardButton9 = new KeyboardButton();

                    KeyboardRow keyboardRow4 = new KeyboardRow();
                    KeyboardButton keyboardButton7 = new KeyboardButton();

                    keyboardButton1.setText("الأماكن السياحية - الخبر");
                    keyboardButton2.setText("المنتزهات والترفيه - الخبر");
                    keyboardButton3.setText("التسوق - الخبر");
                    keyboardButton4.setText("المنتجعات والفنادق - الخبر");
                    keyboardButton5.setText("الطبيعة والبيئة - الخبر");
                    keyboardButton6.setText("التراث والثقافة - الخبر");
                    keyboardButton7.setText("رجوع");
                    keyboardButton8.setText("المطاعم - الخبر");
                    keyboardButton9.setText("الأنشطة - الخبر");


                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);
                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);
                    keyboardRow2.add(keyboardButton6);
                    keyboardRow4.add(keyboardButton7);
                    keyboardRow3.add(keyboardButton8);
                    keyboardRow3.add(keyboardButton9);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);
                    keyboardRowList.add(keyboardRow4);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الأماكن السياحية - الخبر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("روفز");
                    inlineKeyboardButton1.setCallbackData("روفز");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("قرية القصيبي");
                    inlineKeyboardButton2.setCallbackData("قرية القصيبي الخبر");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("الحكير تايم");
                    inlineKeyboardButton3.setCallbackData("الحكير تايم الخبر");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("اجدان ووك");
                    inlineKeyboardButton4.setCallbackData("اجدان ووك");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("مدينة الأطفال");
                    inlineKeyboardButton5.setCallbackData("مدينة الأطفال");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("واحة الخبر");
                    inlineKeyboardButton6.setCallbackData("واحة الخبر");

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("حديقة الأمير سعود بن نايف");
                    inlineKeyboardButton7.setCallbackData("حديقة الأمير سعود بن نايف");

                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    inlineKeyboardButton8.setText("بحيرة مدن الصناعية");
                    inlineKeyboardButton8.setCallbackData("بحيرة مدن الصناعية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
                    inlineKeyboardButton9.setText("شاطئ نصف القمر");
                    inlineKeyboardButton9.setCallbackData("شاطئ نصف القمر");

                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
                    inlineKeyboardButton10.setText("جزيرة الدغيثر");
                    inlineKeyboardButton10.setCallbackData("جزيرة الدغيثر");



                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton9);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton10);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);
                    inlineButtons.add(inlineKeyboardButtonList5);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتزهات والترفيه - الخبر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("فيلاجيو");
                    inlineKeyboardButton1.setCallbackData("فيلاجيو");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("سولت البحر");
                    inlineKeyboardButton2.setCallbackData("سولت البحر");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("جزيرة الدغيثر");
                    inlineKeyboardButton3.setCallbackData("جزيرة الدغيثر");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("سيتي بايك (تأجير سياكل)");
                    inlineKeyboardButton4.setCallbackData("سيتي بايك (تأجير سياكل)");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("مطعم باركرز على البحر");
                    inlineKeyboardButton5.setCallbackData("مطعم باركرز على البحر");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("مركز الملك عبدالعزيز الثقافي العالمي (إثراء)");
                    inlineKeyboardButton6.setCallbackData("مركز الملك عبدالعزيز الثقافي");

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("أجدان ووك");
                    inlineKeyboardButton7.setCallbackData("أجدان ووك");

                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    inlineKeyboardButton8.setText("بافيليون");
                    inlineKeyboardButton8.setCallbackData("بافيليون");

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
                    inlineKeyboardButton9.setText("أوان غاليري");
                    inlineKeyboardButton9.setCallbackData("أوان غاليري");

                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
                    inlineKeyboardButton10.setText("قرية القصيبي");
                    inlineKeyboardButton10.setCallbackData("قرية القصيبي الخبر");

                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
                    inlineKeyboardButton11.setText("كورنيش بارك");
                    inlineKeyboardButton11.setCallbackData("كورنيش بارك");

                    InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
                    inlineKeyboardButton12.setText("مجمع باتيو");
                    inlineKeyboardButton12.setCallbackData("مجمع باتيو");

                    List<InlineKeyboardButton> inlineKeyboardButtonList7 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();
                    inlineKeyboardButton13.setText("الشيخ افنيو");
                    inlineKeyboardButton13.setCallbackData("الشيخ افنيو");

                    InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();
                    inlineKeyboardButton14.setText("مطاعم جزيرة الكريستال");
                    inlineKeyboardButton14.setCallbackData("مطاعم جزيرة الكريستال");

                    List<InlineKeyboardButton> inlineKeyboardButtonList8 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton15 = new InlineKeyboardButton();
                    inlineKeyboardButton15.setText("واحة الخبر");
                    inlineKeyboardButton15.setCallbackData("واحة الخبر");



                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton9);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton10);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton11);
                    inlineKeyboardButtonList6.add(inlineKeyboardButton12);

                    inlineKeyboardButtonList7.add(inlineKeyboardButton13);
                    inlineKeyboardButtonList7.add(inlineKeyboardButton14);

                    inlineKeyboardButtonList8.add(inlineKeyboardButton15);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);
                    inlineButtons.add(inlineKeyboardButtonList5);
                    inlineButtons.add(inlineKeyboardButtonList6);
                    inlineButtons.add(inlineKeyboardButtonList7);
                    inlineButtons.add(inlineKeyboardButtonList8);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التسوق - الخبر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("فؤاد سنتر");
                    inlineKeyboardButton1.setCallbackData("فؤاد سنتر");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("مجمع الرواق");
                    inlineKeyboardButton2.setCallbackData("مجمع الرواق");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("الخبر مول");
                    inlineKeyboardButton3.setCallbackData("الخبر مول");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("مجمع التركي");
                    inlineKeyboardButton4.setCallbackData("مجمع التركي");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("أوان غاليري");
                    inlineKeyboardButton5.setCallbackData("أوان غاليري");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("فينيسيا مول");
                    inlineKeyboardButton6.setCallbackData("فينيسيا مول");

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("مجمع أمواج");
                    inlineKeyboardButton7.setCallbackData("مجمع أمواج");

                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    inlineKeyboardButton8.setText("الراشد مول");
                    inlineKeyboardButton8.setCallbackData("الراشد مول");

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
                    inlineKeyboardButton9.setText("مجمع الظهران");
                    inlineKeyboardButton9.setCallbackData("مجمع الظهران");



                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton9);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);
                    inlineButtons.add(inlineKeyboardButtonList5);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الطبيعة والبيئة - الخبر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("سولت البحر");
                    inlineKeyboardButton1.setCallbackData("سولت البحر");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("جزيرة الدغيثر");
                    inlineKeyboardButton2.setCallbackData("جزيرة الدغيثر");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("سيتي بايك (تأجير سياكل)");
                    inlineKeyboardButton3.setCallbackData("سيتي بايك (تأجير سياكل)");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("الواجهة البحرية");
                    inlineKeyboardButton4.setCallbackData("الواجهة البحرية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("كورنيش بارك");
                    inlineKeyboardButton5.setCallbackData("كورنيش بارك");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("مؤسسة البارشوت البحري (الهاف مون)");
                    inlineKeyboardButton6.setCallbackData("مؤسسة البارشوت البحري");



                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التراث والثقافة - الخبر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("متحف الشاي");
                    inlineKeyboardButton1.setCallbackData("متحف الشاي");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("معرض سايتك");
                    inlineKeyboardButton2.setCallbackData("معرض سايتك");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("متحف الطيبين");
                    inlineKeyboardButton3.setCallbackData("متحف الطيبين");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("الواجهة البحرية");
                    inlineKeyboardButton4.setCallbackData("الواجهة البحرية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("معرض الظهران اكسبو");
                    inlineKeyboardButton5.setCallbackData("معرض الظهران اكسبو");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("مطعم ومتحف قرية الروازن التراثية");
                    inlineKeyboardButton6.setCallbackData("مطعم ومتحف قرية الروازن التراثية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("متحف معالم الخليج البحري");
                    inlineKeyboardButton7.setCallbackData("متحف معالم الخليج البحري");

                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    inlineKeyboardButton8.setText("مركز الملك عبدالعزيز الثقافي العالمي (إثراء)");
                    inlineKeyboardButton8.setCallbackData("مركز الملك عبدالعزيز الثقافي");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - الخبر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton1.setUrl("https://gathern.co");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("المطاعم - الخبر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم الخبر");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g298545-Al_Khobar_Eastern_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الأنشطة - الخبر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("رحلات سفاري");
                    inlineKeyboardButton1.setCallbackData("رحلات سفاري");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("للمزيد من الفعاليات والنشاطات ");
                    inlineKeyboardButton2.setCallbackData("للمزيد من الفعاليات");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);


                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الأحساء")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في الأحساء.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton5 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton6 = new KeyboardButton();


                    keyboardButton1.setText("الأماكن السياحية - الأحساء");
                    keyboardButton2.setText("التسوق - الأحساء");
                    keyboardButton3.setText("المنتجعات والفنادق - الأحساء");
                    keyboardButton4.setText("التراث والثقافة - الأحساء");
                    keyboardButton5.setText("المطاعم - الأحساء");

                    keyboardButton6.setText("رجوع");


                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);
                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);
                    keyboardRow3.add(keyboardButton6);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الأماكن السياحية - الأحساء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("منتزه الملك عبدالله البيئي");
                    inlineKeyboardButton1.setCallbackData("منتزه الملك عبدالله البيئي");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("القرية الشعبية");
                    inlineKeyboardButton2.setCallbackData("القرية الشعبية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("مركز الإبداع الحرفي");
                    inlineKeyboardButton3.setCallbackData("مركز الإبداع الحرفي");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("سوق القيصرية التاريخي");
                    inlineKeyboardButton4.setCallbackData("سوق القيصرية التاريخي");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("عين الحارة");
                    inlineKeyboardButton5.setCallbackData("عين الحارة");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("عين أم سبعة");
                    inlineKeyboardButton6.setCallbackData("عين أم سبعة");

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("سوق المزارعين");
                    inlineKeyboardButton7.setCallbackData("سوق المزارعين");

                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    inlineKeyboardButton8.setText("مزرعة أبو جواد السياحية");
                    inlineKeyboardButton8.setCallbackData("مزرعة أبو جواد السياحية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
                    inlineKeyboardButton9.setText("عين الجوهرية");
                    inlineKeyboardButton9.setCallbackData("عين الجوهرية");

                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
                    inlineKeyboardButton10.setText("جبل القارة وواحة الأحساء");
                    inlineKeyboardButton10.setCallbackData("جبل القارة وواحة الأحساء");

                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
                    inlineKeyboardButton11.setText("منتزه جواثا السياحي");
                    inlineKeyboardButton11.setCallbackData("منتزه جواثا السياحي");

                    InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
                    inlineKeyboardButton12.setText("مدينة الملك عبدالله للتمور");
                    inlineKeyboardButton12.setCallbackData("مدينة الملك عبدالله للتمور");

                    List<InlineKeyboardButton> inlineKeyboardButtonList7 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();
                    inlineKeyboardButton13.setText("بحيرة الأصفر");
                    inlineKeyboardButton13.setCallbackData("بحيرة الأصفر");

                    InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();
                    inlineKeyboardButton14.setText("معمل الفخار");
                    inlineKeyboardButton14.setCallbackData("معمل الفخار");



                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton9);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton10);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton11);
                    inlineKeyboardButtonList6.add(inlineKeyboardButton12);

                    inlineKeyboardButtonList7.add(inlineKeyboardButton13);
                    inlineKeyboardButtonList7.add(inlineKeyboardButton14);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);
                    inlineButtons.add(inlineKeyboardButtonList5);
                    inlineButtons.add(inlineKeyboardButtonList6);
                    inlineButtons.add(inlineKeyboardButtonList7);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التراث والثقافة - الأحساء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("قصر خزام الأثري");
                    inlineKeyboardButton1.setCallbackData("قصر خزام الأثري");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("جامع الجبري التراثي");
                    inlineKeyboardButton2.setCallbackData("جامع الجبري التراثي");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("حي الكوت التراثي");
                    inlineKeyboardButton3.setCallbackData("حي الكوت التراثي");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("المدرسة الأميرية");
                    inlineKeyboardButton4.setCallbackData("المدرسة الأميرية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("قصر إبراهيم الأثري");
                    inlineKeyboardButton5.setCallbackData("قصر إبراهيم الأثري");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("قصر صاهود الأثري");
                    inlineKeyboardButton6.setCallbackData("قصر صاهود الأثري");

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("قصر محيرس الأثري");
                    inlineKeyboardButton7.setCallbackData("قصر محيرس الأثري");

                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    inlineKeyboardButton8.setText("متحف القهوة");
                    inlineKeyboardButton8.setCallbackData("متحف القهوة");

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
                    inlineKeyboardButton9.setText("متحف دار التراث");
                    inlineKeyboardButton9.setCallbackData("متحف دار التراث");

                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
                    inlineKeyboardButton10.setText("مسجد جواثا التاريخي");
                    inlineKeyboardButton10.setCallbackData("مسجد جواثا التاريخي");

                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
                    inlineKeyboardButton11.setText("ميناء العقير الأثري");
                    inlineKeyboardButton11.setCallbackData("ميناء العقير الأثري");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton9);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton10);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton11);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);
                    inlineButtons.add(inlineKeyboardButtonList5);
                    inlineButtons.add(inlineKeyboardButtonList6);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المطاعم - الأحساء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم الأحساء");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g298543-Al_Ahsa_Eastern_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - الأحساء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton1.setUrl("https://gathern.co");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("التسوق - الأحساء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("الأحساء مول");
                    inlineKeyboardButton1.setCallbackData("الأحساء مول");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("أسواق القرية الشعبية");
                    inlineKeyboardButton2.setCallbackData("أسواق القرية الشعبية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("الراشد تاون سكوير");
                    inlineKeyboardButton3.setCallbackData("الراشد تاون سكوير");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("العثيم مول");
                    inlineKeyboardButton4.setCallbackData("العثيم مول الأحساء");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("فوراس مول");
                    inlineKeyboardButton5.setCallbackData("فوراس مول");



                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الجبيل")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في الجبيل.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton5 = new KeyboardButton();


                    keyboardButton1.setText("الأماكن السياحية - الجبيل");
                    keyboardButton2.setText("التسوق - الجبيل");
                    keyboardButton3.setText("المنتجعات والفنادق - الجبيل");
                    keyboardButton4.setText("المطاعم - الجبيل");

                    keyboardButton5.setText("رجوع");


                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow2.add(keyboardButton3);
                    keyboardRow2.add(keyboardButton4);
                    keyboardRow3.add(keyboardButton5);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - الجبيل")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton1.setUrl("https://gathern.co");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("الأماكن السياحية - الجبيل")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("سباركيز الفناتير");
                    inlineKeyboardButton1.setCallbackData("سباركيز الفناتير");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("منتزه القناة المائية");
                    inlineKeyboardButton2.setCallbackData("منتزه القناة المائية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("شاطئ النخيل");
                    inlineKeyboardButton3.setCallbackData("شاطئ النخيل");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("الواجهة البحرية والكورنيش");
                    inlineKeyboardButton4.setCallbackData("الواجهة البحرية والكورنيش");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("شاطئ دارين");
                    inlineKeyboardButton5.setCallbackData("شاطئ دارين");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("شاطئ الفناتير");
                    inlineKeyboardButton6.setCallbackData("شاطئ الفناتير");

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("مرسى الفناتير للرحلات البحرية");
                    inlineKeyboardButton7.setCallbackData("مرسى الفناتير للرحلات البحرية");

                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    inlineKeyboardButton8.setText("ساس الجبيل");
                    inlineKeyboardButton8.setCallbackData("ساس الجبيل");

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
                    inlineKeyboardButton9.setText("النادي البحري بدارين");
                    inlineKeyboardButton9.setCallbackData("النادي البحري بدارين");



                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton9);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);
                    inlineButtons.add(inlineKeyboardButtonList5);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التسوق - الجبيل")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("الدفي مول");
                    inlineKeyboardButton1.setCallbackData("الدفي مول");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("الجبيل مول");
                    inlineKeyboardButton2.setCallbackData("الجبيل مول");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("الحويلات سنتر");
                    inlineKeyboardButton3.setCallbackData("الحويلات سنتر");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("الفناتير مول");
                    inlineKeyboardButton4.setCallbackData("الفناتير مول");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("غاليريا مول");
                    inlineKeyboardButton5.setCallbackData("غاليريا مول");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("الجبيل بلازا");
                    inlineKeyboardButton6.setCallbackData("الجبيل بلازا");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المطاعم - الجبيل")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم الجبيل");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g298544-Al_Jubail_Eastern_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("حفر الباطن")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في حفر الباطن.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();

                    keyboardButton1.setText("التسوق - حفر الباطن");
                    keyboardButton2.setText("المنتجعات والفنادق - حفر الباطن");
                    keyboardButton3.setText("المطاعم - حفر الباطن");

                    keyboardButton4.setText("رجوع");


                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow2.add(keyboardButton3);
                    keyboardRow3.add(keyboardButton4);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - حفر الباطن")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton1.setUrl("https://gathern.co");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("المطاعم - حفر الباطن")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم حفر الباطن");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g2540192-Hafar_Al_Batin_Eastern_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التسوق - حفر الباطن")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("المكان مول");
                    inlineKeyboardButton1.setCallbackData("المكان مول حفر الباطن");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("هلا مول");
                    inlineKeyboardButton2.setCallbackData("هلا مول");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);


                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("القطيف")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في القطيف.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();


                    keyboardButton1.setText("التراث والثقافة - القطيف");
                    keyboardButton2.setText("التسوق - القطيف");
                    keyboardButton3.setText("المطاعم - القطيف");

                    keyboardButton4.setText("رجوع");


                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow2.add(keyboardButton3);
                    keyboardRow3.add(keyboardButton4);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التسوق - القطيف")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("جزيرة سوق السمك");
                    inlineKeyboardButton1.setCallbackData("جزيرة سوق السمك");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("القطيف سيتي مول");
                    inlineKeyboardButton2.setCallbackData("القطيف سيتي مول");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المطاعم - القطيف")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم القطيف");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g14980406-Al_Qatif_Eastern_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التراث والثقافة - القطيف")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("حمام أبو لوزه الأثري");
                    inlineKeyboardButton1.setCallbackData("حمام أبو لوزه الأثري");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("حي المسورة التراثي");
                    inlineKeyboardButton2.setCallbackData("حي المسورة التراثي");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("متحف دارين التراثي");
                    inlineKeyboardButton3.setCallbackData("متحف دارين التراثي");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("قلعة تاروت الأثرية");
                    inlineKeyboardButton4.setCallbackData("قلعة تاروت الأثرية");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الخفجي")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في الخفجي.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();


                    keyboardButton1.setText("التسوق - الخفجي");
                    keyboardButton2.setText("المطاعم - الخفجي");

                    keyboardButton3.setText("رجوع");


                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow2.add(keyboardButton3);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المطاعم - الخفجي")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم الخفجي");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g672722-Al_Khafji_Eastern_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التسوق - الخفجي")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("مجمع قرية القصيبي");
                    inlineKeyboardButton1.setCallbackData("مجمع قرية القصيبي الخفجي");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("الخفجي مول");
                    inlineKeyboardButton2.setCallbackData("الخفجي مول");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("قروف سنتر");
                    inlineKeyboardButton3.setCallbackData("قروف سنتر");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("جازان")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر وجهتك السياحية من جازان.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton5 = new KeyboardButton();
                    KeyboardButton keyboardButton6 = new KeyboardButton();


                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton7 = new KeyboardButton();


                    keyboardButton1.setText("صبيا");
                    keyboardButton2.setText("العارضة");
                    keyboardButton3.setText("الريث");
                    keyboardButton4.setText("جيزان");
                    keyboardButton5.setText("فرسان");
                    keyboardButton6.setText("فيفاء");
                    keyboardButton7.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);
                    keyboardRow2.add(keyboardButton6);

                    keyboardRow3.add(keyboardButton7);


                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("صبيا")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في صبيا.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();


                    keyboardButton1.setText("التراث والثقافة - صبيا");
                    keyboardButton2.setText("المنتجعات والفنادق - صبيا");
                    keyboardButton3.setText("المطاعم - صبيا");

                    keyboardButton4.setText("رجوع");


                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow2.add(keyboardButton3);
                    keyboardRow3.add(keyboardButton4);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المطاعم - صبيا")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم صبيا");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g12700815-Sabya_Jizan_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - صبيا")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton1.setUrl("https://gathern.co");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("التراث والثقافة - صبيا")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("متحف جازان للآثار والتراث");
                    inlineKeyboardButton1.setCallbackData("متحف جازان للآثار والتراث");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("قصور الأدارسة الأثرية");
                    inlineKeyboardButton2.setCallbackData("قصور الأدارسة الأثرية");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);


                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("العارضة")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في العارضة.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();


                    keyboardButton1.setText("الأماكن السياحية - العارضة");
                    keyboardButton2.setText("المطاعم - العارضة");

                    keyboardButton3.setText("رجوع");


                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow2.add(keyboardButton3);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المطاعم - العارضة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم العارضة");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Tourism-g12981505-Al_Aridhah_Jizan_Province-Vacations.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الأماكن السياحية - العارضة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("بحيرة سد وادي جازان");
                    inlineKeyboardButton1.setCallbackData("بحيرة سد وادي جازان");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("منتزه العيرن الحارة");
                    inlineKeyboardButton2.setCallbackData("منتزه العيرن الحارة");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);


                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الريث")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في الريث.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();


                    keyboardButton1.setText("الأماكن السياحية - الريث");
                    keyboardButton2.setText("الأنشطة - الريث");

                    keyboardButton3.setText("رجوع");


                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow2.add(keyboardButton3);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الأنشطة - الريث")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("Yalla Hike");
                    inlineKeyboardButton1.setCallbackData("Yalla Hike");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("بعض النشاطات");
                    inlineKeyboardButton2.setCallbackData("بعض النشاطات");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);


                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الأماكن السياحية - الريث")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("وادي لجب");
                    inlineKeyboardButton1.setCallbackData("وادي لجب");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("الجبل الأسود");
                    inlineKeyboardButton2.setCallbackData("الجبل الأسود");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("بحيرة وادي بيش الفطيحه");
                    inlineKeyboardButton3.setCallbackData("بحيرة وادي بيش الفطيحه");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("بحيرة سد وادي قرى");
                    inlineKeyboardButton4.setCallbackData("بحيرة سد وادي قرى");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("بحيرة سد وادي وعال");
                    inlineKeyboardButton5.setCallbackData("بحيرة سد وادي وعال");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("جيزان")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في جيزان.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton5 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton6 = new KeyboardButton();


                    keyboardButton1.setText("الأماكن السياحية - جيزان");
                    keyboardButton2.setText("التسوق - جيزان");
                    keyboardButton3.setText("المنتجعات والفنادق - جيزان");
                    keyboardButton4.setText("المطاعم - جيزان");
                    keyboardButton5.setText("التراث والثقافة - جيزان");

                    keyboardButton6.setText("رجوع");


                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow2.add(keyboardButton3);
                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);
                    keyboardRow3.add(keyboardButton6);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المطاعم - جيزان")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم جيزان");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g1074315-Jazan_Jizan_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - جيزان")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton1.setUrl("https://gathern.co");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("الأماكن السياحية - جيزان")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("الحكير تايم");
                    inlineKeyboardButton1.setCallbackData("الحكير تايم جيزان");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("الكورنيش الشمالي");
                    inlineKeyboardButton2.setCallbackData("الكورنيش الشمالي");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("مرسى الحافة السياحي");
                    inlineKeyboardButton3.setCallbackData("مرسى الحافة السياحي");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("مرسى الأحلام");
                    inlineKeyboardButton4.setCallbackData("مرسى الأحلام جيزان");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("جزيرة أحبار السياحية");
                    inlineKeyboardButton5.setCallbackData("جزيرة أحبار السياحية");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التسوق - جيزان")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("الراشد ميغا مول");
                    inlineKeyboardButton1.setCallbackData("الراشد ميغا مول جيزان");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("كادي مول");
                    inlineKeyboardButton2.setCallbackData("كادي مول");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("سكاي مول");
                    inlineKeyboardButton3.setCallbackData("سكاي مول");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("سوق الأسر المنتجة");
                    inlineKeyboardButton4.setCallbackData("سوق الأسر المنتجة");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التراث والثقافة - جيزان")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("قلعة جازان الأثرية");
                    inlineKeyboardButton1.setCallbackData("قلعة جازان الأثرية");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("القرية التراثية");
                    inlineKeyboardButton2.setCallbackData("القرية التراثية");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);


                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("فرسان")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في فرسان.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton6 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton5 = new KeyboardButton();


                    keyboardButton1.setText("الأماكن السياحية - فرسان");
                    keyboardButton2.setText("المنتجعات والفنادق - فرسان");
                    keyboardButton4.setText("التراث والثقافة - فرسان");
                    keyboardButton6.setText("الأنشطة - فرسان");

                    keyboardButton5.setText("رجوع");


                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton6);

                    keyboardRow3.add(keyboardButton5);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - فرسان")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton1.setUrl("https://gathern.co");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("الأنشطة - فرسان")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("بعض النشاطات");
                    inlineKeyboardButton1.setCallbackData("بعض النشاطات");



                    inlineKeyboardButtonList.add(inlineKeyboardButton1);


                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الأماكن السياحية - فرسان")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("غابة القندل");
                    inlineKeyboardButton1.setCallbackData("غابة القندل");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("شاطئ الحصيص");
                    inlineKeyboardButton2.setCallbackData("شاطئ الحصيص");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("مرسى الغدير");
                    inlineKeyboardButton3.setCallbackData("مرسى الغدير");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("شاطئ رأس القرن");
                    inlineKeyboardButton4.setCallbackData("شاطئ رأس القرن");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("مرسى الحسين");
                    inlineKeyboardButton5.setCallbackData("مرسى الحسين");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التراث والثقافة - فرسان")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("قصر الرفاعي التراثي");
                    inlineKeyboardButton1.setCallbackData("قصر الرفاعي التراثي");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("القلعة العثمانية");
                    inlineKeyboardButton2.setCallbackData("القلعة العثمانية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("متحف الزيلعي البحري");
                    inlineKeyboardButton3.setCallbackData("متحف الزيلعي البحري");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("مسجد النجدي الأثري");
                    inlineKeyboardButton4.setCallbackData("مسجد النجدي الأثري");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("قرية القصار التراثية");
                    inlineKeyboardButton5.setCallbackData("قرية القصار التراثية");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("حصن الجرمل الأثري");
                    inlineKeyboardButton6.setCallbackData("حصن الجرمل الأثري");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("فيفاء")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في فيفاء.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();


                    keyboardButton1.setText("الأماكن السياحية - فيفاء");
                    keyboardButton2.setText("المنتجعات والفنادق - فيفاء");

                    keyboardButton3.setText("رجوع");


                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow2.add(keyboardButton3);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - فيفاء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton1.setUrl("https://gathern.co");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("الأماكن السياحية - فيفاء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("الملعب الصخري المنحوت في مركز جبال الحشر");
                    inlineKeyboardButton1.setCallbackData("الملعب الصخري المنحوت");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("منتزه قرضه");
                    inlineKeyboardButton2.setCallbackData("منتزه قرضه");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("منتزه الأمير محمد بن ناصر");
                    inlineKeyboardButton3.setCallbackData("منتزه الأمير محمد بن ناصر");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المدينة المنورة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر وجهتك السياحية من المدينة المنورة.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton5 = new KeyboardButton();
                    KeyboardButton keyboardButton7 = new KeyboardButton();


                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton6 = new KeyboardButton();



                    keyboardButton1.setText("المدينه المنورة");
                    keyboardButton2.setText("المهد");
                    keyboardButton3.setText("العُلا");
                    keyboardButton4.setText("ينبع");
                    keyboardButton5.setText("خيبر");
                    keyboardButton7.setText("بدر");

                    keyboardButton6.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);
                    keyboardRow2.add(keyboardButton7);

                    keyboardRow3.add(keyboardButton6);



                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("المدينه المنورة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في المدينة المنورة.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton5 = new KeyboardButton();
                    KeyboardButton keyboardButton6 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton7 = new KeyboardButton();

                    keyboardButton1.setText("الأماكن السياحية - المدينة");
                    keyboardButton2.setText("التسوق - المدينة");
                    keyboardButton3.setText("المنتجعات والفنادق - المدينة");
                    keyboardButton4.setText("التراث والثقافة - المدينة");
                    keyboardButton5.setText("المطاعم - المدينة");
                    keyboardButton6.setText("معالم التاريخ الإسلامي - المدينة");

                    keyboardButton7.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);
                    keyboardRow2.add(keyboardButton6);

                    keyboardRow3.add(keyboardButton7);


                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الأماكن السياحية - المدينة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("مزرعة السهلة السياحية");
                    inlineKeyboardButton1.setCallbackData("مزرعة السهلة السياحية");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("منتزه الأمير محمد بن عبدالعزيز بجبل أحد");
                    inlineKeyboardButton2.setCallbackData("منتزه الأمير محمد بن عبدالعزيز");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("منتزه الفلك البحري");
                    inlineKeyboardButton3.setCallbackData("منتزه الفلك البحري");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("جادة قباء");
                    inlineKeyboardButton4.setCallbackData("جادة قباء");

                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("مزرعة الأوسية السياحية");
                    inlineKeyboardButton5.setCallbackData("مزرعة الأوسية السياحية");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("وادي العقيق");
                    inlineKeyboardButton6.setCallbackData("وادي العقيق");

                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("حديقة الملك فهد");
                    inlineKeyboardButton7.setCallbackData("حديقة الملك فهد");

                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    inlineKeyboardButton8.setText("مزرعة أرياف طيبة السياحية");
                    inlineKeyboardButton8.setCallbackData("مزرعة أرياف طيبة السياحية");

                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
                    inlineKeyboardButton9.setText("مجمع الملك فهد لطباعة المصحف الشريف");
                    inlineKeyboardButton9.setCallbackData("مجمع الملك فهد لطباعة المصحف");

                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
                    inlineKeyboardButton10.setText("مركز الحكير تايم الترفيهي");
                    inlineKeyboardButton10.setCallbackData("مركز الحكير تايم الترفيهي");

                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
                    inlineKeyboardButton11.setText("مزرعة الضابطة السياحية");
                    inlineKeyboardButton11.setCallbackData("مزرعة الضابطة السياحية");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton9);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton10);
                    inlineKeyboardButtonList6.add(inlineKeyboardButton11);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);
                    inlineButtons.add(inlineKeyboardButtonList5);
                    inlineButtons.add(inlineKeyboardButtonList6);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("التسوق - المدينة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("الراشد ميغا مول");
                    inlineKeyboardButton1.setCallbackData("الراشد ميغا مول المدينة");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("بوليفارد المحمدية");
                    inlineKeyboardButton2.setCallbackData("بوليفارد المحمدية");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("العالية مول");
                    inlineKeyboardButton3.setCallbackData("العالية مول");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("النور مول");
                    inlineKeyboardButton4.setCallbackData("النور مول");

                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("المنار مول");
                    inlineKeyboardButton5.setCallbackData("المنار مول");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("رضا مول");
                    inlineKeyboardButton6.setCallbackData("رضا مول");

                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("مجمع طيبة");
                    inlineKeyboardButton7.setCallbackData("مجمع طيبة");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("التراث والثقافة - المدينة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("متحف دار المدينة");
                    inlineKeyboardButton1.setCallbackData("متحف دار المدينة");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("متحف دار القلم");
                    inlineKeyboardButton2.setCallbackData("متحف دار القلم");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("معرض محمد رسول الله");
                    inlineKeyboardButton3.setCallbackData("معرض محمد رسول الله");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("متحف حضارة طيبة");
                    inlineKeyboardButton4.setCallbackData("متحف حضارة طيبة");

                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("متحف سكة حديد الحجاز (محطة العنبرية)");
                    inlineKeyboardButton5.setCallbackData("متحف سكة حديد الحجاز");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("معرض أسماء الله الحسنى");
                    inlineKeyboardButton6.setCallbackData("معرض أسماء الله الحسنى");

                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("معرض القرآن الكريم");
                    inlineKeyboardButton7.setCallbackData("معرض القرآن الكريم");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("معالم التاريخ الإسلامي - المدينة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList7 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList8 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList9 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList10 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("مسجد الغمامة");
                    inlineKeyboardButton1.setCallbackData("مسجد الغمامة");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("مسجد علي بن أبي طالب");
                    inlineKeyboardButton2.setCallbackData("مسجد علي بن أبي طالب");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("مسجد عمر بن الخطاب");
                    inlineKeyboardButton3.setCallbackData("مسجد عمر بن الخطاب");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("موقع غزوة أحد");
                    inlineKeyboardButton4.setCallbackData("موقع غزوة أحد");

                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("مسجد الإجابة");
                    inlineKeyboardButton5.setCallbackData("مسجد الإجابة");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("مقبرة البقيع");
                    inlineKeyboardButton6.setCallbackData("مقبرة البقيع");

                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("مسجد قباء");
                    inlineKeyboardButton7.setCallbackData("مسجد قباء");
                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    inlineKeyboardButton8.setText("مسجد الجمعة");
                    inlineKeyboardButton8.setCallbackData("مسجد الجمعة");

                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
                    inlineKeyboardButton9.setText("المسجد النبوي الشريف");
                    inlineKeyboardButton9.setCallbackData("المسجد النبوي الشريف");

                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
                    inlineKeyboardButton10.setText("مسجد أبو بكر الصديق");
                    inlineKeyboardButton10.setCallbackData("مسجد أبو بكر الصديق");

                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
                    inlineKeyboardButton11.setText("مسجد بني غفار");
                    inlineKeyboardButton11.setCallbackData("مسجد بني غفار");

                    InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
                    inlineKeyboardButton12.setText("مسجد العنبرية");
                    inlineKeyboardButton12.setCallbackData("مسجد العنبرية");

                    InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();
                    inlineKeyboardButton13.setText("مسجد السقيا");
                    inlineKeyboardButton13.setCallbackData("مسجد السقيا");

                    InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();
                    inlineKeyboardButton14.setText("مسجد الفتح");
                    inlineKeyboardButton14.setCallbackData("مسجد الفتح");

                    InlineKeyboardButton inlineKeyboardButton15 = new InlineKeyboardButton();
                    inlineKeyboardButton15.setText("مسجد سلمان الفارسي");
                    inlineKeyboardButton15.setCallbackData("مسجد سلمان الفارسي");

                    InlineKeyboardButton inlineKeyboardButton16 = new InlineKeyboardButton();
                    inlineKeyboardButton16.setText("قصر عروة ابن الزبير");
                    inlineKeyboardButton16.setCallbackData("قصر عروة ابن الزبير");

                    InlineKeyboardButton inlineKeyboardButton17 = new InlineKeyboardButton();
                    inlineKeyboardButton17.setText("مسجد القبلتين");
                    inlineKeyboardButton17.setCallbackData("مسجد القبلتين");

                    InlineKeyboardButton inlineKeyboardButton18 = new InlineKeyboardButton();
                    inlineKeyboardButton18.setText("قصر سعيد ابن العاص");
                    inlineKeyboardButton18.setCallbackData("قصر سعيد ابن العاص");

                    InlineKeyboardButton inlineKeyboardButton19 = new InlineKeyboardButton();
                    inlineKeyboardButton19.setText("مسجد السيدة فاطمة");
                    inlineKeyboardButton19.setCallbackData("مسجد السيدة فاطمة");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton9);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton10);
                    inlineKeyboardButtonList6.add(inlineKeyboardButton11);
                    inlineKeyboardButtonList6.add(inlineKeyboardButton12);
                    inlineKeyboardButtonList7.add(inlineKeyboardButton13);
                    inlineKeyboardButtonList7.add(inlineKeyboardButton14);
                    inlineKeyboardButtonList8.add(inlineKeyboardButton15);
                    inlineKeyboardButtonList8.add(inlineKeyboardButton16);
                    inlineKeyboardButtonList9.add(inlineKeyboardButton17);
                    inlineKeyboardButtonList9.add(inlineKeyboardButton18);
                    inlineKeyboardButtonList10.add(inlineKeyboardButton19);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);
                    inlineButtons.add(inlineKeyboardButtonList5);
                    inlineButtons.add(inlineKeyboardButtonList6);
                    inlineButtons.add(inlineKeyboardButtonList7);
                    inlineButtons.add(inlineKeyboardButtonList8);
                    inlineButtons.add(inlineKeyboardButtonList9);
                    inlineButtons.add(inlineKeyboardButtonList10);


                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("المنتجعات والفنادق - المدينة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton1.setUrl("https://gathern.co");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المطاعم - المدينة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم المدينة المنورة");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g298551-Medina_Al_Madinah_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المهد")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في المهد.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    keyboardButton1.setText("الأماكن السياحية - المهد");

                    keyboardButton2.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow2.add(keyboardButton2);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الأماكن السياحية - المهد")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("حرات رهط البركانية");
                    inlineKeyboardButton1.setCallbackData("حرات رهط البركانية");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);


                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("العُلا")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في العُلا.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton5 = new KeyboardButton();
                    KeyboardButton keyboardButton6 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();


                    keyboardButton1.setText("الأماكن السياحية - العُلا");
                    keyboardButton2.setText("المنتجعات والفنادق - العُلا");
                    keyboardButton3.setText("التراث والثقافة - العُلا");
                    keyboardButton5.setText("المطاعم - العُلا");
                    keyboardButton6.setText("الأنشطة - العُلا");

                    keyboardButton4.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton5);
                    keyboardRow2.add(keyboardButton6);

                    keyboardRow3.add(keyboardButton4);


                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("الأماكن السياحية - العُلا")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("منتزه الحدائق التراثية");
                    inlineKeyboardButton1.setCallbackData("منتزه الحدائق التراثية");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("جبل الفيل");
                    inlineKeyboardButton2.setCallbackData("جبل الفيل");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("منتجع نخيل برزان الريفي");
                    inlineKeyboardButton3.setCallbackData("منتجع نخيل برزان الريفي");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("مقهى ومنتزه المحكر التراثي الريفي");
                    inlineKeyboardButton4.setCallbackData("مقهى ومنتزه المحكر التراثي الريفي");

                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("منتجع شلال الزراعي");
                    inlineKeyboardButton5.setCallbackData("منتجع شلال الزراعي");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("جبل القوس");
                    inlineKeyboardButton6.setCallbackData("جبل القوس");

                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("جبال الغراميل");
                    inlineKeyboardButton7.setCallbackData("جبال الغراميل");

                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    inlineKeyboardButton8.setText("مطل حرة عويرض");
                    inlineKeyboardButton8.setCallbackData("مطل حرة عويرض");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("المنتجعات والفنادق - العُلا")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton1.setUrl("https://gathern.co");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التراث والثقافة - العُلا")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("كتابات ونقوش جبل عكمه");
                    inlineKeyboardButton1.setCallbackData("كتابات ونقوش جبل عكمه");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("الحِجر (مدائن صالح)");
                    inlineKeyboardButton2.setCallbackData("الحِجر (مدائن صالح)");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("البلدة القديمة");
                    inlineKeyboardButton3.setCallbackData("البلدة القديمة");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("مدينة الخريبة الأثرية (مقابر الأسود)");
                    inlineKeyboardButton4.setCallbackData("مدينة الخريبة الأثرية");

                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("جبل أم الدرج");
                    inlineKeyboardButton5.setCallbackData("جبل أم الدرج");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("الأنشطة - العُلا")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList7 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList8 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList9 = new ArrayList<>();



                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("زيبلاين العُلا");
                    inlineKeyboardButton1.setCallbackData("زيبلاين العُلا");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("الحِجر");
                    inlineKeyboardButton2.setCallbackData("الحِجر");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("دادان تجسيد لتاريخ العلا الغني");
                    inlineKeyboardButton3.setCallbackData("دادان تجسيد لتاريخ");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("جبل عكمة");
                    inlineKeyboardButton4.setCallbackData("جبل عكمة");

                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("العُلا القديمة");
                    inlineKeyboardButton5.setCallbackData("العُلا القديمة");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("جولة موقع اليونسكو الأثري");
                    inlineKeyboardButton6.setCallbackData("جولة موقع اليونسكو الأثري");

                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("مسار البرتقال والوادي");
                    inlineKeyboardButton7.setCallbackData("مسار البرتقال والوادي");

                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    inlineKeyboardButton8.setText("تجربة جبل الفيل");
                    inlineKeyboardButton8.setCallbackData("تجربة جبل الفيل");

                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
                    inlineKeyboardButton9.setText("منتزه دراجات العلا");
                    inlineKeyboardButton9.setCallbackData("منتزه دراجات العلا");

                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
                    inlineKeyboardButton10.setText("مسار الخيول");
                    inlineKeyboardButton10.setCallbackData("مسار الخيول");

                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
                    inlineKeyboardButton11.setText("تجربة نفاذ السدو");
                    inlineKeyboardButton11.setCallbackData("تجربة نفاذ السدو");

                    InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
                    inlineKeyboardButton12.setText("تجربة اليوغا الاسترخائية وتأمل الصوت");
                    inlineKeyboardButton12.setCallbackData("تجربة اليوغا الاسترخائية");

                    InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();
                    inlineKeyboardButton13.setText("مسار الفنون الصخرية في الحجر");
                    inlineKeyboardButton13.setCallbackData("مسار الفنون الصخرية في الحجر");

                    InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();
                    inlineKeyboardButton14.setText("مسار الوادي الخفي المشغل: هوساك");
                    inlineKeyboardButton14.setCallbackData("مسار الوادي الخفي المشغل");

                    InlineKeyboardButton inlineKeyboardButton15 = new InlineKeyboardButton();
                    inlineKeyboardButton15.setText("جولة هليكوبتر العلا");
                    inlineKeyboardButton15.setCallbackData("جولة هليكوبتر العلا");

                    InlineKeyboardButton inlineKeyboardButton16 = new InlineKeyboardButton();
                    inlineKeyboardButton16.setText("للمزيد من الجولات والفعاليات");
                    inlineKeyboardButton16.setCallbackData("للمزيد من الجولات والفعاليات");

                    InlineKeyboardButton inlineKeyboardButton17 = new InlineKeyboardButton();
                    inlineKeyboardButton17.setText("Yalla Hike");
                    inlineKeyboardButton17.setCallbackData("Yalla Hike");




                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton9);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton10);
                    inlineKeyboardButtonList6.add(inlineKeyboardButton11);
                    inlineKeyboardButtonList6.add(inlineKeyboardButton12);
                    inlineKeyboardButtonList7.add(inlineKeyboardButton13);
                    inlineKeyboardButtonList7.add(inlineKeyboardButton14);
                    inlineKeyboardButtonList8.add(inlineKeyboardButton15);
                    inlineKeyboardButtonList8.add(inlineKeyboardButton16);
                    inlineKeyboardButtonList9.add(inlineKeyboardButton17);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);
                    inlineButtons.add(inlineKeyboardButtonList5);
                    inlineButtons.add(inlineKeyboardButtonList6);
                    inlineButtons.add(inlineKeyboardButtonList7);
                    inlineButtons.add(inlineKeyboardButtonList8);
                    inlineButtons.add(inlineKeyboardButtonList9);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("المطاعم - العُلا")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم العُلا");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g1802184-AlUla_Al_Madinah_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("بدر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في بدر.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();

                    keyboardButton1.setText("الأماكن السياحية - بدر");
                    keyboardButton2.setText("التراث والثقافة - بدر");
                    keyboardButton3.setText("المطاعم - بدر");

                    keyboardButton4.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);


                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المطاعم - بدر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم بدر");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g23307789-Badr_Cairo_Governorate.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الأماكن السياحية - بدر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("ساحل الرايس");
                    inlineKeyboardButton1.setCallbackData("ساحل الرايس");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("التراث والثقافة - بدر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("سوق غيقه الأثري");
                    inlineKeyboardButton1.setCallbackData("سوق غيقه الأثري");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("سوق بدر الشعبي");
                    inlineKeyboardButton2.setCallbackData("سوق بدر الشعبي");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("موقع غزوة بدر");
                    inlineKeyboardButton3.setCallbackData("موقع غزوة بدر");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton3);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("ينبع")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في ينبع.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton5 = new KeyboardButton();
                    KeyboardButton keyboardButton6 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton7 = new KeyboardButton();

                    keyboardButton1.setText("الأماكن السياحية - ينبع");
                    keyboardButton2.setText("التسوق - ينبع");
                    keyboardButton3.setText("المنتجعات والفنادق - ينبع");
                    keyboardButton4.setText("التراث والثقافة - ينبع");
                    keyboardButton5.setText("المطاعم - ينبع");
                    keyboardButton6.setText("الأنشطة - ينبع");

                    keyboardButton7.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);
                    keyboardRow2.add(keyboardButton6);

                    keyboardRow3.add(keyboardButton7);


                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }


                else if (text.equals("الأنشطة - ينبع")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("للمزيد من الفعاليات والنشاطات");
                    inlineKeyboardButton1.setCallbackData("للمزيد من الفعاليات");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("بعض النشاطات");
                    inlineKeyboardButton2.setCallbackData("بعض النشاطات");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);


                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }


                else if (text.equals("الأماكن السياحية - ينبع")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("حديقة الأمير سعود بن عبدالله");
                    inlineKeyboardButton1.setCallbackData("حديقة الأمير سعود بن عبدالله");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("حديقة الطيور");
                    inlineKeyboardButton2.setCallbackData("حديقة الطيور");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("جبل رضوى");
                    inlineKeyboardButton3.setCallbackData("جبل رضوى");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("حديقة أشجار النيم");
                    inlineKeyboardButton4.setCallbackData("حديقة أشجار النيم");

                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("جزيرة النورس");
                    inlineKeyboardButton5.setCallbackData("جزيرة النورس");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("الواجهة البحرية");
                    inlineKeyboardButton6.setCallbackData("الواجهة البحرية");

                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("شرم ينبع");
                    inlineKeyboardButton7.setCallbackData("شرم ينبع");

                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    inlineKeyboardButton8.setText("مرسى الأحلام البحري");
                    inlineKeyboardButton8.setCallbackData("مرسى الأحلام البحري");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("المنتجعات والفنادق - ينبع")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton1.setUrl("https://gathern.co");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المطاعم - ينبع")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم ينبع");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g298554-Yanbu_Al_Madinah_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التراث والثقافة - ينبع")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("سوق السويق التراثي وسوق الجابرية الأثري");
                    inlineKeyboardButton1.setCallbackData("سوق السويق وسوق الجابرية");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("متحف رضوى التراثي");
                    inlineKeyboardButton2.setCallbackData("متحف رضوى التراثي");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("ينبع البلد (سوق الليل التراثي)");
                    inlineKeyboardButton3.setCallbackData("ينبع البلد");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton3);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("التسوق - ينبع")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("مجمع الورود");
                    inlineKeyboardButton1.setCallbackData("مجمع الورود");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("الجوهرة مول");
                    inlineKeyboardButton2.setCallbackData("الجوهرة مول");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("الدانة مول");
                    inlineKeyboardButton3.setCallbackData("الدانة مول");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton3);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("خيبر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في خيبر.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();


                    keyboardButton1.setText("الأماكن السياحية - خيبر");
                    keyboardButton2.setText("التراث والثقافة - خيبر");

                    keyboardButton4.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);

                    keyboardRow2.add(keyboardButton4);


                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الأماكن السياحية - خيبر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("كهف أم جرسان");
                    inlineKeyboardButton1.setCallbackData("كهف أم جرسان");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);


                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("التراث والثقافة - خيبر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("سد البنت الأثري");
                    inlineKeyboardButton1.setCallbackData("سد البنت الأثري");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("متحف خيبر للتراث");
                    inlineKeyboardButton2.setCallbackData("متحف خيبر للتراث");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("آثار خيبر القديمة");
                    inlineKeyboardButton3.setCallbackData("آثار خيبر القديمة");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("حصن خيبر الأثري");
                    inlineKeyboardButton4.setCallbackData("حصن خيبر الأثري");

                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("قرية أبو وشيع التراثية");
                    inlineKeyboardButton5.setCallbackData("قرية أبو وشيع التراثية");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("حصن النزار التاريخي");
                    inlineKeyboardButton6.setCallbackData("حصن النزار التاريخي");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("الحدود الشمالية")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر وجهتك السياحية من الحدود الشمالية.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();



                    keyboardButton1.setText("عرعر");
                    keyboardButton2.setText("رفحاء");
                    keyboardButton3.setText("طريف");
                    keyboardButton4.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("عرعر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في عرعر.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton7 = new KeyboardButton();

                    keyboardButton1.setText("الأماكن السياحية - عرعر");
                    keyboardButton2.setText("التسوق - عرعر");
                    keyboardButton3.setText("المنتجعات والفنادق - عرعر");
                    keyboardButton4.setText("التراث والثقافة - عرعر");

                    keyboardButton7.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);

                    keyboardRow2.add(keyboardButton3);
                    keyboardRow2.add(keyboardButton4);

                    keyboardRow3.add(keyboardButton7);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الأماكن السياحية - عرعر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("بوليفارد عرعر");
                    inlineKeyboardButton1.setCallbackData("بوليفارد عرعر");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton2.setText("منتزهات مسجد الأمير عبدالله بن عبدالعزيز بن مساعد");
                    inlineKeyboardButton2.setCallbackData("منتزهات مسجد الأمير عبدالله");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);


                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("التراث والثقافة - عرعر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("متحف بسام المفلح");
                    inlineKeyboardButton1.setCallbackData("متحف بسام المفلح");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("قصر الإمارة التاريخي");
                    inlineKeyboardButton2.setCallbackData("قصر الإمارة التاريخي");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton2);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("التسوق - عرعر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("السوق الشعبي للأسر المنتجة");
                    inlineKeyboardButton1.setCallbackData("السوق الشعبي للأسر المنتجة");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("عرعر مول");
                    inlineKeyboardButton2.setCallbackData("عرعر مول");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("فالي مول");
                    inlineKeyboardButton3.setCallbackData("فالي مول");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton3);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("المنتجعات والفنادق - عرعر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton1.setUrl("https://gathern.co");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("رفحاء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في رفحاء.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    keyboardButton1.setText("المنتجعات والفنادق - رفحاء");
                    keyboardButton2.setText("التراث والثقافة - رفحاء");

                    keyboardButton3.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);

                    keyboardRow2.add(keyboardButton3);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - رفحاء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton1.setUrl("https://gathern.co");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التراث والثقافة - رفحاء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("سوق لينه التراثي التاريخي");
                    inlineKeyboardButton1.setCallbackData("سوق لينه التراثي التاريخي");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("قرية زبالا الأثرية");
                    inlineKeyboardButton2.setCallbackData("قرية زبالا الأثرية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("بركة جميماء الأثرية بدرب زبيدة التاريخي");
                    inlineKeyboardButton3.setCallbackData("بركة جميماء الأثرية");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("متحف للماضي أثر");
                    inlineKeyboardButton4.setCallbackData("متحف للماضي أثر");



                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton4);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("طريف")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في طريف.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    keyboardButton1.setText("المنتجعات والفنادق - طريف");
                    keyboardButton2.setText("الأماكن السياحية - طريف");

                    keyboardButton3.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);

                    keyboardRow2.add(keyboardButton3);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - طريف")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton1.setUrl("https://gathern.co");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الأماكن السياحية - طريف")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("جبل أقرن البركاني");
                    inlineKeyboardButton1.setCallbackData("جبل أقرن البركاني");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);


                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("الجوف")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر وجهتك السياحية من الجوف.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);

                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();



                    keyboardButton1.setText("سكاكا");
                    keyboardButton2.setText("القريات");
                    keyboardButton3.setText("دومة الجندل");
                    keyboardButton4.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                else if (text.equals("سكاكا")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في سكاكا.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton5 = new KeyboardButton();

                    keyboardButton1.setText("التسوق - سكاكا");
                    keyboardButton2.setText("المنتجعات والفنادق - سكاكا");
                    keyboardButton3.setText("التراث والثقافة - سكاكا");
                    keyboardButton4.setText("المطاعم - سكاكا");

                    keyboardButton5.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);

                    keyboardRow2.add(keyboardButton3);
                    keyboardRow2.add(keyboardButton4);

                    keyboardRow3.add(keyboardButton5);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);
                    keyboardRowList.add(keyboardRow3);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - سكاكا")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton1.setUrl("https://gathern.co");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المطاعم - سكاكا")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم سكاكا");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g2275811-Sakaka_Jouf_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التراث والثقافة - سكاكا")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("أعمدة الرجاجيل الأثرية");
                    inlineKeyboardButton1.setCallbackData("أعمدة الرجاجيل الأثرية");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("مطعم قصر إبراهيم العيشان التراثي");
                    inlineKeyboardButton2.setCallbackData("مطعم قصر إبراهيم العيشان");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("حي الضلع التراثي التاريخي");
                    inlineKeyboardButton3.setCallbackData("حي الضلع التراثي التاريخي");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("قلعة زعبل التاريخية");
                    inlineKeyboardButton4.setCallbackData("قلعة زعبل التاريخية");

                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("بئر سيسرا الأثري");
                    inlineKeyboardButton5.setCallbackData("بئر سيسرا الأثري");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("التسوق - سكاكا")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("سوق الجوف الشعبي");
                    inlineKeyboardButton1.setCallbackData("سوق الجوف الشعبي");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("الجوف بلازا");
                    inlineKeyboardButton2.setCallbackData("الجوف بلازا");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("الشمال مول");
                    inlineKeyboardButton3.setCallbackData("الشمال مول");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("الجوف سنتر");
                    inlineKeyboardButton4.setCallbackData("الجوف سنتر");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton4);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("القريات")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في القريات.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    //KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();


                    //keyboardButton1.setText("الأماكن السياحية - القريات");
                    keyboardButton1.setText("المنتجعات والفنادق - القريات");
                    keyboardButton2.setText("التراث والثقافة - القريات");

                    keyboardButton3.setText("رجوع");

                    //keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);

                    keyboardRow2.add(keyboardButton3);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("المنتجعات والفنادق - القريات")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("المنتجعات والفلل");
                    inlineKeyboardButton2.setText("الفنادق");
                    inlineKeyboardButton1.setUrl("https://gathern.co");
                    inlineKeyboardButton2.setUrl("https://www.almosafer.com");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("التراث والثقافة - القريات")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("قلعة كاف التاريخية");
                    inlineKeyboardButton1.setCallbackData("قلعة كاف التاريخية");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("دومة الجندل")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في دومة الجندل.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();


                    keyboardButton1.setText("الأماكن السياحية - دومة الجندل");
                    keyboardButton2.setText("التراث والثقافة - دومة الجندل");

                    keyboardButton3.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);

                    keyboardRow2.add(keyboardButton3);

                    keyboardRowList.add(keyboardRow1);
                    keyboardRowList.add(keyboardRow2);


                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                else if (text.equals("الأماكن السياحية - دومة الجندل")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("بحيرة دومة الجندل السياحية");
                    inlineKeyboardButton1.setCallbackData("بحيرة دومة الجندل السياحية");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("مدينة التمور");
                    inlineKeyboardButton2.setCallbackData("مدينة التمور");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);


                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("التراث والثقافة - دومة الجندل")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("متحف الجوف الإقليمي");
                    inlineKeyboardButton1.setCallbackData("متحف الجوف الإقليمي");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("قلعة مارد التاريخية");
                    inlineKeyboardButton2.setCallbackData("قلعة مارد التاريخية");

                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("حي الدرع التاريخي ومسجد عمر ابن الخطاب");
                    inlineKeyboardButton3.setCallbackData("حي الدرع التاريخي");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else if (text.equals("شكرًا لك!")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("أرجو أن أكون خير عونٍ لك وأمددك بما تحتاج،\n إلى لقاءٍ آخر في رحلةٍ قريبة!❤️")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    keyboardButton1.setText("وجهة سياحية أخرى");
                    keyboardButton2.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);

                    keyboardRowList.add(keyboardRow1);
                    replyKeyboardMarkup.setKeyboard(keyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);


                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

                else {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا، قم باختيار أحد الخيارات الظاهرة لديك.")
                            .setParseMode(ParseMode.MARKDOWN);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

            }
        }

        else if (update.hasCallbackQuery()) {
            Message message = update.getCallbackQuery().getMessage();
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();

            SendMessage sendMessage = new SendMessage().setParseMode(ParseMode.MARKDOWN).setChatId(message.getChatId());



            // الأماكن السياحية - الرياض
            if (data.equals("ليفيلز")){
                sendMessage.setText("\n\n ليفيلز: مجمع راقي يضم مجموعة من المطاعم بجلسات داخلية وخارجية مطلة على طريق الدائري الشمالي.\n" + "https://www.google.com/maps/search/?api=1&query=25.34738999999999,49.6141472\n\n");
            }
            else if(data.equals("حدائق الفراولة المعلقة بالعمارية")){
                sendMessage.setText("\n\n حدائق الفراولة المعلقة بالعمارية: إذا كنت من محبين الفراولة وتريد أن تشاهد شكل أشجارها وبذورها وطريقة زراعتها، فحديقة الفراولة المعلقة تتيح لك فرصة التعرف على كل هذا وعيش متعة قطفها واختيار الفراولة التي ترغب بها.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.8065803,46.4302665 \n" );
            }
            else if(data.equals("منتجع ريف كافيه")){
                sendMessage.setText("\n\n منتجع ريف كافيه: مطعم ومقهى نسائي في مزرعة في العمارية لمن يبحث عن الهدوء والبعد عن صخب المدينة\n\n" + "\n https://www.google.com/maps/place/24%C2%B050'48.8%22N+46%C2%B028'14.3%22E/@24.846884,46.4706345,15z \n" );
            }
            else if(data.equals("مطعم ومتحف المزرعة التراثي")){
                sendMessage.setText("\n\n مطعم ومتحف المزرعة التراثي: يتميز المطعم بفن معماره التراثي ومسطحاته الخضراء وأنواع الجلسات المختلفة حيث جعله منتزهاً ومطعماً متكاملاً لكافة أفراد العائلة بما يحتوي من قسم الملاهي وأنشطة ترفيهية للأطفال وحديقة حيوانات المزرعة. كما يقدم المطعم أرقى الأطباق الشرقية والغربية الشهيرة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6145811,46.6702236 \n" );
            }
            else if(data.equals("ميدان الرماية بالدرعية")){
                sendMessage.setText("\n\n ميدان الرماية بالدرعية: تقدم خدمات وأنشطة وبرامج نوعية في التدريب على الرماية والتوعية حول الاستخدام الأمثل والسلمي للأسلحة المرخصة ورفع الوعي لدى المجتمع حول الأسلحة وطريقة استخدامها والرماية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7405023,46.584138 \n" );
            }
            else if(data.equals("عود سكوير")){
                sendMessage.setText("\n\n عود سكوير: يحتوي على العديد من المطاعم الفاخرة والمقاهي الراقية والمتاجر المتنوعة من الأسماء الشهيرة والمتميزة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.675052,46.6250053 \n" );
            }
            else if(data.equals("الثغر بلازا")){
                sendMessage.setText("\n\n الثغر بلازا: مجمع جميل وهادئ ويحتوي على خيارات كثيرة ومختلفة من المطاعم والمقاهي بجلسات داخلية وخارجية، المجمع متكامل ومتنوع ويعتبر من 8 من أفضل مجمعات الرياض كما يضم المجمع العديد من المحلات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7535047,46.5835 \n" );
            }
            else if(data.equals("تركي سكوير")){
                sendMessage.setText("\n\n تركي سكوير: عبارة عن مجمع مطاعم ومقاهي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6754716,46.6682049 \n" );
            }
            else if(data.equals("البوليفارد")){
                sendMessage.setText("\n\n البوليفارد: مجمع تجاري مفتوح في الهواء الطلق؛ يضم المشروع فندقاً بخدمات خمس نجوم. هذا بالإضافة إلى مساحات تجارية خارجية مخصصة للمطاعم والمقاهي العالمية بإطلالة على حدائق ومسطحات مائية مصممة بشكل فني أنيق ومزودة بخدمة صف السيارات وخدمة كبار الشخصيات. كما يضم المشروع نادي صحي ومكاتب تجارية فاخرة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.750658,46.6133892 \n" );
            }
            else if(data.equals("يو ووك")){
                sendMessage.setText("\n\n يو ووك: مجمع يحتوي على مطاعم ومقاهي ومحلات وقاعة سينما.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7404411,46.62661320000001 \n" );
            }
            else if(data.equals("روبين بلازا")){
                sendMessage.setText("\n\n روبين بلازا: مجمع جميل بتصميم رائع تتوسطة النوافير وتطل عليها المطاعم والمقاهي. يعتبر من أفضل مجمعات الرياض ويحتوي على مكتبة جرير وهو المالك للمجمع، ويضم مصليات ودورات مياة ومهيأ لذوي الاحتياجات الخاصة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.75244340000001,46.6254933 \n" );
            }
            else if(data.equals("وودي بارك")){
                sendMessage.setText("\n\n وودي بارك: هي عبارة عن محمية طيور والحيوانات الأليفة وتجربة فريدة لك ولأطفالك لإطعامها وكذلك ألعاب أطفال وكيدز كلوب ومركز ترفيهي وألعاب حركية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.8541395,46.8033477 \n" );
            }
            else if(data.equals("فيورنزا لابيازا")){
                sendMessage.setText("\n\n فيورنزا لابيازا: مجمع يحتوي على العديد من المحلات والمطاعم والمقاهي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7354737,46.6471921 \n" );
            }
            else if(data.equals("القرية النجدية")){
                sendMessage.setText("\n\n القرية النجدية: نقدم لكم قائمة طعام مميزة جدا من مجموعة متنوعة من الأطباق المحلية السعودية التي ستجعل تجربة تناول الطعام الخاصة بكم خاصة جداً ولا تنسى\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.8129216,46.6472709 \n" );
            }

            else if(data.equals("برج الفيصلية")){
                sendMessage.setText("\n\n برج الفيصلية: أول ناطحة سحاب في الرياض ومعلم معروف من معالم السياحة في الرياض العالمية. ويضم البرج مركزا للتسوق ومطاعم عالمية وفنادق وشقق وصالة للاحتفالات ويتميز البرج بتصميمة الهرمي الجميل تعتلية كرة زجاجية توفر إطلالات علوية على العاصمة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6905765,46.685097 \n" );
            }
            else if(data.equals("مجمع الضيافة")){
                sendMessage.setText("\n\n مجمع الضيافة: من أرقى وأجمل المجمعات الجديدة بتصميم رائع ومميز بطابع تراثي نجدي يقع في حي النخيل الدايري الشمالي ويعد من أهم معالم السياحة في الرياض ويتميز بجلساتة الخارجية في الهواء الطلق وممرات مائية جميلة ويضم عددا من المطاعم العالمية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7502064,46.6236346 \n" );
            }
            else if(data.equals("ذا زون")){
                sendMessage.setText("\n\n ذا زون: معلم من معالم السياحة في الرياض ويعد من أكبر المجمعات التجارية في العاصمة، ويضم مطاعم ومقاهي ومتاجر عالمية تطل على بحيرة مائية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7318809,46.649382 \n" );
            }
            else if(data.equals("منطقة 303 بمركز الملك عبدالله المالي")){
                sendMessage.setText("\n\n منطقة ٣٠٣: مكان بمدينة الملك يضم العديد من المطاعم والجلسات الحرة في الهواء، ويناسب جميع أفراد العائلة. يعرض بالمكان فعاليات ونشاطات غنائية وذلك في إجازة آخر الأسبوع.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.76195599999999,46.6404337 \n" );
            }
            else if(data.equals("شارع التحلية")){
                sendMessage.setText("\n\n شارع التحلية: يضم مجموعة كبيرة من متاجر لأفخر الماركات العالمية ومعارض الموضة التي تبيع أرقى أنواع الملابس والحقائب والأحذية والمجوهرات والعطورات وغيرها، كما فيه أيضا بعض متاجر الهايبر ماركت.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.69905600000001,46.6916036 \n" );
            }
            else if(data.equals("برج المملكة")){
                sendMessage.setText("\n\n برج المملكة: برج المملكة واحداً من أعلى الأبراج في المملكة ويبلغ ارتفاعه ثلاث مائة متر ويعد من أهم أماكن السياحة في الرياض. يضم البرج مركز للتسوق ومطاعم عالمية مختلفة وأجنحة مكتبية وشقق سكنية إضافة إلى فندق الفورسيزونز العالمي ويحوي كذلك جسرا معلقا (جسر المشاهدة) الذي يوفر إطلالات بانورامية على مدينة الرياض.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7111837,46.673401 \n" );
            }

            else if(data.equals("واجهة الرياض")){
                sendMessage.setText("\n\n واجهة الرياض: تعتبر أهم معالم السياحة في الرياض والمقصد الأول للسائح لجمال المكان وتنوع الخيارات وكثرة المطاعم والمقاهي\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.8414096,46.733338 \n" );
            }
            else if(data.equals("ريفر ووك")){
                sendMessage.setText("\n\n ريفر ووك: مجمع أنيق وجديد يحتوي على العديد من المطاعم والمقاهي ومساحات كبيرة للمشي والاستمتاع بالأجواء في أرجاء المجمع. يضم المجمع مقاهي ومطاعم بجلسات متنوعة ما بين داخلية وخارجية، كذلك نادي رياضي نسائي ومحل للورد.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.772353,46.6977378 \n" );
            }
            else if(data.equals("مجمع سدرة")){
                sendMessage.setText("\n\n مجمع سدرة: هو الوجهة التي تحتضن مجموعة مطاعم ومقاهي عالمية تلبي جميع الأذواق الرفيعة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7785371,46.7338138 \n" );
            }

            else if(data.equals("سوق عبيه للأسر المنتجة بالدرعية")){
                sendMessage.setText("\n\n سوق عبيه: مركز مخصص لدعم الأسر المنتجة، يضم متاجر متنوعة مثل الحرف اليدوية والطبخ والرسم والملبوسات والتحف الأثرية.\n\n" + "\n https://www.google.com/maps/place/24%C2%B048'27.1%22N+46%C2%B039'31.5%22E/@24.8075237,46.6587528,17z \n" );
            }
            else if(data.equals("فيريندا اف اند بي")){
                sendMessage.setText("\n\n فيرندا اف اند بي: مجمع مطاعم ومقاهي يتميز بتصميمة الجميل وممراته المائية الرائعة إذ يحتوي على حدائق ونافورات مائية تطل عليها جلسات المطاعم والمقاهي الخارجية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7670597,46.65958289999999 \n" );
            }
            else if(data.equals("فورتوري")){
                sendMessage.setText("\n\n فورتوري مول: مجمع تجاري من أحدث المجمعات في الرياض، يتكون من دور سفلي ببحيرة جذابة ودور علوي مطل على البحيرة والنافورة ويعتبر من أفضل مجمعات الرياض. يضم أكثر من 20 محلا تجاريا للعطور والعبايات وبيع الملابس والعديد من المطاعم والكافيهات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7135517,46.6752957 \n" );
            }

            else if(data.equals("عالية بلازا")){
                sendMessage.setText("\n\n عالية بلازا: مجمع تجاري يحتوي على العديد من المتاجر والمطاعم والمقاهي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7135517,46.6752957 \n" );
            }
            else if(data.equals("ريف سنتر")){
                sendMessage.setText("\n\n ريف سنتر: يحاكي قرية أوروبية جبلية لتتمتع بالإطلالات المتدرجة الرائعة وسواء اخترت الجلوس في الشرفات الأمامية أو الأسطح العلوية أو في أجواء مكيفة فتأكد أنك سترسم في ذاكرتك تجربة لا تنسى.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7135517,46.6752957 \n" );
            }

            // الأنشطة - الرياض

            else if(data.equals("جسر المشاهدة")){
                sendMessage.setText("\n\n جسر المشاهدة: على مد البصر، يقدم مركز المملكة رؤية مستقبلية من خلال جسر المشاهدة الذي يمنح زواره إطلالة رائعة لا مثيل لها على مدينة الرياض. \n\n أسعار التذاكر: \n ٦٩ ريالًا للبالغ\n ٢٣ ريالًا للطفل دون سن ١٠ سنوات \n مجانًا للرضع أقل من سنتين \n\n للتواصل: +966111122222 \n\n الموقع: https://www.google.com/maps/dir/?daddr=27.570371,41.6186456 \n\n تصفح عبر: https://kingdomcentre.com.sa/ar/articles/?sky-bridge-ar\n \n\n" + "\n \n" );
            }
            else if(data.equals("سفاري نوفا")){
                sendMessage.setText("\n\n سفاري نوفا: يتميز المنتجع بتصميم أّخاذ، ومستوحى من طراز الأكواخ ومحاطا بعالم بديع من الحياة الب ّرية، والتي ستأخذك برحلة إلى صحاري أفريقيا دون أن تُجاوز رمال الجزيرة  العربية! فرغم افتتاحها قبل مدة قريبة لجميع الزوار –كانت الزيارات محصورة على الحجوزات المسبقة- إلا أنَّها سرعان ما أصبحت وجهة سياحية استثنائية لقضاء صباح جميل؛ لذا سنستعرض هنا أبرز الأماكن والمميزات في سفاري نوفا.\n" + "موقع سفاري نوفا على الويب: \n https://www.nofaresorts.com/ver/tr/en-nofa-african-resort.html \n\n موقع الفندق على الويب: \n https://www.radissonhotels.com/ar-ae/hotels/radisson-collection-riyadh-nofa-resort \n\n الموقع الجغرافي: \n https://www.google.com/maps/place//data=!4m2!3m1!1s0x3e28ddb041849325:0xb29a756b1a64cb0e?source=g.page.share" );
            }
            else if(data.equals("Yalla Hike")){
                sendMessage.setText("\n\n يلا هايك: مجموعة یلا ھایك لتنظیم رحلات المغامرة والاثارة في المملكة العربیة السعودیة، احجز مغامرتك واستمتع بعطلتك الأسبوعیة، یوفر لك فرصة لكسر الروتین الممل واكتشاف أماكن جدیدة، متضمن: النقل - أدلة المشي لمسافات طویلة - أدلة سیاحیة سعودیة معتمدة - أنشطة ترفیھیة متنوعة - المعسكرات - الوجبات الخفیفة والمشروبات الساخنة - الوجبات - المساعدات الطبیة. \n\n" + "https://instagram.com/yallahike?utm_medium=copy_link\n\n");
            }
            else if(data.equals("Hike Mania Club")){
                sendMessage.setText("\n\n Hike Mania Club: \n شركة رحلات ھایكنج ومغامرات مرخصة من ھیئة السیاحة السعودیة، عودة الى منطقة العماریة الجمیلة وأحد مواقعنا الممیزة جبل السكین، استعد لتجربة ھایك آمنة وممتعة.\n\n" + "https://instagram.com/clubhikemania?utm_medium=copy_link\n\n");
            }
            else if(data.equals("Hike Max")){
                sendMessage.setText("\n\n هايك ماكس: ترفیھ المشي بین الجبال تستھدف مجموعة ھایك ماكس أفراد الأسرة كاملة من الأطفال إلى الكبار، و تخلل رحلاتھم فعالیات متنوعة مناسبة لجمیع أفراد الأسرة و بالإضافة إلى وجود ترخیص من وزارة السیاحة. \n\n https://instagram.com/hike.max?utm_medium=copy_link\n\n");
            }
            else if(data.equals("Hike Mania Trips")){
                sendMessage.setText("Hike Mania Trips: \nاقض صیفك و استمتع بالأجواء العلیلة في املج اھم الوجھات البحریة على ساحل البحر الأحمر حیث ترحب بالزوار من كافة أنحاء المملكة، وتتمیز بالجو المعتدل طوال العام، میاه البحر الشفافة، ووجود العدید من الجزر الرائعة. تجربة جدیدة ومختلفة. \n\n https://instagram.com/trips.hikemania?utm_medium=copy_link\n\n");
            }
            else if(data.equals("Riyadh Hiking")){
                sendMessage.setText("\n\nRiyadh Hiking: \nسفاري ورمال بوردینج، من الأنشطة: التنزه والتخییم، ألعاب، الاستمتاع بالطبیعیة الخلابة. \n\n" + "https://instagram.com/riyadh.hiking?utm_medium=copy_link\n\n");
            }
            else if(data.equals("منتجع الفروسية")){
                sendMessage.setText("\n\n منتجع الفروسیة العالمي: مفھوم جدید في عالم الفروسیة والترفیه یھتم بتقدیم بیئة عالیة المستوى للنساء والأطفال وفقا لتطلعات الشخصیات المهمة.\n\n" + "Instagram:\n@ie_resort\n\n");
            }
            else if(data.equals("حدائق الفراولة")){
                sendMessage.setText("\n\n حدائق الفراولة المعلقة: منتجع عطلات یقدم الأنشطة المتعلقة بالمزرعة في العماریة، من الأنشطة وأھمھا: قطف الفراولة.\n\n" + "Instagram:\n@hanging_strawberry_gardens_\n\n");
            }
            else if(data.equals("Doos Karting")){
                sendMessage.setText("\n\n دووس كارتنج: عش جمیع التجارب الممتعة في دووس كارتنج استمتع بالسباق في مسار الكارتنج الكھربائي الداخلي متعدد المستویات في الریاض، تستطیع أن تقضي وقتاً ممتعاً مع أصدقائك وعائلتك، من الخدمات لتجعل تجربتك أكثر راحة: منطقة جلوس مریحة، وجبات خفیفة وسندویشات، مشروبات ساخنة وباردة، كبائن لتغییر الملابس وانترنت مجاني.\n\n" + "https://dooskarting.com/?gclid=Cj0KCQjw_8mHBhClARIsABfFgph_KZc2ZSAxvIwSNJwAPyBm0Rk1jVe5mPX1\n\n");
            }
            else if(data.equals("ميدان ديراب")){
                sendMessage.setText("\n\n ميدان ديراب: وجھة ریاضیة وترفیھیة مدعومة بمناطق جذب مختلفة تناسب جمیع أفراد العائلة لممارسة تجارب ومغامرات فریدة في مجتمع نمط حیاة صحي ومتوازن.\n\n" + "https://instagram.com/dirabpark?utm_medium=copy_link\n\n");
            }
            else if(data.equals("مغامرة الطيران")){
                sendMessage.setText("\n\n مغامرة الطيران: جرب شي جدید وحلّق فوق الأرض مع مغامرة الطیران.\n\n" + "https://instagram.com/saudidzen\n\n");
            }
            else if(data.equals("غرفة الهروب")){
                sendMessage.setText("\n\n غرفة الهروب: لعبة تفاعلیة رائعة بكاملھا، تضعك في أدوار مختلفة، وتثیر جمیع حواسك وتحرك خيالك.\n\nInstagram:\n@game_over_riyadh");
            }
            else if(data.equals("للمزيد من الفعاليات")){
                sendMessage.setText("\n\n للمزيد من الفعاليات والنشاطات:\n\n" + "https://www.haosaudi.com/\n\n");
            }

            //المنتزهات والترفيه - الرياض
            else if(data.equals("نادي الفارسة النسائي للفروسية")){
                sendMessage.setText("\n\n نادي الفارسة النسائي للفروسية: مركز ترفيهي وتدريبي لركوب الخيل للنساء والأطفال، مع حديقة ألعاب ومصلى وسوبر ماركت وجلسات قهوة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.9221923,46.8347993 \n" );
            }
            else if(data.equals("ذا وي اوت (طريق الهروب)")){
                sendMessage.setText("\n\n ذا وي آوت (طريق الهروب): هي محاولة الهروب من غرفة تحتجز فيها أنت وأصحابك أمامكم 60 دقيقة لحل الألغاز والهروب من الغرفة، بالطبع يمكنكم الاستعانة بالأشياء المخفية بالغرفة لتساعدكم.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7763888,46.5779328 \n" );
            }
            else if(data.equals("سفوري لاند (العثيم مول)")){
                sendMessage.setText("\n\n سفوري لاند (العثيم مول): تعد واحدة من أفضل أماكن ترفيه في الرياض للأطفال، فهي عبارة عن مدينة ملاهي تضم أنواعاً لا تحصى من الألعاب الممتعة والألعاب الإلكترونية، مع مطاعم وكافيهات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.68599500000001,46.774714 \n" );
            }

            else if(data.equals("ذا سيكرت روم")){
                sendMessage.setText("\n\n ذا سيكرت روم: لعبة الهروب الأولى من نوعها على مستوى المملكة. \n\n للحجز: https://www.thesecretroomsa.com/\n \n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7135517,46.6752957 \n" );
            }
            else if(data.equals("أحاجي")){
                sendMessage.setText("\n\n أحاجي: لعبة واقعية تفاعلية لمن يرغب بتجربة شيء جديد ومثير في الرياض! الهدف سهل وكله تحدي: حل الأحجية. حاول تهرب من الغرفة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.812334,46.66936399999999 \n" );
            }
            else if(data.equals("مركز أسبار الترفيهي")){
                sendMessage.setText("\n\n مركز اسبار للبولينج: يعد واحد من أفضل أماكن ترفيه في الرياض حيث يمكن لعب البولينج والألعاب الإلكترونية وأيضا بلياردو وتنس ويحتوي أيضا على أماكن لبيع القهوة والعصير ويمتاز بوجود ألعاب الواقع الافتراضي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.84309937798182,46.76257610321045 \n" );
            }

            else if(data.equals("ريسس")){
                sendMessage.setText("\n\n ريسس: هو عبارة عن مركز ترفيهي رائع ومغلق لعشاق الأجهزة الإلكترونية والألعاب والبلايستيشن للكبار والصغار والشباب، مع مكان مخصص للبنات، وكافيه راقي وقهوة فاخرة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7404737,46.8045687 \n" );
            }
            else if(data.equals("فزز هوا النسائية")){
                sendMessage.setText("\n\n فزز هوا النسائي: فزز هوا هو أحد المراكز الترفيهية المميزة التي تناسب جميع أفراد العائلة. يقدم المركز العاب هوائية فريدة من نوعها وذات مستوى عالمي، مثل: ويب اوت، تحديات تفاعلية، الزحليقة، وعقبات النينجا وغيرها الكثير. هو مركز مهيئ ومكيف بالكامل.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.8183348,46.78146520000001 \n" );
            }
            else if(data.equals("واحة المرح (غرناطة مول)")){
                sendMessage.setText("\n\n واحة المرح (غرناطة مول): عد أكبر مدينة ألعب من نوعها ضمن المجمعات التجارية وتحتوي على مجموعة كبيرة من الألعاب من مختلف الأنواع والمناسبة لجميع الأعمار وتبلغ مساحتها 7000 متر مربع.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.781814,46.7302209 \n" );
            }

            else if(data.equals("جيليتش")){
                sendMessage.setText("\n\n جيليتش: يعد واحد من أفضل أماكن ترفيه في الرياض لمحبين العاب الفيديو ويحتوي أيضا على أماكن لبيع القهوة والعصير ويمتاز بوجود ألعاب  الواقع الافتراضي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7135517,46.6752957 \n" );
            }
            else if(data.equals("واي فاي بولينج")){
                sendMessage.setText("\n\n واي فاي بولينج: هو عبارة عن صالة بولينج وبلياردو وألعاب ثلاثية الأبعاد وألعاب أخرى متنوعة بقسم مخصص للرجال وآخر للنساء. يضم المركز مطعم وكافيه ومصلى، ويتميز بهدوئه وأسعاره المعقولة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6991883,46.78020619999999 \n" );
            }
            else if(data.equals("فيرستيمنت")){
                sendMessage.setText("\n\n فيرستيمنت بينتبول: لعبة حرب البينتبول هي لعبة تنافسية تكون بين فريقين داخل مكان مغلق شبيه بالثكنة العسكرية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.8488481,46.7814478 \n" );
            }

            else if(data.equals("الحكير تايم (الربوة)")){
                sendMessage.setText("\n\n الحكير تايم (الربوة): عبارة عن مدينة ملاهي تضم أنواعاً لا تحصى من الألعاب الممتعة والألعاب الإلكترونية، مع مطاعم وكافيهات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6925673,46.7647916 \n" );
            }
            else if(data.equals("المدينة الثلجية (العثيم مول)")){
                sendMessage.setText("\n\n المدينة الثلجية (العثيم مول): تمتاز بتوفير 12 نشاط ترفيهي متنوع مثل: زلاجات الثلج، ممرات السلالم والحبال، سيارات الجليد والمنحدرات الثلجية وأكواخ الثلج وأنابيب الجليد وحديقة المغامرات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6856998,46.7751323 \n" );
            }
            else if(data.equals("حديقة الحيوانات بالملز")){
                sendMessage.setText("\n\n حديقة الحيوانات بالملز: عبارة عن أدغال أفريقية على أراضي المملكة العربية السعودية حيث تحتوي على الكثير من الحيوانات بمختلف الأنواع والجنسيات والتي تأتي من مختلف قارات العالم فضلا عن أندر أنواع الحيوانات والتي شارف أغلبها على الانقراض.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6753198,46.7375011 \n" );
            }

            else if(data.equals("حديقة مكتبة الملك فهد الوطنية")){
                sendMessage.setText("\n\n حديقة مكتبة الملك فهد الوطنية: تضم حديقة المكتبة في مدينة الرياض بحيرة صناعية متعرجة، وهي أبرز العناصر الجذابة في الحديقة والذي يضيف لها شكل جمالي إضافي الهيكل الخرساني ذو شكل الأقواس، ويصب من خلاله شلال، كما تضم ثلاث نوافير جميلة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6855614,46.68652069999999 \n" );
            }
            else if(data.equals("سباركيز (بانوراما)")){
                sendMessage.setText("\n\n سباركيز (بانوراما): منتزه ترفيهي للعائلة ومركز للعب للأطفال ومكان إقامة حفلات أعياد الميلاد. تجربة ركوب الخيل رائعة، وألعاب الممرات مع الترفيه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6925674,46.6694302 \n" );
            }
            else if(data.equals("حديقة الأمير عبدالعزيز بن عياف")){
                sendMessage.setText("\n\n حديقة الأمير عبدالعزيز بن عياف بالحمراء: تعتبر متنفسا لأهالي الرياض ومن أهم عناصرها ساحة وممر مشاة حول الموقع، وتشمل النوافير وساحة العروض وسط الحديقة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.8339503,46.6456252 \n" );
            }

            else if(data.equals("حديقة العليا")){
                sendMessage.setText("\n\n حديقة العليا: حديقة العليا الرياض هي واحدة من أجمل حدائق الرياض عاصمة المملكة العربية السعودية، وتضم مساحات طبيعية وترفيهية واسعة للسكان.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.680615884567505,46.682796478271484 \n" );
            }
            else if(data.equals("منتزه الملك عبدالله بالملز")){
                sendMessage.setText("\n\n منتزه الملك عبدالله بالملز: هو عبارة عن منتزه ضخم يضم العديد من المساحات الخضراء ومناطق للعب الأطفال وأماكن جلوس مظللة ونافورة مياه راقصة ومصلى وأماكن لبيع المقرمشات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6665214,46.7370716 \n" );
            }
            else if(data.equals("حديقة الوطن بالمربع")){
                sendMessage.setText("\n\n حديقة الوطن بالمربع: متنزه كبير يضم حديقة نخيل ويوفر جولات على متن القارب وألعابًا للأطفال تحت (برج مياه الرياض).\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6449364,46.7115062 \n" );
            }

            else if(data.equals("منتزهات المربع المفتوحة")){
                sendMessage.setText("\n\n منتزهات المربع المفتوحة: من أروع الأماكن على مستوى المملكة من ناحية الجو والطبيعة الجبلية والسهول التي تشكل بيئةً جاذبة للمتنزهين.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6444574,46.7094248 \n" );
            }
            else if(data.equals("الحكير تايم (الملقا)")){
                sendMessage.setText("\n\n الحكير تايم (الملقا): عبارة عن مدينة ملاهي تضم أنواعاً لا تحصى من الألعاب الممتعة والألعاب الإلكترونية، مع مطاعم وكافيهات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.820833559930517,46.60169184207916 \n" );
            }
            else if(data.equals("المركز العالمي للبولينج")){
                sendMessage.setText("\n\n المركز العالمي للبولينج: هو أكبر صالة بولينج في المملكة العربية السعودية ويقع في العاصمة الرياض.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6488187,46.65185219999999 \n" );
            }

            else if(data.equals("منتزه سلام")){
                sendMessage.setText("\n\n منتزه سلام: تتكون من بيئات مختلفة حيث تضم منطقة المزرعة، منطقة البحيرة، بالإضافة إلى منطقة المحمية المخصصة للحيوانات، الطيور، والنباتات التي تعيش في البيئة المحيطة. تعتبر من اجمل حدائق الرياض.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.62132600000001,46.7084143 \n" );
            }
            else if(data.equals("منتزه الملك سلمان البري")){
                sendMessage.setText("\n\n منتزه الملك سلمان البري: هو عبارة عن منتزهاً برياً فالموقع عبارة عن أرض صحراوية في معظمها، ويتخللها وادي يحتوي على أشجار ونباتات برية مما شكل منطقة بيئية جميلة ويرتاد الموقع في الوقت الراهن عدد كبير من الزوار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.0056571,46.6005703 \n" );
            }
            else if(data.equals("حلبة ديراب للكارتينج")){
                sendMessage.setText("\n\n حلبة ديراب للكارتينج: هو عبارة عن حلبة ضخمة ومغلقة لسباق السيارات للكبار والصغار والشباب والبنات، مع مطعم وكافيه ومنطقة مخصصة لتهنئة الفائزين.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.461645,46.5824174 \n" );
            }

            else if(data.equals("حديقة معالم العالم")){
                sendMessage.setText("\n\n حديقة معالم العالم: تعد من أهم الحدائق الحديثة والعصرية في المملكة العربية السعودية، وهي عبارة عن حديقة مليئة بمجسمات المعالم البارزة في العالم، وتعتبر واحدة من أجمل الأماكن السياحية في الرياض.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7622486,46.7353076 \n" );
            }

            else if(data.equals("ماجيك بلانيت الرياض بارك")){
                sendMessage.setText("\n\n ماجيك بلاينت (الرياض بارك): أكبر مركز ترفيهي عائلي مغلق مغامرات لا مثيل لها بانتظارك في الوجهة المثالية لقضاء أمتع اللحظات المميزة لجميع أفراد العائلة من الأطفال الصغار وحتى الكبار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7854795,46.7818163 \n" );
            }



            // التسوق - الرياض
            else if(data.equals("سوق القرية الشعبية")){
                sendMessage.setText("\n\n سوق القريه الشعبية: تشمل داخلها تجمع تجاري هائل، وبالفعل فهي عبارة عن قرية من المحلات التجارية المتنوعة والتي تقدم بضائع مميزة أغلبها محلية وتقليدية، ويقصدها العديد من الزوار من داخل وخارج الرياض.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.5837226,46.5858669 \n" );
            }
            else if(data.equals("سوق حراج بن قاسم الجديد")){
                sendMessage.setText("\n\n سوق حراج بن قاسم الجديد: يمكنك التسوق من خلال المحلات التي وصل عددها إلى 800 محل تجاري ويمتاز بسهولة التنقل بين أرجائه من خلال الخرائط الإرشادية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.5690992,46.74304859999999 \n" );
            }
            else if(data.equals("سوق المعيقلية")){
                sendMessage.setText("\n\n سوق المعيقلية: يعتبر السوق أحد أجزاء منطقة قصر الحكم ويضم السوق حوالي 1000 محل تجاري.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6282102,46.7096607 \n" );
            }
            else if(data.equals("سوق الزل الشعبي")){
                sendMessage.setText("\n\n سوق الزل الشعبي: سوق شعبي يشتهر ببيع الزل.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6289465,46.7122389 \n" );
            }
            else if(data.equals("الرمال سنتر")){
                sendMessage.setText("\n\n  الرمال سنتر مول: يضمّ مركز التسوّق الشعبي هذا سوبر ماركت ومتاجر تجزئة وقاعة طعام، فضلاً عن منطقة لعب للأطفال.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6588116,46.7834178 \n" );
            }
            else if(data.equals("أسواق طيبة والعويس الشعبية")){
                sendMessage.setText("\n\n أسواق طيبة والعويس الشعبية: يضم العديد من المحلات سواء الذهب أو الملابس أو العطور وأدوات التجميل.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7344365,46.6628948 \n" );
            }
            else if(data.equals("خريص مول")){
                sendMessage.setText("\n\n خريص مول: مركز تسوّق متواضع يشمل متاجر عالمية متعددة الفروع لبيع مستلزمات الموضة والجمال، بالإضافة إلى مركز لعب للأطفال.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7376333,46.796766 \n" );
            }
            else if(data.equals("غرناطة مول")){
                sendMessage.setText("\n\n غرناطة مول: يعتبر مول غرناطة بالرياض من أشهر وأكبر المولات في الوطن العربي، حيث يوجد به عدد كبير من الخدمات التي جعلت ذلك المول مميز عن غيره من المولات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7813982,46.7301076 \n" );
            }
            else if(data.equals("صحارى مول")){
                sendMessage.setText("\n\n صحارى مول: يمكن أن نسميه صحارى بلازا أيضا، يعتبر من أوائل مولات  شركة المراكز العربية بالرياض، أنشئ في العام 2002 م، وتم تصميمه بأسلوب يناسب وسط مدينة الرياض، ليواكب تطلعات رواده من المتسوقين، ويوفر جميع احتياجاتهم، ويضم صحارى مول 200 متجر.\n\n" + "\n https://goo.gl/maps/XikykKKCh5ZNh2UE7 \n" );
            }
            else if(data.equals("الرياض قاليري")){
                sendMessage.setText("\n\n الرياض قاليري: مركز تسوّق كبير يضمّ متاجر لبيع العلامات التجارية العالمية، فضلاً عن نوافير مياه وقاعة طعام ومنطقة لعب للأطفال.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7436082,46.6580521 \n" );
            }
            else if(data.equals("أطياف مول")){
                sendMessage.setText("\n\n أطياف مول:  يضم المول نوافذ عدة لمتاجر محلية و عالمية في مجالات الأزياء والموضة والمقاهي والمطاعم والألعاب والترفيه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7926073,46.76789890000001 \n" );
            }
            else if(data.equals("القصر مول")){
                sendMessage.setText("\n\n القصر مول: يضمّ مركز التسوّق هذا متاجر متعدّدة الفروع وقاعة طعام ودار سينما ومنطقة ترفيهية للأطفال.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6006978,46.6975899 \n" );
            }
            else if(data.equals("سنتريا مول")){
                sendMessage.setText("\n\n سنتريا مول: يشتهر مركز التسوّق الداخلي والأنيق هذا بمتاجر لعلامات تجارية عالمية فاخرة ومقاهٍ راقية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.69750449999999,46.6839733 \n" );
            }
            else if(data.equals("العليا مول")){
                sendMessage.setText("\n\n العليا مول: العليا مول من أكثر المراكز التجارية التي ينصح بها لتسوق الأقمشة النسائية، وخاصة الفساتين، حيث تكثر المتاجر المتخصصة في فساتين البيت، والمناسبات، والسهرات وغيرها، والقليل متاجر العطور، والأحذية والساعات.\n\n" + "\n https://goo.gl/maps/foiTicaUyH8FMoMVA \n" );
            }
            else if(data.equals("بانوراما مول")){
                sendMessage.setText("\n\n بانوراما مول: يشمل مركز التسوّق الكبير والحديث هذا علامات تجارية عالمية فاخرة وقاعة طعام ومجمّع استجمام واستشفاء للنساء.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6925674,46.6694302 \n" );
            }
            else if(data.equals("سلام مول")){
                sendMessage.setText("\n\n السلام مول: متاجر لعلامات تجارية ومطاعم مريحة وجولات ترفيهية للأطفال ومتجر بقالة تجذب السكان المحليين إلى مركز التسوّق هذا.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.5588111,46.6378903 \n" );
            }
            else if(data.equals("تالا مول")){
                sendMessage.setText("\n\n تالا مول: يشمل مركز التسوّق الكبير هذا مجموعة متنوعة من المتاجر والمطاعم، فضلاً عن مركز ترفيهي لكل الأعمار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7719492,46.6681125 \n" );
            }
            else if(data.equals("المكان مول الرياض")){
                sendMessage.setText("\n\n المكان مول: يشمل مركز التسوّق الكبير هذا مجموعة متنوعة من المتاجر والمطاعم، فضلاً عن مركز ترفيهي لكل الأعمار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.791005,46.6121809 \n" );
            }
            else if(data.equals("رويال مول")){
                sendMessage.setText("\n\n رويال مول: يعد رويال مول واحد من أفضل مولات الرياض وأحد أهم مراكز التسوق والترفيه في المملكة العربية السعودية، فهو مركز تسوق متخصص، يحتوي على منافذ متعددة لأرقى الماركات المحلية والعالمية، بالإضافة لأنشطة ترفيهية متنوعة ومرافق خدمية.\n" +
                        "\n" +
                        "ويعتبر إحدى واجهات الرياض السياحية والترفيهية المتميزة، المول مناسب جدا لتسوق العبايات الجاهزة، كما يوجد تفصيل داخل المحلات، وهو سوق مختص يضم أكثر من ٥٠ محل للذهب والمجوهرات و٨٠ محل للعبايات.\n\n" + "\n https://goo.gl/maps/PoexSsbtCrc7wnaE9 \n" );
            }
            else if(data.equals("مارينا مول الرياض")){
                sendMessage.setText("\n\n مارينا مول: مارينا مول الرياض من أكبر المراكز والمجمعات التجارية الموجودة شمال العاصمة، يضم أكثر من 300 متجر ومعرض تقدم العديد من المنتجات المحلية والمستوردة.\n\n" + "\n https://goo.gl/maps/RJy8dTw2TaT6csfH7 \n" );
            }
            else if(data.equals("النخيل مول")){
                sendMessage.setText("\n\n النخيل مول: يضمّ مركز التسوّق العصري هذا علامات تجارية عالمية فاخرة وقاعة طعام ونوافير مياه ومنطقة لعب للأطفال.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7679338,46.71491289999999 \n" );
            }
            else if(data.equals("حياة مول")){
                sendMessage.setText("\n\n حياة مول: من أضخم وأفضل المجمعات في الرياض، يقع في حي الملك فهد على طريق الملك عبدالعزيز، تجد فيه كل ما يناسب العائلة من محلات ملابس وأحذية وشنط واتصالات وكذلك المطاعم والمقاهي وكذلك المدن الترفيهية.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7430335,46.6795882 \n" );
            }
            else if(data.equals("العثيم مول الرياض")){
                sendMessage.setText("\n\n العثيم مول: يمتاز بموقع حيوي سهل الوصول إليه من كل أحياء الرياض يضم سلسلة من المطاعم المتميزة يضم أول مدينة ثلجية بالمملكة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.685477,46.775605 \n" );
            }
            else if(data.equals("الحمراء مول")){
                sendMessage.setText("\n\n الحمراء مول: يضمّ مجمّع التسوّق الكبير هذا متاجر عالمية متعدّدة الفروع ومطاعم، بالإضافة إلى منطقة لعب داخلية للأطفال.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.1527359,42.6441216 \n" );
            }
            else if(data.equals("الرياض بارك")){
                sendMessage.setText("\n\n الرياض بارك: يقع الرياض بارك في قلب عاصمة المملكة العربية السعودية، الرياض وكل ما ترغب في معرفته يمكن زيارة موقع الإلكتروني: \n https://riyadh-park.com/ar/%D8%A7%D9%84%D8%B1%D9%8A%D8%A7%D8%B6-%D8%A8%D8%A7%D8%B1%D9%83/\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7854795,46.7818163 \n" );
            }
            else if(data.equals("مجمع الفيصلية")){
                sendMessage.setText("\n\n  مجمع الفيصلية: ويعتبر بكافة المقاييس تحفة معمارية بتصميمه الانسيابي البيضاوي، كما أنه مزود بكل ما تحتاجه العائلة من مطاعم وجلسات، وبه أيضا مدينة ملاهي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.99975999999999,46.5105494 \n" );
            }
            else if(data.equals("مجمع المملكة")){
                sendMessage.setText("\n\n مجمع المملكة: يُعد مركز المملكة أحد أبرز المعالم الحضارية في المملكة العربية السعودية وأكثرها شهرة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7858164,46.7471018 \n" );
            }

            // الطبيعة والبيئة - الرياض
            else if(data.equals("منتزه بحيرة المصانع (وادي حنيفة)")){
                sendMessage.setText("\n\n منتزه بحيرة المصانع (وادي حنيفة): يحتوي على بحيرة كبيرة وتنتشر أعداد كبيرة من البط في بحيرة المتنزه إلى جانب أنواع متعددة من الطيور، ويمكن ركوب القوارب فيه و يضم المتنزه عدد كبير من الأشجار والنخيل.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.551365,46.73984040000001 \n" );
            }
            else if(data.equals("منتزه السد الحجري (وادي حنيفة)")){
                sendMessage.setText("\n\n منتزه السد الحجري (وادي حنيفة): يشتمل على بحيرة كبيرة ويضم المتنزه ممرات للمشاة وجلسات للمتنزهين ويضم أيضاً عدداً كبيراً من الشجيرات والأشجار الصحراوية وأشجار النخيل.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.5706156,46.723846 \n" );
            }
            else if(data.equals("منتزه بحيرة عرقة (وادي حنيفة)")){
                sendMessage.setText("\n\n منتزه بحيرة عرقة (وادي حنيفة): يشتمل على بحيرة كبيرة ويضم المتنزه ممرات للمشاة وجلسات للمتنزهين ويضم أيضاً عدداً كبيراً من الشجيرات والأشجار الصحراوية وأشجار النخيل.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.661672621856415,46.6060209274292 \n" );
            }

            else if(data.equals("منتزه بحيرة الحاير (وادي حنيفة)")){
                sendMessage.setText("\n\n منتزه بحيرة الحائر (وادي حنيفة): مجمع ترفيهي مُتكامل يضم مدن ألعاب مائية، ومجموعة البحيرات الطبيعية وما سيلحق بها من مكونات اصطناعية كالقنوات والممرات المائية والأنهار والبرك، وكذلك المرافق الخدمية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.3900954,46.8812327 \n" );
            }

            else if(data.equals("مطل حافة العالم (جبال طويق)")){
                sendMessage.setText("\n\n مطل حافة العالم (جبال طويق): واحدة من أخطر حواف الجبال بالعالم، وهي نهاية سلسلة (جبال طويق)، بالقرب من العيينة، الواقعة وتبعد عن الرياض مسافة 35 كيلومترا أحد أهم الأماكن السياحية بالرياض، مناسب للمجموعات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.9459637,45.9908543 \n" );
            }
            else if(data.equals("منتزه الثمامة البري")){
                sendMessage.setText("\n\n منتزه الثمامة البري: يعد هو الأشهر والأبرز سياحياً خصوصاً لموقع هذا المنتزه قرب مدينة الرياض وتميزه بكثرة المخيمات المجهزة للتأجير وفرصة الاستمتاع بالهواء الطلق بعيدا عن أجواء المدينة مما يدفع بالأسر التوجه إليه وقضاء أجمل الأوقات وأمتعها في هذا المنتزه البري.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.15422119999999,46.65021429999999 \n" );
            }
            else if(data.equals("منتزه وادي نمار")){
                sendMessage.setText("\n\n منتزه وادي نمار: يحتوي المتنزه على بحيرة سد نمار وتشكل أحد المناظر الطبيعية الخلابّة في الموقع، ويحيط بالبحيرة أرصفة على شكل كورنيش بحيث تتناثر فيها أشجار النخيل.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.5709336,46.6733434 \n" );
            }

            else if(data.equals("كهف عين هيت")){
                sendMessage.setText("\n\n كهف هيت: هو تجويف صخري طبيعي، يضم (عين هيت) المليئة بالمياه الطبيعية النقية، يعد الكهف وجهة سياحية لعشاق المغامرات والاستكشاف.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7036848,46.8166994 \n" );
            }

            // التراث والثقافة - الرياض

            else if(data.equals("متحف ديار العز بالمزاحمية")){
                sendMessage.setText("\n\n متحف ديار العز بالمزاحمية: يحتوي المتحف على أكثر من 12000 قطعة تراثية مختلفة من العملات القديمة والملابس النسائية والطوابع وبعض الوثائق القديمة وأدوات الطبخ والمأكل والمشرب وبعض الفخاريات والجلديات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.40012669999999,50.0120981 \n" );
            }

            else if(data.equals("الدرعية التاريخية")){
                sendMessage.setText("\n\n الدرعية التاريخية: تمتاز بطرازها المعماريّ الأثريّ وجدرانها الطينية المقوسة، ليخلّدها التاريخ كأحد أهم محاضنِ الثقافة والتجارة في المملكة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.73387190000001,46.5746498 \n" );
            }

            else if(data.equals("مركز الملك عبدالعزيز التاريخي")){
                sendMessage.setText("\n\n مركز الملك عبدالعزيز التاريخي: يعد المركز أحد أهم المعالم الحضارية والثقافية في العاصمة الرياض، وقد افتتح عام 1419 هـ بمناسبة مرور مائة عام على تأسيس المملكة على يد الملك عبدالعزيز.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6465451,46.7098549 \n" );
            }

            else if(data.equals("متحف صقر الجزيرة للطيران")){
                sendMessage.setText("\n\n متحف صقر الجزيرة للطيران: متحف جوي يسرد التطور التاريخي للقوات الجوية الملكية السعودية منذ نشأتها على يدي الملك عبد العزيز إلى ما وصلت إليه في هذا العصر.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7540196,46.73910889999999 \n" );
            }

            else if(data.equals("متحف المشوح للتراث الشعبي")){
                sendMessage.setText("\n\n متحف المشوح للتراث الشعبي: أحد متاحف مدينة الرياض يتكون المتحف من الكثير من القطع منها أدوات الحرب السلاح القديم وأدوات الطهي ومواد البقالة القديمة وأدوات الترحال ومطبوعات قديمة وقاعدة مدفع تاريخه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7509277,46.78304619999999 \n" );
            }
            else if(data.equals("مكتبة الملك عبدالعزيز العامة")){
                sendMessage.setText("\n\n مكتبة الملك عبد العزيز العامة: من أهم المكتبات بالرياض حيث تم توفير جميع أوعية الإنتاج الفكري وتنظيمها من كتب ودوريات وايضا توفير الخدمات المكتبية والترجمة والنشر العلمي في مجالات العلوم العربية والإسلامية وايضا الاهتمام بالتراث الإسلامي والعربي وإحياءه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7104254,46.75338980000001 \n" );
            }
            else if(data.equals("متحف الحمدان للتراث الشعبي")){
                sendMessage.setText("\n\n متحف الحمدان التراثي: يتحدث عن تاريخ وتراث الخليج العربي وترابط الإنسان بالمعاصر الماضية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7841228,46.8233931 \n" );
            }

            else if(data.equals("متحف الفيصل للفن الإسلامي")){
                sendMessage.setText("\n\n متحف الفيصل للفن الإسلامي: يعدُّ المركز منصة بحثٍ تجمع بين الباحثين والمؤسسات لحفظ العمل العلمي ونشره وإنتاجه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6915538,46.684607 \n" );
            }

            else if(data.equals("واحة الملك سلمان للعلوم")){
                sendMessage.setText("\n\n واحة الملك سلمان للعلوم: مشروع يعتمد على التعليم بالترفيه حيث سيتمكن الجميع من ممارسة العديد من الأنشطة داخله من خلال برامج ومعروضات فاعلية مشوقة لدعم المعرفة العلمية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7042282,46.70001320000001 \n" );
            }
            else if(data.equals("متحف السنين الماضية")){
                sendMessage.setText("\n\n متحف السنين الماضية:  يحتوي المتحف كثيرًا من المقتنيات التراثية.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.74123280000001,46.5718307 \n" );
            }
            else if(data.equals("متحف العضيب للتراث الشعبي")){
                sendMessage.setText("\n\n متحف العضيب للتراث الشعبي: يحتوي المتحف كثيرًا من المقتنيات التراثية والأثرية الثمينة، كما يضم جلسات تراثية وعدداً كبيراً من الحيوانات وموقعاً خاصاً بالخيول العربية الأصيلة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.9135395,46.8276437 \n" );
            }
            else if(data.equals("متحف أبا القد التاريخي")){
                sendMessage.setText("\n\n درب أبا القد التاريخي بالقدية (جبال طويق): يعتبر من أقدم الدروب الأثرية في الجزيرة العربية، وهو درب القوافل قديما للصعود إلى هضبة نجد عبر جبال طويق.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.5690441,46.3574989 \n" );
            }
            else if(data.equals("منطقة قصر الحكم")){
                sendMessage.setText("\n\n منطقة قصر الحكم: تضم العديد من معالم بارزة فهي تضم إداريا إمارة منطقة الرياض وأمانة مدينة الرياض وشرطة مدينة الرياض، ودينيا تضم أحد لأكبر مساجد المدينة جامع الإمام تركي بن عبد الله (رحمه الله).\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6312147,46.7133804 \n" );
            }
            else if(data.equals("مكتبة الملك فهد الوطنية")){
                sendMessage.setText("\n\n مكتبة الملك فهد الوطنية: تعد المكتبة نموذجاً للتلاحم بين القيادة والشعب الذين أرادوا التعبير عن حبهم وإخلاصهم لملكهم بمناسبة توليه الحكم، فهي في أصلها عبارة عن معلم تذكاري شيد على نفقة المواطنين؛ ليكون تحفة معمارية.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6855614,46.68652069999999 \n" );
            }

            // الأماكن السياحية - الخرج
            else if(data.equals("مزرعة ومنتجع وثانه")){
                sendMessage.setText("\n\n مزرعة ومنتجع وثانه السياحية: محمية فراولة بالزراعة المائية ومزيد من المنتجات الزراعية والحيوانية الخرج تمتاز بانه يمكن أن يتم قطف الفراولة وركن للقهوة وجلسات للعائلات.\n\n" + "\n https://www.google.com/maps/place/24%C2%B011'35.6%22N+47%C2%B019'19.5%22E/@24.1932278,47.3220917,17z \n" );
            }
            else if(data.equals("غار الإمام تركي بن عبدالله")){
                sendMessage.setText("\n\n غار الإمام تركي بن عبد الله: غار الامام تركي بن عبدالله بعلية جنوب غرب الرياض والذي جلس فيه الامام متخفيا عن القائد التركي أبوش أغا الذي يبحث عنه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=23.9478,46.4288 \n" );
            }
            else if(data.equals("وادي ماوان")){
                sendMessage.setText("\n\n وادي ماوان: الوادي بالقرب من مدينة الدلم. يتميز الوادي بحوافه العالية٬ وينحدر من جبال طويق حيث يقع مجراه الأعلى٬ وينتهي غرب بلدة الرغيب إلى الجنوب من مدينة الدلم٬ وبه مزارع وتجمعات لأشجار الطلح.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=23.9100513,46.94196759999999 \n" );
            }
            else if(data.equals("منتزه برج الخرج")){
                sendMessage.setText("\n\n منتزه برج الخرج: من أجمل الأماكن السياحية في الخرج حيث يبلغ طوله حوالي 105 متر حيث يتميز برج الخرج بالعديد من الديكورات الحديثة الرائعة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.0074754,40.9384914 \n" );
            }
            // التسوق - الخرج
            else if(data.equals("مجمع الواحة")){
                sendMessage.setText("\n\n مجمع الواحة: يضم المول نوافذ عدة لمتاجر في مجالات الأزياء والموضة والمقاهي والمطاعم والألعاب والترفيه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7228443,46.8519354 \n" );
            }
            else if(data.equals("الحديثي مول")){
                sendMessage.setText("\n\n الحديثي مول: يضم المول نوافذ عدة لمتاجر في مجالات الأزياء والموضة والمقاهي والمطاعم والألعاب. \n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.15681799999999,47.30143929999999 \n" );
            }
            else if(data.equals("سنترو الخرج")){
                sendMessage.setText("\n\n سنترو الخرج: يضم المول نوافذ عدة لمتاجر في مجالات الأزياء والموضة والمقاهي والمطاعم.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.12692870000001,47.2628823 \n" );
            }
            else if(data.equals("العسكر أفينيو")){
                sendMessage.setText("\n\n العسكر أفنيو: يضم المول نوافذ عدة لمتاجر محلية وعالمية في مجالات الأزياء والموضة والمقاهي والمطاعم والألعاب والترفيه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.1574352,47.3184074 \n" );
            }
            else if(data.equals("جو مول")){
                sendMessage.setText("\n\n جو مول: يضم المول نوافذ عدة لمتاجر في مجالات الأزياء والموضة والمقاهي والمطاعم.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.16546719999999,47.3341817 \n" );
            }

            // التراث والثقافة - الخرج
            else if(data.equals("عريش الملك عبدالعزيز التاريخي")){
                sendMessage.setText("\n\n عريش الملك عبد العزيز التاريخي: يعد عريش الملك عبدالعزيز التاريخي الذي يقع في مركز السلمية أحد المعالم الأثرية والسياحية بالخرج حيث كان مصيفاً للملك عبدالعزيز -طيب الله ثراه-.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.2011503,47.28602530000001 \n" );
            }
            else if(data.equals("متحف الموسى بالسلمية")){
                sendMessage.setText("\n\n متحف الموسى بالسلمية: يتكون المتحف من 6 قاعات حيث تم عرض محتويات المتحف بعدة أساليب فمنها ما هو معروض داخل خزانات أو فاترينات ومنها ما هو معروض على أرفف وكذلك ما هو معروض بالتعليق الجداري.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.2016586,47.2896667 \n" );
            }
            else if(data.equals("قصر الملك عبدالعزيز التاريخي")){
                sendMessage.setText("\n\n قصر الملك عبدالعزيز بالسيح: يعتبر من القصور التاريخية الأثرية في محافظة الخرج يعود سبب بناء القصر إلى حماية (الرياض) وحماية حدودها الجنوبية من أي تمرد على الدولة تم بناء القصر تحديدا في الخرج لأنها هدف استراتيجي في تلك الحقبة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.1518933,47.2975695 \n" );
            }

            // التسوق - الدوادمي

            else if(data.equals("المكان مول الدوادمي")){
                sendMessage.setText("\n\n المكان مول: يضم المول نوافذ عدة لمتاجر محلية وعالمية في مجالات الأزياء والموضة والمقاهي والمطاعم والالعاب والترفيه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.5440588,44.43996550000001 \n" );
            }
            else if(data.equals("مجمع أفينيوز الدوادمي")){
                sendMessage.setText("\n\n مجمع أفينيوز الدوادمي: يضم المول نوافذ عدة لمتاجر محلية وعالمية في مجالات الأزياء والموضة والمقاهي والمطاعم والالعاب والترفيه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.1549089,42.6259404 \n" );
            }

            // التراث والثقافة - الدوادمي
            else if(data.equals("متحف المشوح الأثري")){
                sendMessage.setText("\n\n متحف المشوح الاثري: أحد متاحف مدينة الرياض يتكون المتحف من الكثير من القطع منها أدوات الحرب السلاح القديم وأدوات الطهي ومواد البقالة القديمة وأدوات الترحال ومطبوعات قديمة وقاعدة مدفع تاريخه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7509277,46.78304619999999 \n" );
            }
            else if(data.equals("قصر الملك عبدالعزيز")){
                sendMessage.setText("\n\n قصر الملك عبدالعزيز التاريخي: يعتبر من القصور التاريخية الاثرية في محافظة الخرج يعود سبب بناء القصر إلى حماية (الرياض) وحماية حدودها الجنوبية من أي تمرد على الدولة تم بناء القصر تحديدا في الخرج لأنها هدف استراتيجي في تلك الحقبة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4817378,44.3610444 \n" );
            }
            else if(data.equals("نقوش وادي مأسل")){
                sendMessage.setText("\n\n نبذةنقوش وادي مأسل: يوجد في المكان عدد من النقوش السبئية التي تعود الى زمن الملك أسعد الكامل ومن تبعوه من ملوك سبأ هذا الوادي كان يستخدمه ملوك سبأ لتجميع قواتهم قبل الخروج في حملاتهم الكبيرة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.4140851,49.660449 \n" );
            }
            // الأماكن السياحية - المجمعة
            else if(data.equals("محمية طيور الأمارون بتمير")){
                sendMessage.setText("\n\n محمية طيور الأمازون بتمير: مزار سياحي في السعودية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.7154143,45.8559023 \n" );
            }
            else if(data.equals("محمية الراشد للطيور بالحوطه")){
                sendMessage.setText("\n\n محمية الراشد للطيور بالحوطه: مزار سياحي في السعودية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.5836482,45.6184527 \n" );
            }
            else if(data.equals("منتزه وبحيرة الجزر بجلاجل")){
                sendMessage.setText("\n\n منتزه وبحيرة الجزر بجلاجل: هو عبارة عن منتزه يضم العديد من المساحات الخضراء ومناطق للعب الأطفال وفيه جلسات مطلة على البحيرة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.6919964,45.4456822 \n" );
            }
            else if(data.equals("وادي المشقر")){
                sendMessage.setText("\n\n وادي المشقر: يبلغ طول وادي المشقر 100 كم ويخترق محافظة المجمعة ومزارعها فيما يرتفع سد المجمعة 15 مترا.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.8963782,45.31875529999999 \n" );
            }

            // التسوق - المجمعة
            else if(data.equals("كرم مول")){
                sendMessage.setText("\n\n كرم مول: يضم المول نوافذ عدة لمتاجر محلية وعالمية في مجالات الأزياء والموضة والمقاهي والمطاعم والألعاب والترفيه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.8963208,45.39499989999999 \n" );
            }
            else if(data.equals("المجمعة مول")){
                sendMessage.setText("\n\n المجمعة مول: يضم المول نوافذ عدة لمتاجر محلية وعالمية في مجالات الأزياء والموضة والمقاهي والمطاعم والألعاب والترفيه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.9092959,45.34314299999999 \n" );
            }
            // التراث والثقافة - المجمعة
            else if(data.equals("قرية عودة سدير التراثية")){
                sendMessage.setText("\n\n قرية عودة سدير التراثية: تتميز القرية بجمال عمارتها التراثية النجدية وجمال الطبيعة المحيطة بها. وتبعد عودة سدير 170 كيلومتراً.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.5633428,45.6961849 \n" );
            }
            else if(data.equals("قرية المهيدب التراثية")){
                sendMessage.setText("\n\n قرية المهيدب التراثية: من أهم المواقع الأثرية في المجمعة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.58433279999999,45.62627969999999 \n" );
            }
            else if(data.equals("قرية روضة سدير التراثية")){
                sendMessage.setText("\n\n قرية روضة سدير التراثية: تتميز القرية بجمال عمارتها التراثية النجدية وجمال الطبيعة المحيطة بها.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.6193891,45.5616928 \n" );
            }
            else if(data.equals("قرية جلاجل القديمة")){
                sendMessage.setText("\n\n قرية جلاجل القديمة: جلاجل مدينة أثرية، تُعدّ من أقدم بلدان سدير القديمة، في موقع بمنحدرات جبال طويق، ويوجد بها عدد من المباني التي بُنيت في القرون الماضية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.683352,45.4592239 \n" );
            }
            else if(data.equals("قرية حَرمه التراثية")){
                sendMessage.setText("\n\n قرية حرمة التراثية: تعكس روحًا من أصالة وعراقة المجتمع السعودي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.9726283,45.3645552 \n" );
            }
            else if(data.equals("البلدة القديمة بالمجمعة")) {
                sendMessage.setText("\n\n البلدة القديمة بالمجمعة: تمتاز بطرازها المعماريّ الأثريّ وجدرانها الطينية المقوسة وقيمها التراثية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.2954781,34.9508977 \n");
            }

            // التراث والثقافة - الأفلاج
            else if(data.equals("متحف بيت الطيبين")){
                sendMessage.setText("\n\n بيت الطيبين: هو عبارة عن بيت يتم استجاره جميع القطع التي فيه تعود للزمن القديم.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.2959987,45.86460779999999 \n" );
            }
            else if(data.equals("جبل التوباد")){
                sendMessage.setText("\n\n جبل التوباد: شهد هذا الجبل قصة حب قيس بن الملوح وابنة عمه ليلى العامرية، وذلك عام خمس وستون من الهجرة في عهد الخليفة الأموي عبد الملك بن مروان.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=22.5753534,46.5193353 \n" );
            }
            else if(data.equals("متحف الحزيمي")){
                sendMessage.setText("\n\n متحف الحزيمي: متحف يحوي مباني طينية ومقتنيات أثرية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=22.292292,46.7331097 \n" );
            }
            else if(data.equals("قرية العمار التراثية")){
                sendMessage.setText("\n\n قرية العمار التراثية: تعد قرية العمار في محافظة الأفلاج من المعالم التراثية التي تمتلك حقبة تاريخية قديمة؛ حيث تملك ذكريات عدة للملك المؤسِّس، طيّب الله ثراه، وأمراء كُثر من بعده.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=22.2468528,46.72670919999999 \n" );
            }

            // التراث والثقافة - شقراء
            else if(data.equals("متحف بيت الحلوان التراثي")){
                sendMessage.setText("\n\n متحف بيت الحلوان التراثي: بيت الحمدان التراثي هو أحد المنازل الشعبية المتكاملة، مبني من الطين ويعبر عن طراز العمارة القديمة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.1595069,45.3905717 \n" );
            }
            else if(data.equals("سوق حليوه التراثي")){
                sendMessage.setText("\n\n سوق حليوه التراثي: يعتبر سوق حليوه أحد أهم الأسواق التراثية في محافظة شقراء، ويطل عليه هذا الاسم نسبة إلى بستان مجاور للسوق يحمل اسم (حليوه).\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.2563178,45.2566365 \n" );
            }
            else if(data.equals("قصر السبيعي التاريخي")){
                sendMessage.setText("\n\n قصر السبيعي بشقراء: يعدُّ قصر السبيعي التراثي في وسط شقراء التاريخي من أبرز المعالم التراثية في محافظة شقراء.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.2542154,45.25397299999999 \n" );
            }
            else if(data.equals("الديرة القديمة بشقراء")){
                sendMessage.setText("\n\n الديره القديمة بشقراء: تعتبر من اهم مَعلم تاريخيه في شقراء\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.2555893,45.25379399999999 \n" );
            }
            else if(data.equals("قرية أشيقر التراثية")){
                sendMessage.setText("\n\n قرية أشيقر التراثية: تقع أشيقر في قلب نجد، على مساحةٍ من الواحات الممتدَّة على بعد ٢٠٠ كم شمال غرب الرياض، وتعكس روحًا من أصالة وعراقة المجتمع السعودي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.3397513,45.1912354 \n" );
            }
            else if(data.equals("قصر العناقر الأثري بثرمداء")){
                sendMessage.setText("\n\n قصر العناقر الأثري بثرمداء: من أشهر معالم مدينة ثرمدا، وتبلغ مساحته الإجمالية 1800 متر مربع، ويحتوي القصر في جنباته عدة بيوت من بينها بيت الشيخ محيسن العنقري جد الأمير تركي بن طلال بن عبد العزيز.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.1256722,45.4815471 \n" );
            }
            // التسوق - شقراء
            else if(data.equals("شقراء سكوير")){
                sendMessage.setText("\n\n شقراء سكوير:  يضم المجمع نوافذ عدة لمتاجر محلية للمشروبات والقهوة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.2254958,45.2575808 \n" );
            }
            else if(data.equals("البساتين مول")){
                sendMessage.setText("\n\n البساتين مول: يضم المول نوافذ عدة لمتاجر محلية في مجالات الأزياء والموضة والمقاهي والمطاعم.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.2361552,45.25655829999999 \n" );
            }
            // الأماكن السياحية - شقراء
            else if(data.equals("بحيرة برودان")){
                sendMessage.setText("\n\n بحيرة برودان: تمتاز بجمالها وإحاطة الرمال بها وبعض الهضاب الصخرية مروضة وتصب مياهها شمالا عبر المنجور في مملحة القصب عند امتلائها وتبقى لعدة أشهر.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.189667,45.62025 \n" );
            }
            else if(data.equals("ممالح القصب")){
                sendMessage.setText("\n\n ممالح القصب: أصبحت «مملحة القصب» مقصداً للسائحين وخصوصاً الأجانب، حيث يتولى «مكتب الهيئة العامة للسياحة بمحافظة شقراء» الإشراف على عدد من البرامج السياحية والوفود التي تزور مملحة القصب، وقضاء وقت للاطلاع على الممالح وتصويرها وزيارة مصانع الملح في القصب.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.2559883,45.5582201 \n" );
            }
            else if(data.equals("صحراء نفود ثرمداء")){
                sendMessage.setText("\n\n صحراء نفود ثرمداء: واحة ثرمداء التي هي بشكل قطعة مستطيلة من النخيل يبلغ طولها ميلا واحدا وعرضها نصف ميل، تقع إلى الشمال وجنوب وادي البطين.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.741455,45.3369459 \n" );
            }
            // التراث والثقافة - وادي الدواسر
            else if(data.equals("قصر الملك عبدالعزيز الدواسر")){
                sendMessage.setText("\n\n -قصر الملك عبدالعزيز التاريخي بوادي الدواسر: يُعَدُّ من أهم المعالم في المحافظة، ويعود تاريخ القصر إلى مرحلة مبكرة من مراحل تأسيس الدولة في عهد الملك عبدالعزيز.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=20.4739059,44.7907123 \n" );
            }
            else if(data.equals("متاحف الصادرية")){
                sendMessage.setText("\n\n متحف الصادرية: يضم العديد من التحف المعمارية والتي تمثل نماذجا من نماذج العمارة العربية والإسلامية والعالمية، مثل العمارة النجدية (المصمك) والعمارة العسيرية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=20.3701605,44.75933879999999 \n" );
            }
            else if(data.equals("مدينة الفاو الأثرية")){
                sendMessage.setText("\n\n مدينة الفاو التراثية: تمتاز )الفاو( بوجود كم وافر من الآثار والتحف والأبراج والميادين والأسواق التجارية، وعرف أهلها الزراعة حيث عثر في القرية على عدد كبير من آبار المياه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.793501,45.139042 \n" );
            }
            // التراث والثقافة - الغاط
            else if(data.equals("قرية الغاط التراثية")){
                sendMessage.setText("\n\n قرية الغاط التراثية: تحتوي القرية التراثية على قصر الإمارة الذي يعد تحفة معمارية وقلعة مغيران التاريخية وعلى الضفة الغربية من وادي مرخ.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7135517,46.6752957 \n" );
            }
            else if(data.equals("مكتبة الرحمانية العامة")){
                sendMessage.setText("\n\n مكتبة الرحمانية العامة: تحتوي على قسمان: للرجال والنساء تقوم بالأنشطة والبرامج الثقافية المتنوعة روعي في تصميم المبنى الطابع النجدي بمبانيه الطينية واستخدمت في بنائه مكعبات القش من البيئة المحلية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.0208456,44.9630579 \n" );
            }
            // التراث والثقافة - الزلفي
            else if(data.equals("قرية السيح التراثية")){
                sendMessage.setText("\n\n قرية السيح التراثية: تحتوي القرية على اماكن لبيع القهوة والمأكولات وألعاب للأطفال وأيضا تحتوي على أماكن تراثية قيمة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.3239346,44.8091169 \n" );
            }
            else if(data.equals("متحف عبدالرحمن الضويحي")){
                sendMessage.setText("\n\n متحف عبدالرحمن الضويحي: يحتوي المتحف على 11 ألف قطعة مختلفة من المقتنيات والقطع التراثية من الأدوات المنزلية والحلي وإضافة إلى العديد من العملات النقدية التي يعود تاريخ بعضها إلى عصور الخلافة والدول الإسلامية والعربية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.3484046,44.7970418 \n" );
            }
            else if(data.equals("قرية علقة التراثية")){
                sendMessage.setText("\n\n قرية علقة التراثية: يميز قرية علقة التراثية احتفاظها بمعظم خصائص العمارة النجدية من حيث تشكيل الفراغات والمسارات المتعرجة والمغطاة ووجود ساحات تجميعية أمام المنازل الموافقة مع متطلبات الحياة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.3363454,44.7781491 \n" );
            }



            // الأماكن السياحية - المدينة
            else if(data.equals("مزرعة السهلة السياحية")){
                sendMessage.setText("\n\n مزرعة السهلة السياحية: أول مزرعة سياحية في المدينة، مزرعه سياحية تقدم الفطور والغداء والعشاء والقهوة وايضاً بالإمكان شراء المنتجات.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.440006,49.613098 \n" );
            }
            else if(data.equals("منتزه الأمير محمد بن عبدالعزيز")){
                sendMessage.setText("\n\n منتزه الأمیر محمد بن عبدالعزیز بجبل أحد: تقع علي جبل أحد التاریخي وتوفر إطلالة جمیلة و ذلك بسبب ارتفاعھا المتمیز لوقوعھا على الجبل. یوجد في الحدیقة أیضاً مسطحات خضراء كثیرة و أماكن رائعة للجلوس على الجبل.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.404872,50.1138388 \n" );
            }
            else if(data.equals("منتزه الفلك البحري")){
                sendMessage.setText("\n\n منتزه الفلك البحري: مكان مميز يُقدم مجموعة خدمات قيّمة و مميزة ذات جودة عالية توفر جلسات مريحة و راقية وسط أجواء خلابة وخدمة مميزة و أضافت وسائل ترفيه متعددة للكبار و الصغار. بالإضافة إلى مطعم يُقدم أشهى المأكولات المتنوعة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.5093489,39.7080187 \n" );
            }
            else if(data.equals("جادة قباء")){
                sendMessage.setText("\n\n جادة قباء: هي المنطقة الرابطة من المسجد النبوي الشريف ومسجد قباء على امتداد 3,6 كيلومتر تحتضن حزمة من البرامج والفعاليات المختلفة على مدار العام.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.444257,39.66849029999999 \n" );
            }
            else if(data.equals("مزرعة الأوسية السياحية")){
                sendMessage.setText("\n\n مزرعة الأوسية الزراعية: تحتوي المحمية على الكثير من أنواع الطيور بكافة ألوانها وأحجامها الصغيرة، وستستمتع بها وهي تتجول بين الأشجار لتأخذك حينها لعالم من الطبيعة المختلفة، خصوصاً وأن صاحب المحمية قام بابتكار طريقة مذهلة ورائعة ستجعلك تشعر وكأنك في عالم آخر مع زخات المطر الاصطناعية، لتندمج أصوات الطيور مع أصوات حبات المطر وتنتعش بنفس اللحظة بنسمات الأشجار العليلة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.439331,39.619428 \n" );
            }
            else if(data.equals("حديقة الملك فهد")){
                sendMessage.setText("\n\n حدیقة الملك فھد: تمتاز حدیقة الملك فھد بأشجارھا الكثیفة العالیة و المزروعة على أفضل تنسیق و تتوافر أماكن الجلوس وسط المناظر الخلابة و الخضرة البدیعة و تنقسم الحدیقة إلى عدة أقسام؛ فھناك قسم مخصص للعائلات و قسم مخصص للبحیرة الصناعیة و الجبال المحیطة بھا و قسم آخر لملاعب الشباب توجد بھ منطقة لركوب الخیل و الجمال و منطقة للمزارع و البساتین البدیعة حیث أشجار النخیل ممتدة على مدى البصر؛ و أخیراً و لیس آخراً قسم مخصص لألعاب الأطفال من مختلف الأعمار.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4231555,39.6060361 \n" );
            }
            else if(data.equals("مزرعة أرياف طيبة السياحية")){
                sendMessage.setText("\n\n مزرعة أرياف طيبه السياحية: يعتبر منتزه مزرعة ارياف طيبة متنزه عائلي وموقع جذب سياحي وهو أحد أفضل منتزهات المدينة المنورة وأماكن السياحة في السعودية يقدم العديد من الخدمات لزواره، كما يحتوي على أماكن مخصصة للجلسات العائلية ومطاعم وكافيهات وألعاب أطفال ومتاجر لبيع التمور والأدوات المصنوعة يدوياً بالمدينة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4997211,39.5960477 \n" );
            }
            else if(data.equals("مجمع الملك فهد لطباعة المصحف")){
                sendMessage.setText("\n\n مجمع الملك فهد لطباعة المصحف الشريف: هو أكبر مطبعة في العالم لطباعة المصحف. وهو أحد المعالم التي تقدمها المملكة العربية السعودية لخدمة الإسلام والمسلمين في مختلف أرجاء العالم.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.51494610000001,39.5404561 \n" );
            }
            else if(data.equals("وادي العقيق")){
                sendMessage.setText("\n\n وادي العقيق: وادي العقيق من أشهر أودية المدينة المنورة. اكتسب شهرته لارتباطه بسيرة الرسول محمد، ولوادي العقيق ارتباط وثيق بتاريخ المدينة المنورة، وقد فرشت أرض المسجد النبوي في عهد عمر بن الخطاب بحصى ناعمة من أرضه، وكان في بعض العهود الماضية أشبه بنهر دائم الجريان، ونشأت بقربه المزارع وبنيت على ضفافه القصور خصوصا في العهدين الأموي والعباسي.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.3670012,39.5514464 \n" );
            }
            else if(data.equals("مركز الحكير تايم الترفيهي")){
                sendMessage.setText("\n\n مركز الحكير تايم الترفيهي: تقع الملاهي على طريق الأمير سلطان بن عبد العزيز بطريق الهجرة، وبشكل أكثر تحديداً في مخطط الأمير نايف، وبالتالي يمكن الوصول إليها بسهولة. تم افتتاح مدينة الملاهي عام 2001 م، وتمتاز بتنوع الألعاب الترفيهية الموجودة بها، والتي تناسب مختلف الأعمار، وخاصة الأطفال. كما يوجد صالة مفتوحة للتزلج على الجليد في المدينة، وكذلك مجموعة متميزة من المطاعم والمقاهي، وتقدم لك المدينة كل ما تتمناه لقضاء أمتع الأوقات مع أفراد أسرتك.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.4475657,39.8076851 \n" );
            }
            else if(data.equals("مزرعة الضابطة السياحية")){
                sendMessage.setText("\n\n مزرعة الضابطة السیاحیة: مزرعة سیاحیة تحاكي الطبیعة المدینیة،إضافة إلى ما تحویھ من مواقع ترفیھیة مخصصة للأطفال والعائلات،\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4347322,39.6308368 \n" );
            }

            // التسوق - المدينة
            else if(data.equals("الراشد ميغا مول المدينة")){
                sendMessage.setText("\n\n الراشد ميغا مول: يعتبر الراشد ميغا مول من أكبر المجمعات التجارية بالمدينة المنورة، فهو يضم عدد كبير من المتاجر المحلية، والعالمية، بالإضافة للمطاعم، والمقاهي وصالة الألعاب.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4875038,39.64917989999999 \n" );
            }
            else if(data.equals("بوليفارد المحمدية")){
                sendMessage.setText("\n\n بوليفارد المحمدية: يعد من أحدث المجمعات بالمدينة ذات الطابع المميز، ويحتوي على عشرات المقاهي والمطاعم، إضافة لساحة مشي بين أروقته ومقاعد خارجية للجلوس في الهواء الطلق.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4218046,39.6362398 \n" );
            }
            else if(data.equals("العالية مول")){
                sendMessage.setText("\n\n العالية مول: يقع عالية مول على طريق قباء الشهير ويُعرف باسم عالية المدينة؛ وهو من المولات المميزة التي تضم مجموعة متنوعة من المحلات التجارية التي تعرض سلعاً مختلفة تغطي جميع الاحتياجات.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4138794,39.6200342 \n" );
            }
            else if(data.equals("النور مول")){
                sendMessage.setText("\n\n النور مول: هو مجمّع تجاري يتميز ببنائه العصري الحديث، ويوجد فيه العديد من المطاعم والمحلات التجارية العالمية والمحلية،وصالة ترفيهية، ومركز تسوق غذائي.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4958762,39.5958739 \n" );
            }
            else if(data.equals("المنار مول")){
                sendMessage.setText("\n\n المنار مول: یتكون مبنى المول من دور أرضي وأول. ویحتوي على ٢٠٠ متجر، ومعرض للعدید من الماركات، والعلامات التجاریة العالمیة، والمحلیة، ومساحة كبیرة لمواقف السیارات.\n\n\n" + "\nhttps://www.google.com/maps/search/?api=1&query=24.4603471,39.5849067 \n" );
            }
            else if(data.equals("رضا مول")){
                sendMessage.setText("\n\n الرضا مول: مركز تسوق في المدينة المنورة نقطة تمركز لقضاء أجمل الأوقات. \n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.490334,39.5811938 \n" );
            }
            else if(data.equals("مجمع طيبة")){
                sendMessage.setText("\n\n مجمع طيبة: مجمع طيبة التجاري يوجد فيه كل ما يحتاجه الزائر من هدايا بأسعار معقولة ويضم العديد من المحلات.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.3267924,41.9074881 \n" );
            }

            //التراث والثقافة - المدينة
            else if(data.equals("متحف دار المدينة")){
                sendMessage.setText("\n\n متحف دار المدينة: أول متحف متخصص لعرض التاريخ الحضاري والثقافي والإسلامي للمدينة المنورة،من الفترة الإسلامية التي بدأت بالهجرة النبوية إلى العهد الحالي.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.477161,39.6878556 \n" );
            }
            else if(data.equals("متحف دار القلم")){
                sendMessage.setText("\n\n متحف دار القلم: لتعليم الخط العربي، وأصبح منارة للخطاطين بدوراته ومناهجه وتخصصاته في تعليم الخط العربي وأساليبه.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.477161,39.6878556 \n" );
            }
            else if(data.equals("معرض محمد رسول الله")){
                sendMessage.setText("\n\n معرض محمد رسول الله: یتضمن عرضاً باللوحات المضیئة والشاشات التفاعلیة لسیرة الرسول محمد في المرحلتین المكیة والمدنیة منذ ولادتھ حتى وفاتھ، ویعرض معلومات مفصلة عن نسبھ ونشأتھ وحیاتھ قبل البعثة وبعدھا، وأحداث الھجرة والأحداث التي أنشأت المجتمع الإسلامي الأول في المدینة المنورة كما یعرض معلومات عن أمھات المؤمنین والصحابة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.468559,39.60762229999999 \n" );
            }
            else if(data.equals("متحف حضارة طيبة")){
                sendMessage.setText("\n\n متحف حضارة طيبة: يضم مجموعة من القطع التراثية المهمة. ويوجد بجانب المتحف ـ في نفس الطابق ـ مكتبة كبيرة تضم مجموعة كبيرة من أهم الكتب التاريخية والثقافية.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.47549,39.6059328 \n" );
            }
            else if(data.equals("متحف سكة حديد الحجاز")){
                sendMessage.setText("\n\n متحف سكة حديد الحجاز: يركز المتحف على تاريخ سكة الحجاز التي بنيت في عهد عبد الحميد الثاني وقد تم جمع عدة عربات ومحركات من مناطق ومحطات أخرى على السكة وقد اعيد ترميم إحدى المحركات وباستطاعتها الحركة على سكة المتحف. و يحتوى المتحف أيضا على أواني فخارية، أدوات القهوة، مجموعة من العملات الورقية، أسلحة ومجموعة من الصور الفوتوغرافية القديمة للمدينة المنورة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4619371,39.6009011 \n" );
            }
            else if(data.equals("معرض أسماء الله الحسنى")){
                sendMessage.setText("\n\n معرض أسماء الله الحسنى: يدعو معرض أسماء الله الحسنى إلى التأمل والتفكر في أسمائه سبحانه، عبر منظومة من اللوحات وتقنيات العرض الحديثة لتعزز الإيمان بالله تبارك وتعالى.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.4196155,39.8268395 \n" );
            }
            else if(data.equals("معرض القرآن الكريم")){
                sendMessage.setText("\n\n معرض القرآن الكريم: يعمل المعرض على ترسيخ مفهوم ومعاني القرآن الكريم للزوار، باستخدام وسائل تقنية وتعليمية متطورة وحديثة.إضافة إلى المادة العلمية التي احتواها المعرض؛ تضم جنباته جملة من أنفس مخطوطات المصاحف والمقتنيات الأثرية التاريخية التي أثرت المعرض وتوزعت على قاعاته.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.4222213,39.8204528 \n" );
            }

            // معالم التاريخ الإسلامي - المدينة
            else if(data.equals("مسجد الغمامة")){
                sendMessage.setText("\n\n مسجد الغمامة: هو في الموقع الذي صلى به النبي صلاة العيد في المدينة المنورة. وكان هذا المكان آخر المواضع التي صلى بها الرسول صلى الله عليه وسلم صلاة العيد عام 631م، كما صلى فيه الرسول صلاة الغائب على النجاشي. وحاليا لا تقام فيه الصلاة لقربه من المسجد النبوي الشريف. ويعدّ من المساجد الأثرية والتاريخية بالمدينة المنورة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.60496490000001,46.735574 \n" );
            }
            else if(data.equals("مسجد علي بن أبي طالب")){
                sendMessage.setText("\n\n مسجد علي بن أبي طالب: ويقع شرقي مسجد فاطمة على رابية مرتفعة مستطيلة الشكل طوله 8.5 موعرضه 6.5م وله درجة صغيرة. بني هذا المسجد وجدد على الأرجح مع مسجد الفتح ويروى أن علياً قتل في هذا الموقع عمرو بن ود العامري الذي اجتاز الخندق في غزوة الأحزاب.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.5758673,46.83531269999999 \n" );
            }
            else if(data.equals("مسجد عمر بن الخطاب")){
                sendMessage.setText("\n\n مسجد عمر بن الخطاب: يلي مسجد أبي بكر جنوباً على بعد عشرة أمتار منه فقط، وهو على شكل رواق مستطيل وله رحبة غير مسقوفة على صورته، يرتفع عن الأرض ثماني درجات، وطريقة بنائه تطابق بناء مسجد الفتح، وربما يكون قد بني وجدد معه.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.642513,46.4816075 \n" );
            }
            else if(data.equals("موقع غزوة أحد")){
                sendMessage.setText("\n\n موقع غزوة أحد: ميدان جبل أحد هو موقع معركة غزوة أحد بين المسلمين وقريش والتي وقعت في السنة الثالثة للهجرة، حيث وقعت المعركة في جنوب غربي الجبل بالقرب من جبل الرماة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.5184305,39.62084229999999 \n" );
            }
            else if(data.equals("مسجد الإجابة")){
                sendMessage.setText("\n\n مسجد الإجابة: يقع بالمدينة المنورة ويعرف أيضا باسم (مسجد بني معاوية) أو (مسجد المباهلة) بني في عهد الرسول وهو لبني معاوية بن مالك بن عوف من الأوس.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4719274,39.6184227 \n" );
            }
            else if(data.equals("مقبرة البقيع")){
                sendMessage.setText("\n\n مقبرة البقيع: لمقبرة الرئيسة لأهل المدينة المنورة منذ عهد الرسول محمد، ومن أقرب الأماكن التاريخية إلى مبنى المسجد النبوي حاليًا.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.46598220000001,39.6172749 \n" );
            }
            else if(data.equals("مسجد قباء")){
                sendMessage.setText("\n\n مسجد قباء: أول مسجد بني في الإسلام، وأول مسجد بني في المدينة النبوية، ومن حيث الأولية فإن المسجد الحرام أول بيت وضع للناس ومسجد قباء أول مسجد بناه المسلمون، وهو أيضًا أكبر مساجد المدينة بعد المسجد النبوي.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4392471,39.6172886 \n" );
            }
            else if(data.equals("مسجد الجمعة")){
                sendMessage.setText("\n\n مسجد الجمعة: ويسمى أيضاً مسجد الوادي، كما يطلق عليه اسم مسجد عاتكة، ومسجد القبيب نسبة إلى المحل الذي بني فيه، نزل فيه الرسول صلى الله عليه وسلم وصلى الجمعة بمن معه، فكانت أول جمعة تقام بعد هجرته إلى المدينة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4454999,39.61528839999999 \n" );
            }
            else if(data.equals("المسجد النبوي الشريف")){
                sendMessage.setText("\n\n المسجد النبوي الشريف: أو الحرم النبوي أو مسجد النبي أحد أكبر المساجد في العالم وثاني أقدس موقع في الإسلام (بعد المسجد الحرام في مكة المكرمة)، وهو المسجد الذي بناه النبي محمد في المدينة المنورة بعد هجرته سنة 1 هـ.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.468515,39.610526 \n" );
            }
            else if(data.equals("مسجد أبو بكر الصديق")){
                sendMessage.setText("\n\n مسجد أبو بكر الصديق: يقع جنوب غربي مسجد سلمان على بعد خمسة عشر متراً منه بني وجدد مع المسجدين السابقين وقد هدم الآن ليعاد بناؤه وتوسيع مساحته.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.466154,39.60633919999999 \n" );
            }
            else if(data.equals("مسجد بني غفار")){
                sendMessage.setText("\n\n مسجد بني غفار: المعروف بكهف بني حرام الكبير أحد المساجد المأثورة الي ورد أن النبي صلى الله عليه وسلم صلى فيها.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.471863,39.6025299 \n" );
            }
            else if(data.equals("مسجد العنبرية")){
                sendMessage.setText("\n\n مسجد العنبرية: هو المسجد الذي أنشأه السلطان العثماني عبد الحميد الثاني عام 1326هـ 1908م، ليكون جزءا من مشروع محطة المدينة المنورة التي هي آخر محطة من محطات سكة حديد الحجاز والذي كان يربط بين المدينة ودمشق، والتي بنيت في منطقة العنبرية المدينة المنورة، فحمل المسجد والمحطة اسم المنطقة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4617067,39.6017033 \n" );
            }
            else if(data.equals("مسجد السقيا")){
                sendMessage.setText("\n\n مسجد السقيا: بُني هذا المسجد في مكان قبّة الرسول عند خروجه لغزوة بدر، واستعراض جيشه وروي أن عمر بن الخطاب استسقى بالعباس بن عبدالمطلب في هذا المكان. ترجع تسميته لوقوعه قرب “بئر السقيا” الذي كان ملكًا للصحابي سعد بن أبي وقاص والتي تقع إلى الجنوب من هذا المسجد، والتي توضأ منها الرسول صلى الله عليه وسلم.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4608561,39.6001903 \n" );
            }
            else if(data.equals("مسجد الفتح")){
                sendMessage.setText("\n\n مسجد الفتح: يعد من أكبر المساجد، مبني فوق رابية في السفح الغربي لجبل سلع، وقد بناه عمر بن عبد العزيز في فترة إمارته على المدينة بالحجارة ثم جدد مرة أخرى بأمر الوزير سيف الدين بن أبي الهيجاء ثم أعيد بناؤه في عهد السلطان العثماني عبد المجيد الأول.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.477853,39.595602 \n" );
            }
            else if(data.equals("مسجد سلمان الفارسي")){
                sendMessage.setText("\n\n مسجد سلمان الفارسي: يقع جنوبي مسجد الفتح مباشرة وعلى بعد عشرين متراً منه فقط في قاعدة جبل سلع، وسمي باسم الصحابي سلمان الفارسي.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4774541,39.5956318 \n" );
            }
            else if(data.equals("قصر عروة ابن الزبير")){
                sendMessage.setText("\n\n قصر عروة ابن الزبير: يقع على ضفاف وادي العقيق في غرب المدينة المنورة، على امتداد الطريق المؤدّي إلى مسجد ذي الحليفة (ميقات أهل المدينة)، ويبعد عن المسجد النبوي حوالى 3.5 كم. قام عمر بن عبد الله ببناء القصر بتكليف من عروة بن الزبير، وما زالت بعض مبانيه قائمة حتى الآن.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.45039,39.5816615 \n" );
            }
            else if(data.equals("مسجد القبلتين")){
                sendMessage.setText("\n\n مسجد القبلتين: ويسمى أيضا بمسجد بني سلمة وهو مسجد يقع في الطرف الغربي من المدينة المنورة ويشتهر ببياضه الناصع.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4841959,39.57882840000001 \n" );
            }
            else if(data.equals("قصر سعيد ابن العاص")){
                sendMessage.setText("\n\n قصر سعيد ابن العاص: قصر أثري قديم يقع في وادي العقيق في المدينة المنورة. بناه الصحابي سعيد بن العاص عندما كان واليًا للمدينة في خلافة معاوية بن أبي سفيان.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4865951,39.5676507 \n" );
            }
            else if(data.equals("مسجد السيدة فاطمة")){
                sendMessage.setText("\n\n مسجد السيدة فاطمة: وهو أصغرمساجد هذه المجموعة مساحة 4×3م وله درجة صغيرة. وآخر بناء له على نمط أبنية المجموعة نفسها يرجح أنها في العصر العثماني في عهد السلطان عبد المجيد الأول.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.8091551,39.0985805 \n" );
            }
            // المهد
            else if(data.equals("حرات رهط البركانية")){
                sendMessage.setText("\n\n حرات رھط البركانیة: عبارة عن حقل بركاني فرید تحتضن ٧٠٠ فوھة بركانیة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.3767012,39.6304538 \n" );
            }
            // الأماكن السياحية - العُلا
            else if(data.equals("منتزه الحدائق التراثية")){
                sendMessage.setText("\n\n منتزه الحدائق التراثیة: تمكن لجمیع أفراد الأسرة فیھا الاستمتاع بوجبات لذیذة ومتنوعة ما بین التخصصات السعودیة والصینیة والھندیة والشامیة والمأكولات البحریة الطازجة، كما ستتاح لك فرصة الاختیار من بین تشكیلة واسعة من المقبلات اللذیذة والحلویات الشرقیة الممیزة، ویقدم المطعم أیضاً غرفاً خاصة للعائلات لضمان راحتھم وخصوصیتھم.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.3069269,40.4319251 \n" );
            }
            else if(data.equals("جبل الفيل")){
                sendMessage.setText("\n\n جبل الفیل: ھو عبارة عن صخرة ضخمة وتتمیز بشكلھا الفرید الذي یشبھ الفیل ومنھ اكتسب ھذا المسمى وتحیط بالصخرة مجموعة من الجبال ذات الألوان الفاتحة ویقع في منطقة متسعة تكسوھا الرمال الذھبیة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.6893459,37.9816139 \n" );
            }
            else if(data.equals("منتجع نخيل برزان الريفي")){
                sendMessage.setText("\n\n منتجع نخیل برزان الریفي: منتجع جمع بین أركانھ الجلسات المتنوعة و الضیافة العربیة و المأكولات الشعبیة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.6292373,37.9232542 \n" );
            }
            else if(data.equals("مقهى ومنتزه المحكر التراثي الريفي")){
                sendMessage.setText("\n\n مقھى ومنتزه المحكر التراثي الریفي: یتألف من حدیقة واسعة تضم مجموعة من المساحات العشبیة وأشجار النخیل العالیة والزھور الملونة، كما یوفر جلسات تعلیمیة للأطفال حول مواضیع تشمل تاریخ العلا ومقدمة عن الزراعة، وقد تم تجھیز الحدیقة بمقھى مریح حیث یمكن للزوار الراحة والاستمتاع بفنجان لذیذ من القھوة أو الشاي أو طبق محلي لذیذ.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.6285001,37.91688180000001 \n" );
            }
            else if(data.equals("منتجع شلال الزراعي")){
                sendMessage.setText("\n\n منتجع شلال الزراعي: یوفر عیش الطبیعة والحیاة الھادئة بعیداً عن صخب المدن.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.8283217,37.8537154 \n" );
            }
            else if(data.equals("جبل القوس")){
                sendMessage.setText("\n\n جبل القوس: یمتاز بھیكلھ على شكل الجسر، والذي یشبھ قوس قزح محاط بسحابتین،ھو مشھد نادر بالفعل، كما تحیط بھذا الجبل مترامي الأطراف من الحجرالرملي ماسات صحراویة شبھ كریمة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.0493536,37.7661245 \n" );
            }
            else if(data.equals("جبال الغراميل")){
                sendMessage.setText("\n\n جبال الغرامیل: تعد الغرامیل من التضاریس الملھمة في محافظة العلا فھي تكوینات صخریة حمراء ذات أشكال متفاوتة نحتتھا الریاح على مر الأزمان لتصبح أیقونة فریدة في مشھد صحراوي ساحر.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.3582244,37.8103354 \n" );
            }
            else if(data.equals("مطل حرة عويرض")){
                sendMessage.setText("\n\n مطل حرة عویرض: حرة عویرض ھي حرة بركانیة وتشتھر بتضاریسھا الوعرة وأودیتھا المختلفة،وبھا فوھات بركانیة على خط مستقیم على طول الحرة، وھي تتفرع على ھیئة ألسن وأذرع كثیرة جداً بین الشعاب والأودیة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.8518472,37.62554060000001 \n" );
            }
            // التراث والثقافة - العُلا
            else if(data.equals("كتابات ونقوش جبل عكمه")){
                sendMessage.setText("\n\n كتابات ونقوش جبل عكمه: یعتبر مكتبة المملكة العربیة السعودیة المفتوحة، لاحتواه مئات النقوش والكتابات على المنحدرات والواجھات الصخریة التي تعود أسا ًسا إلى الفترتین الدادانیة واللحیانیة.تحكي تاریخ المنطقة، والحیاة فیھا، خلال حقب تاریخیة مختلفة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.1690422,44.6349752 \n" );
            }
            else if(data.equals("الحِجر (مدائن صالح)")){
                sendMessage.setText("\n\n الحجر مدائن صالح: ھي موقع أثري یقع في إقلیم الحجاز یحتل المكان موقعاً إستراتیجیاً على الطریق الذي یربط جنوب شبھ الجزیرة العربیة ببلاد الرافدین وبلاد الشام ومصر، كما أن للمكان شھرتھ التاریخیة التي استمدّھا من موقعھ على طریق التجارة القدیم الذي یربط جنوب شبھ الجزیرة العربیة والشام، والحجر اسم دیار ثمود بوادي القرى بین المدینة المنورة وتبوك.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.8040118,37.9572703 \n" );
            }
            else if(data.equals("البلدة القديمة")){
                sendMessage.setText("\n\n البلدة القدیمة: بلدة مھجورة بالكامل، وھي إحدى المدن الإسلامیة الثلاث الباقیة في العالم، تسمى بالدیرة، ویوجد بھا مباني تراثیة قدیمة ومساجد وأسواق، یعود تاریخھا إلى نحو ٧ قرون.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.6250587,37.9150404 \n" );
            }
            else if(data.equals("مدينة الخريبة الأثرية")){
                sendMessage.setText("\n\n مدینة الخریبة الأثریة مدائن صالح مقابر الأسود: ھي منطقة أثریة تمثل جزءاً من أطلال مدینة دادان القدیمة التي تعود لحضارة مملكة دادان العربیة، والتي برزت سیادتھا في تلك المنطقة في القرن الـ٧ قبل المیلاد.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.657399,37.9141736 \n" );
            }
            else if(data.equals("جبل أم الدرج")){
                sendMessage.setText("\n\n جبل أم الدرج: یشتھر الجبل بكثرة المعثورات والنقوشات الأثریة فیھ، حیث یشكل ھو وجبل عكمة أكبر رافد معلومات عن الحیاة الاجتماعیة والاقتصادیة والتجارة والضرائب في مملكة دادان.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=31.4475728,35.2030618 \n" );
            }

            // الأنشطة - العُلا
            else if(data.equals("زيبلاين العُلا")){
                sendMessage.setText("\n\n تجربة زيبلاين العلا: اكتشف أحدى أكثر الزيبلاين إثارة في المملكة، انطلق على سرعة ١٠٠ كم في الساعة عبر مناظر جبال العلا الخلابة. https://www.experiencealula.com/ar/plan-your-trip/what-to-do/alula-zipline\n\n Instagram: https://instagram.com/experiencealula?utm_medium=copy_link \n\n Website: https://www.experiencealula.com/ar \n\n رقم الاستفسارات: 00966920025003 \n من ٩ صباحًا إلى ٥ مساءً - من الأحد إلى الخميس.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.1690422,44.6349752 \n" );
            }
            else if(data.equals("الحِجر")){
                sendMessage.setText("\n\n الحجر: تفضلوا بزيارة الحجر في العلا للتعرف على أول موقع سعودي مدرج على لائحة اليونسكو للتراث العالمي. وسوف تستكشفون هنا عددا من المدافن الرائعة الموجودة في قلب  المناظر الطبيعية الصحراوية المذهلة، كما ستتعرفون على شعب وثقافة العلا القديمة.\n"
                        + "\n\n جولة الحجر وعرض مسرحية الملكة شقيلة\n"
                        + "https://www.experiencealula.com/ar/plan-your-trip/what-to-do/immersion-show \n\n"
                        + "\n https://www.google.com/maps/search/?api=1&query=18.1690422,44.6349752 \n" );
            }
            else if(data.equals("دادان تجسيد لتاريخ")){
                sendMessage.setText("\n\n دادان تجسيد لتاريخ العلا الغني: من بين الاكتشافات الأكثر أهمية في العلا هي مدينة دادان، عاصمة مملكتي دادان ولحيان. \n"
                        + "للحجر وقطع التذاكر: \n"
                        + "https://book.experiencealula.com/showEventInformation.html?idEvent=556\n\n"
                        + "\n https://www.google.com/maps/search/?api=1&query=18.1690422,44.6349752 \n");
            }
            else if(data.equals("جبل عكمة")){
                sendMessage.setText("\n\n جبل عكمة: تنتشر في عدّة مواقع في العلا الآلاف من النقوش التي تعود إلى ما قبل ٌ حقبة اللغة العربية، وهي تجعل من العلا موقعا مهما في دراسة اللغة العرب ّية. ويتم ّيز جبل الأقرع  الواقع شمالي وادي العلا بكونه يضم أكثر من 450 من أولى النقوش باللغة العرب ّية. كما يتم ّيز نقش زهير إلى الشرق بكونه أحد أقدم النقوش في العصر الإسلامي - يعود تاريخه إلى 24 هـ (644 م). ولكن لا يوجد موقع أكثر أهمية من جبل عكمة، موطن أغنى النقوش وأكثرها تنوعا.\n"
                        + "للحجز وقطع التذاكر: \n"
                        + "https://book.experiencealula.com/showEventInformation.html?idEvent=556\n\n"
                        + "\n https://www.google.com/maps/search/?api=1&query=18.1690422,44.6349752 \n" );
            }
            else if(data.equals("العُلا القديمة")){
                sendMessage.setText("\n\n بلدة العلا القديمة هي المكان الذي تجمع فيه الحجاج والمسافرون والمستوطنون\n" +
                        "الدائمون عبر العصور. \n للمزيد من الجولات والفعاليات في العلا القديمة: https://www.experiencealula.com/ar/discover-alula/heritage/alula-old-town\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.1690422,44.6349752 \n" );
            }
            else if(data.equals("جولة موقع اليونسكو الأثري")){
                sendMessage.setText("\n\n جولة موقع اليونسكو الأثري: للحجز وقطع التذاكر https://www.experiencealula.com/ar/plan-your-trip/what-to-do/hegra-tour\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.1690422,44.6349752 \n" );
            }
            else if(data.equals("مسار البرتقال والوادي")){
                sendMessage.setText("\n\n مسار البرتقال والوادي لا يتطلب شراء تذكرة. \n www.experiencealula.com/ar/discover-alula/nature-//:https outdoors/alula-oasis/wadi-orange-path\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.1690422,44.6349752 \n" );
            }
            else if(data.equals("تجربة جبل الفيل")){
                sendMessage.setText("\n\n  تجربة جبل الفيل، دخول مجاني في فترة الصيف مرحبا بكم في جبل الفيل، الرجاء الجلوس والاستمتاع بتجربتنا الفريدة في تأمل صخرة الفيل الشهيرة والنجوم الليلية المذهلة في العلا.\n" +

                        "\n\nللوصول لموقع جبل الفيل يمكنك قيادة سيارتك و صف السيارة في الأماكن المخصصة عند المدخل. أو اطلب خدمة سيارات الأجرة. \n\n \n الموقع: https://www.google.com/maps/place/Elephant+Mountain/@26.6891779,37.9115627,12z/data=!4m5!3m4!1s0x15a452ac509a65f3:0x70558fd82412c836!8m2!3d26.6891951!4d37.981603?shorturl=1 \n خدمة سيارات الأجرة: \n https://www.experiencealula.com/ar/plan-your-trip/Getting-to-and-around-AlUla\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.1690422,44.6349752 \n" );
            }
            else if(data.equals("منتزه دراجات العلا")){
                sendMessage.setText("\n\n منتزه دراجات العلا: \n https://www.experiencealula.com/ar/plan-your-trip/what-to-do/bike-park\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.1690422,44.6349752 \n" );
            }
            else if(data.equals("مسار الخيول")){
                sendMessage.setText("\n\n مسار الخيول: سافر عبر الزمن في تجربة ركوب الخيل عبرالمناظر الصحراوية الخلابة بمشاهد الجبال المذهلة والآفاق البانورامية عند كل منعطف. \n" +
                        "\n https://www.experiencealula.com/ar/plan-your-trip/what-to-do/horse-trail\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.1690422,44.6349752 \n" );
            }
            else if(data.equals("تجربة نفاذ السدو")){
                sendMessage.setText("\n\n تجربة نفاذ السدو:\n https://www.experiencealula.com/ar/plan-your-trip/what-to-do/sadu-escape\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.1690422,44.6349752 \n" );
            }
            else if(data.equals("تجربة اليوغا الاسترخائية")){
                sendMessage.setText("\n\n تجربة اليوغا الاسترخائية وتأمل الصوت: \n https://www.experiencealula.com/ar/plan-your-trip/what-to-do/sound-experience\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.1690422,44.6349752 \n" );
            }
            else if(data.equals("مسار الفنون الصخرية في الحجر")){
                sendMessage.setText("\n\n مسار الفنون الصخرية في الحجر: \n https://www.experiencealula.com/ar/plan-your-trip/what-to-do/rock-art-trail\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.1690422,44.6349752 \n" );
            }
            else if(data.equals("مسار الوادي الخفي المشغل")){
                sendMessage.setText("\n\n مسار الوادي الخفي المشغل: هوساك \n https://www.experiencealula.com/ar/plan-your-trip/what-to-do/hidden-valley\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.1690422,44.6349752 \n" );
            }
            else if(data.equals("جولة هليكوبتر العلا")){
                sendMessage.setText("\n\n جولة هليكوبتر العلا: اربط حزام الأمان وضع سماعات الرأس الخاصة بك ؛ حان وقت رؤية جمال العلا من الأعلى!\n" +
                        " \n" +
                        " \n للحجز: https://book.experiencealula.com/showEventInformation.html?changeLanguageTo=ar&idEvent=573&tkhrq=40a41894-6f85-4187-ad99-5c32a290fbdf&tkhrp=6a594739-949c-46ff-999d-d39980956119&tkhrts=1626615359&tkhrc\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.1690422,44.6349752 \n" );
            }
            else if(data.equals("للمزيد من الجولات والفعاليات")){
                sendMessage.setText("\n\n للمزيد من الجولات والفعاليات: \n 1- \nInstagram: https://instagram.com/experiencealula?utm_medium=copy_link \n\n Website: https://www.experiencealula.com/ar \n\n رقم الاستفسارات: 00966920025003 \n من ٩ صباحًا إلى ٥ مساءً - من الأحد إلى الخميس\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.1690422,44.6349752 \n\n\n 2-\n https://desertstorm.sa/ar/" );
            }

            // الأماكن السياحية - بدر
            else if(data.equals("ساحل الرايس")){
                sendMessage.setText("\n\n ساحل الرایس: الرایس بلدة ھادئة حالمة تقع على ضفاف البحر الأحمر تتمیزبموقعھا الجغرافي والساحلي وتمتاز بصفاء میاھھا الزرقاء وسحرشعابھا المرجانیة وھدوئھا وذھبیة رمالھا.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=23.5754811,38.6057798 \n" );
            }
            // التراث والثقافة - بدر
            else if(data.equals("سوق غيقه الأثري")){
                sendMessage.setText("\n\n سوق غیقة الأثري: اشتھرت غیقة بسوقھا التجاري الكبیر الذي ضم العدید من المحلات التجاریة التي بنیت منالحجر وسقفت بجرید النخل، ولازال معظمھا متمسك بالوجود رغم مرور السنوات الطویلة التي مرت علیھا، ضم السوق الكثیر من البضائع التي جمعت أعداد كبیرة من أھالي القرى والھجرالمجاورة، إضافة إلى المارین بالقریة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=23.6788353,38.9472433 \n" );
            }
            else if(data.equals("سوق بدر الشعبي")){
                sendMessage.setText("\n\n سوق بدر الشعبي: سوق شعبي یحتوي على مجموعة من البسطات یتمیز بتنوع المنتجات وبأسعار مناسبھ.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=23.77666920000001,38.7949425 \n" );
            }
            else if(data.equals("موقع غزوة بدر")){
                sendMessage.setText("\n\n موقع غزوة بدر: منطقة بدر وھي بئ ٌر مشھورةٌ تقع بین م  َّكة المكرمة والمدینة المنورة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.6118511,39.129309 \n" );
            }

            // الأماكن السياحية - ينبع
            else if(data.equals("حديقة الأمير سعود بن عبدالله")){
                sendMessage.setText("\n\n حدیقة الأمیر سعود بن عبدالله: یحظى الراكضون في ھذا المتنزه بمسارات محاطة بخضار الأشجار والنباتات التي تزید من سكینة المنطقة وجمالھا. ویبلغ طول المسار ٢ كم بالإضافة إلى مسار اخر خاص بالدراجات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.8551105,46.6341344 \n" );
            }
            else if(data.equals("حديقة الطيور")){
                sendMessage.setText("\n\n حدیقة الطیور: یمكن الاستمتاع بھوایة المشي نظ ًرا لوجود ممرللمشاة أی ًضا في المنطقة نفسھا.تتمیز بمساحتھا الخضراء. بھا منطقة مخصصة للأطفال ونافورة تستكمل مشدھا الجمالي الذي تمیزه البحیرة الاصطناعیة. مساءا، تتلألأ الحدیقة بأضواء جمیلة تضفي جوا من البھجة على المكان.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.3640483,49.5851669 \n" );
            }
            else if(data.equals("جبل رضوى")){
                sendMessage.setText("\n\n جبل رضوى: یتمیز ھذا الجبل بارتفاعھ وجمالھ وشھرتھ على مرالتاریخ وھو من الجبال الوعرة التي یصعب صعودھا ومن قمتھ ترى مدینة ینبع كاملة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.5541807,38.2149989 \n" );
            }
            else if(data.equals("حديقة أشجار النيم")){
                sendMessage.setText("\n\n حدیقة أشجار النیم: وض ّمت الحدیقة مساراً مخصصاً للدراجات الھوائیة وممش ًى ریاضیاً ملبساً بمادة مطاطیة وعدد ١١٠٦ من الأشجار، و٣٧٠٠ من الشجیرات، ومساحة مسطحات خضراء ، كما یتوفر بالحدیقة مسجد ومنطقة لألعاب الأطفال ومقھى ومواقف للدراجات الھوائیة والسیارات ودورات للمیاه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.04232440000001,38.17946269999999 \n" );
            }
            else if(data.equals("جزيرة النورس")){
                sendMessage.setText("\n\n جزیرة النورس: بإطلالة ساحرة على البحر الأحمر تقع جزیرة النورس في منطقة الواجھة البحریة بمدینة ینبع\n" +
                        "الصناعیة، وھي جزیرة ممیزة بجمالھا وھدوئھا وطابعھا العمراني والبیئي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.0041116,38.15390559999999 \n" );
            }
            else if(data.equals("الواجهة البحرية")){
                sendMessage.setText("\n\n الواجھة البحریة: تعتبر الواجھة البحریة ینبع الوجھة المفضلة لمحبي السیاحة المائیة، فھذه المنطقة الممیزة التي تقع في مدینة ینبع الصناعیة تحتوي على ٨ شواطئ مفتوحة یمكن فیھا ممارسة ریاضة الغوص ومختلف الأنشطة المائیة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.0197471,38.146436 \n" );
            }
            else if(data.equals("شرم ينبع")){
                sendMessage.setText("\n\n شرم ینبع: مسطح مائي، یطل على البحرالأحمر.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.1308475,37.9869288 \n" );
            }
            else if(data.equals("مرسى الأحلام البحري")){
                sendMessage.setText("\n\n مرسى الأحلام البحري: تضم إلى جانب شاطئ البحر الھادئ ورملتھ الناعمة العدید من عوامل الجذب السیاحیة الممیزة مثل مراسي القوارب ومراكز الغوص والمطاعم وحدائق الأطفال،إلى جانب المنتجعات المنتشرة على طول المرسى.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.168108,37.964371 \n" );
            }

            // التراث والثقافة - ينبع
            else if(data.equals("سوق السويق وسوق الجابرية")){
                sendMessage.setText("\n\n سوق السویق التراثي وسوق الجابریة الأثري بینبع النخل: سوق السویق لھ شھرة كبیرة ویسمى بسوق یوم الاثنین ومازال موجود في مكانھ القدیم رغم طمس معظم معالمھ للتجدید. وكان یخضع لأنظمة رقابیة تعتمد على سلامة البیع والشراء لكل وارد وصادر، تُجلب لھ البضائع مثل السمن والعسل والحیوانات الإبل والأغنام من جمیع المناطق المحیطة.سوق الجابریة وھو عبارة عن سوق مكون من عدة دكاكین كان في الماضي یباع فیھا المواد الغذائیة بأنواعھا والمواشي والأعلاف والحطب وغیره، وبھا أیضاً \"الجلابین\" أو \"الحلة\" وھي عبارة عن بیوت متجاورة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.37742680000001,38.4519825 \n" );
            }
            else if(data.equals("متحف رضوى التراثي")){
                sendMessage.setText("\n\n متحف رضوى التراثي: ھو متحف خاص للتراث الشعبی ویملكھ سالم عید سالم الحجوري الجھني حیث حول منزلھ الذي یضم قطع تراثیة لمتحف بھدف الحفاظ على مقتنیاتھ التاریخیة التي تذكره بالماضي القدیم وأصالة الأجداد.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.0952031,38.0694122 \n" );
            }
            else if(data.equals("ينبع البلد")){
                sendMessage.setText("\n\n ینبع البلد سوق اللیل التراثي: ویعتبر السوق واجھة حضاریة وجز ًء من الھویة الثقافیة لینبع لتمیزه بمنتجات قد لا تتوفر في أسواق أخرى، سوا ًء داخل ینبع أو بالمناطق المحیطة بھا، مثل السمك الجاف والبن والھیل والحناء والملوخیة والتمر والرطب وغیرھا.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.0795088,38.0607777 \n" );
            }
            // التسوق - ينبع
            else if(data.equals("مجمع الورود")){
                sendMessage.setText("\n\n مجمع الورود: مجمع تجاري یضم العدید من المحلات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4821003,39.5390272 \n" );
            }
            else if(data.equals("الجوهرة مول")){
                sendMessage.setText("\n\n الجوهرة مول: یضم العدید من المحلات التجاریة والماركات العالمیة من الملابس والأحذیة واللوازم المنزلیة ، كما\n" +
                        "یحتوي على العدید من المرافق المسلیة للأطفال، ویحتوي المول على العدید من المقاھي والمطاعم، لذلك یعتبرالجوھرة مول من افضل مولات ینبع.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.015,38.19805559999999 \n" );
            }
            else if(data.equals("الدانة مول")){
                sendMessage.setText("\n\n الدانة مول: یضم المول العدید من المحلات التجاریة من الألبسة والأحذیة ومستلزمات المنزل والعدید من الماركات العالمیة، كما یحتوي على العدید من المطاعم والمقاھي، كما تقدم سینما الدانة أحدث الأفلام العالمیة، یقع المول في شارع الملك فھد، ویعد دانة مول من افضل مولات ینبع.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.0337337,38.1936079 \n" );
            }

            // الأنشطة - ينبع
            else if(data.equals("بعض النشاطات")){
                sendMessage.setText("بعض النشاطات:" + "\nhttps://desertstorm.sa/ar");
            }
            // الأماكن السياحية - خيبر
            else if(data.equals("كهف أم جرسان")){
                sendMessage.setText("\n\n كھف أم جرسان: ویعد من أكبر الكھوف في الوطن العربي، حیث یبلغ طولھ ١٥٠٠م، ویحتوي بداخلھ على موجودات أثریة من جماجم بشریة وعظام لحیوانات مفترسة وكتابات یعود تاریخھا لآلاف السنین.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.58867,39.75719000000001 \n" );
            }

            // التراث والثقافة - خيبر
            else if(data.equals("سد البنت الأثري")){
                sendMessage.setText("\n\n سد البنت الأثري: سد مائي تاریخي أثري، یرجع تاریخ إنشاءه إلى فترة ما قبل الإسلام.وھو مشید من أحجار غیر مشذبة ویظھر من البنیان اختلاف في فترات بنائھ وأضیفت على بناء السد طبقة من الملاط من الجھة التي تحجز المیاه، ویأخذ السد شك ًلا متدر ًجا وتزداد سماكتھ عند القاعدة وتقل في الأجزاء العلیا، والسد مدرج من كلا جانبیھ.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.4850123,39.3628828 \n" );
            }
            else if(data.equals("متحف خيبر للتراث")){
                sendMessage.setText("\n\n متحف خیبر للتراث: متحف خاص للتراث الشعبي یحتوي على المعروضات الأثریة و التاریخیة ذات القیمة الكبیرة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.6828926,39.28577560000001 \n" );
            }
            else if(data.equals("آثار خيبر القديمة")){
                sendMessage.setText("\n\n آثار خیبر القدیمة: خیبر القدیمة ھي واحة ومنطقة تاریخیة تقع في منطقة المدینة المنورة في المملكة العربیة السعودیة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.7271301,39.2693652 \n" );
            }
            else if(data.equals("حصن خيبر الأثري")){
                sendMessage.setText("\n\n حصن خیبر الأثري: یُعد الحصن أشھر الحصون في خیبر، ویعرف بالحصن وبحصن خیبر، وذلك لشھرتھ واسمھ الفعلي حصن القموص ویشرف مباشرة على خیبر القدیمة، ویوفر الحمایة لھا، وقد أعید بناؤه لیكون مقراً للإمارة بعد ضم خیبر للدولة السعودیة في عھد الملك عبد العزیز.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.7307147,39.2682635 \n" );
            }
            else if(data.equals("قرية أبو وشيع التراثية")){
                sendMessage.setText("\n\n قریة أبو وشیع التراثیة: تعتبر قریة ابو وشیع التراثة والتاریخیة بمحافظة خیبر من أھم التراث الحضارى التاریخي الذي یوضح حیاة أھل القریة و تفیض بالإبداع الیدوي من نقش معماري وحكایات تجود بھا ذاكرة سكان ھذه القریة المؤلفة من نماذج تعكس البیئات التي انشائة إثرھا حضارة . ینبع\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.7504916,39.26081200000001 \n" );
            }
            else if(data.equals("حصن النزار التاريخي")){
                sendMessage.setText("\n\n حصن النزار التاریخي: ھو حصن بناه الیھود في خیبر شمال المدینة المنورة، وانتھى باستیلاء المسلمین علیھ في غزوة خیبر. یعد الحصن من أكبر القلاع مساحة وأمنعھا.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.7407921,39.2531818 \n" );
            }

            // الأماكن السياحية - عرعر
            else if(data.equals("بوليفارد عرعر")){
                sendMessage.setText("\n\n بوليفارد عرعر: عرعر تحتضن مجمعاً واحداً يجمع بين أمتع تجارب تناول الطعام والقهوه ، وهذا المكان اسمه “البوليفارد”.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=30.977777,41.0087325 \n" );
            }
            else if(data.equals("منتزهات مسجد الأمير عبدالله")){
                sendMessage.setText("\n\n منتزهات مسجد الأمير عبدالله بن عبدالعزيز: واحد من أجمل التحف المعمارية في مدينة عرعر بالسعودية، وهو علامة مُميزة في التاريخ السعودي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=31.66464839999999,38.650271 \n" );
            }

            // التراث والثقافة - عرعر
            else if(data.equals("متحف بسام المفلح")){
                sendMessage.setText("\n\n متحف بسام المفلح : يقع في المكتبة العامة بعرعر والذي يضم مجموعة متميزة من\n" +
                        "المقتنيات التراثية القديمة. كما أطلقت إدارة المعرض التراثي , المتحف الافتراضي عبر\n" +
                        " الموقع الإلكتروني الخاص بالمعرض.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=30.9765636,41.0598591 \n" );
            }
            else if(data.equals("قصر الإمارة التاريخي")){
                sendMessage.setText("\n\n قصر الإمارة التاريخي: يعتبر من أقدم القصور التاريخية الموجودة في المملكة العربية\n" +
                        "السعودية حيث أنه من القصور القديمة الأثرية التي تم تصميمها بشكل مميز، و قد تم \n" +
                        "تقسيم القصر إلى عدة غرف مختلفة الاستخدام.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.3944265,36.58981989999999 \n" );
            }

            // التسوق - عرعر
            else if(data.equals("السوق الشعبي للأسر المنتجة")){
                sendMessage.setText("\n\n السوق الشعبي للأسر المنتجة: ويتك َّون السوق من 24 محلا، يشتمل على مصلى، ودورات مياه، ويمتاز بطابع شعبي،\n" +
                        "روعي في تصميمه ذا طراز عمراني تراثي، يتناسب مع المنتجات الحرف َّية، والأكلات الشعب َّية التي تسوقها معظم الأسر المنتجة في محلات السوق.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=30.9696141,41.0336283 \n" );
            }
            else if(data.equals("عرعر مول")){
                sendMessage.setText("\n\n عرعر مول: يعتبر عرعر مول أحدث وأكبر المجمعات التجارية في مدينة عرعر،\n" +
                        "صمم المول بمواصفات حديثة، ويحتوي على العديد من المحلات والمتاجر التي تلبي \n" +
                        "كافة الإحتياجات والأذواق.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=30.95487730000001,41.0129208 \n" );
            }
            else if(data.equals("فالي مول")){
                sendMessage.setText("\n\n فالي مول : يعتبر من أهم مراكز التسوق والترفيه بعرعر.يضم فالي مول مجموعة من\n" +
                        "المحال التجارية المحلية وكذلك المحلات التي تحمل أشهر العلامات التجارية العالمية، \n" +
                        "ناهيك عن تجربة الترفيه في أماكن ألعاب الأطفال هناك.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=30.9667427,41.0241187 \n" );
            }

            // التراث والثقافة - رفحاء
            else if(data.equals("سوق لينه التراثي التاريخي")){
                sendMessage.setText("\n\n سوق لينة التراثي التاريخي: يعد من المعالم التاريخية التي ساهمت في ازدهار المنطقة ،\n" +
                        "وظل هذا السوق نشطاً ويعج بالتجار حتى عهد قريب، لتبقى إطلالته المتمثلة بالمحلات\n" +
                        " المبنية من الطين شاهداً على التاريخ.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.7601404,43.7392937 \n" );
            }
            else if(data.equals("قرية زبالا الأثرية")){
                sendMessage.setText("\n\n قرية ُز َبالا الأثرية: تعتبر من القرى الغنية بالآثار، وأبرزها البئر الذي يأخذ شكلاً مربعاً،\n" +
                        "والقصر الأثري ويضم الموقع بركاً عدة منها بركة الشاحوف وأم العصافير والشيحيات،  كما يوجد فيها الكثير من الآثار من أهمها حصن زبالا.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.3931937,43.5582915 \n" );
            }
            else if(data.equals("بركة جميماء الأثرية")){
                sendMessage.setText("\n\n قرية جميماء الاثرية: يحتوي الموقع على بركة ماء ووحدات معمارية، وأهم معالم\n" +
                        "الموقع البركة، مربعة الشكل لها دعائم أسطوانية ودرج في جدارها الشرقي يتكون من  13 درجة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.6055888,43.603705 \n" );
            }
            else if(data.equals("متحف للماضي أثر")){
                sendMessage.setText("\n\n متحف للماضي أثر: يسمى (متحف صياح قاسم الشمري) يعتبر من المتاحف الغنيه\n" +
                        "بتراث المنطقه ويجمع بين ماضيها وحاضرها حيث يضم المتحف اكثر من تسعة أقسام  رئيسية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.6287539,43.5222453 \n" );
            }

            // الأماكن السياحية - طريف
            else if(data.equals("جبل أقرن البركاني")){
                sendMessage.setText("\n\n جبل أقرن البركاني: من أشهر المعالم الطبيعية المميزة ، وهو من المواقع الأثرية المهمة؛\n" +
                        "بسبب العثور على دلائل مادية أثرية تشير إلى استيطانه منذ العصور الحجرية. \n\n" + "\n https://www.google.com/maps/search/?api=1&query=31.5342539,38.3033967 \n" );
            }

            // التراث والثقافة - سكاكا
            else if(data.equals("أعمدة الرجاجيل الأثرية")){
                sendMessage.setText("\n\n أعمدة الرجاجيل الأثرية: عبارة عن أعمدة حجرية توجد في سهل رملي متسع شكله نصف دائري وتظهر على الأعمدة الحجرية نقوش ثمودية ورسوم.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.8128876,40.2196684 \n" );
            }
            else if(data.equals("مطعم قصر إبراهيم العيشان")){
                sendMessage.setText("\n\n مطعم قصر إبراهيم العيشان التراثي: قصر العيشان أو قصر الشيخ إبراهيم العيشان الحمداني السرحاني قصر أثري يقع في منطقة الجوف شمال المملكة العربية السعودية ويتجاوز عمره القرن.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.9585052,40.2070306 \n" );
            }
            else if(data.equals("حي الضلع التراثي التاريخي")){
                sendMessage.setText("\n\n حي الضلع التراثي التاريخي: هو حي من البيوت المتلاصقة على سفح التل الذي يقوم عليه حصن زعبل، وشيدت من الطين والحجارة وجذوع الإثل.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.9925714,40.2024689 \n" );
            }
            else if(data.equals("قلعة زعبل التاريخية")){
                sendMessage.setText("\n\n قلعة زعبل التاريخية: قلعة زعبل هي قلعة أثرية تقع شمال مدينة سكاكا في منطقة الجوف شمال المملكة العربية السعودية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.9929599,40.20183919999999 \n" );
            }
            else if(data.equals("بئر سيسرا الأثري")){
                sendMessage.setText("\n\n بئر سيسرا الاثري: هي من الآبار الأثرية في منطقة الجوف الواقعة وهي بئر منحوتة في الصخر غرب حصن زعبل تعود تسمية البئر للقائد العسكري الكنعاني سيسرا الذي حارب اليهود في فلسطين.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.99191,40.19831500000001 \n" );
            }

            // التسوق - سكاكا
            else if(data.equals("سوق الجوف الشعبي")){
                sendMessage.setText("\n\n سوق الجوف الشعبي: السوق الشعبي الأول في منطقة الجوف، نسعى لنكون الوجهة الأولى للسياحة والترفيه والتسوق بالمنطقة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.9507288,40.203362 \n" );
            }
            else if(data.equals("الجوف بلازا")){
                sendMessage.setText("\n\n الجوف بلازا: يعتبر الجوف بلازا معلم من معالم سكاكا بحيث أنه يمثل التجربة التسويقية الفريدة والوحيدة لسكان سكاكا والمدن المجاورة تبلغ مساحة المول ٢٥٬٠٠٠ متر مربع.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.9541694,40.1916824 \n" );
            }
            else if(data.equals("الشمال مول")){
                sendMessage.setText("\n\n الشمال مول: يقع مول الشمال التجاري في مركز المدينة، وهو أحد المولات المميزة والقريبة من وسائل النقل العام. يضم هذا المركز التجاري حوالي 300 متجرا متنوعا.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.9706067,40.2070346 \n" );
            }
            else if(data.equals("الجوف سنتر")){
                sendMessage.setText("\n\n الجوف سنتر: يُعتبر من أشهر مولات سكاكا الذي تم بنائه في الآونة الأخيرة وهو من المولات الشاملة لجميع احتياجات الاسرة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.9544384,40.19086060000001 \n" );
            }

            // التراث والثقافة - القريات
            else if(data.equals("قلعة كاف التاريخية")){
                sendMessage.setText("\n\n قلعة كاف التاريخية: وهو عبارة عن قصر تاريخي بني عام 1438هـ على شكل قلعة حجرية بنيت من الحجر الرسوبي الكلسي الأبيض على منطقة صخرية. ويتكون من عدد من الغرف، بعضها للاستخدام السكني، وأخرى للإدارة والمخازن.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7652398,46.8143515 \n" );
            }

            // الأماكن السياحية - دومة الجندل
            else if(data.equals("بحيرة دومة الجندل السياحية")){
                sendMessage.setText("\n\n بحيرة دومة الجندل السياحية: بحيرة دومة الجندل هي بحيرة ليست طبيعية بل اصطناعية ونشأت في دومة الجندل التابعة لمنطقة الجوف شمال المملكة العربية السعودية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.8145661,39.9118965 \n" );
            }
            else if(data.equals("مدينة التمور")){
                sendMessage.setText("\n\n مدينة التمور: ارتباط وثيق ما بين بريدة كـبلد وتمـور بريدة في صورة مدينة متكاملة تستحق التفرد كمعـلم حضاري واقتصادي وسياحي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.7989522,39.8656458 \n" );
            }

            // التراث والثقافة - دومة الجندل
            else if(data.equals("متحف الجوف الإقليمي")){
                sendMessage.setText("\n\n متحف الجوف الإقليمي: يتميز المتحف بموقع استراتيجي متميز في (دومة الجندل)، وبإطلالة على منطقة أثرية مهمة تشمل قلعة مارد، ومسجد عمر، ويجاوره متحف النويصر، وغيره من المعالم الحضارية بالجوف.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.80991719999999,39.8670331 \n" );
            }
            else if(data.equals("قلعة مارد التاريخية")){
                sendMessage.setText("\n\n قلعة مارد التاريخية: قلعة مارد هي قلعة تاريخية حربية تقع بمدينة دومة الجندل بمنطقة الجوف، وتبعد عن مدينة سكاكا حوالي 50 كم، ويعود تاريخها إلى القرن الأول الميلادي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.8113826,39.86732749999999 \n" );
            }
            else if(data.equals("حي الدرع التاريخي")){
                sendMessage.setText("\n\n حي الدرع التاريخي ومسجد عمر ابن الخطاب: يعد مسجد عمر بن الخطاب في دومة الجندل، الذي يقع بجانب قلعة مارد في حي الدرع من الجهة الجنوبية، من أهم المساجد التاريخية في المملكة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.8119306,39.86746110000001 \n" );
            }

            // الأماكن السياحية - الخبر
            else if(data.equals("روفز")){
                sendMessage.setText("\n\n روفز: يضم ٣٧ محلاً موزعة على معارض تجارية وكافيات.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.3203421,50.2226864 \n" );
            }
            else if(data.equals("قرية القصيبي الخبر")){
                sendMessage.setText("\n\n قرية القصيبي: تأسست قرية القصيبي في مدينة الخبر شرق السعودية عام ٢٠٠٧ م، حيث يقصدها الكثير من السياح والسكان للاستمتاع بأجواء من الاسترخاء في أجواء من المتاجر الأوروبية القديمة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.3029069,50.22229219999999 \n" );
            }
            else if(data.equals("الحكير تايم الخبر")){
                sendMessage.setText("\n\n الحكير تايم: عبارة عن مدينة ملاهي مغلقة متكاملة، كفيلة بإشعال روح الحماس والتحدي في نفوس جميع زوارها كباراً وصغاراً.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.33659,50.19787400000001 \n" );
            }
            else if(data.equals("اجدان ووك")){
                sendMessage.setText("\n\n أجدان ووك:  يعتبر أحد المعالم البارزة في الخبر، أبرز مشاريعها قرية المطاعم وصالات السينما العالمية.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.2832832,50.22154989999999 \n" );
            }
            else if(data.equals("مدينة الأطفال")){
                sendMessage.setText("\n\n مدينة الأطفال: تحتوي على ٢٥ مجسماً لمباني ومرافق حكومية، ومجسمات لأسواق تجارية ومرافق ترفيهية ومباني سكنية، مشيرا إلى أن الهدف من المدينة وتصاميمها تعليم الأطفال قواعد المرور العامة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.263564,50.2072312 \n" );
            }
            else if(data.equals("واحة الخبر")){
                sendMessage.setText("\n\n واحة الخبر: يعد واحد من أجمل المشاريع التي تتزين بها مدينة الخبر، ويتميز بتصميمه الرائع وأنه يضم عدد كبير من المطاعم والكافيات والمحلات التجارية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.2817847,50.201791 \n" );
            }
            else if(data.equals("حديقة الأمير سعود بن نايف")){
                sendMessage.setText("\n\n حديقة الأمير سعود بن نايف: هي أحد أجمل وأفضل المنتزهات بالخبر في المنطقة الشرقية، وقد حصلت على لقب أول حديقة ذكية في السعودية ودول الخليج وتسمي أيضا حديقة التركي\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.3087075,50.1750489 \n" );
            }
            else if(data.equals("بحيرة مدن الصناعية")){
                sendMessage.setText("\n\n بحيرة مدن الصناعية: تُعد أكبر بحيرة صناعية في المملكة وهي عبارة عن مياه متجددة تعالج بطريقة بيئية،  و تعتبر وجهةً سياحيةً ومتنفساً للعاملين بالمدينة الصناعية الثانية بالدمام بصفة خاصة وسكان المنطقة الشرقية وزوارها.\n.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.2262584,49.9745076 \n" );
            }
            else if(data.equals("شاطئ نصف القمر")){
                sendMessage.setText("\n\n شاطئ نصف القمر: يُعد الشاطئ من أبرز المعالم السياحية في المنطقة الشرقية بالسعودية التي تعد سواحلها الأكثر طولاً في منطقة الخليج حيث يقدر طولها بحوالي ٧٠٠ كلم.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.2262584,49.9745076 \n" );
            }


            // المنتزهات والترفيه - الخبر
            else if(data.equals("فيلاجيو")){
                sendMessage.setText("\n\n فيلاجيو: الملتقى المتميز لأرقى المطاعم و الكوفيهات.\n\n" + "\n https://g.page/VillaggioSA?share \n" );
            }
            else if(data.equals("سولت البحر")){
                sendMessage.setText("\n\n  سولت البحر: أثناء فعاليات موسم الشرقية في منتصف مارس من العام ٢٠١٩م تم إنشاء “سولت البحر” Salt Al Bahar هو مطعم وكوفي بالبحر على الهواء الطلق، مع جلسات جميلة على الشاطي، على طريق الكورنيش، والدخول مجاني.\n\n" + "\n https://goo.gl/maps/B95zbLDTZ3FZ4oia8 \n" );
            }
            else if(data.equals("جزيرة الدغيثر")){
                sendMessage.setText("\n\n  جزيرة الدغيثر: تعتبر واحدة من أجمل الاماكن السياحية في الخبر على الإطلاق ومن المعالم السياحية الرائعة في المملكة العربية السعودية، وهي جزيرة صناعية تبلغ مساحتها ٢٠٠٠ متر مربع.\n\n\n" + "\n https://goo.gl/maps/qnxpynq4EV2uAsch7 \n" );
            }
            else if(data.equals("سيتي بايك (تأجير سياكل)")){
                sendMessage.setText("\n\n سيتي بايك:  تأجير وبيع الدرجاتا الهوائية. \n https://www.instagram.com/citybikeksa/ \n\n" + "\n https://g.page/city-bike-khobar?share \n" );
            }
            else if(data.equals("مطعم باركرز على البحر")){
                sendMessage.setText("\n\n مطعم باركرز: مطعم المفتاح، تبحث عن المفتاح لتدخل المطعم، فرع كورنيش الخبر من غير مفتاح، لكن يحتاج حجز.\n\n" + "\n https://goo.gl/maps/a4Xke1cFdwRaPvPU9 \n" );
            }
            else if(data.equals("مركز الملك عبدالعزيز الثقافي")){
                sendMessage.setText("\n\n مركز الملك عبدالعزيز الثقافي: يضم إثراء متحفًا ومسرحًا ومكتبةً وسينما ومجموعةً من المعارض ومختبرًا للأفكار والمعرفة، بقاعات ذات تصاميمٍ معماريَّة مذهلة.\n\n" + "\n https://goo.gl/maps/zZbWUwCY5rQpLd2c9 \n" );
            }
            else if(data.equals("أجدان ووك")){
                sendMessage.setText("\n\n أجدان ووك: يعتبر أحد المعالم البارزة في الخبر، أبرز مشاريعها قرية المطاعم وصالات السينما العالمية.\n\n" + "\n https://g.page/Ajdan-Walk-Khobar?share \n" );
            }
            else if(data.equals("بافيليون")){
                sendMessage.setText("\n\n بافيليون: يعتبر بافيليون مستقبل واعد لروّاد الأعمال حيث يُتيح فرص استثماريه في (المطاعم – الكفيهات – المعاهد الصحية – الزهور – السبا – السوبر ماركت العضوي )وغيرها من الخدمات المقدمة ذات الجودة الرفيعة التي تستهوي الشريحة العظمى من المجتمع.\n\n" + "\n https://goo.gl/maps/msP69Gj9kTD2Ht8F6 \n" );
            }
            else if(data.equals("أوان غاليري")){
                sendMessage.setText("\n\n أوان غاليري: يقع المشروع في قلب مدينة الخبر، ويربط بين مدينتي الخبر والظهران، مما يجعله وجهة هامة في الحاضر والمستقبل، يتكوّن أكثر من معرض تجاري وأكثر من مكتب إداري ومساحات مفتوحة تتناسب مع جميع الأنشطة مما يجعله وجهة تجارية واستثمارية مميزة.\n\n\n" + "\n https://goo.gl/maps/W8jvLd3qj6grNhj27 \n" );
            }

            else if(data.equals("كورنيش بارك")){
                sendMessage.setText("\n\n كورنيش بارك: مجمع تجاري فريد يجمع أرقى الأسماء العالمية \n https://www.instagram.com/corniche.park/?igshid=ev5t4kwf8bnq \n\n" + "\n https://goo.gl/maps/U3MPKjsG8MdqVJ3C7 \n" );
            }
            else if(data.equals("مجمع باتيو")){
                sendMessage.setText("\n\n مجمع باتيو: مجمع مطاعم ومقاهي، يتكون من بحيرة وممشى وجسر خشبي.\n\n" + "\n https://goo.gl/maps/wcCHbDfZGg7w9aKo9 \n" );
            }
            else if(data.equals("الشيخ افنيو")){
                sendMessage.setText("\n\n الشيخ أفنيو: عبارة عن مجمعين، أحدهما للمطاعم والمقاهي ،المحلات، والآخر للماركات العالمية.\n\n" + "\n https://goo.gl/maps/vdL7KBdFzVHXS9Eh7 \n" );
            }
            else if(data.equals("مطاعم جزيرة الكريستال")){
                sendMessage.setText("\n\n مطاعم جزيرة الكريستال: مطعم الفيروز جاردن هو الخيار الأمثل للتمتع بتجربة النخبة حيث يخدم اكثر الأذواق كلاسيكية من المطبخ اللبنانى والسعودى فى ظل اجواء ممتعة بأسلوب راقي.\n\n" + "\n https://goo.gl/maps/DnH9hPNZVsgoynX28 \n" );
            }

            // التسوق - الخبر
            else if(data.equals("فؤاد سنتر")){
                sendMessage.setText("\n\n فؤاد سنتر: من أماكن التسوق البارزة في كورنيش الخبر ويقع في شارع الأمير تركي ، يحوي العديد من المحلات التجارية والماركات العالمية والمحلية وحوله عدة أماكن سياحية ومطاعم مشهورة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.2986823,50.2235688 \n" );
            }
            else if(data.equals("الخبر مول")){
                sendMessage.setText("\n\n الخبر مول: مجمع تجاري يضم كبرى الوكالات والماركات التجارية والمحلات والشركات، ويضم كذلك صالة العاب حديثة للأطفال مع صالة مطاعم.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.31448749999999,50.2101503 \n" );
            }
            else if(data.equals("مجمع الرواق")){
                sendMessage.setText("\n\n مجمع الرواق: مطعم ومقهى الرواق الشعبي للأكلات الشعبية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.2914927,50.2200245 \n" );
            }
            else if(data.equals("مجمع التركي")){
                sendMessage.setText("\n\n مجمع التركي: مجمع يمتاز بموقع خيالي ، وممتاز بالكافيات التي تتناسب مختلف أذواق الزوار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.2866667,50.2180556 \n" );
            }

            else if(data.equals("فينيسيا مول")){
                sendMessage.setText("\n\n فينيسيا مول: مجمع ممتاز للتسوق النسائي على وجه الخصوص لفساتين السهرات والحفلات والأقمشة النسائية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.286565,50.183945 \n" );
            }
            else if(data.equals("مجمع أمواج")){
                sendMessage.setText("\n\n مجمع أمواج: يتميز بموقعه حيث يسهل الوصول اليه، ووقوعه بالقرب من الكثافة السكانية العالية ليقدم لهم كل ما يحتاجونه من خيارات عديدة للتسوق من خدمات تجارية وترفيه للعائلة والاطفال من خلال اجواء راقية وتصميم مميز ، يليق بمستواه من حيث المكان حيث تم اختيار المشروع بدقة متناهية ليوفر جميع وسائل الراحة العصرية لزوار المركز.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.30980640000001,50.1715013 \n" );
            }
            else if(data.equals("الراشد مول")){
                sendMessage.setText("\n\n الراشد مول: يضم مجموعة متنوعة من المحلات التجارية، التي تزيد عن ٦٠٠ مح ًلا تجار ًيا ، يُلبي احتياجات جميع أفراد الأسرة والمنزل، لذلك يحظى بشعبية وإقبال كبير في الخبر، فهو وجهة ترفيهية مناسبة لمختلف الأعمار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.2908311,50.1805653 \n" );
            }
            else if(data.equals("مجمع الظهران")){
                sendMessage.setText("\n\n مجمع الظهران: يعد من أهم وأفضل الأماكن السياحية بالخبر، وهو يضم الكثير من المحلات التجارية الضخمة التي تعرض أفضل وأحسن الماركات العالمية، كما يتميز إلى جانب تصميمه على أحدث فنون العمارة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.3062977,50.1710283 \n" );
            }

            // الأنشطة - الخبر
            else if(data.equals("رحلات سفاري")){
                sendMessage.setText("\n\n رحلات سفاري: تعد تجربة السفاري الصحراوية في الكثبان الرملية من التجارب الشيقة الكثبان الرملية من التجارب المهمة التي يجب ألا تفوتها عند زيارة المنطقة الشرقية. اقض ليلة في الصحراء واستمتع بالنار الدافئة والنجوم الساطعة في السماء. هذه رحلة للاستمتاع بها مع عائلتك وأصدقائك.\n\n"
                        + "\nللتواصل:\n +966546351618 \n +966547112308\n"
                        + "info@saudi-tours.com \n\n Instagram: https://instagram.com/ghymaksa?utm_medium=copy_link \n\n");
                //+ "تصفح عبر: https://www.saudi-tours.com/ar/trip_details/12\n");
            }

            // الطبيعة والبيئة - الخبر

            else if(data.equals("مؤسسة البارشوت البحري")){
                sendMessage.setText("\n\n مؤسسة البارشوت البحري: تأجير قوارب نزهة ودبابات بحرية.\n\n" + "\n https://goo.gl/maps/Nhmu5ECvyJSzi9XP9 \n" );
            }

            // التراث والثقافة - الخبر
            else if(data.equals("متحف الشاي")){
                sendMessage.setText("\n\n متحف الشاي: متحف مميز بمدينة الخبر للشاي وتاريخه وادواته المستعملة من عدة مدن مختلفة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.324133,50.22605799999999 \n" );
            }
            else if(data.equals("معرض سايتك")){
                sendMessage.setText("\n\n معرض سايتك: مركز علمي على غرار أحدث المراكز العلمية في العالم ليخدم فئة الطلبة والباحثين في مجالات العلوم والتقنية وجميع فئات المجتمع.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.319249,50.2279355 \n" );
            }

            else if(data.equals("مطعم ومتحف قرية الروازن التراثية")){
                sendMessage.setText("\n\n مطعم ومتحف قرية الروازن التراثية: أكبر وأضخم قرية تراثية في منطقة الخليج عبارة عن مطعم ومتحف مصغر ومحلات تجارية لها صلة بالتراث.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.3175939,50.2040538 \n" );
            }
            else if(data.equals("متحف معالم الخليج البحري")){
                sendMessage.setText("\n\n متحف معالم الخليج البحري: أول متحف لمعالم الخليج تحت مياه شاطئ نصف القمر، والذي يضم قرية صديقة للبيئة وقطعاً جاذبة للأسماك، بهدف إحياء البيئة البحرية المحتضرة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.5853754,50.0303972 \n" );
            }

            else if(data.equals("متحف الطيبين")){
                sendMessage.setText("\n\n متحف الطيبين: يتسم بأنه جزء من ذاكرة تمتد من أوائل ستينيات القرن الميلادي المنصرم إلى نهايات التسعينيات، على شكل مقتنيات كانت بين أيادي الناس أو في لباسهم، كأنواع من الحلوى أو العصائر أو الأدوات المدرسية.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.1670388,50.1453972 \n" );
            }
            else if(data.equals("معرض الظهران اكسبو")){
                sendMessage.setText("\n\n معرض الظهران اكسبو: يقدم خدمات متكاملة في مجال المعارض والفعاليات، يمتلك مركزا لاستضافة المعارض والفعاليات ولديها قسم خاص للتنظيم وقسم لإدارة الفعاليات.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.28558379999999,50.1903376 \n" );
            }

            // الأماكن السياحية - الدمام
            else if(data.equals("مطاعم ومقاهي الرواق الشعبي")){
                sendMessage.setText("\n\n مطاعم ومقاهي الرواق الشعبي: مطعم شعبي بأيدي طباخين يمانية، يقدم الفطور والغداء والعشاء، ويتوفر به قسم للعوائل.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.4140357,50.0687078 \n" );
            }
            else if(data.equals("منتزه اللايف بارك")){
                sendMessage.setText("\n\n منتزه اللايف بارك: من أكبر المشاريع الترفيهية وأكثرها جاذبية في المنطقة الشرقية ، يحتوي المنتزه على أكثر من مائة نوع من الأشجار والشجيرات والنباتات ، توفر مدينة الملاهي الموجودة داخل المنتزه ٢٥ لعبة ، مما يجعلها المكان الأمثل لعشاق المغامرات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.3924832,50.1273835 \n" );
            }
            else if(data.equals("الحكير تايم الدمام")){
                sendMessage.setText("\n\n الحكير تايم: عبارة عن مدينة ملاهي مغلقة متكاملة، كفيلة بإشعال روح الحماس والتحدي في نفوس جميع\n" +
                        "زوارها كباراً وصغاراً.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.45269,50.1283303 \n" );
            }

            else if(data.equals("جزيرة المرجان")){
                sendMessage.setText("\n\n جزيرة المرجان: من أهم مناطق السياحة في مدينة الدمام،تبعد عن كورنيش الدمام بحوالي ١٨٠٠ متر، وهي ُمتصلة به من خلال جسر، تتزين الجزيرة بفناره عالية تُزين بدورها الكورنيش وتُضيئه مثل اللؤلؤة المنيرة وهو ما يجذب الز ّوار لزيارتها والاستمتاع بإطلالتها البديعة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.4838494,50.1050625 \n" );
            }

            // التراث والثقافة - الدمام
            else if(data.equals("متحف الفلوة والجوهرة")){
                sendMessage.setText("\n\n متحف الفلوة والجوهرة: يعد أحد أشهر و أهم المتاحف في المنطقة الشرقية لما يحتويه من قطع اثرية تصل إلى ٥٠٠الف قطعة أثرية وتراثية من أنفس وأجمل وأندر القطع على مستوى العالم ، و تبلغ مساحة المتحف حوالي ٥٠٠٠ متر ، و يتكون من طابقين ، و يتكون من ١٠ أقسام منها : قسم للسيارات الكلاسيكية وسيارات بعض الملوك ورؤساء الدول ، قسم للتراث الإسلامي وغيرها.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.3997702,50.11134449999999 \n" );
            }
            else if(data.equals("مطعم ومتحف القرية الشعبية")){
                sendMessage.setText("\n\n مطعم ومتحف القرية الشعبية: تتميز القرية الشعبية بالأكل اللذيذ و طريقة التقديم المتميزة و المكان الشعبي بطريقة حديثة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.4919881,50.1205838 \n" );
            }

            // التسوق - الدمام
            else if(data.equals("دارين مول")){
                sendMessage.setText("\n\n دارين مول: يعد من أبرز المجمعات التجارية بمنطقة الدمام ويمتاز بموقعه الاستراتيجي ، يعد هذا المجمع خياراً رائعاً للتسوق حيث يجتمع التسوق والترفيه تحت سقف واحد.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.4613006,50.0649391 \n" );
            }
            else if(data.equals("سوق الدمام الشعبي")){
                sendMessage.setText("\n\n سوق الدمام الشعبي:  أو ما يعرف باسم سوق النساء الشعبي بالدمام ، هو أحد أفضل الاسواق الشعبية في مدينة الدمام ، والذي يوحي لك بما كانت عليه الحياة في المنطقة الشرقية بالسعودية قديماً، ويرتاده الآلاف من الزوار يومياً.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.4373904,50.09477349999999 \n" );
            }
            else if(data.equals("العثيم مول الدمام")){
                sendMessage.setText("\n\n العثيم مول: من أجمل المجمعات التجارية الشاملة، يحتوي على عدد كبير من المتاجر، للأزياء، والأحذية، والعطور، وغيرها، يشغل مساحة كبيرة داخل المول ليلبي جميع احتياجات الأسرة والمنزل ، يتكون المبنى من دور أرضي وثلاثة طوابق، ويأتي بتصميم جميل على شكل سفينة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.4004579,50.1172408 \n" );
            }
            else if(data.equals("مارينا مول الدمام")){
                sendMessage.setText("\n\n مارينا مول: يقع على طريق الخليج المطل على كورنيش البحر الأحمر وتم بنائه على الطراز المعماري الحديث ، ويتكون من طابقين ويحتوي على أكثر من ١٢٠ مح ًلا تجار ًيا في جميع المجالات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.455208,50.10572199999999 \n" );
            }
            else if(data.equals("الشاطئ مول")){
                sendMessage.setText("\n\n الشاطئ مول: يتميز بتصميمه الرائع و موقعه الممتاز و يوجد به أشهر المحلات التي تهتم بالموضة و الأزياء ، ويوجد به منطقة ترفيهيه للأطفال و صالة تزلج على الجليد ومجموعة من المطاعم عالمية و كافيات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.45484699999999,50.120971 \n" );
            }
            else if(data.equals("حياة بلازا")){
                sendMessage.setText("\n\n حياة بلازا: هو أحد أشهر و أكبر المولات في الدمام بالمنطقة الشرقية ، يتميز المول بتصميمه الرائع و مساحته الكبيرة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.4424384,50.06710589999999 \n" );
            }

            // الأماكن السياحية - الأحساء
            else if(data.equals("منتزه الملك عبدالله البيئي")){
                sendMessage.setText("\n\n منتزه الملك عبدالله البيئي: يضمُّ منتزه الملك عبد الله البيئي العديد من المرافق منها نافورة تفاعلية تعد الأكبر على مستوى العالم ووسائل ترفيه من ملاعب الأطفال وجزيرة مائية وسط البحيرة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.3201189,49.5566434 \n" );
            }
            else if(data.equals("القرية الشعبية")){
                sendMessage.setText("\n\n القرية الشعبية: يقع المُجمّع بحي المبرّز ويتخذ هيئة معمارية بسيطة وتقليدية مُستمد من تراث المدينة العريق ويضم نحو 1000 متجر لبيع السلع المُختلفة عالية الجودة مُتنوعة الماركات بما يُرضي مُختلف الميزانيات والأذواق، إلى جانب ساحات لتناول الطعام والشراب بل وأماكن للإقامة أيضاً.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.3883346,49.5477305 \n" );
            }
            else if(data.equals("مركز الإبداع الحرفي")){
                sendMessage.setText("\n\n مركز الإبداع الحرفي: مركز الإبداع الحرفي بالأحساء التابع للبرنامج الوطني للحرف والصناعات اليدوية (بارع) إحدى مبادرات الهيئة العامة للسياحة والتراث الوطني لبرنامج التحول الوطني 2020.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.3882848,49.5567643 \n" );
            }
            else if(data.equals("سوق القيصرية التاريخي")){
                sendMessage.setText("\n\n سوق القيصرية التاريخي: معروضات السوق: الملابس العربية التقليدية ومنها البشوت المطرزة بخيوط الذهب وأنواع العبايات واغطية الرأس، المشغولات التقليدية والمقتنيات التراثية، المنتجات العطرية والنباتات الطبية، أنواع الحبوب والقهوة وجميع المواد الغذائية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.3759045,49.5890805 \n" );
            }
            else if(data.equals("عين الحارة")){
                sendMessage.setText("\n\n عين الحارة: عين الحارة هي أحد عيون محافظة الأحساء السعودية، تقع في مدينة المبرز وهي نبع متوسط الحجم، سميت بذلك لسخونة الماء الذي يخرج منها. والعين قريبة من مقبرة المبرز. يذكر ان ماءها يقدر بعشرين ألف جالون في الدقيقة، ويصل ماؤها إلى سطح الأرض عبر 3 فوهات مكونا بحيرة كبيرة، أقامت عليها هيئة الري والصرف مضخات كبيرة بعد أن قل ماؤها.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.4219974,49.5870927 \n" );
            }
            else if(data.equals("عين أم سبعة")){
                sendMessage.setText("\n\n عين أم سبعة: هي نبع مائي تعد من الأماكن التي يقصدها سُياح السياحة العلاجية والسياحة الاستجمامية.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.4676787,49.5816784 \n" );
            }
            else if(data.equals("سوق المزارعين")){
                sendMessage.setText("\n\n سوق المزارعين: سوق لجميع منتجات مزارع واحة الاحساء من الثمار الموسمية مثل الرطب والتين والعنب والبطيخ وغيرها، بأسعار رخيصة جدا مقارنة بأسعار الأسواق الأخرى.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.4762184,49.58224399999999 \n" );
            }
            else if(data.equals("مزرعة أبو جواد السياحية")){
                sendMessage.setText("\n\n مزرعة أبو جواد السياحية: مزرعة يميزها الورد الحساوي، يوجد بها العديد من الثمار مثل: (الليمون الحساوي) وغير ه من الثمار التي تتميز بها محافظة الأحساء. \n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.4659642,49.6042241 \n" );
            }
            else if(data.equals("عين الجوهرية")){
                sendMessage.setText("\n\n عين الجوهرية: تحظى مياه العين بشهرة عالميّة، وتتخد شكل الحوض البيضاوي الكبير وتعتبر من أبرد المياه صيفًا، وتعتبر العين مصدرًا لسقاية عدة بساتين في المنطقة، مثل بستان الشعبة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.4306574,49.6233939 \n" );
            }
            else if(data.equals("جبل القارة وواحة الأحساء")){
                sendMessage.setText("\n\n جبل القارة وواحة الأحساء: يُعد الجبل من أبرز المعالم السياحية الطبيعية في الأحساء ويحتوي على كهوفٍ أو ما يسمى بالمغاراتِ بين أهالي الأحساء. تتميز بعض مغاراته مثل مغارة النشاب بأن لها درجة حرارة معتدلة شبه ثابتة طوال العام.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.4118481,49.69269459999999 \n" );
            }
            else if(data.equals("منتزه جواثا السياحي")){
                sendMessage.setText("\n\n منتزه جواثا السياحي: هي مدينة ترفيهيه بالقرب من مسجد جواثا التاريخي والذي صليت فيه ثاني جمعة بالإسلام وتحتوي المدينة على العديد من الانشطة الترفيهيه للصغار والكبار مثل مدينة الألعاب نادي الطيران الشراعي ونادي الكارتنيج ونادي البينتبول وبحرة وقوارب، وتحتوي مدينة جواثا السياحية علي سوق (هجر التراثي)، ومساحات لاقامة الفعاليات الحية والتراثية والثقافية بالإضافة لمساحات للتخييم الشتوي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.4118481,49.69269459999999 \n" );
            }
            else if(data.equals("مدينة الملك عبدالله للتمور")){
                sendMessage.setText("\n\n مدينة الملك عبدالله للتمور: تعد مدينة الملك عبدالله للتمور من أهم العوامل الاقتصادية زراعياً بالمحافظة، وتحتوي على عدد من المراكز الخدمية الخاصة بالتمور والعناية بها.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.3767948,49.777894 \n" );
            }
            else if(data.equals("بحيرة الأصفر")){
                sendMessage.setText("\n\n بحيرة الأصفر: تعتبر أكبر تجمع مائي في منطقة الخليج، وهي الوحيدة في المملكة من نوعها والتي تعيش فيها حياة فطرية متكاملة\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.5665192,49.8332965 \n" );
            }
            else if(data.equals("معمل الفخار")){
                sendMessage.setText("\n\n معمل الفخار: تقدم الدوغة بطابعها التراثي والشعبي، العديد من المنتجات الفخارية والهدايا التذكارية التي تصنع من الفخار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.3353699,39.23686420000001 \n" );
            }
            // التراث والثقافة - الأحساء
            else if(data.equals("قصر خزام الأثري")){
                sendMessage.setText("\n\n قصر خزام الأثري: يحتوي القصر على قاعات تقدم في محتوياتها العصور التاريخية متناسقة من تاريخ العصور القديمة مروراً بالعصور الإسلامية وحتى الوصول إلى العصر الحديث، وتحتوي هذه القاعات على آيات قرآنية ولوحات عديدة موجودة في مختلف أنحائه، وصوراً للمسجد الحرام والمسجد النبوي بعد الانتشار في عهد الملك فهد بن عبد العزيز.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.3680422,49.5768616 \n" );
            }
            else if(data.equals("جامع الجبري التراثي")){
                sendMessage.setText("\n\n جامع الجبري التراثي: هو مسجد ومنطقة أثرية تاريخية، يقع في حي الكوت في مدينة الهفوف في محافظة الأحساء شرق المملكة العربية السعودية، تعود فترة بناء المسجد إلى القرن التاسع الهجري وبالضبط سنة ٨٨٠ هـ، حيث بناه سيف بن زامل بن حسين الجبري أمير الإمارة الجبري في الأحساء آنذاك.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.3786336,49.5836291 \n" );
            }
            else if(data.equals("حي الكوت التراثي")){
                sendMessage.setText("\n\n حي الكوت التراثي: يعتبَرُ حي الكوت مِنْ أقْدم أحياء مَدِينة الهُفوف بمُحافظَة الأَحْساء في المنطقة الشرقية بِالمَملكة العربيَّة السعوديَّة، يَتميزُ الحي ببَقاء أغلب مَبانِيه عَلى الطراز القديم والذي يَتكوَّن أساسًا من الطين والسعف ويَعودُ تاريخهُ إلى عَهد الإمْبرَاطُوريَّة العُثْمانيَّة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.3779653,49.58535729999999 \n" );
            }
            else if(data.equals("المدرسة الأميرية")){
                sendMessage.setText("\n\n المدرسة الأميرية: المدرسة الأميرية أو مدرسة الهفوف الأولى أو بيت الثقافة، هي أقدم مدرسة حكومية في السعودية وقد ارتبطت بتاريخ الملك عبد العزيز آل سعود وإنجازاته، فأسس المدرسة لتكون نقطة انطلاق التعليم في المنطقة الشرقية.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.374103,49.58746259999999 \n" );
            }
            else if(data.equals("قصر إبراهيم الأثري")){
                sendMessage.setText("\n\n قصر إبراهيم الأثري: عبارة عن قلعة ضخمة بناها العثمانيون لحماية وتحصين المدينة ضد الهجمات أثناء سيطرتهم على عدد من الأراضي السعودية، ويضم المكان قصرًا ومسجدًا ذات طراز ديني يتميّز بالأقواس والقباب مُسوّر بأبراج ضخمة تعكس الطراز العسكري في البناء.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.3788664,49.5868937 \n" );
            }
            else if(data.equals("قصر صاهود الأثري")){
                sendMessage.setText("\n\n قصر صاهود الأثري: قلعة تقع خارج الأسوار الغربية لمدينة المبرز، ويواجه مدخله ضاحية الحزم، وقد اُعيد بناؤه بشكل جيد ويستخدم كثكنات للجيش العربي السعودي، تميز بوجود ٦ أبراج حصن ومراقبة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.4142036,49.5833655 \n" );
            }
            else if(data.equals("قصر محيرس الأثري")){
                sendMessage.setText("\n\n قصر محيرس الأثري: قلعة حربية صغيرة مكونة من أبراج دائريّة بها عدد من الغرف، خُزنت بها الأسلحة والمؤن والذخائر.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.4482602,49.5825542 \n" );
            }
            else if(data.equals("متحف القهوة")){
                sendMessage.setText("\n\n متحف القهوة: متحف نوعي جميل يضم مقهى ومتجراً وأكاديمية القهوة، كما أنه يُدون تاريخ القهوة في المملكة العربية السعودية ويعرض أدواتها والطرق المستخدمة لزرعها وطحنها وتحميصها.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.495657,49.578743 \n" );
            }
            else if(data.equals("متحف دار التراث")){
                sendMessage.setText("\n\n متحف دار التراث: يحتوي المتحف على ١٨ ركنًا تمثل الحِرف، وأنواع المقتنيات.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.3972791,49.6811576 \n" );
            }
            else if(data.equals("مسجد جواثا التاريخي")){
                sendMessage.setText("\n\n  مسجد جواثا التاريخي: بني هذا المسجد في عهد النبي محمد عليه السلام، وتشرف ببنائه سكان بلاد إقليم البحرين بنو عبد قيس وهم الذين بادروا بإسلامهم طوعاً لا كرهاً وقد مدح النبي أهل هذه الديار بقوله (أكرموا أخوانكم فإنهم أشبه الناس بكم أسلموا طوعاً لا كرهاً)، ولا تزال قواعد هذا المسجد قائمة إلى وقتنا الحالي.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.4698414,49.6785138 \n" );
            }
            else if(data.equals("ميناء العقير الأثري")){
                sendMessage.setText("\n\n  ميناء العقير الأثري: هو ميناء بحري أثري، حيث اتُخِذَ الميناءُ بوابةً بحريةً لمنطقة نجد.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.6434173,50.2155662 \n" );
            }

            // التسوق - الأحساء
            else if(data.equals("الأحساء مول")){
                sendMessage.setText("\n\n  الأحساء مول: يعد من أكبر المجمّعات ذو الطابق الواحد، يتميز بأجوائه العائلية، ويحتوي على العديد من المحلات والمطاعم وصالة ترفيهية تحت سقف واحد.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.3288966,49.5496024 \n" );
            }
            else if(data.equals("أسواق القرية الشعبية")){
                sendMessage.setText("\n\n أسواق القرية الشعبية: أٔكبر سوق تجاري والذي يحاكي التراث السعودي القديم لمحافظة الأحساء، يحتوي على ١٥٠٠وحدة تجارية متعددة الأنشطة. \n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.3885291,49.5475275 \n" );
            }
            else if(data.equals("الراشد تاون سكوير")){
                sendMessage.setText("\n\n الراشد تاون سكوير: هو مجمع سكني تجاري ترفيهي ويضم مطاعم واستراحات موزعة على عشرة طوابق، بالإضافة الى صالة متعددة الأغراض بمساحة ألفي متر مربع، وناديين صحيين ومسابح.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.4055039,49.56767319999999 \n" );
            }
            else if(data.equals("العثيم مول الأحساء")){
                sendMessage.setText("\n\n العثيم مول: مركز تجاري، يحتوي على أكثر من ٣٣٠ متجرا بمساحات مختلفة تحتوي على العديد من الماركات التجارية سواء العالمية أو المحلية وذات نشاطات مختلفة منها الملابس والعطور والمجوهرات، بالإضافة إلى سلسلة من المطاعم المميزة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.400436,49.577898 \n" );
            }
            else if(data.equals("فوراس مول")){
                sendMessage.setText("\n\n فوراس مول: مركز تجاري، يضم سلسلة من المتاجر والمطاعم المحلية والعالمية، كما يوجد به ملاهي مناسبة لكل الفئات العمرية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.37346990000001,49.5903271 \n" );
            }

            // الأماكن السياحية - الحبيل
            else if(data.equals("سباركيز الفناتير")){
                sendMessage.setText("\n\n سباركيز الفناتير: ملاهي سباركيز هي ملاهي تقع في منطقة الجبيل الصناعية، وتوفر اروع وأجمل مدينة ملاهي متنوعة للأطفال، وتوفر الكثير من المطاعم والكافيهات فيما حولها ومناسبة للعوائل، تعتبر ملاهي سباركيز أقوى مدينة ألعاب ملاهي في الجبيل.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.0039088,49.65852599999999 \n" );
            }
            else if(data.equals("منتزه القناة المائية")){
                sendMessage.setText("\n\n منتزه القناة المائية: تم بناء منتزه القناة المائية الذي يتميز بكافة التجهيزات والتصميمات الحديثة، ويحتوي المنتزه على الكثير من الأشجار ويعتبر مقصد رئيسي للطيور المُهاجرة في فصل الشتاء وفصل الربيع.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.1143241,49.56173709999999 \n" );
            }
            else if(data.equals("شاطئ النخيل")){
                sendMessage.setText("\n\n شاطئ النخيل: من أجمل الشواطئ الموجودة في مدينة الجبيل، ويعتبر من المزارات السياحية التي يلجأ إليها السياح المحليين والسياح الخارجيين لما به من خدمات رائعة ومرافق متميزة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.1176508,49.57224419999999 \n" );
            }
            else if(data.equals("الواجهة البحرية والكورنيش")){
                sendMessage.setText("\n\n الواجهة البحرية والكورنيش: يمتد كورنيش الجبيل على ساحل البحر حيث يتميز بوجود بعض أشجار النجيل التي تعطيه مظهرًا سياحيًا فريدًا، كما يحتوي على مجموعة من الشاليهات الفاخرة، وتنتشر المرافق على الكورنيش التي تقدم خدمات متميزة للسياح وللمقيمين بالمدينة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.1311761,49.56949530000001 \n" );
            }
            else if(data.equals("شاطئ الفناتير")){
                sendMessage.setText("\n\n شاطئ الفناتير: يعتبر شاطئ الفناتير من الشواطئ الحديثة في مدينة الجبيل، يوجد به أفضل أنواع السياحة في مدينة الجبيل سياحة الألعاب الترفيهية التي تنتشر على الشاطئ، حيث يوجد به الكثير من الخدمات الحيوية ويضم مجموعة متنوعة من الأنشطة السياحية، وهو من أهم الشواطئ الجاذبة للسكان.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.1348015,49.569079 \n" );
            }
            else if(data.equals("مرسى الفناتير للرحلات البحرية")){
                sendMessage.setText("\n\n مرسى الفناتير للرحلات البحرية: رحلات غوص في مدينة الجبيل الصناعية، للتواصل أبو عبدالله: \n" +
                        "0546699664\n" +
                        "\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.1348015,49.569079 \n" );
            }
            else if(data.equals("ساس الجبيل")){
                sendMessage.setText("\n\n ساس الجبيل: يعتبر فندق ساس الجبيل من افضل فنادق الجبيل 4 نجوم، ويتميز الفندق بإطلالته الفريدة على شاطئ البحر، وبالقرب منه تتوفر العديد من معالم السياحة في الجبيل.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.14757,49.566281 \n" );
            }
            else if(data.equals("النادي البحري بدارين")){
                sendMessage.setText("\n\n النادي البحري بدارين: يوفر النادي دورات من شتى المجالات والنشاطات الرياضية، للتسجيل: https://scc-j.com/courses\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.160503,49.576066 \n" );
            }
            else if(data.equals("شاطئ دارين")){
                sendMessage.setText("\n\n شاطئ دارين: يُعتبر من أجمل شواطئ الجبيل الصناعية، هو عبارة عن شبه جزيرة رائعة، ذات مساحة كبيرة جدًا، مما يُتيح لك الاستمتاع بقضاء عطلة ترفيهية مثالية مع أفراد أسرتك، يضم شاطئ دارين العديد من الملاعب الرياضية المسلية، مثل: ملاعب كرة القدم المُفضلة وغيرها من الأنشطة الترفيهية.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.1734191,49.5697908 \n" );
            }

            // التسوق - الجبيل
            else if(data.equals("الجبيل بلازا")){
                sendMessage.setText("\n\n الجبيل بلازا: من أشهر سوق مفتوح في المدينة ومكان يتردد إليه عشرات الآلاف من السياح كل عام، وذلك لروعة البضائع المقدمة فيه، ولأنه يقدم للسياح فرصة التعرف على العديد من السعوديين وثقافتهم وتقاليدهم وأفضل بضائعهم.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.0124507,49.6421706 \n" );
            }
            else if(data.equals("الدفي مول")){
                sendMessage.setText("\n\n الدفي مول: هو مركز تجاري جديد في منطقه الجبيل في حي الدفي وهو الاسم المقرر اطلاقه على هذا المشروع، تصميم المشروع عباره عن مزج بين العمارة المعاصرة والعمارة التقليدية في المملكة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.1282227,49.5330908 \n" );
            }
            else if(data.equals("الجبيل مول")){
                sendMessage.setText("\n\n الجبيل مول: من أشهر مركز تسوق في المدينة، وذلك لأن مساحته واسعة، ولأنه يوفر متاجر العلامات تجارية عالمية ومحلية، ويوجد في المركز أيضاً العديد من المرافق من ضمنها سينما وعدة مطاعم ومركز للألعاب وغيرها.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.0039372,49.6592026 \n" );
            }
            else if(data.equals("الحويلات سنتر")){
                sendMessage.setText("\n\n الحويلات سنتر: من أعرق المولات في مدينة الجبيل الصناعية يضم أشهر المحلات التجارية والماركات العالمية.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.0976578,49.5720721 \n" );
            }
            else if(data.equals("الفناتير مول")){
                sendMessage.setText("\n\n الفناتير مول: هو مركز تسوق ضخم في مدينة الجبيل، ويرتاد هذا المركز المحليون والسياح على حد سواء، إذ استطاع أن يخلق لنفسه سمعة ممتازة وشهرة واسعة بسبب وجود الكثير من المتاجر الرائعة والمتنوعة فيه، فتجد متاجر الأزياء والإلكترونيات والمجوهرات والإكسسوارات وغيرها الكثير، ويوجد في هذا المركز أيضا العديد من المرافق من ضمنها مطاعم رائعة وبعض مساحات الألعاب للأطفال.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.13551129999999,49.5670778 \n" );
            }
            else if(data.equals("غاليريا مول")){
                sendMessage.setText("\n\n غاليريا مول: يعد أحد من مولات الجبيل المميزة وإحدى اهم وجهات السياحة فيها، حيث يضم المول إلى جانب المحلات التجارية عدد من المرافق الترفيهية الأخرى المطاعم، المقاهي ومنطقة ألعاب الأطفال، يقع مجمع غاليريا الجبيل في طريق الخميس بالقرب من شاطئ الفناتير ومول الفناتير، ولذلك فإن موقعه يعتبر مميز بالقرب من معالم المدينة الهامة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.1370908,49.5684232 \n" );
            }

            // التسوق - حفر الباطن
            else if(data.equals("المكان مول حفر الباطن")){
                sendMessage.setText("\n\n المكان مول: هو واحد من اهم المولات التي توجد في مدينة حفر الباطن، فالمركز التجاري يحتوي على أعلى معايير الجودة والسلامة، تم افتتاح المول للمرة الاولى للجمهور في عام ٢٠١٣م، وتقدر مساحته حوالي ١٣٠ ألف متر مربع، ويحتوي المول على الكثير من المحالات التجارية والعلامات العالمية بشكل كبير.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.3584459,45.96247380000001 \n" );
            }
            else if(data.equals("هلا مول")){
                sendMessage.setText("\n\n هلا مول: مركز تجاري فهو نقلة نوعية في مجال التسوق والترفيه، حيث يحتضن مجموعة مميّزة من المعارض، صالات العرض، وقاعات الترفيه التي تشمل التزلج، البولينج، والبلياردو، يشمل عدد متاجر ٣٥٥ متجرًا، لتوفر احتياجات كل أفراد العائلة، ويعتبر من اشهر مولات حفر الباطن. \n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.411984,45.9973524 \n" );
            }

            // التسوق - القطيف
            else if(data.equals("جزيرة سوق السمك")){
                sendMessage.setText("\n\n جزيرة سوق السمك: سوق السمك المركزي أو جزيرة سوق السمك هي جزيرة اصطناعية، في خليج جزيرة تاروت بـمحافظة القطيف، أُنشئت الجزيرة بغرض جعلها سوق مركزي للأسماك تحتوي على ٢٦ مبسطاً و٨٦ محلاً، وتم تخصيصها بعيداً عن الأحياء السكنية وقريباً من ميناء صيد الأسماك لتسهيل عملية جلب الأسماك إليه.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.5557445,50.00778919999999 \n" );
            }
            else if(data.equals("القطيف سيتي مول")){
                sendMessage.setText("\n\n القطيف سيتي مول: مركز تسوق كبير يقع أقصى غرب جزيرة تاروت بمحافظة القطيف، تقام بالمول الكثير من الفعاليات التوعوية الطبية، والثقافية، والمعارض الفنية، ويضم المول متاجر متنوعة لأرقى الماركات العالمية، والمحلية في الأزياء والأحذية، والعطور، والمجوهرات، ومطاعم شرقية، وغربية تقدم أشهى وأطيب المأكولات.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.5570224,50.0379875 \n" );
            }

            // التراث والثقافة - القطيف
            else if(data.equals("حمام أبو لوزه الأثري")){
                sendMessage.setText("\n\n حمام أبو لوزه الأثري: هو حمَّام أثري ذ مياه كبريتية معدنية، يقع في قرية البحاري، يُستشفى بمياهها لعلاج الأمراض الجلدية وآلام المفاصل.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.5612734,49.99316139999999 \n" );
            }
            else if(data.equals("حي المسورة التراثي")){
                sendMessage.setText("\n\n حي المسورة التراثي: حي المسورة من بؤره إرهاب إلى مركز حضاري وتنموي، ويقف المشروع على مساحة تصل إلى ١٨٠ ألف متر مربع، ويضم عدداً من المعالم المعمارية التي توفر خدمات متعددة ثقافية وسياحية وتجارية لسكان محافظة القطيف وزوارها.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.5873078,49.9838055 \n" );
            }
            else if(data.equals("متحف دارين التراثي")){
                sendMessage.setText("\n\n متحف دارين التراثي: يحتوي المتحف على مجسمات السفن الخليجية التراثية وأدوات الصيد، والقطع المندثرة النادرة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.5439637,50.0764851 \n" );
            }
            else if(data.equals("قلعة تاروت الأثرية")){
                sendMessage.setText("\n\n قلعة تاروت الأثرية: قلعة ساحلية من أهم قلاع الخليج العربي، تتوسط جزيرة تاروت جزيرة المسك واللؤلؤ، أكبر جزر الساحل الشرقي للسعودية، ويؤكد المؤرخون أنها بنيت على تل يعد أحد أقدم مواقع الاستيطان البشري منذ العصر الحجري حتى اليوم، الذي تعاقبت عليه خمس حضارات.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.5692829,50.0659411 \n" );
            }

            // التسوق - الخفجي
            else if(data.equals("مجمع قرية القصيبي الخفجي")){
                sendMessage.setText("\n\n مجمع قرية القصيبي: عبارة عن مجمع مصغر للتسوق يحتوي على عدد من المطاعم والمقاهي والمحلات، كما تشمل هذه المساحة المميزة متاجر لبيع الملابس والهدايا، فضلًا عن مقاهٍ وأماكن بيع آيس كريم وصالون.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.2901462,50.21513909999999 \n" );
            }
            else if(data.equals("الخفجي مول")){
                sendMessage.setText("\n\n الخفجي مول: من أهم المولات التجارية المميزة في الخفجي، حيثُ أنه يضم العديد من السلع والمنتجات ويوجد به العديد من المحلات التجارية، يضم المول مرافق كثيرة تساعد على قضاء وقت ممتع إلى جانب التسوق.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.4275939,48.4771024 \n" );
            }
            else if(data.equals("قروف سنتر")){
                sendMessage.setText("\n\n قروف سنتر: مجمع حيث يوجد به العديد من الكافيات وبعض من المحلات التجارية.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.4437881,48.4925952 \n" );
            }

            // التراث والثقافة - صبيا
            else if(data.equals("متحف جازان للآثار والتراث")){
                sendMessage.setText("\n\n متحف جازان للآثار والتراث: هو متحف بمدينة صبيا الواقعة بمنطقة جازان، يقع بجوار موقع الأدارسة الأثري، ويشكل جزءًا من شبكة المتاحف التي أقامتها وكالة الآثار والمتاحف يوزارة المعارف.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.1633333,42.6475 \n" );
            }
            else if(data.equals("قصور الأدارسة الأثرية")){
                sendMessage.setText("\n\n قصور الأدارسة الاثرية: تعد قصور الأدارسة من بين أميز المواقع الأثرية التي تعج بها منطقة جازان، والتي وصلت حسب آخر إحصائية لموسوعة آثار المنطقة إلى أكثر من 400 موقع في عموم محافظات المنطقة، وتشكل في مجملها رمزًا لفترات زمنية أثرت في تاريخ المنطقة وسياستها وحضارتها.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.16034029999999,42.6508845 \n" );
            }

            // الأماكن السياحية - العارضة
            else if(data.equals("بحيرة سد وادي جازان")){
                sendMessage.setText("\n\n بحيرة سد وادي جازان: يقع سد وادي جازان في أقصى الجنوب الغربي من المملكة العربية السعودية في منطقة جازان بين سلسلة من الجبال المرتفعة المنتهية من الغرب بسهل ساحلي ينحدر تدريجياً نحو البحر الأحمر.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.0491533,42.95750849999999 \n" );
            }
            else if(data.equals("منتزه العيرن الحارة")){
                sendMessage.setText("\n\n منتزه العيون الحارة: يقع (منتزه العين الحارة) على بعد 48 كلم شرق محافظة الليث، ويضم بين جنباته عيناً معدنية حارة تتميز مياهها بخصائصها العلاجية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.0347389,42.98977989999999 \n" );
            }

            // الأماكن السياحية - الريث
            else if(data.equals("وادي لجب")){
                sendMessage.setText("\n\n وادي لجب: وادي لجب هو صدع وانكسار في الجزء الشرقي من جبل \"القهر زهوان\" التابع لمحافظة الريث التي تقع على بعد 150 كيلومتراً إلى الشمال الشرقي من مدينة جيزان.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.6048019,42.9301407 \n" );
            }
            else if(data.equals("الجبل الأسود")){
                sendMessage.setText("\n\n الجبل الأسود: الجبل الأسود ويسمى جبل العزيين نسبة إلى قبيلة (العزيين) يقع في محافظة الريث شرق منطقة جازان الواقعة جنوب غرب السعودية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.6169984,42.82966429999999 \n" );
            }
            else if(data.equals("بحيرة وادي بيش الفطيحه")){
                sendMessage.setText("\n\nبحيرة وادي بيش الفطيحه: وادي بيش هو أحد أودية تهامة في شبه الجزيرة العربية، يقع في محافظة بيش شمال منطقة جازان جنوب غرب السعودية الوادي يقع ضمن أودية تهامة السعودية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.670521,42.66536240000001 \n" );
            }
            else if(data.equals("بحيرة سد وادي قرى")){
                sendMessage.setText("\n\n بحيرة سد وادي قرى: يقع سد وادي جازان في أقصى الجنوب الغربي من المملكة العربية السعودية جازان بين سلسلة من الجبال المرتفعة المنتهية من الغرب بسهل ساحلي ينحدر تدريجياً نحو البحر الأحمر.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.5135446,42.7305178 \n" );
            }
            else if(data.equals("بحيرة سد وادي وعال")){
                sendMessage.setText("\n\n بحيرة سد وادي وعال: يعتبر وادي وعال من الأودية الشهيرة في منطقة جازان حيث يُعد من أجمل المواقع السياحية وخاصة لقاصدي المخيمات والإقامة، حيث يجمع المناظر الخلابة والطبيعة الساحرة والصخور البديعة والمياه الجارية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.4978739,42.7485309 \n" );
            }
            // الأماكن السياحية - جيزان
            else if(data.equals("الحكير تايم جيزان")){
                sendMessage.setText("\n\n الحكير تايم: تعد أحد أكبر وأشهر الملاهي والمراكز الترفيهية في جازان.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=16.9293052,42.5494499 \n" );
            }
            else if(data.equals("الكورنيش الشمالي")){
                sendMessage.setText("\n\n الكورنيش الشمالي: تتكون عناصر هذه الواجهات من مناطق ترفيهية وممرات مشاة ومسطحات خضراء ومقاهي ومطاعم وجبات سريعة وقطار ترفيهي ومدن ألعاب ترفيهية ونوا فير وأشكال جمالية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=16.9180372,42.5478943 \n" );
            }
            else if(data.equals("مرسى الحافة السياحي")){
                sendMessage.setText("\n\nمرسى الحافة السياحي: مرسى الحافة هو البوابة الرئيسية لسياح جازان وزائريها الراغبين في الذهاب للاستمتاع بالرحلات البحرية للجزر القريبة من المدينة، وكذلك رحلات الصيد والغوص إضافة للراغبين بزيارة جزيرة فرسان.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=16.9019745,42.5411654 \n" );
            }
            else if(data.equals("مرسى الأحلام جيزان")){
                sendMessage.setText("\n\n مرسى الأحلام: منتزه مرسى الأحلام في قلب جازا يضم مطاعم وشاليهات ورحلات القوارب البحرية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=16.839497,42.58335719999999 \n" );
            }
            else if(data.equals("جزيرة أحبار السياحية")){
                sendMessage.setText("\n\n جزيرة أحبار السياحية: تعد جزيرة احبار جازان من أولى الجُزر العربية التي تم تهيئتها سياحياً لاستقبال الزوّار والسُيّاح من كل أنحاء العالم حيث تم تجهيزها بكافة المرافق من رصيف لقوارب الصيد والنُزهات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=16.8835158,42.4101934 \n" );
            }
            // التسوق- جيزان
            else if(data.equals("الراشد ميغا مول جيزان")){
                sendMessage.setText("\n\n الراشد ميغا مول: مركز تسوّق كبير يضمّ متاجر لعلامات تجارية ومركزًا ترفيهيًا فيه ألعاب كلاسيكية وألعاب ركوب للأطفال.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4875038,39.64917989999999 \n" );
            }
            else if(data.equals("كادي مول")){
                sendMessage.setText("\n\n كادي مول: يضمّ مركز التسوّق الكبير هذا متاجر تجزئة معروفة لبيع مختلف أنواع السلع، فضلاً عن مطاعم ومرافق ترفيهية للأطفال.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=16.908925,42.5465653 \n" );
            }
            else if(data.equals("سكاي مول")){
                sendMessage.setText("\n\n سكاي مول: هو عبارة عن مجمع يوجد فيه أكثر من 20 محل للمشروبات والقهوة والمطاعم.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=16.9031909,42.54828390000001 \n" );
            }
            else if(data.equals("سوق الأسر المنتجة")){
                sendMessage.setText("\n\n سوق الاسر المنتجة: هو عبارة عن سوق تبلغ مساحته الإجمالية ويشمل 50 محلًّا تجاريًّا وكل المرافق الخدمية المساندة، وروعي تصميمه طراز المنطقة العمراني، ويعدّ الأكبر من نوعه على مستوى المنطقة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=16.8993147,42.5477726 \n" );
            }
            // التراث والثقافة - جيزان
            else if(data.equals("قلعة جازان الأثرية")){
                sendMessage.setText("\n\n قلعة جازان الأثرية: تعد القلعة الدوسرية أحد أهم المعالم التاريخية والأثرية في منطقة جازان، وقد تعددت استخداماتها من استخدامات عسكرية وإستراتيجية إلى علمية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=16.8880336,42.545583 \n" );
            }
            else if(data.equals("القرية التراثية")){
                sendMessage.setText("\n\n القرية التراثية: القرية التراثية بجازان هي مزيج من تراث الماضي مع عراقة الحاضر، حيث تقف القرية بشموخ على كورنيش جازان الجنوبي لتجسد التنوع الثقافي والحضاري.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=16.8251686,42.6205426 \n" );
            }

            // الأماكن السياحية - فرسان
            else if(data.equals("غابة القندل")){
                sendMessage.setText("\n\n غابة القندل: غَابة القندل تقع شَمال جُزر فَرسان، وهي عبارة عن خليج يزدَحم بأشجار الشورى (المانجروف) متخللاً بممرات مائية نقية يَجعل منه وجهة سياحية تستحق التجربة والاكتشاف.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6873073,46.7594232 \n" );
            }
            else if(data.equals("شاطئ الحصيص")){
                sendMessage.setText("\n\n شاطى الحصيص: يعتبر هذا الشاطئ مشروع سياحي مميز قامت به أمانة محافظة جزر الفرسان التابعة لمنطقة جازان وهو أحد أجمل المشاريع المميزة في المدينة لما يوفره من نشاطات يمكن القيام بها على جميع الأصعدة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=16.7486655,42.07378509999999 \n" );
            }
            else if(data.equals("مرسى الغدير")){
                sendMessage.setText("\n\n مرسى الغدير: يعد مرسى الغدير في فرسان من المواقع المهمة، لما يمثله من أهمية كبيرة في التنشيط السياحي في المحافظة وخدمة الأهالي في نقل احتياجاتهم الخاصة والعامة إلى الجزر الأخرى القريبة وهو مرسى لقوارب الصيادين.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=16.682353,42.1082468 \n" );
            }
            else if(data.equals("شاطئ رأس القرن")){
                sendMessage.setText("\n\n شاطئ رأس القرن: يُعد شاطئ رأس القرن واحد من أبرز الشواطئ وأجملها في جزر فرسان، فهو يتمتع برمال ذهبية ناعمة ومياه فيروزية صافية تتضمن مجموعة مذهلة من الشعاب المرجانية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=16.6960126,42.0588519 \n" );
            }
            else if(data.equals("مرسى الحسين")){
                sendMessage.setText("\n\n مرسى الحسين: هي قرية تابعة لجزيرة فرسان يتميز الشاطئ بجماله، بإمكانك الصعود لقمة الجبل هناك والاستمتاع بالمنظر الجميل.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=16.7158073,41.90739120000001 \n" );
            }
            // التراث والثقافة - فرسان
            else if(data.equals("قصر الرفاعي التراثي")){
                sendMessage.setText("\n\n قصر الرفاعي التراثي: يتميز بزخارفه الفنية البديعة وملامحه البحرية الهادئة ويكسوه اللون الأبيض وتعلو سقفه نقوش بارزة وتغطي نوافذه العلوية الوان جميلة تعبر عن فن العمارة الجازانية خاصة الساحلية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.5444997,43.95527389999999 \n" );
            }
            else if(data.equals("القلعة العثمانية")){
                sendMessage.setText("\n\n القلعة العثمانية: القلعة العثمانية هي قلعة أثرية تقع شمال جزيرة فرسان التابعة لمنطقة جازان جنوب غرب المملكة العربية السعودية، وتُعتبر إحدى الرموز البارزة بالجزيرة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=16.712347,42.12240099999999 \n" );
            }
            else if(data.equals("متحف الزيلعي البحري")){
                sendMessage.setText("\n\n متحف الزيلعي البحري: متحف الزيلعي البحري هو أحد أشهر المتاحف الخاصة في جزر فرسان، ويتردد إليه عدد كبير من الزوار من داخل المملكة العربية السعودية وخارجها، فهو يتواجد في منزل مؤسسه زيلعي محمد داوود، ويحتوي على آلاف القطع البحرية المتنوعة والمثيرة للاهتمام.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=16.70292539999999,42.1214694 \n" );
            }
            else if(data.equals("مسجد النجدي الأثري")){
                sendMessage.setText("\n\n مسجد النجدي الأثري: أحد المساجد القديمة التي شيدها تاجر اللؤلؤ إبراهيم التميمي في عام 1932م، ويتميز المسجد بالنقوش والزخارف الإسلامية التي تغطي القباب والشرفات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=16.7029459,42.11646849 \n" );
            }
            else if(data.equals("قرية القصار التراثية")){
                sendMessage.setText("\n\n قرية القصار التراثية: قرية القصار التراثية وتعرف اختصاراً باسم القصار هي قرية قديمة تقع في جزيرة فرسان التابعة لمنطقة جازان الواقعة جنوب غرب السعودية. تضم القرية حوالي 400 منزل مبنية من الحجارة وجريد النخل، ويعود تاريخها وفقاً للمؤرِّخين إلى العهد الروماني.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=16.6703799,42.1484417 \n" );
            }
            else if(data.equals("حصن الجرمل الأثري")){
                sendMessage.setText("\n\n حصن الجرمل الاثري: بيت الجرمل هو مبنى أثري يقع على ساحل جزيرة قماح التابعة لجزر فرسان في منطقة جازان جنوب المملكة العربية السعودية.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=16.6550154,42.0313962 \n" );
            }
            // الأماكن السياحية - فيفاء
            else if(data.equals("الملعب الصخري المنحوت")){
                sendMessage.setText("\n\n الملعب الصخري المنحوت في مركز جبال الحشر: هو عبارة عن ملعب منحوت من الصخر وقد قام بنحته وتجهيزه أرضاً للعب كرة القدم في هذه المدينة الأستاذ محمد حربان الحريصي ولقد مكث في نحت هذا الملعب 16 سنة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.4703709,43.0349845 \n" );
            }
            else if(data.equals("منتزه قرضه")){
                sendMessage.setText("\n\n منتزه قرضه: يعد الأول من نوعه في حجم المساحة والتصميم والمحتوى في مرحلة متقدمة لتطوير المجال السياحي بفيفاء.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.2201853,43.1032526 \n" );
            }
            else if(data.equals("منتزه الأمير محمد بن ناصر")){
                sendMessage.setText("\n\n منتزه الأمير محمد بن ناصر: تقع على تقاطع طريقي الملك فهد والأمير متعب بن عبدالعزيز مما يشكل لموقعها أهمية كبيرة. كما تتميز هذه الحديقة بوجود الأشجار فيها مما يعطي بيئة نقية وهواء عليل.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.0313252,43.1231269 \n" );
            }

            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

}
