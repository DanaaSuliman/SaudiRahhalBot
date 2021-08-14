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

public class MyFirstBot3 extends TelegramLongPollingBot {


    @Override
    public String getBotUsername() {

        return "SaudiRahhalBot";
    }

    @Override
    public String getBotToken() {

        return "1906328573:AAEd5a8b_5r7TnTjXoRkwru-qJgF_sOidf8";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            Message message = update.getMessage();

            if (message.hasText()) {
                String text = message.getText();
                if (text.equals("الباحة")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر وجهتك السياحية في الباحة.")
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

                    KeyboardRow keyboardRow4 = new KeyboardRow();
                    KeyboardButton keyboardButton7 = new KeyboardButton();

                    keyboardButton1.setText("بلجرشي");
                    keyboardButton2.setText("المندق");
                    keyboardButton3.setText("المخواة");
                    keyboardButton4.setText("العقيق");
                    keyboardButton5.setText("قلوة");
                    keyboardButton6.setText("مدينة الباحة");

                    keyboardButton7.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);

                    keyboardRow3.add(keyboardButton6);

                    keyboardRow4.add(keyboardButton7);

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
// مدينة الباحة
                else if (text.equals("مدينة الباحة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في مدينة الباحة.")
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
                    KeyboardButton keyboardButton5 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton6 = new KeyboardButton();

                    keyboardButton4.setText("التراث والثقافة - مدينة الباحة");
                    keyboardButton2.setText("الأماكن السياحية - مدينة الباحة");
                    keyboardButton3.setText("التسوق - مدينة الباحة");
                    keyboardButton1.setText("المنتجعات والفنادق - مدينة الباحة");
                    keyboardButton5.setText("المطاعم - مدينة الباحة");

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
                // الأماكن السياحية - مدينة الباحة
                else if (text.equals("الأماكن السياحية - مدينة الباحة")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطل العقبة");
                    inlineKeyboardButton1.setCallbackData("مطل العقبة");

                    inlineKeyboardButton2.setText("منتزه غابة خيره");
                    inlineKeyboardButton2.setCallbackData("منتزه غابة خيره");


                    inlineKeyboardButton3.setText("قرية غابة رغدان السياحية ");
                    inlineKeyboardButton3.setCallbackData("قرية غابة رغدان");


                    inlineKeyboardButton4.setText("منتزه القيم ( منتزه الأمير حسام )");
                    inlineKeyboardButton4.setCallbackData("منتزه القيم");


                    inlineKeyboardButton5.setText("مزرعة الزيتونه للسياحة الزراعية");
                    inlineKeyboardButton5.setCallbackData("مزرعة الزيتونه");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton5);

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
                //  التسوق - مدينة الباحة
                else if (text.equals("التسوق - مدينة الباحة")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("سوق الحرف والصناعات اليدوية");
                    inlineKeyboardButton1.setCallbackData("سوق الحرف الباحة");

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
                // التراث والثقافة - مدينة الباحة
                else if (text.equals("التراث والثقافة - مدينة الباحة")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("قلعة الملد الاثرية");
                    inlineKeyboardButton1.setCallbackData("قلعة الملد الاثرية");

                    inlineKeyboardButton2.setText("قرية ذي عين الاثرية");
                    inlineKeyboardButton2.setCallbackData("قرية ذي عين الاثرية");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

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
                // المنتجعات والفنادق - مدينة الباحة
                else if (text.equals("المنتجعات والفنادق - مدينة الباحة")) {
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
                // المطاعم - مدينة الباحة
                else if (text.equals("المطاعم - مدينة الباحة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم مدينة الباحة");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Search?q=%D9%85%D8%AF%D9%8A%D9%86%D8%A9%20%D8%A7%D9%84%D8%A8%D8%A7%D8%AD%D8%A9&searchSessionId=BA07EFD81073DE3E2AAC32A1D54191E21627692058237ssid&geo=3238681&sid=4C59EA535DB241AE85E5E86C5E85FD8E1627703884873&blockRedirect=true&ssrc=e ");
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

                // بلجرشي
                else if (text.equals("بلجرشي")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في بلجرشي.")
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

                    keyboardButton1.setText("التراث والثقافة - بلجرشي");
                    keyboardButton2.setText("الأماكن السياحية - بلجرشي");

                    keyboardButton3.setText("المنتجعات والفنادق - بلجرشي");

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
                // الأماكن السياحية - يلجرشي
                else if (text.equals("الأماكن السياحية - بلجرشي")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("بحيرة وادي الجنابين");
                    inlineKeyboardButton1.setCallbackData("بحيرة وادي الجنابين");

                    inlineKeyboardButton2.setText("أبو الخير بلازا");
                    inlineKeyboardButton2.setCallbackData("أبو الخير بلازا");

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
                //  التراث والثقافة - بلجرشي
                else if (text.equals("التراث والثقافة - بلجرشي")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("الحي التاريخي ببلجرشي");
                    inlineKeyboardButton1.setCallbackData("الحي التاريخي ببلجرشي");

                    inlineKeyboardButton2.setText("متحف محمد بن مصبح");
                    inlineKeyboardButton2.setCallbackData("متحف محمد بن مصبح");

                    inlineKeyboardButton3.setText("عقبة حميدة الاثرية");
                    inlineKeyboardButton3.setCallbackData("عقبة حميدة الاثرية");

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
                // المنتجعات والفنادق - بلجرشي
                else if (text.equals("المنتجعات والفنادق - بلجرشي")) {
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
                // المندق
                else if (text.equals("المندق")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في المندق.")
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

                    keyboardButton1.setText("التراث والثقافة - المندق");
                    keyboardButton2.setText("الأماكن السياحية - المندق");

                    keyboardButton3.setText("المنتجعات والفنادق - المندق");

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
                // الأماكن السياحية - المندق
                else if (text.equals("الأماكن السياحية - المندق")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("بحيرة سد مدهاس");
                    inlineKeyboardButton1.setCallbackData("بحيرة سد مدهاس");

                    inlineKeyboardButton2.setText("وادي ضرك");
                    inlineKeyboardButton2.setCallbackData("وادي ضرك");

                    inlineKeyboardButton3.setText("حديقة الفراشة");
                    inlineKeyboardButton3.setCallbackData("حديقة الفراشة");

                    inlineKeyboardButton4.setText("بحيرة وادي مشينة");
                    inlineKeyboardButton4.setCallbackData("بحيرة وادي مشينة");

                    inlineKeyboardButton5.setText("منتجع برج الخلب السياحي");
                    inlineKeyboardButton5.setCallbackData("منتجع برج الخلب");

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
                //  التراث والثقافة - المندق
                else if (text.equals("التراث والثقافة - المندق")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("قلعة بخروش الاثرية");
                    inlineKeyboardButton1.setCallbackData("قلعة بخروش الاثرية");

                    inlineKeyboardButton2.setText("قرية قهاد الاثرية");
                    inlineKeyboardButton2.setCallbackData("قرية قهاد الاثرية");

                    inlineKeyboardButton3.setText("متحف عاصفة الحزم");
                    inlineKeyboardButton3.setCallbackData("متحف عاصفة الحزم");

                    inlineKeyboardButton4.setText("قرية الاطاولة التراثية السياحية");
                    inlineKeyboardButton4.setCallbackData("قرية الاطاولة التراثية");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton4);

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
                // المنتجعات والفنادق - المندق
                else if (text.equals("المنتجعات والفنادق - المندق")) {
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
                // المخواة
                else if (text.equals("المخواة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في المخواة.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();

                    keyboardButton2.setText("الأماكن السياحية - المخواة");

                    keyboardButton3.setText("المنتجعات والفنادق - المخواة");

                    keyboardButton4.setText("رجوع");

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
                // الأماكن السياحية - المخواة
                else if (text.equals("الأماكن السياحية - المخواة")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("سوق الثلاثاء الشعبي");
                    inlineKeyboardButton1.setCallbackData("سوق الثلاثاء الشعبي");

                    inlineKeyboardButton2.setText("بحيرة سد ناوان نيرا");
                    inlineKeyboardButton2.setCallbackData("بحيرة سد ناوان نيرا");

                    inlineKeyboardButton3.setText("بحيرة وادي الاحسبة");
                    inlineKeyboardButton3.setCallbackData("بحيرة وادي الاحسبة");

                    inlineKeyboardButton4.setText("كهوف جبل شدا الأسفل");
                    inlineKeyboardButton4.setCallbackData("كهوف جبل شدا الأسفل");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton4);

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
                // المنتجعات والفنادق - المخواة
                else if (text.equals("المنتجعات والفنادق - المخواة")) {
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
                // العقيق
                else if (text.equals("العقيق")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في العقيق.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();

                    keyboardButton2.setText("الأماكن السياحية - العقيق");

                    keyboardButton3.setText("المنتجعات والفنادق - العقيق");

                    keyboardButton4.setText("رجوع");

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
                // الأماكن السياحية - العقيق
                else if (text.equals("الأماكن السياحية - العقيق")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("بحيرة وادي ثراد");
                    inlineKeyboardButton1.setCallbackData("بحيرة وادي ثراد");

                    inlineKeyboardButton2.setText("بحيرة سد وادي العقيق");
                    inlineKeyboardButton2.setCallbackData("بحيرة سد وادي العقيق");

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
                // المنتجعات والفنادق - العقيق
                else if (text.equals("المنتجعات والفنادق - العقيق")) {
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
                // قلوة
                else if (text.equals("قلوة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في قلوة.")
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

                    keyboardButton1.setText("التراث والثقافة - قلوة");

                    keyboardButton2.setText("الأماكن السياحية - قلوة");

                    keyboardButton3.setText("المنتجعات والفنادق - قلوة");

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
                // الأماكن السياحية - قلوة
                else if (text.equals("الأماكن السياحية - قلوة")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("منتزه الفرشه");
                    inlineKeyboardButton1.setCallbackData("منتزه الفرشه");

                    inlineKeyboardButton2.setText("جبل شدا الأعلى");
                    inlineKeyboardButton2.setCallbackData("جبل شدا الأعلى");

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
                // التراث والثقافة - قلوة
                else if (text.equals("التراث والثقافة - قلوة")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("قرية الخلف والخليف الاثرية");
                    inlineKeyboardButton1.setCallbackData("قرية الخلف والخليف");

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
                // المنتجعات والفنادق - قلوة
                else if (text.equals("المنتجعات والفنادق - قلوة")) {
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
                // عسير
                else if (text.equals("عسير")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر وجهتك السياحية في عسير.")
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

                    KeyboardRow keyboardRow5 = new KeyboardRow();
                    KeyboardButton keyboardButton13 = new KeyboardButton();

                    keyboardButton1.setText("خميس مشيط");
                    keyboardButton2.setText("النماص");
                    keyboardButton3.setText("محايل عسير");
                    keyboardButton4.setText("أبها");
                    keyboardButton5.setText("رجال ألمع");
                    keyboardButton6.setText("بيشة");
                    keyboardButton7.setText("المجاردة");
                    keyboardButton8.setText("بلقرن");
                    keyboardButton9.setText("بللسمر");
                    keyboardButton10.setText("بللحمر");
                    keyboardButton11.setText("تنومه");
                    keyboardButton12.setText("القحمة");


                    keyboardButton13.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);
                    keyboardRow2.add(keyboardButton6);

                    keyboardRow3.add(keyboardButton7);
                    keyboardRow3.add(keyboardButton8);
                    keyboardRow4.add(keyboardButton9);

                    keyboardRow4.add(keyboardButton10);
                    keyboardRow4.add(keyboardButton11);
                    keyboardRow4.add(keyboardButton12);

                    keyboardRow5.add(keyboardButton13);

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
                // محايل عسير
                else if (text.equals("محايل عسير")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في محايل عسير.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow4 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();

                    keyboardButton1.setText("الأماكن السياحية - محايل عسير");

                    keyboardButton2.setText("التسوق - محايل عسير");

                    keyboardButton3.setText("المنتجعات والفنادق - محايل عسير");

                    keyboardButton4.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);

                    keyboardRow2.add(keyboardButton2);

                    keyboardRow3.add(keyboardButton3);

                    keyboardRow4.add(keyboardButton4);

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
                // الأماكن السياحية - محايل عسير
                else if (text.equals("الأماكن السياحية - محايل عسير")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("معرض ومتحف محايل عسير");
                    inlineKeyboardButton1.setCallbackData("معرض ومتحف محايل عس");

                    inlineKeyboardButton2.setText("جادة الفن");
                    inlineKeyboardButton2.setCallbackData("جادة الفن");

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
                // التسوق - محايل عسير
                else if (text.equals("التسوق - محايل عسير")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("الواحة مول");
                    inlineKeyboardButton1.setCallbackData("الواحة مول");


                    inlineKeyboardButton2.setText("السوق الشعبي");
                    inlineKeyboardButton2.setCallbackData("السوق الشعبي الشعبي");


                    inlineKeyboardButton3.setText("المكان مول");
                    inlineKeyboardButton3.setCallbackData("المكان مووول");


                    inlineKeyboardButton4.setText("البساتين مول");
                    inlineKeyboardButton4.setCallbackData("البساتين مووول");

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
                // المنتجعات والفنادق - محايل عسير
                else if (text.equals("المنتجعات والفنادق - محايل عسير")) {
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
                // خميس مشيط
                else if (text.equals("خميس مشيط")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في خميس مشيط.")
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

                    KeyboardRow keyboardRow4 = new KeyboardRow();
                    KeyboardButton keyboardButton6 = new KeyboardButton();


                    keyboardButton1.setText("الأماكن السياحية - خميس مشيط");
                    keyboardButton2.setText("التراث والثقافة - خميس مشيط");
                    keyboardButton3.setText("التسوق - خميس مشيط");
                    keyboardButton4.setText("المطاعم - خميس مشيط");
                    keyboardButton5.setText("المنتجعات والفنادق - خميس مشيط");


                    keyboardButton6.setText("رجوع");


                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);

                    keyboardRow2.add(keyboardButton3);
                    keyboardRow2.add(keyboardButton4);

                    keyboardRow3.add(keyboardButton5);

                    keyboardRow4.add(keyboardButton6);


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
                //  التسوق - خميس مشيط
                else if (text.equals("التسوق - خميس مشيط")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("الواحة مول");
                    inlineKeyboardButton1.setCallbackData("المكان مول موول");

                    inlineKeyboardButton2.setText("اصداف مول");
                    inlineKeyboardButton2.setCallbackData("اصداف مول");

                    inlineKeyboardButton3.setText("الخميس افينيو");
                    inlineKeyboardButton3.setCallbackData("الخميس افينيو");

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
                //  الأماكن السياحية - خميس مشيط
                else if (text.equals("الأماكن السياحية - خميس مشيط")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("بحيرة سد وادي تندحة");
                    inlineKeyboardButton1.setCallbackData("بحيرة سد وادي تن");

                    inlineKeyboardButton2.setText("بوليفارد الخميس");
                    inlineKeyboardButton2.setCallbackData("بوليفارد الخميس");

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
                //  التراث والثقافة - خميس مشيط
                else if (text.equals("التراث والثقافة - خميس مشيط")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("متحف بن عفيصان");
                    inlineKeyboardButton1.setCallbackData("متحف بن عفيصان");

                    inlineKeyboardButton2.setText("قرية بن حمسان التراثية");
                    inlineKeyboardButton2.setCallbackData("قرية بن حمسان");

                    inlineKeyboardButton3.setText("مدينة جرش الاثرية بأحد رفيدة");
                    inlineKeyboardButton3.setCallbackData("مدينة جرش");

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
                //المنتجعات والفنادق - خميس مشيط
                else if (text.equals("المنتجعات والفنادق - خميس مشيط")) {
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

                // المطاعم - خميس مشيط
                else if (text.equals("المطاعم - خميس مشيط")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم خميس مشيط");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g298550-Khamis_Mushait_Asir_Province.html");


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
                // النماص
                else if (text.equals("النماص")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في النماص.")
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

                    keyboardButton1.setText("الأماكن السياحية - النماص");
                    keyboardButton2.setText("التراث والثقافة - النماص");
                    keyboardButton3.setText("المطاعم - النماص");
                    keyboardButton4.setText("المنتجعات والفنادق - النماص");

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
                // الأماكن السياحية - النماص
                else if (text.equals("الأماكن السياحية - النماص")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("بحيرة وادي ترج");
                    inlineKeyboardButton1.setCallbackData("بحيرة وادي ترج");


                    inlineKeyboardButton2.setText("بحيرة وادي بدوة");
                    inlineKeyboardButton2.setCallbackData("بحيرة وادي بدوة");


                    inlineKeyboardButton3.setText("قرية المقر السياحية");
                    inlineKeyboardButton3.setCallbackData("قرية المقر السياحية");


                    inlineKeyboardButton4.setText("منتزه الأمير سلطان بن سلمان");
                    inlineKeyboardButton4.setCallbackData("منتزه الأمير سلطان ب");

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
                // التراث والثقافة - النماص
                else if (text.equals("التراث والثقافة - النماص")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("قرية آل عطيفه التراثية");
                    inlineKeyboardButton1.setCallbackData("قرية آل عطيفه");

                    inlineKeyboardButton2.setText("قرية آل عليان التراثية");
                    inlineKeyboardButton2.setCallbackData("قرية آل عليان");

                    inlineKeyboardButton3.setText("متحف قرية الفضول");
                    inlineKeyboardButton3.setCallbackData("متحف قرية الفضول");

                    inlineKeyboardButton4.setText("قرية صدريد التراثية");
                    inlineKeyboardButton4.setCallbackData("قرية صدريد التراثية");

                    inlineKeyboardButton5.setText("قصر ثربان التاريخي");
                    inlineKeyboardButton5.setCallbackData("قصر ثربان التاريخي");

                    inlineKeyboardButton6.setText("قرية آل نييح الأثرية");
                    inlineKeyboardButton6.setCallbackData("قرية آل نييح");

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

                //المنتجعات والفنادق - النماص
                else if (text.equals("المنتجعات والفنادق - النماص")) {
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

                // المطاعم - النماص
                else if (text.equals("المطاعم - النماص")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم النماص");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Search?q=%D8%A7%D9%84%D9%86%D9%85%D8%A7%D8%B5&searchSessionId=916B97AADE59519E1C7E84EB6D35DD221627712355905ssid&searchNearby=false&geo=298550&sid=FEB1D40E7F614C4093A7E2532FE09CAA1627713012571&blockRedirect=true&ssrc=e&rf=1 ");


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
                // رجال ألمع
                else if (text.equals("رجال ألمع")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في رجال ألمع.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    keyboardButton1.setText("الأماكن السياحية - رجال ألمع");

                    keyboardButton2.setText("المنتجعات والفنادق - رجال ألمع");

                    keyboardButton3.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);

                    keyboardRow2.add(keyboardButton2);

                    keyboardRow3.add(keyboardButton3);

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

                // الأماكن السياحية - رجال ألمع
                else if (text.equals("الأماكن السياحية - رجال ألمع")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("قرية رجال ألمع التراثية");
                    inlineKeyboardButton1.setCallbackData("قرية رجال ألمع الت");

                    inlineKeyboardButton2.setText("مطل منتزه رجال ألمع");
                    inlineKeyboardButton2.setCallbackData("مطل منتزه رجال");

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
                //المنتجعات والفنادق - رجال ألمع
                else if (text.equals("المنتجعات والفنادق - رجال ألمع")) {
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

                // المجاردة
                else if (text.equals("المجاردة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في المجاردة.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    keyboardButton1.setText("الأماكن السياحية - المجاردة");

                    keyboardButton2.setText("المنتجعات والفنادق - المجاردة");

                    keyboardButton3.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);

                    keyboardRow2.add(keyboardButton2);

                    keyboardRow3.add(keyboardButton3);

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

                // الأماكن السياحية - المجاردة
                else if (text.equals("الأماكن السياحية - المجاردة")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("جبل تهوي");
                    inlineKeyboardButton1.setCallbackData("جبل تهوي");

                    inlineKeyboardButton2.setText("قرية ربوع بلادي السياحية والتراثية");
                    inlineKeyboardButton2.setCallbackData("قرية ربوع بلادي");

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
                //المنتجعات والفنادق - المجاردة
                else if (text.equals("المنتجعات والفنادق - المجاردة")) {
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
                // بيشة
                else if (text.equals("بيشة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في بيشة.")
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

                    keyboardButton1.setText("المطاعم  - بيشة");
                    keyboardButton2.setText("المنتجعات والفنادق - بيشة");
                    keyboardButton3.setText("الأماكن السياحية - بيشة");

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

                // الأماكن السياحية - بيشة
                else if (text.equals("الأماكن السياحية - بيشة")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("قصر بن هتيل التاريخي");
                    inlineKeyboardButton1.setCallbackData("قصر بن هتيل");

                    inlineKeyboardButton2.setText("بحيرة سد الملك فهد بوادي بيشة");
                    inlineKeyboardButton2.setCallbackData("بحيرة سد الملك");

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
                //المنتجعات والفنادق - بيشة
                else if (text.equals("المنتجعات والفنادق - بيشة")) {
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
                // المطاعم - بيشة
                else if (text.equals("المطاعم  - بيشة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم بيشة");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g9776788-Bishah_Asir_Province.html");


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
                // بلقرن
                else if (text.equals("بلقرن")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في بلقرن.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    keyboardButton1.setText("المنتجعات والفنادق - بلقرن");
                    keyboardButton2.setText("الأماكن السياحية - بلقرن");

                    keyboardButton3.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);

                    keyboardRow2.add(keyboardButton2);

                    keyboardRow3.add(keyboardButton3);

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

                // الأماكن السياحية - بلقرن
                else if (text.equals("الأماكن السياحية - بلقرن")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("بحيرة شيبانه");
                    inlineKeyboardButton1.setCallbackData("بحيرة شيبانه");

                    inlineKeyboardButton3.setText("مرتفعات عقبة السقيفة");
                    inlineKeyboardButton3.setCallbackData("مرتفعات عقبة السقيفة");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

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
                //المنتجعات والفنادق - بلقرن
                else if (text.equals("المنتجعات والفنادق - بلقرن")) {
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
                // بللسمر
                else if (text.equals("بللسمر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في بللسمر.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    keyboardButton1.setText("المنتجعات والفنادق - بللسمر");
                    keyboardButton2.setText("الأماكن السياحية - بللسمر");

                    keyboardButton3.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);

                    keyboardRow2.add(keyboardButton2);

                    keyboardRow3.add(keyboardButton3);

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
                // الأماكن السياحية - بللسمر
                else if (text.equals("الأماكن السياحية - بللسمر")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مرتفعات شعف بللسمر");
                    inlineKeyboardButton1.setCallbackData("مرتفعات شعف بللسمر");

                    inlineKeyboardButton2.setText("بحيرة سد الغرابة");
                    inlineKeyboardButton2.setCallbackData("بحيرة سد الغرابة");

                    inlineKeyboardButton3.setText("بحيرة سد الخلصه");
                    inlineKeyboardButton3.setCallbackData("بحيرة سد الخلصه");

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
                //المنتجعات والفنادق - بللسمر
                else if (text.equals("المنتجعات والفنادق - بللسمر")) {
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
                // تنومه
                else if (text.equals("تنومه")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في تنومه.")
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

                    keyboardButton1.setText("الأماكن السياحية - تنومه");
                    keyboardButton2.setText("التراث والثقافة - تنومه");
                    keyboardButton3.setText("المنتجعات والفنادق - تنومه");

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
                // الأماكن السياحية - تنومه
                else if (text.equals("الأماكن السياحية - تنومه")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("منتزه المحفار");
                    inlineKeyboardButton1.setCallbackData("منتزه المحفار");

                    inlineKeyboardButton2.setText("منتزه الشرف");
                    inlineKeyboardButton2.setCallbackData("منتزه الشرف");

                    inlineKeyboardButton3.setText("مرتفعات الحيفه");
                    inlineKeyboardButton3.setCallbackData("مرتفعات الحيفه");

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
                // التراث والثقافة - تنومه
                else if (text.equals("التراث والثقافة - تنومه")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    inlineKeyboardButton2.setText("قرية تنومه التراثية");
                    inlineKeyboardButton2.setCallbackData("قرية تنومه التراثية");

                    inlineKeyboardButtonList2.add(inlineKeyboardButton2);

                    inlineButtons.add(inlineKeyboardButtonList2);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                //المنتجعات والفنادق - تنومه
                else if (text.equals("المنتجعات والفنادق - تنومه")) {
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
                // بللحمر
                else if (text.equals("بللحمر")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في بللحمر.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    keyboardButton1.setText("المنتجعات والفنادق - بللحمر");
                    keyboardButton2.setText("الأماكن السياحية - بللحمر");

                    keyboardButton3.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);

                    keyboardRow2.add(keyboardButton2);

                    keyboardRow3.add(keyboardButton3);

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
                // الأماكن السياحية - بللحمر
                else if (text.equals("الأماكن السياحية - بللحمر")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مرتفعات عقبة الجعدة");
                    inlineKeyboardButton1.setCallbackData("مرتفعات عقبة الجعدة");

                    inlineKeyboardButton2.setText("قرية بن عضوان التراثية السياحية");
                    inlineKeyboardButton2.setCallbackData("قرية بن عضوان التراثية");

                    inlineKeyboardButton3.setText("بحيرة وادي عمق");
                    inlineKeyboardButton3.setCallbackData("بحيرة وادي عمق");

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
                //المنتجعات والفنادق - بللحمر
                else if (text.equals("المنتجعات والفنادق - بللحمر")) {
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
                // القحمة
                else if (text.equals("القحمة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في القحمة.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();

                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton2 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    keyboardButton1.setText("المنتجعات والفنادق - القحمة");
                    keyboardButton2.setText("الأماكن السياحية - القحمة");

                    keyboardButton3.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);

                    keyboardRow2.add(keyboardButton2);

                    keyboardRow3.add(keyboardButton3);

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
                // الأماكن السياحية - القحمة
                else if (text.equals("الأماكن السياحية - القحمة")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();


                    inlineKeyboardButton1.setText("الواجهة البحرية بالقحمة");
                    inlineKeyboardButton1.setCallbackData("الواجهة البحرية بالقحمة");

                    inlineKeyboardButton2.setText("بحيرة وادي ذهبان");
                    inlineKeyboardButton2.setCallbackData("بحيرة وادي ذهبان");

                    inlineKeyboardButton3.setText("شاطئ البرك");
                    inlineKeyboardButton3.setCallbackData("شاطئ البرك");

                    inlineKeyboardButton4.setText("الواجهة البحرية بالحضرية");
                    inlineKeyboardButton4.setCallbackData("الواجهة البحرية بالحضرية");

                    inlineKeyboardButton5.setText("جزيرة كدمبل");
                    inlineKeyboardButton5.setCallbackData("جزيرة كدمبل");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton3);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton5);

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
                //المنتجعات والفنادق - القحمة
                else if (text.equals("المنتجعات والفنادق - القحمة")) {
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

                // أبها
                else if (text.equals("أبها")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في أبها.")
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
                    KeyboardButton keyboardButton6 = new KeyboardButton();
                    KeyboardButton keyboardButton7 = new KeyboardButton();

                    KeyboardRow keyboardRow4 = new KeyboardRow();
                    KeyboardButton keyboardButton8 = new KeyboardButton();


                    keyboardButton1.setText("الأماكن السياحية - أبها");
                    keyboardButton2.setText("المنتزهات والترفيه - أبها");
                    keyboardButton3.setText("المنتجعات والفنادق - أبها");
                    keyboardButton4.setText("الطبيعة والبيئة - أبها");
                    keyboardButton5.setText("التسوق - أبها");
                    keyboardButton6.setText("التراث والثقافة - أبها");
                    keyboardButton7.setText("المطاعم - أبها");
                    keyboardButton8.setText("رجوع");


                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);

                    keyboardRow2.add(keyboardButton3);
                    keyboardRow2.add(keyboardButton4);

                    keyboardRow3.add(keyboardButton5);
                    keyboardRow3.add(keyboardButton6);
                    keyboardRow3.add(keyboardButton7);

                    keyboardRow4.add(keyboardButton8);

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
                // الأماكن السياحية - أبها
                else if (text.equals("الأماكن السياحية - أبها")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    //First row
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    //Second row
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();

                    //Third row
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();

                    //Fourth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList7 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton15 = new InlineKeyboardButton();

                    //Fifth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList8 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton16 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton17 = new InlineKeyboardButton();


                    List<InlineKeyboardButton> inlineKeyboardButtonList9 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton18 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton19 = new InlineKeyboardButton();


                    inlineKeyboardButton1.setText("القرية العالية");
                    inlineKeyboardButton1.setCallbackData("القرية العالية");

                    inlineKeyboardButton2.setText("قرية الحبلة السياحية");
                    inlineKeyboardButton2.setCallbackData("قرية الحبلة السياحية");

                    inlineKeyboardButton3.setText("شارع الفن");
                    inlineKeyboardButton3.setCallbackData("شارع الفن");

                    inlineKeyboardButton4.setText("قرية المفتاحة السياحية");
                    inlineKeyboardButton4.setCallbackData("قرية المفتاحة السياحية");

                    inlineKeyboardButton5.setText("الجبل الأخضر");
                    inlineKeyboardButton5.setCallbackData("الجبل الأخضر");

                    inlineKeyboardButton6.setText("منتزهات بحيرة سد أبها");
                    inlineKeyboardButton6.setCallbackData("منتزهات بحيرة سد أبها");

                    inlineKeyboardButton7.setText("كورنيش الضباب");
                    inlineKeyboardButton7.setCallbackData("كورنيش الضباب");

                    inlineKeyboardButton10.setText("حديقة المطار");
                    inlineKeyboardButton10.setCallbackData("حديقة المطار");

                    inlineKeyboardButton11.setText("بحيرة سد ضبوعي");
                    inlineKeyboardButton11.setCallbackData("بحيرة سد ضبوعي");

                    inlineKeyboardButton12.setText("منتزه الشلال");
                    inlineKeyboardButton12.setCallbackData("منتزه الشلال");

                    inlineKeyboardButton13.setText("منتزه السلام");
                    inlineKeyboardButton13.setCallbackData("منتزه السلام");

                    inlineKeyboardButton14.setText("بحيرة سد وادي عشران");
                    inlineKeyboardButton14.setCallbackData("بحيرة سد وادي عش");

                    inlineKeyboardButton15.setText("حديقة ملهمتي الفنية");
                    inlineKeyboardButton15.setCallbackData("حديقة ملهمتي الفنية");

                    inlineKeyboardButton16.setText("حديقة أبها الجديدة");
                    inlineKeyboardButton16.setCallbackData("حديقة أبها الجديدة");

                    inlineKeyboardButton17.setText("منتزه أبو خيال");
                    inlineKeyboardButton17.setCallbackData("منتزه أبو خيال");

                    inlineKeyboardButton18.setText("قرية السودة السياحية");
                    inlineKeyboardButton18.setCallbackData("قرية السودة السياحية");

                    inlineKeyboardButton19.setText("مطل العقبة");
                    inlineKeyboardButton19.setCallbackData("مطل العقبة");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton10);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton11);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton12);
                    inlineKeyboardButtonList6.add(inlineKeyboardButton13);

                    inlineKeyboardButtonList7.add(inlineKeyboardButton14);
                    inlineKeyboardButtonList7.add(inlineKeyboardButton15);

                    inlineKeyboardButtonList8.add(inlineKeyboardButton16);
                    inlineKeyboardButtonList8.add(inlineKeyboardButton17);

                    inlineKeyboardButtonList9.add(inlineKeyboardButton18);
                    inlineKeyboardButtonList9.add(inlineKeyboardButton19);

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
                // المنتزهات والترفيه - أبها
                else if (text.equals("المنتزهات والترفيه - أبها")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    //First row
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    //Second row
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();

                    //Third row
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();

                    //Fourth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList7 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("شارع الفن");
                    inlineKeyboardButton1.setCallbackData("شارع الفن");

                    inlineKeyboardButton2.setText("مجمع شرفة");
                    inlineKeyboardButton2.setCallbackData("مجمع شرفة");

                    inlineKeyboardButton3.setText("المدينة العالية");
                    inlineKeyboardButton3.setCallbackData("المدينة العالية");

                    inlineKeyboardButton4.setText("قصور آل سراح");
                    inlineKeyboardButton4.setCallbackData("قصور آل سراح");

                    inlineKeyboardButton5.setText("قصور وقلاع أبو نقطة");
                    inlineKeyboardButton5.setCallbackData("قصور وقلاع");

                    inlineKeyboardButton6.setText("البوليفارد");
                    inlineKeyboardButton6.setCallbackData("البوليفااارد");

                    inlineKeyboardButton8.setText("ريفر سايد");
                    inlineKeyboardButton8.setCallbackData("ريفر سايد");

                    inlineKeyboardButton10.setText("الحديقة الزجاجية");
                    inlineKeyboardButton10.setCallbackData("الحديقة الزجاجية");

                    inlineKeyboardButton12.setText("سماش تايم");
                    inlineKeyboardButton12.setCallbackData("سماش تايم");

                    inlineKeyboardButton13.setText("التلفريك");
                    inlineKeyboardButton13.setCallbackData("التلفريك");

                    inlineKeyboardButton14.setText("نادي الفيصل للفروسية");
                    inlineKeyboardButton14.setCallbackData("نادي الفيصل للفروسية");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton10);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton12);
                    inlineKeyboardButtonList6.add(inlineKeyboardButton13);

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
                // التسوق - أبها
                else if (text.equals("التسوق - أبها")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    //First row
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    //Second row
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();

                    //Third row
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("الواحة مول");
                    inlineKeyboardButton1.setCallbackData("الواحة مول");

                    inlineKeyboardButton2.setText("عسير مول");
                    inlineKeyboardButton2.setCallbackData("عسير مول");

                    inlineKeyboardButton3.setText("أبها مول");
                    inlineKeyboardButton3.setCallbackData("أبها مول");

                    inlineKeyboardButton4.setText("الراشد مول");
                    inlineKeyboardButton4.setCallbackData("الراشد موول");

                    inlineKeyboardButton5.setText("رفالا بلازا");
                    inlineKeyboardButton5.setCallbackData("رفالا بلازا");

                    inlineKeyboardButton6.setText("سوق الثلاء الشعبي");
                    inlineKeyboardButton6.setCallbackData("سوق الثلاء الشعبي");

                    inlineKeyboardButton7.setText("ريحانا مول");
                    inlineKeyboardButton7.setCallbackData("ريحانا مول");

                    inlineKeyboardButton8.setText("النخيل بلازا مول");
                    inlineKeyboardButton8.setCallbackData("النخيل بلازا مول");

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
                // الطبيعة والبيئة - أبها
                else if (text.equals("الطبيعة والبيئة - أبها")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    //First row
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    //Second row
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();

                    //Third row
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();

                    //Fourth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("شارع الفن");
                    inlineKeyboardButton1.setCallbackData("شارع الفن");

                    inlineKeyboardButton2.setText("جسر السودة");
                    inlineKeyboardButton2.setCallbackData("جسر السودة");

                    inlineKeyboardButton3.setText("شلال النخبة");
                    inlineKeyboardButton3.setCallbackData("شلال النخبة");

                    inlineKeyboardButton4.setText("عين الذيبة");
                    inlineKeyboardButton4.setCallbackData("عين الذيبة");

                    inlineKeyboardButton5.setText("حديقة أبو خيال");
                    inlineKeyboardButton5.setCallbackData("حديقة أبو خيال");

                    inlineKeyboardButton6.setText("منتزه المسقي");
                    inlineKeyboardButton6.setCallbackData("منتزه المسقي");

                    inlineKeyboardButton8.setText("بني مازن");
                    inlineKeyboardButton8.setCallbackData("بني مازن");

                    inlineKeyboardButton10.setText("الحبلة");
                    inlineKeyboardButton10.setCallbackData("الحبلة");

                    inlineKeyboardButton11.setText("رجال ألمع");
                    inlineKeyboardButton11.setCallbackData("رجال ألمع");

                    inlineKeyboardButton12.setText("التلفريك");
                    inlineKeyboardButton12.setCallbackData("التلفريك");

                    inlineKeyboardButton13.setText("السودة");
                    inlineKeyboardButton13.setCallbackData("السودة");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton10);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton11);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton12);
                    inlineKeyboardButtonList6.add(inlineKeyboardButton13);

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
                // التراث والثقافة - أبها
                else if (text.equals("التراث والثقافة - أبها")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    //First row
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    //Second row
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();

                    //Third row
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("متحف الأجيال");
                    inlineKeyboardButton1.setCallbackData("متحف الأجيال");

                    inlineKeyboardButton2.setText("قرية طبب التراثية");
                    inlineKeyboardButton2.setCallbackData("قرية طبب التراثية");

                    inlineKeyboardButton3.setText("متحف الجحل");
                    inlineKeyboardButton3.setCallbackData("متحف الجحل");

                    inlineKeyboardButton4.setText("قلعة شمسان الأثري");
                    inlineKeyboardButton4.setCallbackData("قلعة شمسان الأثري");

                    inlineKeyboardButton5.setText("حي البسطه الأثري");
                    inlineKeyboardButton5.setCallbackData("حي البسطه الأثري");

                    inlineKeyboardButton6.setText("قصر شدا التاريخي");
                    inlineKeyboardButton6.setCallbackData("قصر شدا التاريخي");

                    inlineKeyboardButton7.setText("متحف عسير الإقليمي");
                    inlineKeyboardButton7.setCallbackData("متحف عسير الإقليمي");

                    inlineKeyboardButton8.setText("متحف فاطمه");
                    inlineKeyboardButton8.setCallbackData("متحف فاطمه");

                    inlineKeyboardButton10.setText("متحف الراقدي");
                    inlineKeyboardButton10.setCallbackData("متحف الراقدي");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);

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

                //المنتجعات والفنادق - أبها
                else if (text.equals("المنتجعات والفنادق - أبها")) {
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
                //المطاعم - أبها
                else if (text.equals("المطاعم - أبها")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم أبها");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g298542-Abha_Asir_Province.html");


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


                //--------------------------------------------------------------------//
                // الرياض

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

                } else {
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
            Message message2 = update.getCallbackQuery().getMessage();
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();

            SendMessage sendMessage = new SendMessage().setParseMode(ParseMode.MARKDOWN).setChatId(message2.getChatId());

            // الباحة
            // الأماكن السياحية - مدينة الباحة
            if(data.equals("مزرعة الزيتونه")){
                sendMessage.setText("\n\n مزرعة الزيتونة للسياحية الزراعية: محمية رعوية تُعرف بأنها الوجهة السياحية الزراعية الأولى في السعودية، لما تجذبه من جميع أنواع السياح بمناظرها الطبيعية ومساحاتها الخضراء الشاسعة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=20.0761365,41.5697457 \n" );
            }
            else if(data.equals("منتزه القيم")){
                sendMessage.setText("\n\n منتزه القيم: يعتبر منتزه القيم أو منتزه الامير الدكتور حسام يتميز بالجمال الطبيعي والبحيرة الصناعية والشلالات والنوافير التفاعلية والمسطحات الخضراء، وغيرها.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=20.0115386,41.4502238 \n" );
            }
            else if(data.equals("منتزه غابة خيره")){
                sendMessage.setText("\n\n منتزه غابة خيرة : يتميز بالمساحات الخضراء الشاسعة ، و يحتوى علي الكثير من الأحواض المائية والشلالات والينابيع و يتميز أيضا بوجود غطاء نباتي متنوع، يوجد بالمنتزه ممرات للمشي و مناطق ترفيهية للأطفال.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=20.0522376,41.3977182 \n" );
            }
            else if(data.equals("مطل العقبة")){
                sendMessage.setText("\n\n مطل العقبة: تعتبر لوحة جمالية مبهرة لطبيعة خلابة حيث تطل على القرى القديمة التي تقف مبانيها الحجرية على حافة الجبل وعندما تنساب الأمطار بين جبالها الشاهقة، تتشكل شلالات جذابة، تضفي لمسات إبداعية على وجه الطبيعة الساحرة تسر الناظرين.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.1823779,42.507223 \n" );
            }
            else if(data.equals("قرية غابة رغدان")){
                sendMessage.setText("\n\n قرية رغدان السياحية: تُعتبر هذه المنطقة من أهم و أرقى المناطق السياحية في المملكة العربية السعودية لما تمتاز به من غابات كثيفة ذات طبيعة خلابة و ساحرة، ومنتزهات خيالية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=20.0206813,41.4327696 \n" );
            }
            // التراث والثقافة - مدينة الباحة
            else if(data.equals("قلعة الملد الاثرية")){
                sendMessage.setText("\n\n قلعة الملد التاريخية: تعتبر القلعة من أهم وأقدم المباني الأثرية المخدومة بشكل جيد وهي عبارة عن حصنين متجاورين مع بعضهما البعض، يمكنك زيارة القلعة والتمتع بالأجواء السائدة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=20.01197,41.4985461 \n" );
            }
            else if(data.equals("قرية ذي عين الاثرية")){
                sendMessage.setText("\n\n قرية ذي عين الأثرية : تعد من أشهر و أهم المناطق الأثرية في مدينة الباحة تتميز بتصميمها المعماري المميز و ترتيب البيوت بها يمكنك مشاهدة وديان المياه التي تقع وسط الأشجار والزهور كأنها لوحة  مرسومة، كما يوجد فيها منطقة ترفيهيه خاصة للأطفال.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.9299246,41.4420978 \n" );
            }
            // التسوق - مدينة الباحة
            else if(data.equals("سوق الحرف الباحة")){
                sendMessage.setText("\n\n سوق الحرف والصناعات اليدوية: يحتوي على العديد من الأسواق الأسبوعية والمحلات الشعبية في منطقة الباحة ، وترينا لوحات فنية خالدة ومتناثرة في جميع أرجائها.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=20.0109734,41.462112 \n" );
            }
            // التراث والثقافة - بلجرشي
            else if(data.equals("الحي التاريخي ببلجرشي")){
                sendMessage.setText("\n\n الحي التاريخي ببلجرشي: أكثر ما يميز هذا الحي هو أنه يحتوي على عدد كبير من المباني الأثرية و العتيقة التي لا زالت محافظة على تماسكها إلى يومنا هذا.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.8648875,41.5812154 \n" );
            }
            else if(data.equals("متحف محمد بن مصبح")){
                sendMessage.setText("\n\n متحف محمد بن مصبح: الشيخ محمد بن مصبح هو شيخ قبيلة بلجرشي وأقيم المتحف بجهوده وتكاليفه الخاصة. يتكون من قاعتين رئيستين وثلاث غرف، تعرض القطع الأثرية في المتحف من خلال خزائن عرض زجاجية أو من خلال أرفف مرتبه بشكل مميز.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.8421482,41.5764418 \n" );
            }
            else if(data.equals("عقبة حميدة الاثرية")){
                sendMessage.setText("\n\n عقبة حميدة الاثرية : اقدم عقبة بمنطقة الباحة وهي عبارة عن درج وطرق مرصوفة بالحجارة من الحجم الكبير بطريقة هندسية رائعة، وتحوي العشرات من النقوش والمواقع الاثرية التي كان يتخذها المسافرون استراحات لهم من عناء السفر منذ مئات السنين.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.8562411,41.5367722 \n" );
            }

            // الأماكن السياحية - بلجرشي
            else if(data.equals("بحيرة وادي الجنابين")){
                sendMessage.setText("\n\n بحيرة وادي الجنابين: يقع  جنوب شرق محافظة بلجرشي على بعد 13 كيلو مترًا إلى الجنوب، ويضم أنواعا من مختلفة من الأشجار كما ينموعلى جنبات الوادي كميات كبيرة من شجرة الحبق ، حيث تعطي رائحة جميلة للوادي .\n\n" + "\n  https://www.google.com/maps/search/?api=1&query=19.9074799,41.7071285\n" );
            }
            else if(data.equals("أبو الخير بلازا")){
                sendMessage.setText("\n\n أبو الخير بلازا: يضم عددا كبيرا من المحلات التجارية المميزة و المتخصصة في بيع الكثير من المنتجات المتنوعة. كما يقام في المول عدد من مهرجانات التسوق و التي يمكن من خلالها الحصول على عروض مميزة .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.8607417,41.5703767 \n" );
            }
            // المندق
            // الأماكن السياحية - المندق
            else if(data.equals("قلعة بخروش الاثرية")){
                sendMessage.setText("\n\n قلعة بخروش : من أشهر المعالم الأثرية ومن إحدى القلاع الضخمة المحصنة التى تم بناؤها من الحجارة الكبيرة و تتكون من أربعة قلاع في شكل دائري و يلتف حولها سور قوي مبني من الحجارة .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=20.2950204,41.3584721 \n" );
            }
            else if(data.equals("قرية قهاد الاثرية")){
                sendMessage.setText("\n\n قرية الجهاد الاثرية: تعتبر من أجمل و أهم الأماكن الخاصة بمصائف المملكة العربية السعودية وتعتبر واجهة تراثية عظيمة تنظر على جميع الشوارع الرئيسية العامة و التي تربط بين الباحة و الطائف.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=20.272,41.3596416 \n" );
            }
            else if(data.equals("قرية الاطاولة التراثية")){
                sendMessage.setText("\n\n قرية الأطاولة التراثية: تعد أحد أهم القرى في مدينة الباحة، تطل القرية على مناظر طبيعية شكلت لوحة جمالية تتمثل في مجموعة من التلال بين واديين فسيحين يصبان في وادي بيدة ووادي ينبع.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=20.2497391,41.3598618 \n" );
            }
            else if(data.equals("متحف عاصفة الحزم")){
                sendMessage.setText("\n\n متحف الديرة وسابقًا عاصفة الحزم: يقدم لكم اجمل العروض، متحف تراثي، مجلس تراثي كبير لاقامة المناسبات، مجلس مفتوح، اطلالات وجلسات، شلالات مائية، مدرجات زراعية، كافيه، اكلات شعبية، استعداد لاقامة الحفلات والفعاليات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=20.0932037,41.308751 \n" );
            }
            // التراث والثقافة - المندق
            else if(data.equals("بحيرة سد مدهاس")){
                sendMessage.setText("\n\n بحيرة سد مدهاس : يقع السد على امتداد وادي تربة، ويوجد على ضفافه جلسات ومطلات.\n\n" + "\n https://www.google.com/maps/place/20%C2%B013'19.7%22N+41%C2%B016'27.1%22E/@20.2221286,41.2742025,15z \n" );
            }
            else if(data.equals("بحيرة وادي مشينة")){
                sendMessage.setText("\n\n بحيرة وادي مشنية: من السدود الجميلة في قرية مشنية، مناسبة جداً للنزهة والتخييم. \n\n" + "\n https://www.google.com/maps/search/?api=1&query=20.176987,41.3164535 \n" );
            }
            else if(data.equals("وادي ضرك")){
                sendMessage.setText("\n\n وادي ضرك: يشتهر الوادي بالجبال التي تحيط به من كل الأجناب مع ظهور الوادي في المنتصف.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=20.1849247,41.2867177 \n" );
            }
            else if(data.equals("حديقة الفراشة")){
                sendMessage.setText("\n\n حديقة الفراشة: تعد من أكبر الحدائق بالمحافظة ويتوفر بها كامل الخدمات التي تهم الزائر أثناء نزهته حيث تحتوي الحديقة على 42 جلسة ذات خصوصية تامة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=20.1800596,41.2693799 \n" );
            }
            else if(data.equals("منتجع برج الخلب")){
                sendMessage.setText("\n\n منتزه برج الخلب السياحي: تم تصميمه بشكل مختلف عن منتزهات المنطقة بنمط عمراني جديد يحاكي التراث القديم يقع على مرتفع يتميز بإطلالة جميلة تعانق السحاب، ويحتوي المنتزه على مطاعم ومسرح ومقاهٍ وملاهٍ للأطفال، وجلسات عائلية.\n\n" + "\n https://www.google.com/maps/place/16%C2%B042'55.2%22N+42%C2%B058'51.3%22E/@16.7153435,42.9809231,15z  \n" );
            }
            // الأماكن السياحية - المخواة
            else if(data.equals("سوق الثلاثاء الشعبي")){
                sendMessage.setText("\n\n سوق الثلاثاء الشعبي: يتميز السوق بالمحلات الحرفية، والأبواب الخشبية، والأواني التراثية التي تنقلك إلى الماضي عبر مقتنيات جذابة، و يوجد منتجات غذائية طبيعية تُجلب من المنطقة في فترة المواسم.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.7831694,41.43968689999999 \n" );
            }
            else if(data.equals("بحيرة سد ناوان نيرا")){
                sendMessage.setText("\n\n بحيرة وادي ناوان نيرا: وادي نيرا أحد أودية قطاع تهامة يحده عدد من الجبال المشهورة، يعد مكان جميل جدا للنزهة والسياحة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.7589479,41.33407270000001 \n" );
            }
            else if(data.equals("بحيرة وادي الاحسبة")){
                sendMessage.setText("\n\n بحيرة وادي الأحسبة: أحد أطول الأودية في جنوب المملكة العربية السعودية، يعرف بكثافة الأشجار، والعديد من الخيرات من الفواكه والخضروات، خاصة مع تطوير أدوات الزراعة خلال الوقت الراهن.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.7003674,41.395561  \n" );
            }
            else if(data.equals("كهوف جبل شدا الأسفل")){
                sendMessage.setText("\n\n كهوف جبل شدا الاسفل: أشهر الجبال في جنوب الجزيرة العربية، تشتهر هذه الكهوف بكثرة المغاور والكهوف الغرانيتية الواسعة التي استخدمها سكان هذا الجبل، ويقع بجانبها منتجعات جميلة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.7327669,41.3596717 \n" );
            }
            // الأماكن السياحية - العقيق
            else if(data.equals("بحيرة وادي ثراد")){
                sendMessage.setText("\n\n بحيرة وادي ثراد: هو عبارة عن وادي جميل به الكثير من الأزهار الجميلة الخضراء، وقد قام المسئولون بتوصيل مياة سد وادي ثـراد إلي مدينة الباحة .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7139491,46.85058129999999 \n" );
            }
            else if(data.equals("بحيرة سد وادي العقيق")){
                sendMessage.setText("\n\n بحيرة سد وادي العقيق: أكبر سد بالمنطقة ويعتبر سد وادي العقيق محط أنظار السائحين وذلك بسبب موقعه وسط الطبيعة الخلابة والساحرة والغابات والأشجار الخضراء.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=20.2296907,41.5599937 \n" );
            }
            // قلوة
            // الأماكن السياحية - قلوة
            else if(data.equals("منتزه الفرشه")){
                sendMessage.setText("\n\n منتزه الفرشة: منتزه رائع و جميل يوجد به العاب اطفال ومطلات جميلة وجلسات و ممرات للمشي، مساحات خضراء طبيعية و شلال ماء و مسرح مفتوح. اجتمع فيه جمال الطبيعة و لطف الجو و تنسيق البلدية الرائع.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.8857388,41.31168429999999 \n" );
            }
            else if(data.equals("جبل شدا الأعلى")){
                sendMessage.setText("\n\n جبل شدا الاعلى: أعلى جبل في سهل تهامة، تغلب على تضاريس الجبل الصخور الملساء، مما يعطي الجبل لونًا أزرق باهت، يوجد بالجبل مبنى للإمارة ومدرسة ومركز صحي، ويتوفر التيار الكهربائي أيضًا.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.8499523,41.3178221 \n" );
            }
            // التراث والثقافة - قلوة
            else if(data.equals("قرية الخلف والخليف")){
                sendMessage.setText("\n\n قرية الخلف والخليف الأثرية: الخلف و الخليف هما موقعان لقريتين متجاورتين يعود تاريخهما إلي العصور الإسلامية المتوسطة ، وتقع على قمة التل وتتميز القرية المساجد التي يوجد عليها نقوش وكتابات إسلامية في كلا الموقعين معظمها كتب بالخط الكوفي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.968923,41.2263612 \n" );
            }
            // محايل عسير
            // الأماكن السياحية - محايل عسير
            else if(data.equals("معرض ومتحف محايل عس")){
                sendMessage.setText("\n\n متحف ومعرض محايل عسير: متحف يحتوي على أكثر من ألف قطعه أثرية وتراثية، وبعض المخطوطات القديمة والأسلحة إلى جانب بعض الأدوات المستخدمة في الزراعه وتجهيز الطعام .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.545981,42.071285 \n" );
            }
            else if(data.equals("جادة الفن")){
                sendMessage.setText("\n\n جادة الفن: جادة محايل تشتمل على مناشط اجتماعية وثقافية وخدمية، مثل ركن الأسر المنتجة، ومجلس الطيبين، ومعرض جمعية رعاية المعاقين.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.5159805,42.0632101 \n" );
            }
            // التسوق - محايل عسير
            else if(data.equals("الواحة مول")){
                sendMessage.setText("\n\n الواحة مول : تسعى مجموعة الواحة مول إلى منح كافة روّادها أقصى حدود الرفاهية، من صالات الطعام المنمّقة إلى المقاهي العصرية ومواقف السيارات الفسيحة ، ويضم المجمع عدد كبير من العلامات التجارية البارزة والماركات العالمية المتنوعة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.5521761,42.0400834 \n" );
            }
            else if(data.equals("السوق الشعبي الشعبي")){
                sendMessage.setText("\n\n السوق الشعبي: يعتبر من أقدم الاسواق في منطقة عسير ويحظى بإقبال من المتسوقين، حيث يتميز بأنه يفتح ابوابه على مدار الأسبوع وتتنوع فيه المنتجات المحلية والتراثية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.5466275,42.0481914 \n" );
            }
            else if(data.equals("المكان مووول")){
                sendMessage.setText("\n\n المكان مول : يضم مجموعة من متاجر الماركات العالمية ، إضافة إلى ساحة تضم أشهر وأرقى المطاعم والمقاهي ، مع منطقة ترفيهية للأطفال.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.5378663,42.0575272 \n" );
            }
            else if(data.equals("البساتين مووول")){
                sendMessage.setText("\n\n  البساتين مول: مجمع تجاري هو الاكبر بالمدينة بساحة كبيرة داخلية مفتوحة، يوجد به العديد من المحلات مع عدد معقول من الكشكات المتوزعه بالساحة، كما يوجد به منطقة ترفيهية للأطفال.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.5485877,42.0352015 \n" );
            }
            // خميس مشيط
            // الأماكن السياحية - خميس مشيط
            else if(data.equals("بحيرة سد وادي تن")){
                sendMessage.setText("\n\n بحيرة سد وادي تندحة : تتنوع معطيات الجمال الطبيعي على ضفافه ما بين جداول المياه، والمسطحات الخضراء، والتشكيلات الصخرية، والمساحات المفتوحة ذات الأشجار المتنوعة التي تحيط بالمكان من كافة اتجاهاته.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.311607,42.880296 \n" );
            }
            else if(data.equals("بوليفارد الخميس")){
                sendMessage.setText("\n\n بوليفارد الخميس: يعتبر من المجمعات التجارية المميزة، تم تصميمها على أحدث الطرازات العالمية ويضم العديد من العلامات التجارية المشهورة، بالإضافة إلى صالات تسوق مختلفة ومدينة ألعاب.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2749788,42.7198042 \n" );
            }
            // التسوق - خميس مشيط
            else if(data.equals("المكان مول موول")){
                sendMessage.setText("\n\n المكان مول : أكبر وأحدث مول في خميس مشيط  ويضم مجموعة من متاجر الماركات العالمية ، إضافة إلى ساحة تضم أشهر وأرقى المطاعم والمقاهي ، مع منطقة ترفيهية للأطفال.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.3230619,42.75303439999999 \n" );
            }
            else if(data.equals("اصداف مول")){
                sendMessage.setText("\n\n أصداف مول: أحد مولات خميس مشيط المُتميّزة في عرض كل ما يهم الأسرة العربية، كما يُوفر المول منطقة ترفيهية للأطفال بما في ذلك صالة للبولينج، إلى جانب ساحة تضم أرقى المطاعم العربية والعالمية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.3057158,42.73217260000001 \n" );
            }
            else if(data.equals("الخميس افينيو")){
                sendMessage.setText("\n\n الخميس افينيو مول: يعتبر أحد الأماكن التسوقية والترفيهية الجيدة بالمدينة، يحتوي على العديد من محلات العلامات التجارية العالمية الفاخرة و الراقية، كما يضم عدداً من المقاهي والمطاعم المميزة، يحتل سوق هايبر بنده جزء كبير من مساحة الطابق الأول.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2464814,42.76568 \n" );
            }

            // التراث والثقافة - خميس مشيط
            else if(data.equals("متحف بن عفيصان")){
                sendMessage.setText("\n\n متحف ابن عفيصان: يضم المتحف كثير من التراثيات المثيرة والملفتة للنظر.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.3306486,42.7539309 \n" );
            }
            else if(data.equals("قرية بن حمسان")){
                sendMessage.setText("\n\n قرية ابن حمسان التراثية: هي واحدة من القرى السياحية ذات الطابع المعماري التراثي ،وقد أصبحت من أشهر القرى على مستوى منطقة عسير، وقد زار القرية عدد من كبار الشخصيات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2965483,42.7578386 \n" );
            }
            else if(data.equals("مدينة جرش")){
                sendMessage.setText("\n\n مدينة جرش الأثرية: يحتوي الموقع على بقايا مبان ضخمة بعضها من الحجارة وأخرى من الطين، كما تضم معثورات يعود تاريخها إلى فترة ما قبل الإسلام، وقد اشتهرت بصناعاتها الجلدية والحربية .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2027875,42.8243873 \n" );
            }
            // النماص
            // الأماكن السياحية - النماص
            else if(data.equals("بحيرة وادي ترج")){
                sendMessage.setText("\n\n بحيرة وادي ترج: يعد سـد وادي ترج من السدود العملاقة، ويعد متنفساً لأهالي المحافظة، حيث يقوم فرع وزارة المياه بالمحافظة بالإشراف عليه وصيانته المستمرة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.1505141,42.2047404 \n" );
            }
            else if(data.equals("بحيرة وادي بدوة")){
                sendMessage.setText("\n\n بحيرة وادي بدوة : سد بدوة هو سد خرساني لتوفير المياه، يتبع لقرية ذات طبيعة خلابة كما تحتوي على منتزه سد بدوة الذي يعد واجهة سياحية مميزة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.1659262,42.1643703 \n" );
            }
            else if(data.equals("قرية المقر السياحية")){
                sendMessage.setText("\n\n قرية المقر السياحية: قرية تراثية سياحية، تضم أجمل القصور التاريخية على مر التاريخ وهو قصر المقر، يتميز القصر ببنائه المعماري القديم الذي يحمل عبق التاريخ الإسلامي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.1178664,42.1190323 \n" );
            }
            else if(data.equals("منتزه الأمير سلطان ب")){
                sendMessage.setText("\n\n منتزه الأمير سلطان بن سلمان: تعد من ضمن الحدائق والمنتزهات المميزة بتصميمها بأشكال هندسية منوعة، وتشمل شبكات ري ومظلات للجلوس وألعاب أطفال ومصلى للرجال وللنساء، إلى جانب المرافق المساندة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.09619409999999,42.1195033 \n" );
            }
            // التراث والثقافة - النماص
            else if(data.equals("قرية آل عطيفه")){
                sendMessage.setText("\n\n قرية آل عطيفة التاريخية: تجسد تاريخًا عريقًا منذ مئات السنين، بمبانيها الأثرية، ومساجدها، وطبيعتها الساحرة في مرتفعات منطقة عسير، فبها عدة جبال ووديان تمر منها أو تصب فيها، من أشهرها وادي سفاه، ووادي السود.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.328492,42.042068 \n" );
            }
            else if(data.equals("قرية آل عليان")){
                sendMessage.setText("\n\n قرية آل عليان التراثية: تقع هذه القرية التاريخية على سفوح جبال السروات، يوجد بها متحف تراثي وتحتوي على الكثير من الاثار، حيث تجد اهتماماً بالغاً من الحكومة وهيئة السياحة والتراث الوطني.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.2913879,42.063657 \n" );
            }
            else if(data.equals("متحف قرية الفضول")){
                sendMessage.setText("\n\n متحف قرية الفضول : يقع متحف قرية الفضول داخل بناء مسلح يتكون من 6 قاعات تضم كل قاعة قسم تراثي مختلف من أسلحة وألبسة وحلي وغيره.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.1567391,42.15313880000001 \n" );
            }
            else if(data.equals("قرية صدريد التراثية")){
                sendMessage.setText("\n\n قرية صدريد التراثية: تمتاز بالعديد من المنازل والقلاع التاريخية تم بناؤها على نمط معماري فريد ومميز، الأمر الذي جعل منها تحفة إلا أن أهم ما تميزت به القرية من تلك المباني هو ذلك المسجد الأثري والذي بني في عهد هارون الرشيد.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.1685667,42.111446 \n" );
            }
            else if(data.equals("قصر ثربان التاريخي")){
                sendMessage.setText("\n\n قصر ثربان التاريخي: ويضم هذا القصر آلاف الزخارف الإسلامية و يوجد الفناء المكون من الشقق الخلفية والمراحيض لخدمة الزوار ويحتوي أيضًا على حديقة للحيوانات للزائرين.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.1212453,42.1300239 \n" );
            }
            else if(data.equals("قرية آل نييح")){
                sendMessage.setText("\n\n قرية آل نييح التراثية: تعد من القرى التي لاتزال تحافظ على طابعها المعماري القديم، يوجد بالقرية قرابة 122 مسكنا قديما، إضافة إلى الحدائق التي تظهر جمال المكان وعبق الماضي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.1172807,42.1325191 \n" );
            }
            //رجال أالمع
            // الأماكن السياحية - رجال أالمع
            else if(data.equals("قرية رجال ألمع الت")){
                sendMessage.setText("\n\n قرية رجال ألمع التراثية:  تشتهر بهندستها المعمارية العربية التقليدية، وتضم مجموعة من المنازل الساحرة والملونة، وتتمتع بمناظر خلابة لها تاريخ عظيم وميزات استثنائية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2117826,42.2745816 \n" );
            }
            else if(data.equals("مطل منتزه رجال")){
                sendMessage.setText("\n\n مطل منتزه رجال ألمع (مطل الحبيل): يعتبر من أجمل المطلات في تهامة عسير ، حيث يمتاز بسعة موقعه وإطلالته الجميلة على مركز الحبيل ، كما يمتاز أيضاً بقربة من مهرجان العسل الذي يقام سنوياً في مركز الحبيل .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.0745979,42.2233283 \n" );
            }
            // المجاردة
            // الأماكن السياحية - المجاردة
            else if(data.equals("جبل تهوي")){
                sendMessage.setText("\n\n جبل تهوي: يتميز بقامته المديدة ومناظره الخلابة الفاتنة تجبر من يزوره أن يهوى الطبيعة الساحرة ويتمنى قضاء وقت فوق هاماته الخضر يلامس السحاب ويتفكر في صنع رب العزة والجلال.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.111891,41.9841073 \n" );
            }
            else if(data.equals("قرية ربوع بلادي")){
                sendMessage.setText("\n\n قرية ربوع بلادي: قرية رائعة تعد علامة فارقة في رسم التراث والموروث الشعبي في المجاردة بما تحويه في قصر التراث والمسرح المفتوح ودور الإيواء وإطلالتها الساحرة على وادي جريه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.1265121,41.92158510000001 \n" );
            }
            // الأماكن السياحية - بيشة
            else if(data.equals("قصر بن هتيل")){
                sendMessage.setText("\n\n قصر هتيل التاريخي: يضم ثلاثة طوابق تضم عددا كبيرا من القطع الأثرية والتراثية التي تعكس تاريخ محافظة بيشة و المناطق المجاورة لها.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=20.0451519,42.6075537 \n" );
            }
            else if(data.equals("بحيرة سد الملك")){
                sendMessage.setText("\n\n بحيرة سد الملك فهد: مشروع يعكس عظمة الإنجاز يعد السد أكبر سد خرسانى فى منطقة الشرق الاوسط من حيث الحجم والطاقة التخزينية ويقع جنوب غرب مدينة بيشة بمسافة أربعين كيلو مترا.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.6775211,42.4810498 \n" );
            }

            // الأماكن السياحية - بلقرن
            else if(data.equals("بحيرة شيبانه")){
                sendMessage.setText("\n\n بحيرة سد شيبانة: تُعد أحد المواقع السياحية البارزة لما تضفيه البحيرة من جمال طبيعي، ستجد فيها الراحة والمتعة حيث الجمال الطبيعي للموقع المحاذي لبحيرة السد.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.5868863,41.9278662 \n" );
            }
            else if(data.equals("مرتفعات عقبة السقيفة")){
                sendMessage.setText("\n\n عقبة مرتفعات السقيفة: عقبة جميلة وتعد من أفضل و أسهل عقبة لجميع انواع السيارات لتصل بمنطقة تهامة في شمران او الصعود الى منطقة باشوت في محافظة بلقرن بالحجاز.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.5249856,41.8891291 \n" );
            }
            // الأماكن السياحية - بللسمر
            else if(data.equals("مرتفعات شعف بللسمر")){
                sendMessage.setText("\n\n مرتفعات شعف بللسمر: تحتوي على مظلات ومنطقة للألعاب وطرق مسفلتة سهلة الوصول إليها.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=23.9078755,42.9162861 \n" );
            }
            else if(data.equals("بحيرة سد الغرابة")){
                sendMessage.setText("\n\n بحيرة سد الغرابة: يعد من السدود الكبيرة لتوفير المياه المحلاة، يقع السد بلونه الزمردي في ملتقى اكبر الأودية القادمة من السراة بين جبال جرداء.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.7891953,42.305144 \n" );
            }
            else if(data.equals("بحيرة سد الخلصه")){
                sendMessage.setText("\n\n بحيرة سد الخلاصة: إلى الغرب من السد تتموضع جبال الطرقة ذات الارتفاع الشاهق، كما يوجد حديقة قريبة من سد \"الخلصة\" بمجهودات البلدية الذاتية، لتخدم الأهالي والزوار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.7670194,42.2607857 \n" );
            }
            // الأماكن السياحية - تنومه
            else if(data.equals("منتزه المحفار")){
                sendMessage.setText("\n\n منتزه المحفار: ومن مناطق الجذب الذي تحيط به الجبال والأشجار الخضراء الكثيفة إلى جانب الأشجار العطرية المختلفة مثل الزعتر والنعناع والريحان وغيرها وتلفه خيوط الضباب.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.9654417,42.1362732 \n" );
            }
            else if(data.equals("منتزه الشرف")){
                sendMessage.setText("\n\n منتزه الشرف: هو اعلى من منتزة المحفار يتمتع بالمسطحات الخضراء والجو الهادئ الجميل، يحتوي على مجموعة كبيرة متنوعة من النباتات والحيوانات في طبيعية خلابة و رائعة .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.9485176,42.1498605 \n" );
            }
            else if(data.equals("مرتفعات الحيفه")){
                sendMessage.setText("\n\n مرتفعات الحيفة: تطل على تهامة، وقد اشتهرت بأشجار الطلح و العتم و العرعر وبعض التكوينات الصخرية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.9915358,56.3453744 \n" );
            }
            // التراث والثقافة - تنومه

            else if(data.equals("قرية تنومه التراثية")){
                sendMessage.setText("\n\n  قرية تنومه التراثية: متحف تراثي يضم بين جنباته مئات القطع القديمة في شتى مجالات الحياة الاجتماعية والاقتصادية والزراعية والتجارية ويسمح للزائر بتجربة السكن في البيت طوال اليوم والليلة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.9290182,42.1770246 \n" );
            }
            // الأماكن السياحية - بللحمر
            else if(data.equals("مرتفعات عقبة الجعدة")){
                sendMessage.setText("\n\n عقبة الجعدة: عقبة يكسوها الضباب في معظم أيام السنة، وتعد هذه العقبة أعجوبة هندسية لخطورة الموقع.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6873998,46.7930483 \n" );
            }
            else if(data.equals("قرية بن عضوان التراثية")){
                sendMessage.setText("\n\n قرية بن عضوان التراثية السياحية: تعد أحد أبرز الوجهات السياحية الترفيهية التراثية العملاقة للزوار والوفود السياحية في قمة جبال السروات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.6330521,42.2417175 \n" );
            }
            else if(data.equals("بحيرة وادي عمق")){
                sendMessage.setText("\n\n بحيرة وادي عمق: هو وادي كبير يمتد على طول المنطقة يصب في أكبر اودية الجزيرة العربية وادي تربة تكثر به النباتات بأنواعها وكذلك العدود القديمة والآبار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.4591172,41.4637692 \n" );
            }
            // الأماكن السياحية - القحمة
            else if(data.equals("الواجهة البحرية بالقحمة")){
                sendMessage.setText("\n\n الواجهة البحرية بالقحمة: على شاطئ البحر الأحمر تقع بلدة «القحمة» الساحلية ذات الطبيعة والجزر البكر والشواطئ الحالمة حيث زرقة البحر فيها تسطع وتشتد، والموج يثرثر بلغة الرياح الغربية القادمة بنسائم البحر.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.0037516,38.157831 \n" );
            }
            else if(data.equals("بحيرة وادي ذهبان")){
                sendMessage.setText("\n\n وادي ذهبان: يتميز بطبيعة ساحرة وبمناظر خلابة، حيث يشكل لوحة جمالية آخاذة، بعد ان اكتسى حلة خضراء تجري فيه المياه على مدار العام، وسط غطاء نباتي جيد.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2511981,41.6888925 \n" );
            }
            else if(data.equals("شاطئ البرك")){
                sendMessage.setText("\n\n شاطئ البرك: يشكل إطلالة بحرية رائعة تستوقف العابرين في منظر جمالي مُثير، ويعد من الشواطئ ذات الأجواء الربيعية البحرية الجميلة والشعب المُرجانية المتنوعة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.221549,41.534604 \n" );
            }
            else if(data.equals("الواجهة البحرية بالحضرية")){
                sendMessage.setText("\n\n الواجهة البحرية بالحريضة: تحوي مسافة 3 كيلو مترات كامل الخدمات المقدمة للمتنزهين، أقيم فيها الكثير من الفعاليات المتنوعة التي جذبت آلاف المتنزهين.\n\n" + "\n https://www.google.com/maps/place/17%C2%B044'31.3%22N+41%C2%B057'06.8%22E/@17.7420125,41.9518955,15z \n" );
            }
            else if(data.equals("جزيرة كدمبل")){
                sendMessage.setText("\n\n جزيرة كدمبل: جزيرة برمال بيضاء وجبل، تحيطها مياه زرقاء وسحاب، يلفها الهدوء وأصوات الطيور، إحدى أجمل المناطق السياحية في المملكة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.8918461,41.6915609 \n" );
            }
            // أبها
            // الأماكن السياحية - أبها
            else if(data.equals("القرية العالية")){
                sendMessage.setText("\n\n المدينة العالية: عبارة عن متنفس ووجهة سياحية في أبها وعسير للسياح من خارج السعودية، تضم العديد من المطاعم والمقاهي والمنتجعات والفنادق والفلل السكنية لتلبية احتياجات السياح والزوار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.5086238,39.70648149999999 \n" );
            }
            else if(data.equals("قرية الحبلة السياحية")){
                sendMessage.setText("\n\n قرية الحبلة السياحية: هي قرية أثرية وتراثية وسياحية ، وتعد بلدة نموذجية ذات خدمات متكاملة تخدم سكانها، كما يوجد بها وسيلة نقل بالكابلات للسياح وزوار المكان.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.030043,42.8540403 \n" );
            }
            else if(data.equals("شارع الفن")){
                sendMessage.setText("\n\n شارع الفن: عبارة عن شارع مزين بقطع فنية مذهلة، يضم صالات لإقامة الحفلات والعديد من المطاعم والمقاهي المميزة، كما تنتشر فيه الأشجار المورقة وتصطف على طوله المظلات الملونة الفريدة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2147279,42.49360539999999 \n" );
            }
            else if(data.equals("قرية المفتاحة السياحية")){
                sendMessage.setText("\n\n قرية المفاتحة السياحة: تمزج مبانيها المتلاصقة على امتداد الممرات الداخلية والخارجية بين الألوان الزاهية إلى جانب أحدث الطراز المعمارية التي تعكس التراث الأصيل للمملكة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2127325,42.4933704 \n" );
            }
            else if(data.equals("الجبل الأخضر")){
                sendMessage.setText("\n\n الجبل الأخضر: يُعتبر واحداً من أهم وأبرز الوجهات السياحيّة في المدينة؛ وذلك بسبب ارتفاعه وإطلالته الرائعة التي تكشف جميع معالم أبها.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2046855,42.5062038 \n" );
            }
            else if(data.equals("منتزهات بحيرة سد أبها")){
                sendMessage.setText("\n\n منتزه بحيرة سد أبها: تعج المنطقة المحيطة ببحيرة سد أبها بالحدائق والجلسات العائلية والعديد من المرافق الترفيهية والسياحية كالفنادق والمطاعم كما تتوفر خدمة استئجار القوارب للتنزه داخل البحيرة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2116134,42.48672579999999 \n" );
            }
            else if(data.equals("كورنيش الضباب")){
                sendMessage.setText("\n\n كورنيش الضباب: ممشى الضباب الواقع على قمم جبال أبها والذي يُعد من أجمل العجائب الطبيعية في المملكة العربية السعودية، حيث يعطي الزوار شعوراً وكأنهم يتجولون بين السحب.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.1995772,42.5081973 \n" );
            }
            else if(data.equals("حديقة المطار")){
                sendMessage.setText("\n\n حديقة المطار:  تُعد أكبر حديقة في منطقة عسير، وتشمل مجموعة من المساحات الخضراء الشاسعة ومناطق ألعاب الأطفال ونافورة تتوسط الحديقة ومن أبرز عناصر حديقة المطار هو المجرى المائي وتتوزع عليه ثلاثة جسور خشبية بتصاميم مذهلة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2405604,42.6453852 \n" );
            }
            else if(data.equals("بحيرة سد ضبوعي")){
                sendMessage.setText("\n\n بحيرة سد ضبوعي : يتميز سد ضبوعي بوفرة مياهه وكذلك تحيط به الكثير من الأشجار والجبال التي تشكل منظراً جميلاً يسر الناظرين من الزوار والسائحين.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.3674642,42.36174269999999 \n" );
            }
            else if(data.equals("منتزه الشلال")){
                sendMessage.setText("\n\n منتزه الشلال: تعد حديقة الشلال واحدة من أجمل المنتزهات فى مدينة أبها، حيث تنعم بموقع فريد على جبل Waterfall Park مما منحها إطلالة خلابة على الجبال.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2315793,42.5005299  \n" );
            }
            else if(data.equals("منتزه السلام")){
                sendMessage.setText("\n\n منتزه السلام: يُعد منتزه السلام أبها، من المُنتزهات الترفيهية الرائعة، حيث الطبيعة الخلابة الواسعة التي يتمتع بها جميع أفرد العائلة، وبالإضافة أيضاً إلى، مجموعة متنوعة من المرافق و الخدمات الترفيهية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.0062779,43.3715826 \n" );
            }
            else if(data.equals("بحيرة سد وادي عش")){
                sendMessage.setText("\n\n بحيرة سد وادي عشران: يعد من السدود التي تجذب العديد من الزوار والسياح حيث ستستمتعون بمنظر المياه والمشاهد الطبيعية حول هذا السد من مرتفعات وخضرة، إلى جانب الأجواء العليلة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2681706,42.4353121 \n" );
            }
            else if(data.equals("حديقة ملهمتي الفنية")){
                sendMessage.setText("\n\n حديقة ملهمتي الفنية: تم أنشاؤها من قبل مجموعة شبابية محلية تهدف إلى تقديم رسائل هادفة بواسطة الفن.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2132036,42.4902356 \n" );
            }
            else if(data.equals("حديقة أبها الجديدة")){
                sendMessage.setText("\n\n حديقة أبها الجديدة: حديقة عامة تجذب العديد من العائلات حيث تتضمّن مساحات خضراء واسعة مناسبة لممارسة العديد من الأنشطة الخارجية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2106233,42.48500560000001 \n" );
            }
            else if(data.equals("منتزه أبو خيال")){
                sendMessage.setText("\n\n منتزه أبو خيال: يمتاز بإطلالته الرائعة والجميلة على مدينة أبها، و هو من أكثر منتزهات ابها التي تحث زائرها على الاستجمام والاسترخاء .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.1998646,42.49962300000001 \n" );
            }
            else if(data.equals("قرية السودة السياحية")){
                sendMessage.setText("\n\n قرية السودة السياحية: هي قرية سياحية تكسو جبالها أشجار العرعر الكثيفة مكونة غابات طبيعية خلابة، كما يوجد فيها منتزه يعد من أهم المعالم السياحية في المملكة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2610717,42.3772023 \n" );
            }
            else if(data.equals("مطل العقبة")){
                sendMessage.setText("\n\n مطل العقبة: مطل إطلالة رائعه على الجبال وبين الجبال قريب من أبها، مكان رائع والجلسات متنوعة ودورات مياه ومطل بارد، لكن يجب توخي الحذر والانتباه للاطفال حيث أنه مكان وعر.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.1823779,42.507223 \n" );
            }
            // المنتزهات والترفيه - أبها
            else if(data.equals("شارع الفن")){
                sendMessage.setText("\n\n شارع الفن: عبارة عن شارع مزين بقطع فنية مذهلة، يضم صالات لإقامة الحفلات والعديد من المطاعم والمقاهي المميزة، كما تنتشر فيه الأشجار المورقة وتصطف على طوله المظلات الملونة الفريدة.\n\n" + "\n https://goo.gl/maps/SVKwAAUWEfURtg5W6 \n" );
            }
            else if(data.equals("مجمع شرفة")){
                sendMessage.setText("\n\n مجمع شرفة: يقع على الحزام الدائري في مدينة أبها والذي يعد الأكثر حيوية و نشاطاً على الإطلاق ويجاور الموقع العديد من نقاط الجذب السياحية و الأماكن المهمة.\n\n" + "\n https://goo.gl/maps/d9rVSSmyMzDCgsW38 \n" );
            }
            else if(data.equals("المدينة العالية")){
                sendMessage.setText("\n\n المدينة العالية: عبارة عن متنفس ووجهة سياحية في أبها وعسير للسياح من خارج السعودية، تضم العديد من المطاعم والمقاهي والمنتجعات والفنادق والفلل السكنية لتلبية احتياجات السياح والزوار.\n\n" + "\n https://goo.gl/maps/B4CBWwUeNqPegkWp6 \n" );
            }
            else if(data.equals("قصور آل سراح")){
                sendMessage.setText("\n\n قصور آل سراح: تعتبر هذه القصور التي تتربع على مساحة تزيد عن 3000م، أحد أبرز القصور التاريخية والتي تجاوز عمرها 200 عاما.\n\n" + "\n https://goo.gl/maps/8nKxoJ2AzNXhmy2N9 \n" );
            }
            else if(data.equals("قصور وقلاع")){
                sendMessage.setText("\n\n قصور وقلاع أبو نقطة: تضم عدة مواقع تاريخية وتراثية هامة، أبرزها مسجد طبب والذي أسسه الأمير عبد الوهاب بن عامر أبو نقطة المتحمي عام 1221 هـ.\n\n" + "\n https://goo.gl/maps/Cw8ZysKrDehmQtw57 \n" );
            }
            else if(data.equals("البوليفااارد")){
                sendMessage.setText("\n\n البوليفارد: مجمع تجاري مفتوح يجمع بين أمتع تجارب تناول الطعام والقهوة حيث يحتوي على أشهر المطاعم والكافيهات.\n\n" + "\n https://goo.gl/maps/EXCJGsWqUUNyiEKg6 \n" );
            }
            else if(data.equals("ريفر سايد")){
                sendMessage.setText("\n\n ريفر سايد: كافيه بستايل ريفي مُميز .\n\n" + "\n https://goo.gl/maps/McJSv9KYcBLTJHHc9 \n" );
            }
            else if(data.equals("الحديقة الزجاجية")){
                sendMessage.setText("\n\n الحديقة الزجاجية: مطعم حديقة ابها الجديدة الجلسات جميلة و تطل على البحيرة، توجد ألعاب و ملاهي كثيرة للأطفال.\n\n" + "\n https://goo.gl/maps/41fbbdaLcBuVSeABA \n" );
            }
            else if(data.equals("سماش تايم")){
                sendMessage.setText("\n\n سماش تايم: لأول مره في المملكة غرفة التحطيم هي عباره عن صاله ترفيهيه من دون حدود أو قيود.\n\n" + "\n https://goo.gl/maps/Z2VpZwTbfthx7muu6 \n" );
            }
            else if(data.equals("نادي الفيصل للفروسية")){
                sendMessage.setText("\n\n نادي الفيصل للفروسية: هو نادي لركوب الخيل الحر، دورات قفز حواجز، رماية حره بالسهام.\n\n" + "\n https://goo.gl/maps/wGFhv4XnoGMcH1Qo6 \n" );
            }
            else if(data.equals("التلفريك")){
                sendMessage.setText("\n\n التلفريك: تعتبر عربات التلفريك من عوامل الجذب السياحي في منطقة عسير، حيث تمنح السائح وزائر المنطقة فرصة الاستمتاع بالطبيعة الخلابة، ومشاهدة أبرز المعالم الطبيعية عبر 4 محطات تتوزع بين مدينة أبها ومتنزهي السودة و الحبلة.\n\n" + "\n https://goo.gl/maps/AFpLW16wdit993Qp7  \n" );
            }
            // الطبيعة والبيئة - أبها
            else if(data.equals("شارع الفن")){
                sendMessage.setText("\n\n شارع الفن: عبارة عن شارع مزين بقطع فنية مذهلة، يضم صالات لإقامة الحفلات والعديد من المطاعم والمقاهي المميزة، كما تنتشر فيه الأشجار المورقة وتصطف على طوله المظلات الملونة الفريدة.\n\n" + "\n https://goo.gl/maps/SVKwAAUWEfURtg5W6 \n" );
            }
            else if(data.equals("جسر السودة")){
                sendMessage.setText("\n\n جسر السودة: مقابل مبنى التلفريك، يزيد عمر الجسر الخشبي في سودة عسير على ثلاثين عامًا، ويوجد في منتزه السودة ويوصل الى مواقع مطلة حيث يخترق اشجار العرعر في منظر جمالي خصوصًا اوقات المطر.\n\n" + "\n https://goo.gl/maps/nd15yR15SMnkkE2B6 \n" );
            }
            else if(data.equals("شلال النخبة")){
                sendMessage.setText("\n\n شلال النخبة: من أجمل الشلالات فى مدينة أبها مما منحها إطلالة خلابة على الجبال.\n\n" + "\n https://goo.gl/maps/C8PWHorwBuvMm9M48 \n" );
            }
            else if(data.equals("عين الذيبة")){
                sendMessage.setText("\n\n عين الذيبة: تُعد عين الذيبة واحدة من أبرز معالم الجذب الطبيعية في مدينة أبها، فهي تقع في حديقة السودة الوطنية الخلابة، وتضم مجموعة من الشلالات المذهلة وذات المياه العذبة، وتحيط بها مجموعة من المنحدرات الصخرية المميزة.\n\n" + "\n https://goo.gl/maps/GS4F3kpMG7EKQ1aY8 \n" );
            }
            else if(data.equals("حديقة أبو خيال")){
                sendMessage.setText("\n\n منتزه أبو خيال: يمتاز بإطلالته الرائعة والجميلة على مدينة أبها، و هو من أكثر منتزهات ابها التي تحث زائرها على الاستجمام والاسترخاء .\n\n" + "\n https://goo.gl/maps/yBJ62vLTQgNLnhrK6 \n" );
            }
            else if(data.equals("منتزه المسقي")){
                sendMessage.setText("\n\n منتزه المسقي: يعتبر واحدا من أفضل المنتزهات بمنطقة عسير، و يتميز بالمناظر الطبيعية الجميلة والخلابة، كما تقدر مساحته بنحو 1.3 مليون متر مربع معظمها من الجبال تغطيها أشجار العرعر، بالإضافة إلى عدة أنواع من الشجيرات.\n\n" + "\n https://goo.gl/maps/5r47q3idAjnUWdez6 \n" );
            }
            else if(data.equals("بني مازن")){
                sendMessage.setText("\n\n قرية بني مازن: تجمع ما بين الطبيعة الخلابة من مدرجات زراعية على المرتفعات ومزارع أخرى في واديها، وتحوي تراثاً عريقاً في كثير من بيوتها القديمة.\n\n" + "\n https://goo.gl/maps/EV86WnZjit6rnJm76  \n" );
            }
            else if(data.equals("الحبلة")){
                sendMessage.setText("\n\n الحبلة: لحبلة ابها واحدة من أجمل منتزهات المدينة والتي تجمع بين كل ما هو بديع، فتمتلك طبيعة خلابة لا تُضاهى، وإطلالات من على ارتفاع شاهق يمكّنك من مشاهدة المدينة بأكملها ومعالمها المتميزة.\n\n" + "\n https://goo.gl/maps/gza7urogdk5VXXf96 \n" );
            }
            else if(data.equals("وادي البرداني")){
                sendMessage.setText("\n\n وادي البَرْدَاني: من أجمل أودية محافظة بارق، في أعلاه قرى ومدرجات زراعية، وفي أسفله روضة غناء جميلة وارفة الظلال يمتاز بجريان الماء طوال العام، وبخضرته الدائمة.\n\n" + "\n https://goo.gl/maps/ZY3D9nQh42ALKmyo9 \n" );
            }
            else if(data.equals("رجال ألمع")){
                sendMessage.setText("\n\n رية رجال ألمع التراثية:  تشتهر بهندستها المعمارية العربية التقليدية، وتضم مجموعة من المنازل الساحرة والملونة، وتتمتع بمناظر خلابة لها تاريخ عظيم وميزات استثنائية.\n\n" + "\n https://goo.gl/maps/f7XJSRojAxBYLdrX8 \n" );
            }
            else if(data.equals("التلفريك")){
                sendMessage.setText("\n\n التلفريك: تعتبر عربات التلفريك من عوامل الجذب السياحي في منطقة عسير، حيث تمنح السائح وزائر المنطقة فرصة الاستمتاع بالطبيعة الخلابة، ومشاهدة أبرز المعالم الطبيعية عبر 4 محطات تتوزع بين مدينة أبها ومتنزهي السودة و الحبلة.\n\n" + "\n https://goo.gl/maps/AFpLW16wdit993Qp7 \n" );
            }
            else if(data.equals("السودة")){
                sendMessage.setText("\n\n السودة: تقع منطقة السودة على ارتفاع 3000 متر عن سطح البحر، على جانب أعلى جبل في المملكة العربية السعودية، تكسوها جبال العرعر ويغطيها الضباب طوال العام، وتتميز أجواءها بالبرودة صيفاً، وتضم المنتزه الوطني الذي يعتبر وجهة سياحية رائعة للتخييم وهواة المشي والتسلق الجبلي، كما أصبحت السودة وجهة للعديد من الأنشطة والفعاليات الرياضية خلال الصيف.\n\n" + "\n https://goo.gl/maps/ZQjmpWpRojxWkGnm7 \n" );
            }
            // التراث والثقافة - أبها
            else if(data.equals("متحف الأجيال")){
                sendMessage.setText("\n\n متحف الأجيال: أكثر متاحف ابها الخاصة من حيث تكلفة الإنشاء، يضم المتحف سوقًا لمُنتجات الأسر المُنتجة بما فيها الأكلات الشعبية التي تشتهر بها أبها ومنطقة عسير عامةً.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.3139284,42.540177 \n" );
            }
            else if(data.equals("قرية طبب التراثية")){
                sendMessage.setText("\n\n قرية طبب التراثية: من أقدم القرى التاريخية في المنطقة حيث بنيت في عهد الدولة السعودية الأولى وتضم مواقع تاريخية أبرزها مسجد الطبب وقصور أمراء آل أبو نقطة المتحمي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.3673198,42.37012319999999 \n" );
            }
            else if(data.equals("متحف الجحل")){
                sendMessage.setText("\n\n متحف الحجل: هو من أكبر متاحف ابها الخاصة، ويضم المتحف مرافق خاصة لذوي الاحتياجات الخاصة، ومرافق خدمية، ويتميّز ببنائه التقليدي الذي يُشبه بيوت المدينة العتيقة والمنقوشة بزخارف القط .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.3546073,42.3287887 \n" );
            }
            else if(data.equals("قلعة شمسان الأثري")){
                sendMessage.setText("\n\n قلعة شمسان الأثري: جمعت  ‘’قلعة شمسان’’ البعدين التراثي والسياحي شُيدت القلعة بتصميمها الأخير قبل أكثر من مئة عام فكانت البوابة الرئيسة لمدينة أبها من جهة عقبة شعار.\n\n" + "\n  https://www.google.com/maps/search/?api=1&query=18.2252425,42.503335 \n" );
            }
            else if(data.equals("حي البسطه الأثري")){
                sendMessage.setText("\n\n حي البسطة الأثري: أحد أحياء أبها القديمة والتي لازالت تحتفظ بعبق ورائحة الماضي وبساطة الناس في الماضي، وهو حي تراثي يتكون من مجموعة مبان وقلاع أثرية قديمة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2202734,42.49786279999999 \n" );
            }
            else if(data.equals("قصر شدا التاريخي")){
                sendMessage.setText("\n\n قصر شدا التاريخي: يُعد واحد من أهم المعالم التراثية في مدينة أبها، يضم اليوم مجموعة متنوعة من الحرف اليدوية والأدوات المنزلية القديمة وغيرها الكثير من القطع الأثرية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.216653,42.50092720000001 \n" );
            }
            else if(data.equals("متحف عسير الإقليمي")){
                sendMessage.setText("\n\n متحف عسير الإقليمي: هو يعتبر من أهم المتاحف الحكومية في البلاد، إذ يضم هذا المتحف مجموعة رائعة من القطع الأثرية النادرة، والتي توثق الحياة في منطقة عسير الجنوبية في الماضي البعيد.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2164239,42.499212 \n" );
            }
            else if(data.equals("متحف فاطمه")){
                sendMessage.setText("\n\n متحف فاطمة: يتكون المتحف من ثلاثة أركان رئيسة: الأول مخصص لفن القط في منطقة رجال ألمع، والثاني لفن القط في منطقة السراة وبلاد قحطان، أما الركن الثالث فقد تم تخصيصه للملابس التقليدية والمصوغات والحلي الفضية لنساء المنطقة.  \n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.1907058,42.5444651  \n" );
            }
            else if(data.equals("متحف الراقدي")) {
                sendMessage.setText("\n\n متحف الراقدي: والمُلقّب بمتحف الربع قرن ما يجعله واحدًا من أعرق متاحف ابها وأهمها بمُقتنياته ومخطوطاته النادرة التي يصل عددها إلى ألفي قطعة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2043752,42.5051285 \n");
            }
            // التسوق - أبها
            else if(data.equals("الواحة مول")){
                sendMessage.setText("\n\n الواحة مول : تسعى مجموعة الواحة مول إلى منح كافة روّادها أقصى حدود الرفاهية، من صالات الطعام المنمّقة إلى المقاهي العصرية ومواقف السيارات الفسيحة ، ويضم المجمع عدد كبير من العلامات التجارية البارزة والماركات العالمية المتنوعة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.1294886,47.2648774 \n" );
            }
            else if(data.equals("عسير مول")){
                sendMessage.setText("\n\n عسير مول: يتميز بتصميم هندسي عصري ينسجم مع الطبيعة الخلابة للمنطقة، ويضم العديد من العلامات التجارية المحلية والعالمية الشهيرة، كما يضم مجموعة من المطاعم والمقاهي والمرافق الترفيهية المناسبة للعائلات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.239864,42.6043669 \n" );
            }
            else if(data.equals("أبها مول")){
                sendMessage.setText("\n\n أبها مول: يتمتع بموقع رائع فى قلب أبها ، ويتميز بمبناه المستوحى من التراث الأصيل لهذه المنطقة، يضم العديد من المحلات التجاريه التى تخدم كافة أفراد الأسرة ، كما يضم مدينة ترفيهية للأطفال، وأجنحة فندقية راقية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.239864,42.6043669 \n" );
            }
            else if(data.equals("الراشد موول")){
                sendMessage.setText("\n\n الراشد مول: يُعد من أضخم وأفخم مولات أبها وأكثرها شهرة، يتميز بروعة تصميمه الذي يتسم بالأناقة، حيث يعتبر أحد الوجهات السياحية والترفيهية فى المدينة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2369044,42.57985619999999 \n" );
            }
            else if(data.equals("رفالا بلازا")){
                sendMessage.setText("\n\n رفالا بلازا: عبارة عن مركز تسوق كبير يشمل مجموعة متنوعة من المحلات التجارية التي تلبي جميع احتياجات العملاء من مختلف الفئات العمرية، كما يضم العديد من المطاعم والمقاهي المحلية والعالمية الشهيرة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2285614,42.5441156 \n" );
            }
            else if(data.equals("سوق الثلاء الشعبي")){
                sendMessage.setText("\n\n سوق الثلاثاء الشعبي: أحد أبرز المعالم التاريخية في أبها، ويعد من أقدم الأسواق الشعبية في المنطقة. ويتميز السوق بحضور قوي للمنتجات الشعبية، ويديره مجموعة كبيرة من كبار السن.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.2147845,42.4967778 \n" );
            }
            else if(data.equals("ريحانا مول")){
                sendMessage.setText("\n\n ريحانا مول: حد من أفضل المولات في المدينة كونه يضم 65 محلاً تجارياً متنوعاً إلى جانب احتوائه لأكبر صالة ألعاب بمدينة أبها بالكامل، وعدد من المطاعم والمقاهي الشهيرة.\n\n" + "\n https://goo.gl/maps/trt6awrFxFdMLb2G9 \n" );
            }
            else if(data.equals("النخيل بلازا مول")){
                sendMessage.setText("\n\n النخيل بلازا مول: يتمتع النخيل بلازا مول بموقع مميز في مدينة أبها بالسعودية، وهو من وجهات السياحة الشهيرة بالمدينة، يضم المول العديد من المحلات التجارية، التي تعرض مجموعة مميزة من العلامات التجارية المحلية والعالمية.\n\n" + "\n https://goo.gl/maps/xQ3ctYT2TPsebK2B7 \n" );
            }

            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }
    }
}
