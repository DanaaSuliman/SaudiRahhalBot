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

public class MyFirstBot2 extends TelegramLongPollingBot {

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

                if (text.equals("تبوك")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر وجهتك السياحية من تبوك.")
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

                    keyboardButton1.setText("الوجه");
                    keyboardButton2.setText("ضباء");
                    keyboardButton3.setText("أملج");
                    keyboardButton4.setText("حقل");
                    keyboardButton5.setText("تيماء");
                    keyboardButton6.setText("البدع");
                    keyboardButton7.setText("مدينة تبوك");

                    keyboardButton8.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);

                    keyboardRow2.add(keyboardButton4);
                    keyboardRow2.add(keyboardButton5);
                    keyboardRow2.add(keyboardButton6);

                    keyboardRow3.add(keyboardButton7);
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
                } else if (text.equals("الوجه")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في الوجه.")
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


                    keyboardButton1.setText("الأماكن السياحية - الوجه");
                    keyboardButton2.setText("المنتجعات والفنادق - الوجه");
                    keyboardButton4.setText("التراث والثقافة - الوجه");
                    keyboardButton6.setText("الأنشطة - الوجه");

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
                } else if (text.equals("المنتجعات والفنادق - الوجه")) {
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

                } else if (text.equals("الأماكن السياحية - الوجه")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("جزيرة الظهرة");
                    inlineKeyboardButton1.setCallbackData("جزيرة الظهرة");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("كورنيش وشواطئ الوجه");
                    inlineKeyboardButton2.setCallbackData("كورنيش وشواطئ الوجه");

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
                } else if (text.equals("الأنشطة - الوجه")) {
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

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("Hike Mania Trips");
                    inlineKeyboardButton2.setCallbackData("Hike Mania Trips");

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
                } else if (text.equals("التراث والثقافة - الوجه")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("قلعة الزريب التاريخية");
                    inlineKeyboardButton1.setCallbackData("قلعة الزريب التاريخية");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("البلدة القديمة بالوجه");
                    inlineKeyboardButton2.setCallbackData("البلدة القديمة بالوجه");


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
                } else if (text.equals("ضباء")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في ضباء.")
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


                    keyboardButton1.setText("الأماكن السياحية - ضباء");
                    keyboardButton2.setText("المنتجعات والفنادق - ضباء");
                    keyboardButton4.setText("التراث والثقافة - ضباء");
                    keyboardButton6.setText("الأنشطة - ضباء");

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
                } else if (text.equals("المنتجعات والفنادق - ضباء")) {
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


                } else if (text.equals("الأماكن السياحية - ضباء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("وادي الديسه");
                    inlineKeyboardButton1.setCallbackData("وادي الديسه");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("كورنيش وشواطئ ضباء");
                    inlineKeyboardButton2.setCallbackData("كورنيش وشواطئ ضباء");

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
                } else if (text.equals("الأنشطة - ضباء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("Hike Mania Trips");
                    inlineKeyboardButton1.setCallbackData("Hike Mania Trips");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                } else if (text.equals("التراث والثقافة - ضباء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("قلعة الأزنم التاريخية");
                    inlineKeyboardButton1.setCallbackData("قلعة الأزنم التاريخية");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("البلدة القديمة بضباء");
                    inlineKeyboardButton2.setCallbackData("البلدة القديمة بضباء");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("قلعة الملك عبدالعزيز");
                    inlineKeyboardButton3.setCallbackData("قلعة الملك عبدالعزيز ضباء");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("قلعة المويلح التاريخية");
                    inlineKeyboardButton4.setCallbackData("قلعة المويلح التاريخية");


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
                } else if (text.equals("أملج")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في أملج.")
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

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton5 = new KeyboardButton();
                    KeyboardButton keyboardButton6 = new KeyboardButton();


                    keyboardButton1.setText("الأماكن السياحية - أملج");
                    keyboardButton2.setText("المنتجعات والفنادق - أملج");
                    keyboardButton4.setText("التراث والثقافة - أملج");
                    keyboardButton6.setText("الأنشطة - أملج");

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
                } else if (text.equals("المنتجعات والفنادق - أملج")) {
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


                } else if (text.equals("الأماكن السياحية - أملج")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("كورنيش وشواطئ أملج");
                    inlineKeyboardButton1.setCallbackData("كورنيش وشواطئ أملج");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("مرسى الحرة");
                    inlineKeyboardButton2.setCallbackData("مرسى الحرة");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("جزيرة المقيطع");
                    inlineKeyboardButton3.setCallbackData("جزيرة المقيطع");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("جزيرة جبل حسان");
                    inlineKeyboardButton4.setCallbackData("جزيرة جبل حسان");

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
                } else if (text.equals("الأنشطة - أملج")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("Hike Mania Trips");
                    inlineKeyboardButton1.setCallbackData("Hike Mania Trips");

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
                } else if (text.equals("التراث والثقافة - أملج")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("متحف المناخة التراثي");
                    inlineKeyboardButton1.setCallbackData("متحف المناخة التراثي");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("البلدة القديمة بأملج");
                    inlineKeyboardButton2.setCallbackData("البلدة القديمة بأملج");

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
                } else if (text.equals("حقل")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في حقل.")
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

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton5 = new KeyboardButton();

                    keyboardButton1.setText("الأماكن السياحية - حقل");
                    keyboardButton2.setText("المنتجعات والفنادق - حقل");
                    keyboardButton4.setText("التراث والثقافة - حقل");

                    keyboardButton5.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
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
                } else if (text.equals("المنتجعات والفنادق - حقل")) {
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

                } else if (text.equals("الأماكن السياحية - حقل")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("منتزه النخيل");
                    inlineKeyboardButton1.setCallbackData("منتزه النخيل");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("منتزه الأمير فهد بن سلطان البحري");
                    inlineKeyboardButton2.setCallbackData("منتزه الأمير فهد بن سلطان البحري");

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
                } else if (text.equals("التراث والثقافة - حقل")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("حطام سفينة جورجيوس جي");
                    inlineKeyboardButton1.setCallbackData("حطام سفينة جورجيوس جي");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("قلعة الملك عبدالعزيز");
                    inlineKeyboardButton2.setCallbackData("قلعة الملك عبدالعزيز حقل");

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
                } else if (text.equals("تيماء")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في تيماء.")
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

                    keyboardButton1.setText("الأماكن السياحية - تيماء");
                    keyboardButton2.setText("التراث والثقافة - تيماء");

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
                } else if (text.equals("الأماكن السياحية - تيماء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("جبل المحجة");
                    inlineKeyboardButton1.setCallbackData("جبل المحجة");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("حصاة النصلة");
                    inlineKeyboardButton2.setCallbackData("حصاة النصلة");

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
                } else if (text.equals("التراث والثقافة - تيماء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("سور تيماء الأثري");
                    inlineKeyboardButton1.setCallbackData("سور تيماء الأثري");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("قصر الرمان الأثري");
                    inlineKeyboardButton2.setCallbackData("قصر الرمان الأثري");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("منتزه بئر هداج التاريخي");
                    inlineKeyboardButton3.setCallbackData("منتزه بئر هداج التاريخي");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("متحف تيماء للآثار والتراث");
                    inlineKeyboardButton4.setCallbackData("متحف تيماء للآثار والتراث");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("قصر الرضم الأثري");
                    inlineKeyboardButton5.setCallbackData("قصر الرضم الأثري");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("قلعة المعظم التاريخية");
                    inlineKeyboardButton6.setCallbackData("قلعة المعظم التاريخية");


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
                } else if (text.equals("البدع")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في البدع.")
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

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton5 = new KeyboardButton();


                    keyboardButton1.setText("الأماكن السياحية - البدع");
                    keyboardButton2.setText("المنتجعات والفنادق - البدع");
                    keyboardButton4.setText("التراث والثقافة - البدع");

                    keyboardButton5.setText("رجوع");


                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
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
                } else if (text.equals("المنتجعات والفنادق - البدع")) {
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


                } else if (text.equals("الأماكن السياحية - البدع")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("جبل اللوز");
                    inlineKeyboardButton1.setCallbackData("جبل اللوز");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("جزيرة أم عسيله");
                    inlineKeyboardButton2.setCallbackData("جزيرة أم عسيله");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("شواطئ مقنا");
                    inlineKeyboardButton3.setCallbackData("شواطئ مقنا");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("وادي طيب اسم");
                    inlineKeyboardButton4.setCallbackData("وادي طيب اسم");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("شواطئ راس الشيخ حميد");
                    inlineKeyboardButton5.setCallbackData("شواطئ راس الشيخ حميد");


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
                } else if (text.equals("التراث والثقافة - البدع")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("مغائر النبي شعيب");
                    inlineKeyboardButton1.setCallbackData("مغائر النبي شعيب");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("حطام الطائرة المائية كاتلينا");
                    inlineKeyboardButton2.setCallbackData("حطام الطائرة المائية كاتلينا");


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
                } else if (text.equals("مدينة تبوك")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في تبوك.")
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


                    keyboardButton1.setText("الأماكن السياحية - تبوك");
                    keyboardButton2.setText("التسوق - تبوك");
                    keyboardButton3.setText("المنتجعات والفنادق - تبوك");
                    keyboardButton4.setText("المطاعم - تبوك");
                    keyboardButton5.setText("التراث والثقافة - تبوك");
                    keyboardButton7.setText("الأنشطة - تبوك");

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
                } else if (text.equals("المنتجعات والفنادق - تبوك")) {
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


                } else if (text.equals("المطاعم - تبوك")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم تبوك");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g679581-Tabouk_Tabuk_Province.html");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);

                    inlineButtons.add(inlineKeyboardButtonList);

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                } else if (text.equals("الأماكن السياحية - تبوك")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("مجمع ستيشن 67");
                    inlineKeyboardButton1.setCallbackData("مجمع ستيشن 67");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("بحيرة الرايس");
                    inlineKeyboardButton2.setCallbackData("بحيرة الرايس");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("جادة الأمير فهد بن سلطان");
                    inlineKeyboardButton3.setCallbackData("جادة الأمير فهد بن سلطان");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("جرين لاند (حديقة الطيور)");
                    inlineKeyboardButton4.setCallbackData("جرين لاند (حديقة الطيور)");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("منتزه الأمير فهد بن سلطان");
                    inlineKeyboardButton5.setCallbackData("منتزه الأمير فهد بن سلطان");


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
                } else if (text.equals("التراث والثقافة - تبوك")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("متحف محطة سكة حديد الحجاز");
                    inlineKeyboardButton1.setCallbackData("متحف محطة سكة حديد الحجاز");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("متحف تبوك الإقليمي");
                    inlineKeyboardButton2.setCallbackData("متحف تبوك الإقليمي");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("مسجد التوبة التاريخي");
                    inlineKeyboardButton3.setCallbackData("مسجد التوبة التاريخي");

                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    inlineKeyboardButton4.setText("متحف قلعة تبوك الإسلامية");
                    inlineKeyboardButton4.setCallbackData("متحف قلعة تبوك الإسلامية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton5.setText("مطعم ومتحف القرية التراثية");
                    inlineKeyboardButton5.setCallbackData("مطعم ومتحف القرية التراثية");

                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    inlineKeyboardButton6.setText("مركز بن عاصي للتراث والفروسية");
                    inlineKeyboardButton6.setCallbackData("مركز بن عاصي للتراث والفروسية");

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    inlineKeyboardButton7.setText("جبل السفينة في بجدة");
                    inlineKeyboardButton7.setCallbackData("جبل السفينة في بجدة");

                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    inlineKeyboardButton8.setText("عين السكر التاريخية");
                    inlineKeyboardButton8.setCallbackData("عين السكر التاريخية");


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
                } else if (text.equals("التسوق - تبوك")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("ميلاغرو بوتيك");
                    inlineKeyboardButton1.setCallbackData("ميلاغرو بوتيك");

                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton2.setText("تبوك بارك");
                    inlineKeyboardButton2.setCallbackData("تبوك بارك");

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    inlineKeyboardButton3.setText("المكان مول");
                    inlineKeyboardButton3.setCallbackData("المكان مول");


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
                } else if (text.equals("الأنشطة - تبوك")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();


                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("سفاري تبوك");
                    inlineKeyboardButton1.setCallbackData("سفاري تبوك");


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

                //مكة المكرمة
                else if (text.equals("مكة المكرمة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر وجهتك السياحية في مكة المكرمة.")
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


                    keyboardButton1.setText("مدينة مكة المكرمة");
                    keyboardButton2.setText("جدة");
                    keyboardButton3.setText("الطائف");
                    keyboardButton4.setText("القنفذة");
                    keyboardButton5.setText("رابغ");

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

                //مدينة مكة
                else if (text.equals("مدينة مكة المكرمة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في مدينة مكة المكرمة.")
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

                    keyboardButton1.setText("الأماكن السياحية - مكة");
                    keyboardButton2.setText("التسوق - مكة");
                    keyboardButton3.setText("المنتجعات والفنادق - مكة");
                    keyboardButton4.setText("التراث والثقافة - مكة");
                    keyboardButton5.setText("معالم التاريخ الإسلامي - مكة");

                    keyboardButton6.setText("المطاعم - مكة");
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

                //الأماكن السياحية - مكة المكرمة
                else if (text.equals("الأماكن السياحية - مكة")) {

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


                    //First row
                    inlineKeyboardButton1.setText("الحكير تايم الترفيهي");
                    inlineKeyboardButton1.setCallbackData("الحكير تايم الترفيهي");

                    inlineKeyboardButton2.setText("جامع الراجحي");
                    inlineKeyboardButton2.setCallbackData("جامع الراجحي");

                    inlineKeyboardButton3.setText("مصنع كسوة الكعبة المشرفة");
                    inlineKeyboardButton3.setCallbackData("مصنع كسوة الكعبة المشرفة");

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


                //التراث والثقافة - مكة المكرمة

                else if (text.equals("التراث والثقافة - مكة")) {

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

                    //Fourth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();

                    //Fifth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();


                    inlineKeyboardButton1.setText("متحف الدينار الإسلامي");
                    inlineKeyboardButton1.setCallbackData("متحف الدينار الإسلامي");

                    inlineKeyboardButton2.setText("متحف التراث الانساني");
                    inlineKeyboardButton2.setCallbackData("متحف التراث الانساني");

                    inlineKeyboardButton3.setText("متحف أبو بكر العامودي للتراث");
                    inlineKeyboardButton3.setCallbackData("متحف أبو بكر العامودي");

                    inlineKeyboardButton4.setText("متحف مكة للتراث والآثار");
                    inlineKeyboardButton4.setCallbackData("متحف مكة للتراث والآثار");

                    inlineKeyboardButton5.setText("متحف عمارة الحرمين الشريفين");
                    inlineKeyboardButton5.setCallbackData("متحف عمارة الحرمين الشريفين");

                    inlineKeyboardButton6.setText("متحف أم القرى");
                    inlineKeyboardButton6.setCallbackData("متحف أم القرى");

                    inlineKeyboardButton7.setText("متحف الفلك وعلوم الفضاء (برج الساعة)");
                    inlineKeyboardButton7.setCallbackData("متحف الفلك وعلوم الفضاء");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton6);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton7);


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

                //  التسوق - مكة

                else if (text.equals("التسوق - مكة")) {

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

                    //Third row
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();

                    //Fourth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();


                    inlineKeyboardButton1.setText("مكة مول");
                    inlineKeyboardButton1.setCallbackData("مكة مول");

                    inlineKeyboardButton2.setText("الضيافة مول");
                    inlineKeyboardButton2.setCallbackData("الضيافة مول");

                    inlineKeyboardButton3.setText("الحجاز مول");
                    inlineKeyboardButton3.setCallbackData("الحجاز مول");

                    inlineKeyboardButton5.setText("مجمع وقف الملك عبدالعزيز (برج الساعة)");
                    inlineKeyboardButton5.setCallbackData("مجمع وقف الملك عبدالعزيز");

                    inlineKeyboardButton6.setText("مجمع اعمار جبل عمر");
                    inlineKeyboardButton6.setCallbackData("مجمع اعمار جبل عمر");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton6);


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

                //  معالم التاريخ الإسلامي - مكة

                else if (text.equals("معالم التاريخ الإسلامي - مكة")) {

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
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();

                    //Second row
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();

                    //Third row
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();

                    //Fourth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();

                    //Fifth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();

                    //Sixth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();


                    inlineKeyboardButton1.setText("عين زبيدة");
                    inlineKeyboardButton1.setCallbackData("عين زبيدة");

                    inlineKeyboardButton2.setText("مسجد الشجرة");
                    inlineKeyboardButton2.setCallbackData("مسجد الشجرة");

                    inlineKeyboardButton3.setText("مسجد الراية");
                    inlineKeyboardButton3.setCallbackData("مسجد الراية");

                    inlineKeyboardButton4.setText("مسجد نمره");
                    inlineKeyboardButton4.setCallbackData("مسجد نمره");

                    inlineKeyboardButton5.setText("مسجد البيعة");
                    inlineKeyboardButton5.setCallbackData("مسجد البيعة");

                    inlineKeyboardButton6.setText("غار حراء");
                    inlineKeyboardButton6.setCallbackData("غار حراء");

                    inlineKeyboardButton7.setText("مسجد الجن");
                    inlineKeyboardButton7.setCallbackData("مسجد الجن");

                    inlineKeyboardButton8.setText("مسجد التنعيم");
                    inlineKeyboardButton8.setCallbackData("مسجد التنعيم");

                    inlineKeyboardButton9.setText("غار ثور");
                    inlineKeyboardButton9.setCallbackData("غار ثور");

                    inlineKeyboardButton10.setText("بيت الله الحرام");
                    inlineKeyboardButton10.setCallbackData("بيت الله الحرام");

                    inlineKeyboardButton11.setText("قصر بن سليمان التاريخي");
                    inlineKeyboardButton11.setCallbackData("قصر بن سليمان التاريخي");

                    inlineKeyboardButton12.setText("قصر السقاف التاريخي");
                    inlineKeyboardButton12.setCallbackData("قصر السقاف التاريخي");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList.add(inlineKeyboardButton3);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton8);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton9);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton10);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton11);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton12);


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

                //المنتجعات والفنادق - مكة
                else if (text.equals("المنتجعات والفنادق - مكة")) {
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

                // المطاعم - مكة
                else if (text.equals("المطاعم - مكة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم مكة");
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

                //جدة
                else if (text.equals("جدة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في جدة.")
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


                    keyboardButton1.setText("الأماكن السياحية - جدة");
                    keyboardButton2.setText("المنتزهات والترفيه - جدة");
                    keyboardButton3.setText("المنتجعات والفنادق - جدة");
                    keyboardButton4.setText("الطبيعة والبيئة - جدة");
                    keyboardButton5.setText("التراث والثقافة - جدة");
                    keyboardButton6.setText("التسوق - جدة");
                    keyboardButton7.setText("المطاعم - جدة");

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

                // الأماكن السياحية - جدة

                else if (text.equals("الأماكن السياحية - جدة")) {

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
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();

                    //Second row
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();

                    //Third row
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();


                    //Fourth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
                    //Fifth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();

                    //Sixth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();

                    //Seventh row
                    List<InlineKeyboardButton> inlineKeyboardButtonList7 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();

                    //Eighth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList8 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton15 = new InlineKeyboardButton();


                    inlineKeyboardButton1.setText("بلاجيو");
                    inlineKeyboardButton1.setCallbackData("بلاجيو");

                    inlineKeyboardButton2.setText("مرسى الأحلام");
                    inlineKeyboardButton2.setCallbackData("مرسى الأحلام");

                    inlineKeyboardButton3.setText("كنز ابحر");
                    inlineKeyboardButton3.setCallbackData("كنز ابحر");

                    inlineKeyboardButton4.setText("جزيرة الشراع");
                    inlineKeyboardButton4.setCallbackData("جزيرة الشراع");

                    inlineKeyboardButton5.setText("ممشى شارع التحلية");
                    inlineKeyboardButton5.setCallbackData("ممشى شارع التحلية");

                    inlineKeyboardButton6.setText("ممشى شارع فلسطين");
                    inlineKeyboardButton6.setCallbackData("ممشى شارع فلسطين");

                    inlineKeyboardButton7.setText("الواجهة البحرية الوسطى");
                    inlineKeyboardButton7.setCallbackData("الواجهة البحرية الوسطى");

                    inlineKeyboardButton8.setText("اعمار سكوير جدة");
                    inlineKeyboardButton8.setCallbackData("اعمار سكوير جدة");

                    inlineKeyboardButton9.setText("كيدزانيا");
                    inlineKeyboardButton9.setCallbackData("كيدزانيا");

                    inlineKeyboardButton10.setText("كورنيش جدة");
                    inlineKeyboardButton10.setCallbackData("كورنيش جدة");

                    inlineKeyboardButton11.setText("نافورة الملك فهد");
                    inlineKeyboardButton11.setCallbackData("نافورة الملك فهد");

                    inlineKeyboardButton12.setText("غواصين بحر الصحراء");
                    inlineKeyboardButton12.setCallbackData("غواصين بحر الصحراء");

                    inlineKeyboardButton13.setText("سوق الجمعة التراثي");
                    inlineKeyboardButton13.setCallbackData("سوق الجمعة التراثي");

                    inlineKeyboardButton14.setText("متحف جدة المفتوح للمجسمات");
                    inlineKeyboardButton14.setCallbackData("متحف جدة المفتوح");

                    inlineKeyboardButton15.setText("الواجهة البحرية الشمالية");
                    inlineKeyboardButton15.setCallbackData("الواجهة البحرية الشمالية");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList.add(inlineKeyboardButton3);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton5);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton7);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton9);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton10);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton11);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton12);
                    inlineKeyboardButtonList6.add(inlineKeyboardButton13);

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
                //المنتزهات والترفيه - جدة

                else if (text.equals("المنتزهات والترفيه - جدة")) {

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
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();

                    //Second row
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();

                    //Third row
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();

                    //Fourth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();

                    //Fifth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();

                    //Sixth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();

                    //Seventh row
                    List<InlineKeyboardButton> inlineKeyboardButtonList7 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();

                    //Eighth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList8 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton15 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList9 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton16 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("سماش");
                    inlineKeyboardButton1.setCallbackData("سماش");

                    inlineKeyboardButton2.setText("جنغل لاند");
                    inlineKeyboardButton2.setCallbackData("جنغل لاند");

                    inlineKeyboardButton3.setText("اكوا بارك");
                    inlineKeyboardButton3.setCallbackData("اكوا بارك");

                    inlineKeyboardButton4.setText("منتزه الأمواج");
                    inlineKeyboardButton4.setCallbackData("منتزه الأمواج");

                    inlineKeyboardButton5.setText("اوكتو");
                    inlineKeyboardButton5.setCallbackData("اوكتو");

                    inlineKeyboardButton6.setText("مون تون");
                    inlineKeyboardButton6.setCallbackData("مون تون");

                    inlineKeyboardButton7.setText("ان تن سو");
                    inlineKeyboardButton7.setCallbackData("ان تن سو");

                    inlineKeyboardButton8.setText("ايس لاند");
                    inlineKeyboardButton8.setCallbackData("ايس لاند");

                    inlineKeyboardButton9.setText("هابي لاند عطا الله");
                    inlineKeyboardButton9.setCallbackData("هابي لاند عطا");

                    inlineKeyboardButton10.setText("مدينة فن تايم الترفيهية");
                    inlineKeyboardButton10.setCallbackData("مدينة فن تايم");

                    inlineKeyboardButton11.setText("كيدزانيا");
                    inlineKeyboardButton11.setCallbackData("كيدزانيا");

                    inlineKeyboardButton12.setText("تشيكي تشيز");
                    inlineKeyboardButton12.setCallbackData("تشيكي تشيز");

                    inlineKeyboardButton13.setText("مدينة الشلال الترفيهية");
                    inlineKeyboardButton13.setCallbackData("مدينة الشلال");

                    inlineKeyboardButton14.setText("مدينة الملك عبدالله الاقتصادية");
                    inlineKeyboardButton14.setCallbackData("مدينة الملك عبدالله");

                    inlineKeyboardButton15.setText("حديقة الإرادة لذي الاحتياجات الخاصة");
                    inlineKeyboardButton15.setCallbackData("حديقة الإرادة");


                    inlineKeyboardButton16.setText("نادي الغربية للطيران الشراعي");
                    inlineKeyboardButton16.setCallbackData("نادي الغربية للطيران");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList.add(inlineKeyboardButton3);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton5);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton7);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton9);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton10);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton11);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton12);
                    inlineKeyboardButtonList6.add(inlineKeyboardButton13);

                    inlineKeyboardButtonList7.add(inlineKeyboardButton14);

                    inlineKeyboardButtonList8.add(inlineKeyboardButton15);

                    inlineKeyboardButtonList9.add(inlineKeyboardButton16);

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


                // التسوق - جدة
                else if (text.equals("التسوق - جدة")) {

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
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();

                    //Second row
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();

                    //Third row
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();

                    //Fourth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();

                    //Fifth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();

                    //Sixth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton15 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton16 = new InlineKeyboardButton();

                    //Seventh row
                    List<InlineKeyboardButton> inlineKeyboardButtonList7 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton17 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton18 = new InlineKeyboardButton();

                    //Eighth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList8 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton19 = new InlineKeyboardButton();

                    //Ninth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList9 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton20 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList10 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton21 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("الأندلس مول");
                    inlineKeyboardButton1.setCallbackData("الأندلس مول");

                    inlineKeyboardButton2.setText("برستيج مول");
                    inlineKeyboardButton2.setCallbackData("برستيج مول");

                    inlineKeyboardButton3.setText("اويسس مول");
                    inlineKeyboardButton3.setCallbackData("اويسس مول");

                    inlineKeyboardButton4.setText("هيفاء مول");
                    inlineKeyboardButton4.setCallbackData("هيفاء مول");

                    inlineKeyboardButton5.setText("جدة مول");
                    inlineKeyboardButton5.setCallbackData("جدة مول");

                    inlineKeyboardButton6.setText("أنا غير مول");
                    inlineKeyboardButton6.setCallbackData("أنا غير مول");

                    inlineKeyboardButton7.setText("بولفار");
                    inlineKeyboardButton7.setCallbackData("بولفار");

                    inlineKeyboardButton8.setText("البلد");
                    inlineKeyboardButton8.setCallbackData("البلد");

                    inlineKeyboardButton9.setText("البساتين مول");
                    inlineKeyboardButton9.setCallbackData("البساتين مول");

                    inlineKeyboardButton10.setText("التحلية مول");
                    inlineKeyboardButton10.setCallbackData("التحلية مول");

                    inlineKeyboardButton11.setText("رد سي مول");
                    inlineKeyboardButton11.setCallbackData("رد سي مول");

                    inlineKeyboardButton12.setText("مول العرب");
                    inlineKeyboardButton12.setCallbackData("مول العرب");

                    inlineKeyboardButton13.setText("عزيز مول");
                    inlineKeyboardButton13.setCallbackData("عزيز مول");

                    inlineKeyboardButton14.setText("الياسمين مول");
                    inlineKeyboardButton14.setCallbackData("الياسمين مول");

                    inlineKeyboardButton15.setText("صيرفي ميجا مول");
                    inlineKeyboardButton15.setCallbackData("صيرفي ميجا مول");

                    inlineKeyboardButton16.setText("لو شاتو مول");
                    inlineKeyboardButton16.setCallbackData("لو شاتو مول");

                    inlineKeyboardButton17.setText("ستارز أفينيو مول");
                    inlineKeyboardButton17.setCallbackData("ستارز أفينيو");

                    inlineKeyboardButton18.setText("سوق حراء الدولي");
                    inlineKeyboardButton18.setCallbackData("سوق حراء الدولي");

                    inlineKeyboardButton19.setText("مركز الخياط التجاري");
                    inlineKeyboardButton19.setCallbackData("مركز الخياط");

                    inlineKeyboardButton20.setText("مركز الكورنيش التجاري");
                    inlineKeyboardButton20.setCallbackData("مركز الكورنيش");

                    inlineKeyboardButton21.setText("السلام مول");
                    inlineKeyboardButton21.setCallbackData("السلام مول");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList.add(inlineKeyboardButton3);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton8);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton9);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton10);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton11);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton12);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton13);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton14);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton15);
                    inlineKeyboardButtonList6.add(inlineKeyboardButton16);

                    inlineKeyboardButtonList7.add(inlineKeyboardButton17);
                    inlineKeyboardButtonList7.add(inlineKeyboardButton18);

                    inlineKeyboardButtonList8.add(inlineKeyboardButton19);

                    inlineKeyboardButtonList9.add(inlineKeyboardButton20);

                    inlineKeyboardButtonList10.add(inlineKeyboardButton21);

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
                // الطبيعة والبيئة - جدة
                else if (text.equals("الطبيعة والبيئة - جدة")) {

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
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();


                    //Second row
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();

                    //Third row
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();


                    inlineKeyboardButton1.setText("أكوا بارك");
                    inlineKeyboardButton1.setCallbackData("أكوا بارك");

                    inlineKeyboardButton2.setText("فقيه أكواريوم");
                    inlineKeyboardButton2.setCallbackData("فقيه أكواريوم");

                    inlineKeyboardButton3.setText("كورنيش جدة");
                    inlineKeyboardButton3.setCallbackData("كورنيش جدة");

                    inlineKeyboardButton4.setText("نافورة الملك فهد");
                    inlineKeyboardButton4.setCallbackData("نافورة الملك فهد");

                    inlineKeyboardButton5.setText("غواصين بحر الصحراء");
                    inlineKeyboardButton5.setCallbackData("غواصين بحر الصحراء");

                    inlineKeyboardButton6.setText("منتزه ذهبان");
                    inlineKeyboardButton6.setCallbackData("منتزه ذهبان");

                    inlineKeyboardButton7.setText("الحديقة المائية");
                    inlineKeyboardButton7.setCallbackData("الحديقة المائية");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList.add(inlineKeyboardButton3);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton5);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton7);


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
                // التراث والثقافة - جدة
                else if (text.equals("التراث والثقافة - جدة")) {

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

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();


                    inlineKeyboardButton1.setText("البلد");
                    inlineKeyboardButton1.setCallbackData("البلد");

                    inlineKeyboardButton2.setText("جدة التاريخية");
                    inlineKeyboardButton2.setCallbackData("جدة التاريخية");

                    inlineKeyboardButton3.setText("متحف درويش سلامه");
                    inlineKeyboardButton3.setCallbackData("متحف درويش سلامه");

                    inlineKeyboardButton4.setText("متحف الفنون المنزلية");
                    inlineKeyboardButton4.setCallbackData("متحف الفنون المنزلية");

                    inlineKeyboardButton5.setText("مدينة الطيبات للعلوم والمعرفة");
                    inlineKeyboardButton5.setCallbackData("مدينة الطيبات");

                    inlineKeyboardButton6.setText("متحف عبدالرؤوف حسن خليل");
                    inlineKeyboardButton6.setCallbackData("متحف عبدالرؤوف");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton6);


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
                //المنتجعات والفنادق - جدة
                else if (text.equals("المنتجعات والفنادق - جدة")) {
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


                // المطاعم - جدة
                else if (text.equals("المطاعم - جدة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم جدة");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g298553-Taif_Makkah_Province.html");


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

                // الطائف

                else if (text.equals("الطائف")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في الطائف.")
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


                    keyboardButton1.setText("الأماكن السياحية - الطائف");
                    keyboardButton2.setText("المنتزهات والترفيه - الطائف");
                    keyboardButton3.setText("المنتجعات والفنادق - الطائف");
                    keyboardButton4.setText("الطبيعة والبيئة - الطائف");
                    keyboardButton5.setText("التراث والثقافة - الطائف");
                    keyboardButton6.setText("التسوق - الطائف");
                    keyboardButton7.setText("المطاعم - الطائف");


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

                // الأماكن السياحية - الطائف

                else if (text.equals("الأماكن السياحية - الطائف")) {

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
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();

                    //Second row
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();

                    //Third row
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();

                    //Fourth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
                    //Fifth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();

                    //Sixth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList7 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();

                    //Seventh row
                    List<InlineKeyboardButton> inlineKeyboardButtonList8 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();

                    //Eighth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList9 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton15 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList10 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton16 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList11 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton17 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList12 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton18 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList13 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton19 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList14 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton20 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList15 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton21 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("جبل لبنان");
                    inlineKeyboardButton1.setCallbackData("جبل لبنان");

                    inlineKeyboardButton2.setText("وادي وج");
                    inlineKeyboardButton2.setCallbackData("وادي وج");

                    inlineKeyboardButton3.setText("منتزه الردف");
                    inlineKeyboardButton3.setCallbackData("منتزه الردف");

                    inlineKeyboardButton4.setText("فوهة الوعبة البركانية");
                    inlineKeyboardButton4.setCallbackData("فوهة الوعبة");

                    inlineKeyboardButton5.setText("جبال الهدا والشفا");
                    inlineKeyboardButton5.setCallbackData("جبال الهدا والشفا");

                    inlineKeyboardButton6.setText("مزرعة الفراولة");
                    inlineKeyboardButton6.setCallbackData("مزرعة الفراولة");

                    inlineKeyboardButton7.setText("جبل دكا");
                    inlineKeyboardButton7.setCallbackData("جبل دكا");

                    inlineKeyboardButton8.setText("منتزه الشفا بارك");
                    inlineKeyboardButton8.setCallbackData("منتزه الشفا بارك");

                    inlineKeyboardButton9.setText("حديقة الردف");
                    inlineKeyboardButton9.setCallbackData("حديقة الردف");

                    inlineKeyboardButton10.setText("تلفريك الهدا");
                    inlineKeyboardButton10.setCallbackData("تلفريك الهدا");

                    inlineKeyboardButton11.setText("وادي ذي غزال");
                    inlineKeyboardButton11.setCallbackData("وادي ذي غزال");

                    inlineKeyboardButton12.setText("مزرعة ومصنع بن سلمان للورد الطائفي");
                    inlineKeyboardButton12.setCallbackData("مزرعة ومصنع بن سلمان");

                    inlineKeyboardButton13.setText("مصنع بيت الورد الطائفي");
                    inlineKeyboardButton13.setCallbackData("مصنع بيت الورد");

                    inlineKeyboardButton14.setText("مصنع الكمال للورد الطائفي");
                    inlineKeyboardButton14.setCallbackData("مصنع الكمال للورد");

                    inlineKeyboardButton15.setText("مصنع الشيوخ للورد الطائفي");
                    inlineKeyboardButton15.setCallbackData("مصنع الشيوخ للورد");

                    inlineKeyboardButton16.setText("مزرعة راشد القرشي لإنتاج دهن وماء الورد الطائفي");
                    inlineKeyboardButton16.setCallbackData("مزرعة راشد القرشي");

                    inlineKeyboardButton17.setText("معمل سالم بن مشيهيب للورد الطائفي");
                    inlineKeyboardButton17.setCallbackData("معمل سالم بن مشيهيب");

                    inlineKeyboardButton18.setText("لعبة التوبوجان (الجبل الأخضر)");
                    inlineKeyboardButton18.setCallbackData("لعبة التوبوجان");

                    inlineKeyboardButton19.setText("قرية الكر السياحية (التلفريك)");
                    inlineKeyboardButton19.setCallbackData("قرية الكر السياحية");

                    inlineKeyboardButton20.setText("تنال للنزل السياحية");
                    inlineKeyboardButton20.setCallbackData("تنال للنزل السياحية");

                    inlineKeyboardButton21.setText("مصنع القاضي للورد الطائفي");
                    inlineKeyboardButton21.setCallbackData("مصنع القاضي للورد");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList.add(inlineKeyboardButton3);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton7);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton9);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton10);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton11);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton5);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton12);

                    inlineKeyboardButtonList7.add(inlineKeyboardButton13);

                    inlineKeyboardButtonList8.add(inlineKeyboardButton14);

                    inlineKeyboardButtonList9.add(inlineKeyboardButton16);

                    inlineKeyboardButtonList10.add(inlineKeyboardButton17);

                    inlineKeyboardButtonList11.add(inlineKeyboardButton18);

                    inlineKeyboardButtonList12.add(inlineKeyboardButton19);

                    inlineKeyboardButtonList13.add(inlineKeyboardButton20);

                    inlineKeyboardButtonList15.add(inlineKeyboardButton21);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList5);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList4);
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
                // المنتزهات والترفيه - الطائف
                else if (text.equals("المنتزهات والترفيه - الطائف")) {

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
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();

                    //Third row
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();

                    //Fourth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();

                    //Fifth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();


                    inlineKeyboardButton1.setText("حديقة الملك فيصل");
                    inlineKeyboardButton1.setCallbackData("حديقة الملك فيصل");

                    inlineKeyboardButton2.setText("منتزه الملك عبدالله");
                    inlineKeyboardButton2.setCallbackData("منتزه الملك عبدالله");

                    inlineKeyboardButton3.setText("منتزه الطائف الوطني");
                    inlineKeyboardButton3.setCallbackData("منتزه الطائف الوطني");

                    inlineKeyboardButton4.setText("حديقة الحيوانات");
                    inlineKeyboardButton4.setCallbackData("حديقة الحيوانات");

                    inlineKeyboardButton5.setText("منتزه الشلال");
                    inlineKeyboardButton5.setCallbackData("منتزه الشلال");

                    inlineKeyboardButton6.setText("منتزه الملك فهد");
                    inlineKeyboardButton6.setCallbackData("منتزه الملك فهد");

                    inlineKeyboardButton7.setText("الحكير تايم");
                    inlineKeyboardButton7.setCallbackData("الحكير تايم");

                    inlineKeyboardButton8.setText("منتزه الردف");
                    inlineKeyboardButton8.setCallbackData("منتزه الردف");

                    inlineKeyboardButton9.setText("منتزه روابي لاند");
                    inlineKeyboardButton9.setCallbackData("منتزه روابي لاند");

                    inlineKeyboardButton10.setText("منتزه الجبل الأخضر");
                    inlineKeyboardButton10.setCallbackData("منتزه الجبل الأخضر");

                    inlineKeyboardButton11.setText("تنال للنزل السياحية");
                    inlineKeyboardButton11.setCallbackData("تنال للنزل السياحية");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton5);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton7);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton9);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton10);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton11);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton3);


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
                // الطبيعة والبيئة - الطائف
                else if (text.equals("الطبيعة والبيئة - الطائف")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    //First row
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    //Second row
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();

                    //Third row
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();

                    //Fourth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();

                    //Fifth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList7 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList8 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList9 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList10 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();

                    inlineKeyboardButton2.setText("منتزه الشفا بارك");
                    inlineKeyboardButton2.setCallbackData("منتزه الشفا بارك");

                    inlineKeyboardButton3.setText("مزرعة الفراولة");
                    inlineKeyboardButton3.setCallbackData("مزرعة الفراولة");

                    inlineKeyboardButton4.setText("تلفريك الهدا");
                    inlineKeyboardButton4.setCallbackData("تلفريك الهدا");

                    inlineKeyboardButton6.setText("حديقة الردف");
                    inlineKeyboardButton6.setCallbackData("حديقة الردف");

                    inlineKeyboardButton8.setText("لعبة التوبوجان (الجبل الأخضر)");
                    inlineKeyboardButton8.setCallbackData("لعبة التوبوجان");

                    inlineKeyboardButton9.setText("مصنع الشيوخ للورد الطائفي");
                    inlineKeyboardButton9.setCallbackData("مصنع الشيوخ للورد");

                    inlineKeyboardButton10.setText("مصنع الكمال للورد الطائفي");
                    inlineKeyboardButton10.setCallbackData("مصنع الكمال للورد");

                    inlineKeyboardButton11.setText("مزرعة راشد القرشي لإنتاج دهن وماء الورد الطائفي");
                    inlineKeyboardButton11.setCallbackData("مزرعة راشد القرشي");

                    inlineKeyboardButton12.setText("معمل سالم بن مشيهيب للورد الطائفي");
                    inlineKeyboardButton12.setCallbackData("معمل سالم بن مشيهيب");

                    inlineKeyboardButton13.setText("مزرعة ومصنع بن سلمان للورد الطائفي");
                    inlineKeyboardButton13.setCallbackData("مزرعة ومصنع بن سلمان");

                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton8);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton9);

                    inlineKeyboardButtonList7.add(inlineKeyboardButton10);

                    inlineKeyboardButtonList8.add(inlineKeyboardButton11);

                    inlineKeyboardButtonList9.add(inlineKeyboardButton12);

                    inlineKeyboardButtonList10.add(inlineKeyboardButton13);

                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
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

                // التراث والثقافة - الطائف
                else if (text.equals("التراث والثقافة - الطائف")) {

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

                    //Third row
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList11 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton14 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton15 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList12 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton16 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton17 = new InlineKeyboardButton();

                    //Fourth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();

                    //Fifth row
                    List<InlineKeyboardButton> inlineKeyboardButtonList7 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton10 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList8 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton11 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList9 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton12 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList10 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton13 = new InlineKeyboardButton();


                    inlineKeyboardButton1.setText("سوق عكاظ التاريخي");
                    inlineKeyboardButton1.setCallbackData("سوق عكاظ التاريخي");

                    inlineKeyboardButton2.setText("متحف أصالة الماضي");
                    inlineKeyboardButton2.setCallbackData("متحف أصالة الماضي");

                    inlineKeyboardButton3.setText("متحف الشريف");
                    inlineKeyboardButton3.setCallbackData("متحف الشريف");

                    inlineKeyboardButton8.setText("سد معاوية بن أبي سفيان بسيسد");
                    inlineKeyboardButton8.setCallbackData("سد معاوية");

                    inlineKeyboardButton9.setText("متحف قصر شبرا التاريخي");
                    inlineKeyboardButton9.setCallbackData("متحف قصر شبرا");

                    inlineKeyboardButton5.setText("سد السملقي");
                    inlineKeyboardButton5.setCallbackData("سد السملقي");

                    inlineKeyboardButton11.setText("مسجد عبدالله ابن العباس");
                    inlineKeyboardButton11.setCallbackData("مسجد عبدالله ابن");

                    inlineKeyboardButton12.setText("قصر الدهلوي التراثي");
                    inlineKeyboardButton12.setCallbackData("قصر الدهلوي التراثي");

                    inlineKeyboardButton13.setText("بيت الكاتب التاريخي");
                    inlineKeyboardButton13.setCallbackData("بيت الكاتب التاريخي");

                    inlineKeyboardButton14.setText("مسجد القابل");
                    inlineKeyboardButton14.setCallbackData("مسجد القابل");

                    inlineKeyboardButton15.setText("مسجد الكوع التراثي");
                    inlineKeyboardButton15.setCallbackData("مسجد الكوع التراثي");

                    inlineKeyboardButton16.setText("سد عكرمة التاريخي");
                    inlineKeyboardButton16.setCallbackData("سد عكرمة التاريخي");

                    inlineKeyboardButton17.setText("طريق كرا التاريخي");
                    inlineKeyboardButton17.setCallbackData("طريق كرا التاريخي");

                    inlineKeyboardButton10.setText("سوق البلد بوسط الطائف التاريخي");
                    inlineKeyboardButton10.setCallbackData("سوق البلد بوسط");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton8);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton9);

                    inlineKeyboardButtonList7.add(inlineKeyboardButton10);

                    inlineKeyboardButtonList8.add(inlineKeyboardButton11);

                    inlineKeyboardButtonList9.add(inlineKeyboardButton12);

                    inlineKeyboardButtonList10.add(inlineKeyboardButton13);

                    inlineKeyboardButtonList11.add(inlineKeyboardButton14);
                    inlineKeyboardButtonList11.add(inlineKeyboardButton15);

                    inlineKeyboardButtonList12.add(inlineKeyboardButton16);
                    inlineKeyboardButtonList12.add(inlineKeyboardButton17);


                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList11);
                    inlineButtons.add(inlineKeyboardButtonList12);
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
                // التسوق - الطائف
                else if (text.equals("التسوق - الطائف")) {

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


                    inlineKeyboardButton1.setText("مجمع الطائف الدولي");
                    inlineKeyboardButton1.setCallbackData("مجمع الطائف الدولي");

                    inlineKeyboardButton2.setText("تيرا مول");
                    inlineKeyboardButton2.setCallbackData("تيرا مول");

                    inlineKeyboardButton3.setText("جوري مول");
                    inlineKeyboardButton3.setCallbackData("جوري مول");

                    inlineKeyboardButton4.setText("مجمع قلب الطائف");
                    inlineKeyboardButton4.setCallbackData("مجمع قلب الطائف");

                    inlineKeyboardButton5.setText("فالي سنتر");
                    inlineKeyboardButton5.setCallbackData("فالي سنتر");

                    inlineKeyboardButton6.setText("العبيكان مول");
                    inlineKeyboardButton6.setCallbackData("العبيكان مول");

                    inlineKeyboardButton7.setText("المصيف مول");
                    inlineKeyboardButton7.setCallbackData("المصيف مول");

                    inlineKeyboardButton8.setText("سوق عكاظ");
                    inlineKeyboardButton8.setCallbackData("سوق عكاظ");

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

                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }


                }

                // المنتجعات والفنادق - الطائف
                else if (text.equals("المنتجعات والفنادق - الطائف")) {
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
                // المطاعم - الطائف
                else if (text.equals("المطاعم - الطائف")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم الطائف");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Restaurants-g298553-Taif_Makkah_Province.html");


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
                // القنفذة
                else if (text.equals("القنفذة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في القنفذة.")
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
                    KeyboardButton keyboardButton4 = new KeyboardButton();

                    keyboardButton1.setText("الأماكن السياحية - القنفذة");

                    keyboardButton2.setText("المنتجعات والفنادق - القنفذة");

                    keyboardButton4.setText("رجوع");


                    keyboardRow1.add(keyboardButton1);

                    keyboardRow2.add(keyboardButton2);

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


                // الأماكن السياحية - القنفذة
                else if (text.equals("الأماكن السياحية - القنفذة")) {

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

                    //Third row
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();


                    inlineKeyboardButton1.setText("وادي شسع");
                    inlineKeyboardButton1.setCallbackData("وادي شسع");

                    inlineKeyboardButton2.setText("كورنيش القنفذة");
                    inlineKeyboardButton2.setCallbackData("كورنيش القنفذة");

                    inlineKeyboardButton3.setText("جزيرة جبل الصبايا");
                    inlineKeyboardButton3.setCallbackData("جزيرة جبل الصبايا");

                    inlineKeyboardButton4.setText("بحيرة سد وادي قنونا");
                    inlineKeyboardButton4.setCallbackData("بحيرة سد وادي");


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
                // المنتجعات والفنادق - القنفذة
                else if (text.equals("المنتجعات والفنادق - القنفذة")) {
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

                // رابغ
                else if (text.equals("رابغ")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في رابغ.")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true).setSelective(true);
                    List<KeyboardRow> keyboardRowList = new ArrayList<>();

                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();


                    KeyboardRow keyboardRow2 = new KeyboardRow();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();

                    KeyboardRow keyboardRow3 = new KeyboardRow();
                    KeyboardButton keyboardButton4 = new KeyboardButton();

                    keyboardButton1.setText("الأماكن السياحية - رابغ");

                    keyboardButton2.setText("المنتجعات والفنادق - رابغ");

                    keyboardButton3.setText("المطاعم - رابغ");
                    keyboardButton4.setText("رجوع");


                    keyboardRow1.add(keyboardButton1);

                    keyboardRow2.add(keyboardButton2);
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
                // الأماكن السياحية - رابغ
                else if (text.equals("الأماكن السياحية - رابغ")) {

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

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();


                    inlineKeyboardButton1.setText("جزيرة الرمال");
                    inlineKeyboardButton1.setCallbackData("جزيرة الرمال");

                    inlineKeyboardButton7.setText("مرسى القوارب واليخوت بالبيبلسان");
                    inlineKeyboardButton7.setCallbackData("مرسى القوارب واليخوت");

                    inlineKeyboardButton3.setText("حديقة جمان بارك");
                    inlineKeyboardButton3.setCallbackData("حديقة جمان بارك");

                    inlineKeyboardButton4.setText("كورنيش البيلسان");
                    inlineKeyboardButton4.setCallbackData("كورنيش البيلسان");

                    inlineKeyboardButton5.setText("حديقة الفنون الخضراء");
                    inlineKeyboardButton5.setCallbackData("حديقة الفنون الخضراء");

                    inlineKeyboardButton6.setText("منتزه الالعاب المائية اكوافن");
                    inlineKeyboardButton6.setCallbackData("منتزه الالعاب المائية");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton7);


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

                // المنتجعات والفنادق - رابغ
                else if (text.equals("المنتجعات والفنادق - رابغ")) {
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
                // المطاعم - رابغ
                else if (text.equals("المطاعم - رابغ")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم رابغ");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Search?q=%D8%B1%D8%A7%D8%A8%D8%BA&searchSessionId=C4C32A06D4AC84ADA61918C6310265F51627631175069ssid&searchNearby=false&geo=298553&sid=8F1D410F5BFC405B98C9F6FBADFEEA1E1627631179457&blockRedirect=true&ssrc=e&rf=1");


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
                // حائل
                else if (text.equals("حائل")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر وجهتك السياحية في حائل.")
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
                    KeyboardButton keyboardButton6 = new KeyboardButton();


                    keyboardButton1.setText("مدينة حائل");
                    keyboardButton2.setText("الحائط");
                    keyboardButton3.setText("الشنان");
                    keyboardButton4.setText("جبه");

                    keyboardButton6.setText("رجوع");

                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);

                    keyboardRow2.add(keyboardButton3);
                    keyboardRow2.add(keyboardButton4);

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


                //مدينة حائل
                else if (text.equals("مدينة حائل")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في مدينة حائل.")
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

                    keyboardButton1.setText("الأماكن السياحية - حائل");
                    keyboardButton2.setText("التسوق - حائل");
                    keyboardButton3.setText("المنتجعات والفنادق - حائل");
                    keyboardButton4.setText("التراث والثقافة - حائل");

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

                //الأماكن السياحية - حائل
                else if (text.equals("الأماكن السياحية - حائل")) {

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

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("جبل سلمى");
                    inlineKeyboardButton1.setCallbackData("جبل سلمى");

                    inlineKeyboardButton2.setText("جبل أجا");
                    inlineKeyboardButton2.setCallbackData("جبل أجا");

                    inlineKeyboardButton3.setText("منتزه السمراء");
                    inlineKeyboardButton3.setCallbackData("منتزه السمراء");

                    inlineKeyboardButton4.setText("بوليفارد حائل");
                    inlineKeyboardButton4.setCallbackData("بوليفارد حائل");

                    inlineKeyboardButton5.setText("منتزه المغواة");
                    inlineKeyboardButton5.setCallbackData("منتزه المغواة");

                    inlineKeyboardButton6.setText("منتزه مشار");
                    inlineKeyboardButton6.setCallbackData("منتزه مشار");

                    inlineKeyboardButton7.setText("منتزه أجا بارك");
                    inlineKeyboardButton7.setCallbackData("منتزه أجا بارك");

                    inlineKeyboardButton8.setText("صخرة أبو الهول الحائلي");
                    inlineKeyboardButton8.setCallbackData("صخرة أبو الهول");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton8);

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
                //المولات والتسوق - حائل
                else if (text.equals("التسوق - حائل")) {

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

                    inlineKeyboardButton1.setText("سلمى مول");
                    inlineKeyboardButton1.setCallbackData("سلمى مول");

                    inlineKeyboardButton2.setText("جراند مول");
                    inlineKeyboardButton2.setCallbackData("جراند مول");

                    inlineKeyboardButton3.setText("المصنع الوطني للدلال");
                    inlineKeyboardButton3.setCallbackData("المصنع الوطني للدلال");

                    inlineKeyboardButton4.setText("الحديقة مول");
                    inlineKeyboardButton4.setCallbackData("الحديقة مول");

                    inlineKeyboardButton5.setText("سوق الحرف والصناعات اليدوية");
                    inlineKeyboardButton5.setCallbackData("سوق الحرف حائل");

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
                //التراث والثقافة - حائل
                else if (text.equals("التراث والثقافة - حائل")) {

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

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("متحف الضويلي للتراث");
                    inlineKeyboardButton1.setCallbackData("متحف الضويلي للتراث");

                    inlineKeyboardButton2.setText("متحف حائل الإقليمي");
                    inlineKeyboardButton2.setCallbackData("متحف حائل الإقليمي");

                    inlineKeyboardButton3.setText("المطعم والمتحف التراثي");
                    inlineKeyboardButton3.setCallbackData("المطعم والمتحف التراثي");

                    inlineKeyboardButton4.setText("قلعة القشلة التاريخية");
                    inlineKeyboardButton4.setCallbackData("قلعة القشلة التاريخية");

                    inlineKeyboardButton5.setText("قلعة أعيرف التاريخية");
                    inlineKeyboardButton5.setCallbackData("قلعة أعيرف التاريخية");

                    inlineKeyboardButton6.setText("متحف ومقهى أجا وسلمى");
                    inlineKeyboardButton6.setCallbackData("متحف ومقهى أجا");

                    inlineKeyboardButton7.setText("منازل حاتم الطائي الاثرية");
                    inlineKeyboardButton7.setCallbackData("منازل حاتم الطائي");

                    inlineKeyboardButton8.setText("متحف لقيت للماضي أثر");
                    inlineKeyboardButton8.setCallbackData("متحف لقيت للماضي أثر");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton5);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton7);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton8);

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
                // المنتجعات والفنادق - حائل
                else if (text.equals("المنتجعات والفنادق - حائل")) {
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
                //الحائط
                else if (text.equals("الحائط")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في الحائط.")
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

                    keyboardButton1.setText("الأماكن السياحية - الحائط");
                    keyboardButton2.setText("التراث والثقافة - الحائط");
                    keyboardButton3.setText("المنتجعات والفنادق - الحائط");

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
                //الأماكن السياحية - الحائط
                else if (text.equals("الأماكن السياحية - الحائط")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("حرة بني رشيد البركانية بجبل الرأس الأبيض");
                    inlineKeyboardButton1.setCallbackData("حرة بني رشيد");

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
                // التراث والثقافة - الحائط
                else if (text.equals("التراث والثقافة - الحائط")) {

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

                    inlineKeyboardButton1.setText("نقوش راطا والمنجور");
                    inlineKeyboardButton1.setCallbackData("نقوش راطا");

                    inlineKeyboardButton2.setText("سوق الحائط القديم");
                    inlineKeyboardButton2.setCallbackData("سوق الحائط القديم");

                    inlineKeyboardButton3.setText("قرية فدك الاثرية");
                    inlineKeyboardButton3.setCallbackData("قرية فدك الاثرية");

                    inlineKeyboardButton4.setText("نقوش الشويمس");
                    inlineKeyboardButton4.setCallbackData("نقوش الشويمس");


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


                // المنتجعات والفنادق - الحائط
                else if (text.equals("المنتجعات والفنادق - الحائط")) {
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
                // الشنان
                else if (text.equals("الشنان")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في الشنان.")
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

                    keyboardButton2.setText("التراث والثقافة - الشنان");
                    keyboardButton3.setText("المنتجعات والفنادق - الشنان");

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
                // التراث والثقافة - الشنان
                else if (text.equals("التراث والثقافة - الشنان")) {

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

                    inlineKeyboardButton1.setText("مدينة فيد الاثرية التاريخية");
                    inlineKeyboardButton1.setCallbackData("مدينة فيد الاثرية");

                    inlineKeyboardButton2.setText("قصر الفيصل التاريخي بالسبعان");
                    inlineKeyboardButton2.setCallbackData("قصر الفيصل التاريخي");

                    inlineKeyboardButton3.setText("قصر العنفان التاريخي بالسبعان");
                    inlineKeyboardButton3.setCallbackData("قصر العنفان التاريخي");

                    inlineKeyboardButton4.setText("مركز عبداللطيف جميل للتراث والآثار في فيد");
                    inlineKeyboardButton4.setCallbackData("مركز عبداللطيف جميل");


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
                // المنتجعات والفنادق - الشنان
                else if (text.equals("المنتجعات والفنادق - الشنان")) {
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
                // جبه
                else if (text.equals("جبه")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في جبه.")
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

                    keyboardButton2.setText("التراث والثقافة - جبه");
                    keyboardButton3.setText("المنتجعات والفنادق - جبه");

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
                // التراث والثقافة - جبه
                else if (text.equals("التراث والثقافة - جبه")) {

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

                    inlineKeyboardButton1.setText("متحف قصر النايف التراثي");
                    inlineKeyboardButton1.setCallbackData("متحف قصر النايف");

                    inlineKeyboardButton2.setText("متحف العيادة التراثي");
                    inlineKeyboardButton2.setCallbackData("متحف العيادة التراثي");

                    inlineKeyboardButton3.setText("نقوش جبل ام سمنان");
                    inlineKeyboardButton3.setCallbackData("نقوش جبل");


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
                // المنتجعات والفنادق - جبه
                else if (text.equals("المنتجعات والفنادق - جبه")) {
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
                //نجران
                else if (text.equals("نجران")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في نجران.")
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

                    keyboardButton1.setText("الأماكن السياحية - نجران");
                    keyboardButton2.setText("التراث والثقافة - نجران");
                    keyboardButton3.setText("التسوق - نجران");
                    keyboardButton4.setText("المنتجعات والفنادق - نجران");
                    keyboardButton5.setText("المطاعم - نجران");

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
                // الأماكن السياحية - نجران
                else if (text.equals("الأماكن السياحية - نجران")) {

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


                    inlineKeyboardButton1.setText("منتزه النافورة الراقصة");
                    inlineKeyboardButton1.setCallbackData("منتزه النافورة الراقصة");

                    inlineKeyboardButton2.setText("قرية مدماك التراثية السياحية");
                    inlineKeyboardButton2.setCallbackData("قرية مدماك");

                    inlineKeyboardButton3.setText("غابة سقام");
                    inlineKeyboardButton3.setCallbackData("غابة سقام");

                    inlineKeyboardButton4.setText("محمية عروق بني معارض");
                    inlineKeyboardButton4.setCallbackData("محمية عروق بني معارض");

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
                // التسوق - نجران
                else if (text.equals("التسوق - نجران")) {

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

                    inlineKeyboardButton1.setText("سوق الحرف والصناعات اليدوية");
                    inlineKeyboardButton1.setCallbackData("سوق الحرف نجران");

                    inlineKeyboardButton2.setText("نجران سيتي سنتر");
                    inlineKeyboardButton2.setCallbackData("نجران سيتي سنتر");

                    inlineKeyboardButton3.setText("سوق الجنابي والخناجر الشعبي");
                    inlineKeyboardButton3.setCallbackData("سوق الجنابي والخناجر");

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
                //التراث والثقافة - نجران
                else if (text.equals("التراث والثقافة - نجران")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList6 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();


                    inlineKeyboardButton1.setText("قصر أبو ساق كحيلان الاثري");
                    inlineKeyboardButton1.setCallbackData("قصر أبو ساق");

                    inlineKeyboardButton2.setText("متحف شعيب دحضه");
                    inlineKeyboardButton2.setCallbackData("متحف شعيب دحضه");

                    inlineKeyboardButton3.setText("مدينة الأخدود الاثرية");
                    inlineKeyboardButton3.setCallbackData("مدينة الأخدود الاثرية");

                    inlineKeyboardButton4.setText("متحف نجران الإقليمي");
                    inlineKeyboardButton4.setCallbackData("متحف نجران الإقليمي");

                    inlineKeyboardButton6.setText("قصر العان الاثري");
                    inlineKeyboardButton6.setCallbackData("قصر العان الاثري");

                    inlineKeyboardButton7.setText("قرية ال منجم التراثية");
                    inlineKeyboardButton7.setCallbackData("قرية ال منجم");

                    inlineKeyboardButton8.setText("قلعة رعوم الاثرية");
                    inlineKeyboardButton8.setCallbackData("قلعة رعوم الاثرية");

                    inlineKeyboardButton9.setText("قصر الامارة التاريخي");
                    inlineKeyboardButton9.setCallbackData("قصر الامارة التاريخي");


                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton6);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton7);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton8);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton9);

                    inlineKeyboardButtonList6.add(inlineKeyboardButton1);

                    inlineKeyboardButtonList.add(inlineKeyboardButton2);


                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);
                    inlineButtons.add(inlineKeyboardButtonList5);
                    inlineButtons.add(inlineKeyboardButtonList6);
                    inlineButtons.add(inlineKeyboardButtonList);


                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }


                // المنتجعات والفنادق - نجران
                else if (text.equals("المنتجعات والفنادق - نجران")) {
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
                // المطاعم - نجران
                else if (text.equals("المطاعم - نجران")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم نجران");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Search?q=%D9%86%D8%AC%D8%B1%D8%A7%D9%86&searchSessionId=C4C32A06D4AC84ADA61918C6310265F51627631175069ssid&geo=298553&sid=A9C803FF60E243E8ABE9B4410DF27C8D1627638742906&blockRedirect=true&ssrc=e");


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
                // القصيم
                else if (text.equals("القصيم")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر وجهتك في القصيم.")
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
                    ;

                    KeyboardRow keyboardRow4 = new KeyboardRow();
                    KeyboardButton keyboardButton10 = new KeyboardButton();


                    keyboardButton1.setText("بريدة");
                    keyboardButton2.setText("عنيزة");
                    keyboardButton3.setText("الرس");
                    keyboardButton4.setText("المذنب");
                    keyboardButton5.setText("البكيرية");
                    keyboardButton6.setText("البدائع");
                    keyboardButton7.setText("عيون الجواء");
                    keyboardButton8.setText("رياض الخبراء");
                    keyboardButton9.setText("القصيباء");

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
                // بريدة
                else if (text.equals("بريدة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في بريدة.")
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

                    keyboardButton1.setText("الأماكن السياحية - بريدة");
                    keyboardButton2.setText("التراث والثقافة - بريدة");
                    keyboardButton3.setText("التسوق - بريدة");
                    keyboardButton4.setText("المنتجعات والفنادق - بريدة");
                    keyboardButton5.setText("المطاعم - بريدة");

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
                // الأماكن السياحية - بريدة
                else if (text.equals("الأماكن السياحية - بريدة")) {

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

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("محمية تلنتس للطيور");
                    inlineKeyboardButton1.setCallbackData("محمية تلنتس للطيور");

                    inlineKeyboardButton2.setText("مدينة التمور ببريدة");
                    inlineKeyboardButton2.setCallbackData("مدينة التمور ببريدة");

                    inlineKeyboardButton3.setText("منتزه الملك خالد");
                    inlineKeyboardButton3.setCallbackData("منتزه الملك خالد");

                    inlineKeyboardButton4.setText("مزرعة الصباخ السياحية");
                    inlineKeyboardButton4.setCallbackData("مزرعة الصباخ السياحية");

                    inlineKeyboardButton5.setText("مزرعة السليم السياحية");
                    inlineKeyboardButton5.setCallbackData("مزرعة السليم السياحية");

                    inlineKeyboardButton6.setText("منتجع الديرة الريفي");
                    inlineKeyboardButton6.setCallbackData("منتجع الديرة الريفي");

                    inlineKeyboardButton7.setText("منتزه الملك عبدالله الوطني");
                    inlineKeyboardButton7.setCallbackData("منتزه الملك عبدالله الوط");

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
                // التراث والثقافة - بريدة
                else if (text.equals("التراث والثقافة - بريدة")) {

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
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();


                    inlineKeyboardButton1.setText("متحف قصر الدبيخي");
                    inlineKeyboardButton1.setCallbackData("متحف قصر الدبيخي");

                    inlineKeyboardButton2.setText("متحف العقيلات");
                    inlineKeyboardButton2.setCallbackData("متحف العقيلات");

                    inlineKeyboardButton4.setText("متحف بريده");
                    inlineKeyboardButton4.setCallbackData("متحف بريده");

                    inlineKeyboardButton5.setText("متحف المجحدي للتراث والسيارات الكلاسيكية");
                    inlineKeyboardButton5.setCallbackData("متحف المجحدي");

                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

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
                // التسوق - بريدة
                else if (text.equals("التسوق - بريدة")) {

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

                    inlineKeyboardButton1.setText("النخيل مول");
                    inlineKeyboardButton1.setCallbackData("النخيل موول");

                    inlineKeyboardButton2.setText("مركز النخلة التجاري");
                    inlineKeyboardButton2.setCallbackData("مركز النخلة التجاري");

                    inlineKeyboardButton3.setText("العثيم مول");
                    inlineKeyboardButton3.setCallbackData("العثيم موول");

                    inlineKeyboardButton4.setText("مجمع الفايزي");
                    inlineKeyboardButton4.setCallbackData("مجمع الفايزي");

                    inlineKeyboardButton5.setText("النخيل بلازا");
                    inlineKeyboardButton5.setCallbackData("النخيل بلازا");

                    inlineKeyboardButton6.setText("العمري سنتر");
                    inlineKeyboardButton6.setCallbackData("العمري سنتر");

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
                // المنتجعات والفنادق - بريدة
                else if (text.equals("المنتجعات والفنادق - بريدة")) {
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
                // المطاعم - بريدة
                else if (text.equals("المطاعم - بريدة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم بريدة");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Search?q=%D8%A8%D8%B1%D9%8A%D8%AF%D8%A9&searchSessionId=BA07EFD81073DE3E2AAC32A1D54191E21627692058237ssid&searchNearby=false&geo=2628882&sid=E10C66B5933245F4A455C154C26B2DC31627692074095&blockRedirect=true&ssrc=e&rf=1 ");


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
                // عنيزة
                else if (text.equals("عنيزة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في عنيزة.")
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

                    keyboardButton1.setText("الأماكن السياحية - عنيزة");
                    keyboardButton2.setText("التراث والثقافة - عنيزة");
                    keyboardButton3.setText("التسوق - عنيزة");
                    keyboardButton4.setText("المنتجعات والفنادق - عنيزة");
                    keyboardButton5.setText("المطاعم - عنيزة");

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
                // الأماكن السياحية - عنيزة
                else if (text.equals("الأماكن السياحية - عنيزة")) {

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

                    inlineKeyboardButton1.setText("مزرعة الزنيدي السياحية");
                    inlineKeyboardButton1.setCallbackData("مزرعة الزنيدي السياحية");

                    inlineKeyboardButton2.setText("مزرعة العبيد السياحية");
                    inlineKeyboardButton2.setCallbackData("مزرعة العبيد السياحية");

                    inlineKeyboardButton3.setText("مزرعة فلايح عنيزة السياحية");
                    inlineKeyboardButton3.setCallbackData("مزرعة فلايح عنيزة");

                    inlineKeyboardButton4.setText("منتزه حايط الحركان التراثي الريفي");
                    inlineKeyboardButton4.setCallbackData("منتزه حايط الحركان");


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
                // التراث والثقافة - عنيزة
                else if (text.equals("التراث والثقافة - عنيزة")) {

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

                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("متحف الصالحي");
                    inlineKeyboardButton1.setCallbackData("متحف الصالحي");

                    inlineKeyboardButton2.setText("متحف الحمدان");
                    inlineKeyboardButton2.setCallbackData("متحف الحمدان");

                    inlineKeyboardButton3.setText("متحف محمد النعيم");
                    inlineKeyboardButton3.setCallbackData("متحف محمد النعيم");

                    inlineKeyboardButton4.setText("بيت البسام التراثي");
                    inlineKeyboardButton4.setCallbackData("بيت البسام التراثي");

                    inlineKeyboardButton5.setText("سوق المسوكف التراثي");
                    inlineKeyboardButton5.setCallbackData("سوق المسوكف التراثي");

                    inlineKeyboardButton6.setText("قلعة الربيعي الاثرية");
                    inlineKeyboardButton6.setCallbackData("قلعة الربيعي الاثرية");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton4);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton5);

                    inlineKeyboardButtonList5.add(inlineKeyboardButton6);


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
                // التسوق - عنيزة
                else if (text.equals("التسوق - عنيزة")) {

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


                    inlineKeyboardButton1.setText("سوق التمور");
                    inlineKeyboardButton1.setCallbackData("سوق التمور");

                    inlineKeyboardButton2.setText("العثيم مول");
                    inlineKeyboardButton2.setCallbackData("العثيم مووول");

                    inlineKeyboardButton3.setText("عنيزه مول");
                    inlineKeyboardButton3.setCallbackData("عنيزه مول");

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
                // المنتجعات والفنادق - عنيزة
                else if (text.equals("المنتجعات والفنادق - عنيزة")) {
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
                // المطاعم - عنيزة
                else if (text.equals("المطاعم - عنيزة")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم عنيزة");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Search?q=%D8%B9%D9%86%D9%8A%D8%B2%D8%A9&searchSessionId=BA07EFD81073DE3E2AAC32A1D54191E21627692058237ssid&geo=2628882&sid=E10C66B5933245F4A455C154C26B2DC31627694612071&blockRedirect=true&ssrc=e ");


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
                // الرس
                else if (text.equals("الرس")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في الرس.")
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

                    keyboardButton1.setText("التراث والثقافة - الرس");
                    keyboardButton2.setText("المنتجعات والفنادق - الرس");
                    keyboardButton3.setText("التسوق - الرس");
                    keyboardButton4.setText("المطاعم - الرس");

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

                // التراث والثقافة - الرس
                else if (text.equals("التراث والثقافة - الرس")) {

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

                    inlineKeyboardButton1.setText("متحف راشد الغفيلي للتراث");
                    inlineKeyboardButton1.setCallbackData("متحف راشد الغفيلي");

                    inlineKeyboardButton2.setText("متحف دار الاجداد");
                    inlineKeyboardButton2.setCallbackData("متحف دار الاجداد");

                    inlineKeyboardButton3.setText("برج الشنانه الاثري");
                    inlineKeyboardButton3.setCallbackData("برج الشنانه الاثري");

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
                // التسوق - الرس
                else if (text.equals("التسوق - الرس")) {

                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة أحد المواقع التالية:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());

                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();

                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();

                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();

                    inlineKeyboardButton2.setText("صحارى مول");
                    inlineKeyboardButton2.setCallbackData("صحارى مووول");

                    inlineKeyboardButton3.setText("الديرة مول");
                    inlineKeyboardButton3.setCallbackData("الديرة موول");

                    inlineKeyboardButton4.setText("الواحة مول");
                    inlineKeyboardButton4.setCallbackData("الواحة مول");

                    inlineKeyboardButtonList2.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList3.add(inlineKeyboardButton3);

                    inlineKeyboardButtonList4.add(inlineKeyboardButton4);

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


                // المنتجعات والفنادق - الرس
                else if (text.equals("المنتجعات والفنادق - الرس")) {
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
                // المطاعم - الرس
                else if (text.equals("المطاعم - الرس")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم الرس");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Search?q=%D8%A7%D9%84%D8%B1%D8%B3&searchSessionId=BA07EFD81073DE3E2AAC32A1D54191E21627692058237ssid&geo=2628882&sid=E10C66B5933245F4A455C154C26B2DC31627694898363&blockRedirect=true&ssrc=e ");

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
                // المذنب
                else if (text.equals("المذنب")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في المذنب.")
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

                    keyboardButton1.setText("التراث والثقافة - المذنب");
                    keyboardButton2.setText("المنتجعات والفنادق - المذنب");
                    keyboardButton3.setText("المطاعم - المذنب");

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
                // التراث والثقافة - المذنب
                else if (text.equals("التراث والثقافة - المذنب")) {

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

                    inlineKeyboardButton1.setText("متحف الفوزان");
                    inlineKeyboardButton1.setCallbackData("متحف الفوزان");

                    inlineKeyboardButton2.setText("متحف الطيور");
                    inlineKeyboardButton2.setCallbackData("متحف الطيور");

                    inlineKeyboardButton3.setText("قرية المذنب التراثية");
                    inlineKeyboardButton3.setCallbackData("قرية المذنب التراثية");

                    inlineKeyboardButton4.setText("دار الحسياني للتراث");
                    inlineKeyboardButton4.setCallbackData("دار الحسياني للتراث");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

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

                // المنتجعات والفنادق - المذنب
                else if (text.equals("المنتجعات والفنادق - المذنب")) {
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
                // المطاعم - المذنب
                else if (text.equals("المطاعم - المذنب")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم المذنب");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Search?q=%D8%A7%D9%84%D9%85%D8%B0%D9%86%D8%A8&searchSessionId=BA07EFD81073DE3E2AAC32A1D54191E21627692058237ssid&geo=2628882&sid=E10C66B5933245F4A455C154C26B2DC31627695842701&blockRedirect=true&ssrc=e ");

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
                // البكيرية
                else if (text.equals("البكيرية")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في البكيرية.")
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

                    keyboardButton1.setText("التراث والثقافة - المذنب");
                    keyboardButton2.setText("المنتجعات والفنادق - المذنب");
                    keyboardButton3.setText("المطاعم - المذنب");

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
                // التراث والثقافة - البكيرية
                else if (text.equals("التراث والثقافة - البكيرية")) {

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

                    inlineKeyboardButton1.setText("مسجد الشيخ محمد بن عبدالوهاب التاريخي");
                    inlineKeyboardButton1.setCallbackData("مسجد الشيخ محمد بن");

                    inlineKeyboardButton2.setText("متحف ومحمية الراجحي");
                    inlineKeyboardButton2.setCallbackData("متحف ومحمية الراجحي");

                    inlineKeyboardButton3.setText("مقصورة الراجحي الاثرية");
                    inlineKeyboardButton3.setCallbackData("مقصورة الراجحي الاثرية");

                    inlineKeyboardButton4.setText("مقصورة السويلم الاثرية");
                    inlineKeyboardButton4.setCallbackData("مقصورة السويلم الاثرية");


                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton3);

                    inlineKeyboardButtonList2.add(inlineKeyboardButton4);

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
                // المنتجعات والفنادق - البكيرية
                else if (text.equals("المنتجعات والفنادق - البكيرية")) {
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
                // المطاعم - البكيرية
                else if (text.equals("المطاعم - البكيرية")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("فضلًا قم بزيارة الموقع التالي:")
                            .setParseMode(ParseMode.MARKDOWN)
                            .setChatId(message.getChatId());


                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();

                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();

                    inlineKeyboardButton1.setText("مطاعم البكيرية");
                    inlineKeyboardButton1.setUrl("https://ar.tripadvisor.com/Search?q=%D8%A7%D9%84%D8%A8%D9%83%D9%8A%D8%B1%D9%8A%D8%A9&searchSessionId=BA07EFD81073DE3E2AAC32A1D54191E21627692058237ssid&geo=2628882&sid=E10C66B5933245F4A455C154C26B2DC31627696565736&blockRedirect=true&ssrc=e ");
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
                // البدائع
                else if (text.equals("البدائع")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في البدائع.")
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

                    keyboardButton1.setText("الأماكن السياحية - البدائع");
                    keyboardButton2.setText("المنتجعات والفنادق - البدائع");

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
                // التراث والثقافة - البدائع
                else if (text.equals("الأماكن السياحية - البدائع")) {

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

                    inlineKeyboardButton1.setText("منتزه المملكة");
                    inlineKeyboardButton1.setCallbackData("منتزه المم");

                    inlineKeyboardButton2.setText("مزرعة الحبردي السياحية");
                    inlineKeyboardButton2.setCallbackData("مزرعة الحبردي السياحية");

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
                // المنتجعات والفنادق - البدائع
                else if (text.equals("المنتجعات والفنادق - البدائع")) {
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
                // عيون الجواء
                else if (text.equals("عيون الجواء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في عيون الجواء.")
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

                    keyboardButton1.setText("التراث والثقافة - عيون الجواء");
                    keyboardButton2.setText("الأماكن السياحية - عيون الجواء");
                    keyboardButton3.setText("المنتجعات والفنادق - عيون الجواء");

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
                // الأماكن السياحية - عيون الجواء
                else if (text.equals("الأماكن السياحية - عيون الجواء")) {

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

                    inlineKeyboardButton1.setText("منتزه شبة الجزيرة");
                    inlineKeyboardButton1.setCallbackData("منتزه شبة الجزيرة");

                    inlineKeyboardButton2.setText("جامع ومجمع الملك فهد");
                    inlineKeyboardButton2.setCallbackData("جامع ومجمع الملك ف");

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
                // التراث والثقافة - عيون الجواء
                else if (text.equals("التراث والثقافة - عيون الجواء")) {

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

                    inlineKeyboardButton1.setText("بلدة روضة الجواء التراثية");
                    inlineKeyboardButton1.setCallbackData("بلدة روضة الجواء");

                    inlineKeyboardButton2.setText("قرية عيون الجواء التراثية");
                    inlineKeyboardButton2.setCallbackData("قرية عيون الجواء");

                    inlineKeyboardButton3.setText("صخرة عنتر وعبلة التاريخية");
                    inlineKeyboardButton3.setCallbackData("صخرة عنتر وعبلة");

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

                // المنتجعات والفنادق - عيون الجواء
                else if (text.equals("المنتجعات والفنادق - عيون الجواء")) {
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
                // رياض الخبراء
                else if (text.equals("رياض الخبراء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في رياض الخبراء.")
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

                    keyboardButton1.setText("التراث والثقافة - رياض الخبراء");
                    keyboardButton2.setText("المنتجعات والفنادق - رياض الخبراء");

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
                // التراث والثقافة - رياض الخبراء
                else if (text.equals("التراث والثقافة - رياض الخبراء")) {

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

                    inlineKeyboardButton1.setText("قرية رياض الخبراء التراثية");
                    inlineKeyboardButton1.setCallbackData("قرية رياض الخبراء");

                    inlineKeyboardButton2.setText("متحف العبري للسيارات الكلاسيكيه والتراث");
                    inlineKeyboardButton2.setCallbackData("متحف العبري للسيارات");

                    inlineKeyboardButton3.setText("البلدة القديمة بالخبراء");
                    inlineKeyboardButton3.setCallbackData("البلدة القديمة بالخبراء");

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
                // المنتجعات والفنادق - رياض الخبراء
                else if (text.equals("المنتجعات والفنادق - رياض الخبراء")) {
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

                // القصيباء
                else if (text.equals("القصيباء")) {
                    SendMessage sendMessage = new SendMessage()
                            .setText("اختر أحد الوجهات السياحية في القصيباء.")
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

                    keyboardButton1.setText("التراث والثقافة - القصيباء");
                    keyboardButton2.setText("المنتجعات والفنادق - القصيباء");

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
                // التراث والثقافة - القصيباء
                else if (text.equals("التراث والثقافة - القصيباء")) {

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

                    inlineKeyboardButton1.setText("قصر المشقوق الاثري");
                    inlineKeyboardButton1.setCallbackData("قصر المشقوق الاثري");

                    inlineKeyboardButton2.setText("قصر عنتر بن شداد التاريخي");
                    inlineKeyboardButton2.setCallbackData("قصر عنتر بن شداد");

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
                // المنتجعات والفنادق - القصيباء
                else if (text.equals("المنتجعات والفنادق - القصيباء")) {
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
            Message message2 = update.getCallbackQuery().getMessage();
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();

            SendMessage sendMessage = new SendMessage().setParseMode(ParseMode.MARKDOWN).setChatId(message2.getChatId());




            // الأماكن السياحية - الوجه
            if (data.equals("جزيرة الظهرة")) {
                sendMessage.setText("\n\n جزیرة الظھرة: ھي إحدى الجزر الواقعة في البحر الأحمر، وتتبع منطقة تبوك شمال غرب السعودیة. وھي تشبھ شكل الدلفین شمال المملكة العربیة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7902797,46.7347578 \n");
            }
            else if (data.equals("كورنيش وشواطئ الوجه")) {
                sendMessage.setText("\n\n كورنیش وشواطئ الوجھ: تنفرد مدینة الوجھ الساحلیة بشواطئھا الخلابة النقیّة الممتدة شمالاً وجنوباً.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.2596191,36.4374105 \n");
            }
            // التراث والثقافة - الوجه
            else if (data.equals("قلعة الزريب التاريخية")) {
                sendMessage.setText("\n\n قلعة الزريب التاريخية: من القلاع التاریخیة في شرق محافظة الوجھ التابعة لمنطقة تبوك، وھي قلعة كبیرة أنشئت في\n" +
                        "عصر السلطان أحمد الأول لتأمین الحجاج وخزن ودائعھم وأقواتھم، ویوجد على مدخل القلعة نقش تأسیس البناء. \n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.2528785,36.5460044 \n");
            }
            else if (data.equals("البلدة القديمة بالوجه")) {
                sendMessage.setText("\n\n البلدة القديمة بالوجه: تمتلك البلدة القدیمة في محافظة الوجھ، بما تحتویھ من مباني تاریخیة وأثریة وأسوار وقلاع\n" +
                        " \n" +
                        "وحصون ومیناء، إطلالة تبحر بالزائر نحو ذاكرة التاریخ.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.2553616,36.4464623 \n");
            }
            // الأماكن السياحية - ضباء
            else if (data.equals("وادي الديسه")) {
                sendMessage.setText("\n\n وادي الدیسه: یتمیز بوفرة جداول المیاه، وأشجار النخیل والأعشاب البریة، ماجعلھ یكتسب طبیعة منفردا، إضافةً إلى أنھ یعد واحدًا من أھم المرتكزات الطبیعیة لمشروع نیوم. جاءت تسمیتھ على قریة الدیسة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.6021254,36.4310251 \n");
            }
            else if (data.equals("كورنيش وشواطئ ضباء")) {
                sendMessage.setText("\n\n كورنیش وشواطئ ضباء: واجھة بحریة ُمطلة على البحر الأحم رتُساعد على تلطیف المناخ.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.339059,35.7074471 \n");
            }
            // التراث والثقافة - ضباء
            else if (data.equals("قلعة الأزنم التاريخية")) {
                sendMessage.setText("\n\n قلعة الأزنم التاریخیة: كانت القلعة من مراكز تموین الجیوش التي كانت تقوم بمھمة الدفاع عن الساحل الشرقي للبحر الأحمر، وتساعد بقیة القلاع الساحلیة لحمایة الدیار الإسلامیة.القلعة مبنیة من الحجر الجیري المنظم وفناءالقلعة یفتح على جمیع الوحدات الداخلیة التي تضمھا القلعة من حجرات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.0397536,36.01949920000001 \n");
            }
            else if (data.equals("البلدة القديمة بضباء")) {
                sendMessage.setText("\n\n البلدة القدیمة بضباء: تتكون البلدة القدیمة في ضباء سابقاً من منازل وسوق وجامع والقلعة والمباني القدیمة..فالبلدة القدیمة تجمع بین نظام الاحواش الذي انتشر في تخطیط المدن الاسلامیة في نھایة العصر العثماني ونظام التخطیط الحدیث الذي یعتمد على وجود ممرات مستقیمة متلاصقة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.3457474,35.7243073 \n");
            }
            else if (data.equals("قلعة الملك عبدالعزيز ضباء")) {
                sendMessage.setText("\n\n قلعة الملك عبدالعزیز: ھي أحد القلاع التي بنیت في عھد الملك عبد العزیز .بنیت القلعة على ھضبة مرتفعة لجعلھا مقراً لإمارة المنطقة، وقد بنیت من الحجر الجیري على نمط القلاع بالمنطقة والتي تم ترمیمھا لتكون مرفقاً سیاحیاً.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.3483896,35.69488949999999 \n");
            }
            else if (data.equals("قلعة المويلح التاريخية")) {
                sendMessage.setText("\n\n قلعة المویلح التاریخیة: قلعة تاریخیة ضخمة كانت سابقاً إحدى المحطات الرئیسیة لطریق الحج الساحلي وبوابة من بوابات الشمال في العصور الإسلامیة المتأخرة .وبداخلھا فناء ومسجد وبئر، ویحیط بالفناء من جمیع الجھات وحدات أقیمت لخدمة الحجاج، كما أن للقلعة أبراج من مختلف الأركان الأربعة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.6822639,35.47640949999999 \n");
            }
            // الأماكن السياحية - أملج
            else if (data.equals("كورنيش وشواطئ أملج")) {
                sendMessage.setText("\n\n كورنیش وشواطئ أملج: مسطحات خضراء مع زرقة البحر واللون الفیروزي للمیاه الصافیة للمنطقة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.0408911,37.2523595 \n");
            }
            else if (data.equals("مرسى الحرة")) {
                sendMessage.setText("\n\n مرسى الحرة: توجد خدمة تأجیر قوارب للاستمتاع بالرحلات البحریة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.2008178,37.2236256 \n");
            }
            else if (data.equals("جزيرة المقيطع")) {
                sendMessage.setText("\n\n جزیرة المقیطع: ھي إحدى الجزر الواقعة في البحر الأحمر، وتتبع منطقة تبوك شمال غرب السعودیة. تبلغ مساحة الجزیرة نحو ٤،٤ كم٢ وتبعد عن الساحل بحوالي ٠،١٠ میل بحري.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7914279,37.19280559999999 \n");
            }
            else if (data.equals("جزيرة جبل حسان")) {
                sendMessage.setText("\n\n جزیرة جبل حسان: وھي أكبر جزر أملج غیر المأھولة بالسكان ومن أشھرھا، إذ تتمتع بشواطئ رملیة خلابة ومیاه صافیة تكشف عن أسماك القاع ال ُملونة، مع مزارع تنمو على میاه الأمطار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.9650571,37.0905898 \n");
            }
            // التراث والثقافة - أملج
            else if (data.equals("متحف المناخة التراثي")) {
                sendMessage.setText("\n\n متحف المناخة التاریخي: وتشمل مجموعتھ الدائمة آثاراً ھامة ومكتبة تاریخیة وملابس وموروث شعبي وسیارات قدیمة وغیرھا الكثیر من المقتنیات التي تعكس تاریخ أملج العریق.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.05943830000001,37.27580450000001 \n");
            }
            else if (data.equals("البلدة القديمة بأملج")) {
                sendMessage.setText("\n\n القریة القدیمة بأملج: توجد فیھا بعض الآثار وبقایا الأطلال القدیمة الظاھرة في شمال مدینة أملج الحالیة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.0380387,37.25841989999999 \n");
            }

            // الأنشطة - أملج
            else if(data.equals("Hike Mania Trips")){
                sendMessage.setText("Hike Mania Trips: \nاقض صیفك و استمتع بالأجواء العلیلة في املج اھم الوجھات البحریة على ساحل البحر الأحمر حیث ترحب بالزوار من كافة أنحاء المملكة، وتتمیز بالجو المعتدل طوال العام، میاه البحر الشفافة، ووجود العدید من الجزر الرائعة. تجربة جدیدة ومختلفة. \n\n https://instagram.com/trips.hikemania?utm_medium=copy_link\n\n");
            }
            else if(data.equals("بعض النشاطات")){
                sendMessage.setText("بعض النشاطات:" + "\nhttps://desertstorm.sa/ar");
            }

            // الأماكن السياحية - حقل
            else if (data.equals("منتزه النخيل")) {
                sendMessage.setText("\n\n منتزه النخیل: المتزة الجمیل الذي یعج بالناس و تحظى برعایة جیدة جدا من دورات میاة وشلالات والعاب ترفیھیة للأطفال.وازھار بجمیع الوانھا وجسور مائیة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.2993419,34.9491164 \n");
            }
            else if (data.equals("منتزه الأمير فهد بن سلطان البحري")) {
                sendMessage.setText("\n\n منتزه الأمیر فھد بن سلطان البحري: یطل مباشرة على البحر ویشتمل على قنوات مائیة ومسطحات خضراء ورملیة وممرات مشاة وقسم للشباب وقسم للعائلات ویضم جلسات عدیدة مطلة على البحر بالإضافة إلى مطعم على شكل سفینة مكون من طابقین كما یتمیز بتواجد متحف بحري. التراث والثقافة\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.3008459,34.9406862 \n");
            }
            // التراث والثقافة - حقل
            else if (data.equals("حطام سفينة جورجيوس جي")) {
                sendMessage.setText("\n\n حطام سفینة جورجیوس جي: ھي سفینة یونانیة َجنَحت قرب مدینة تبوك على شاطئ منطقة بئر الماشي بمحافظة حقل قرب الحدود الأردنیة منذ ٤٠ عاما. \n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.8770555,34.8323464 \n");
            }
            else if (data.equals("قلعة الملك عبدالعزيز حقل")) {
                sendMessage.setText("\n\n قلعة الملك عبدالعزیز: ھي عبارة عن قلعة كبیرة، ویحیط بھا سور ،وھي مزودة بأربعة أبراج في أركانھا، بنیت القلعة من الحجر الجیري الذي كان یجلب قدیما من الشعاب المرجانیة المتكونة في السھل الساحلي من البحر الأحمر وھناك نوع آخر منھ یجلب من البر.تشابھ في بنائھا طریقة بناء القلاع الإسلامیة في العصور القدیمة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.296964,34.94628600000001 \n");
            }
            // الأماكن السياحية - تيماء
            else if (data.equals("جبل المحجة")) {
                sendMessage.setText("\n\n جبل المحجة: ھي تشكیلة صخریة تكونت بفعل عوامل التعریة والتجویة یوجد على جدرانھا بعض الرسومات والطلاسم وبعض من المخطوطات منقوشة في عصور تاریخیة مختلفة بعضھا بالخط الآرامي غیرھا من اللغات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.978845,39.5239477 \n");
            }
            else if (data.equals("حصاة النصلة")) {
                sendMessage.setText("\n\n حصاة النصلة: تلة صخریة ضخمة مقسومة إلى النصفین بشكل شبھ ھندسي، وتتسم بالشكل المخروطي الذي تشكل بسبب العوامل الجویة والریاح.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.2294006,38.5717237 \n");
            }
            // التراث والثقافة - تيماء
            else if (data.equals("سور تيماء الأثري")) {
                sendMessage.setText("\n\n سور تیماء الأثري: ھو سور یحیط بمدینة تیماء القدیمة من الجھات الغربیة والجنوبیة والشرقیة عدا الجھة الشمالیة التي تشغلھا الأرض الملحیة المعروفة بالسبخة. وھو مشید من الحجارة واللبن والطین.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.6173655,38.5533351 \n");
            }
            else if (data.equals("قصر الرمان الأثري")) {
                sendMessage.setText("\n\n قصر الرمان الأثري: تعكس ھندستھ المعماریة تلك التي اتبعتھا المناطق الحضریة في الماضي.القصر مبني من مواد طبیعیة كالحجر والرخام وتحیط بھ أسوار كبیرة جعلت منھ حصنا منیعا.ویتمیز القصر أی ًضا بأبراجھ وساحتھ الداخلیة وطابقین مع غرف یخدم كل منھا وظیفة معینة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.63435579999999,38.5560599 \n");
            }
            else if (data.equals("منتزه بئر هداج التاريخي")) {
                sendMessage.setText("\n\n منتزه بئر ھداج التاریخي: من أشھر الآبار في جزیرة العرب یقع البئر في وسط البلدة القدیمة داخل إطار دائري من أشجار النخیل الباسقة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.6348019,38.553434 \n");
            }
            else if (data.equals("متحف تيماء للآثار والتراث")) {
                sendMessage.setText("\n\n متحف تیماء للآثار والتراث: یحتوي على لوحات لخرائط المواقع الأثریة بتیماء وتعرض مجموعة من القطع الأثریة والكتابات والنقوش الصخریة القدیمة المنتشرة في المنطقة، ومن أھمھا مسلة تیماء والتي عرضت لفترة بمتحف اللوفر بباریس. و یضم المتحف مكتبة تحتوى على مجموعة من الكتب المتخصصة بالإضافة إلى بعض الدوریات والنشرات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.628145,38.5443782 \n");
            }
            else if (data.equals("قصر الرضم الأثري")) {
                sendMessage.setText("\n\n قصر الرضم الأثري: یعود بناء القصر إلى العصر الحدیدي في النصف الأول من الألف قبل المیلاد.ھو قصر في وسطھ بئر، وجدرانھ مشیدة من الحجارة المصقولة، ولھ دعائم من الخارج، ویمكن مشاھدة دعامات حجریة ضخمھ ساھمت في صموده عبر القرون.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.6354019,38.54135769999999 \n");
            }
            else if (data.equals("قلعة المعظم التاريخية")) {
                sendMessage.setText("\n\n قلعة المعظم التاریخیة: ھي قلعة تاریخیة تعد من آثار العصور الإسلامیة المتأخرة وتعد من أكبر القلاع العثمانیة التي كانت تستخدم لمراقبة الحجیج وحمایتھم، وتشمل ب ّركة المعظم ومحطة سكة الحدید، حیث یوجد على واجھة ھذه القلعة أربعة نقوش تأسیسیة لبنائھا.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.7408897,37.5087619 \n");
            }
            // الأماكن السياحية - البدع
            else if (data.equals("جبل اللوز")) {
                sendMessage.setText("\n\n جبل اللوز: یسمى بجبل اللوز لوجود شجر اللوز بھ قدیما وتنتشر بالمنطقة الرسوم الصخریة التي یرجع تاریخھا حوالي ١٠٫٠٠٠ سنة قبل المیلاد، بالإضافة إلى النقوش القدیمة والكتابات الإسلامیة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.6460625,35.28625299999999 \n");
            }
            else if (data.equals("جزيرة أم عسيله")) {
                sendMessage.setText("\n\n جزیرة أم عسیلھ: تتمیز الجزیرة برمالھا الناعمة وتنوع الأشجار على مساحة كبیرة منھا كذلك وجود كثبان رملیة .ویتمیز شاطئ الجزیرة كباقي شواطئ تبوك بالبیئة الخلابة وتنوع شاطئھا وأعماقھ بالشعب المرجانیة التي یتواجد بھا العدید من الكائنات البحریة المتنوعة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.0627313,35.0875281 \n");
            }
            else if (data.equals("شواطئ مقنا")) {
                sendMessage.setText("\n\n شواطئ مقنا: یستھوي الكثیر من محبي مختلف الریاضات البحریة بما فیھا الغوص، لجمال خلجانھ والتدرجات اللونیة لتشكیلاتھ الرملیة من الحصى الناعم والصغیر، وبتنوع بیئتھ البحریة، وصفاء وعمق میاھھ التي تكتنز حدائق المرجان وتجتمع حولھا مختلف الكائنات البحریة بألوانھا البدیعة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.4038955,34.7575059 \n");
            }
            else if (data.equals("وادي طيب اسم")) {
                sendMessage.setText("\n\n وادي طیب اسم: عبارة عن شق وسط جبال شاھقة تتوسطھا میاه جاریة طوال العام، وعلى مدخلة البحري تقع واحة من￼ النخیل،والشق ضیق لدرجة لا تسمح إلا بمرور سیارة واحدة فقط. ویوجد بالوادي ثلاثة عیون أكثرھا حلاوة تلك التي على مقربة من البحر.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.5598732,34.8021448 \n");
            }
            else if (data.equals("شواطئ راس الشيخ حميد")) {
                sendMessage.setText("\n\n شواطئ راس الشیخ حمید: تعتبر منطقة رأس الشیخ حمید من المناطق الممیزة لھواة السباحة والغوص، حیث تتمیز میاه المنطقة بالصفاء، كما یمكن للزائر رؤیة جبال شرم الشیخ والطور ومضائق تیران.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.1181582,34.6303372 \n");
            }

            // التراث والثقافة - البدع
            else if (data.equals("مغائر النبي شعيب")) {
                sendMessage.setText("\n\n مغائر النبي شعیب: تحتفظ مغائر شعیب بشكلھاالقدیم،حیث نُحتت مساكنھا بالجبال،واتخذ تفیما بعد مقاب في أشكال ھندسیة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.4878045,35.0033202 \n");
            }
            else if (data.equals("حطام الطائرة المائية كاتلينا")) {
                sendMessage.setText("\n\n حطام الطائرة المائیة كاتلینا: طائرة برمائیة أمیركیة الصنع حیث لا یزال حطامھا یقبع ھناك منذ نحو ٥٧ عاما.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.090771,34.608709 \n");
            }
            // الأماكن السياحية - تبوك
            else if (data.equals("مجمع ستيشن 67")) {
                sendMessage.setText("\n\n مجمع ستیشن ٦٧: انشأت إحدى الأسر السعودیة بمنطقة تبوك محطة نموذجیة وعصریة لخدمة المسافرین والسیاح القادمین إلى مدینة تبوك ، ُص ّممت بأسلوب المحطات المفتوحة وعربات وحاویات الشحن ، بأكثر من ٢٥ مطعما ومقھ ًى ومنطقة ألعاب للأطفال ، وسوبر ماركت ، وتطویر مفھوم الفود تراك ، بخدمة عالیة الجودة على مدار الساعة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7788031,46.71941699999999 \n");
            }
            else if (data.equals("بحيرة الرايس")) {
                sendMessage.setText("\n\n بحیرة الرایس: محاطة بخُضرة تزید من جمالھا وتجذب الكثیر من المتنزھین لیجلسوا حولھا وینالوا قسطاً من الراحة وتصفیة أذھانھم من مشاغل الحیاة بعیداً عن أجواء المدینة الصاخبة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7880985,46.7879612 \n");
            }
            else if (data.equals("جادة الأمير فهد بن سلطان")) {
                sendMessage.setText("\n\n جادة الأمیر فھد بن سلطان: یوجد بالجادة العدید من محلات الملابس الخاصة بالرجال والنساء والأطفال ومحلات لبیع المجوھرات والكمالیات ومحلات بیع الأدوات الریاضیة وغیرھا.وعدد من المطاعم والفنادق ومقرات لفروع بنوك رئیسیة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.3850374,36.5630969 \n");
            }
            else if (data.equals("جرين لاند (حديقة الطيور)")) {
                sendMessage.setText("\n\n جرین لاند حدیقة الطیور: تحتوي على ملاھي بھا العدید من الألعاب التي تناسب الأطفال لاسیما الأعمارالصغیرة، كما تحتوي بداخلھا على حدیقة للحیوانات تضم مختلف أنواع الحیوانات والطیور التي یقوم الأطفال برؤیتھا وإطعامھا، كما تضم الحدیقة مساحات خضراء ومسطحات شاسعة، تسمح للعوائل بالجلوس والاسترخاء، أو المشي والتنزه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.3997279,36.5655876 \n");
            }
            else if (data.equals("منتزه الأمير فهد بن سلطان")) {
                sendMessage.setText("\n\n منتزه الأمیر فھد بن سلطان: یقع منتزة الأمیر فھد بن سلطان في تبوك وھي من المناطق الزراعیة المھمة في المملكة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.4317636,36.5749682 \n");
            }
            // التراث والثقافة - تبوك
            else if (data.equals("متحف محطة سكة حديد الحجاز")) {
                sendMessage.setText("\n\n متحف محطة سكة حدید الحجاز: یركز المتحف على تاریخ سكة الحجاز التي بنیت في عھد عبد الحمید الثاني وقد تم جمع عدة عربات ومحركات من مناطق ومحطات أخرى على السكة وقد اعید ترمیم إحدى المحركات وباستطاعتھا الحركة على سكة المتحف.و یحتوى المتحف أیضا على أواني فخاریة، أدوات القھوة، مجموعة من العملات الورقیة، أسلحة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4619371,39.6009011 \n");
            }
            else if (data.equals("متحف تبوك الإقليمي")) {
                sendMessage.setText("\n\n متحف تبوك الإقلیمي: ھو متحف حكومي الھدف من بناءه ھو التوعیة و نشر الثقافة . یقع المتحف في صالة العروض بإدارة التربیة و التعلیم بمنطقة تبوك ،ویتكون المتحف من قاعات العروض المتحفیة و الإدارة والمكتبة و المستودعات.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.3878143,36.5619096 \n");
            }
            else if (data.equals("مسجد التوبة التاريخي")) {
                sendMessage.setText("\n\n مسجد التوبة التاریخي: تعود نشأة المسجد إلى غزوة تبوك سنة ٩ ھـ حیث أدى الرسول محمد الصلاة فیھ عشر لیال وأعاد بناءه مرة أخرى في العھد السعودي وأمر بتجدید بنائھ على طراز الحرم النبوي الشریف في عام ١٣٩٣ ھـ.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.3840072,36.55768 \n");
            }
            else if (data.equals("متحف قلعة تبوك الإسلامية")) {
                sendMessage.setText("\n\n متحف قلعة تبوك الإسلامیة: یقع في داخل قلعة تبوك التاریخیة الشھیرة في المملكة والتي یعود تاریخ بنائھا إلى القرن الخامس والثلاثین قبل المیلاد ویحتوي على مجموعة كبیرة من التحف والوثائق التي تعود إلى زمن النبي محمد صلى الله علیھ وسلم.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.3827152,36.556315 \n");
            }
            else if (data.equals("مطعم ومتحف القرية التراثية")) {
                sendMessage.setText("\n\n مطعم ومتحف القریة التراثیة: وھو من مطاعم تبوك الممیزة. تم تزیین جدران المطعم بقطع أثریة قدیمة للمملكة السعودیة وكذلك صور قدیمة لمدینة تبوك.كذلك ما یمیز المطعم أكلاتھم الشعبیة التراثیة الخاصة بجمیع مناطق المملكة.\n\n" + "\n hhttps://www.google.com/maps/search/?api=1&query=28.4004635,36.5513008 \n");
            }
            else if (data.equals("مركز بن عاصي للتراث والفروسية")) {
                sendMessage.setText("\n\n مركز بن عاصي للتراث والفروسیة: یعبر عن ریاضة الفروسیة والجوانب التراثیة. استقبال وفود سیاحیة ، زیارات من شتى أنحاء المملكة معتمدمن قبل ھیئة السیاحة والتراث.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.3999895,36.4072558 \n");
            }
            else if (data.equals("جبل السفينة في بجدة")) {
                sendMessage.setText("\n\n جبل السفینة في بجدة: جبل یضم آثارا جیولوجیة وتاریخیة .س ّمي بجبل السفینة لتكوینھ الذي یبدو في ھیئتھ أقرب إلى السفینة.تعددت النقوش والآثار على جبل السفینة التي توثق حیاة أقوام سابقة مرت على المنطقة.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.3271534,35.8032337 \n");
            }
            else if (data.equals("عين السكر التاريخية")) {
                sendMessage.setText("\n\n عین السكر التاریخیة: عین ماء یقع في مدینة تبوك الواقعة إلى الشمال الغربي من المملكة العربیة السعودیة. یعود تاریخ العین إلى فترة بعثة النبي محمد، واستمرت منذ ذلك التاریخ حتى الآن.\n\n\n" + "\n https://www.google.com/maps/search/?api=1&query=33.45333329999999,36.3858333 \n");
            }

            // التسوق - تبوك
            else if (data.equals("ميلاغرو بوتيك")) {
                sendMessage.setText("\n\n میلاغرو بوتیك: یضم المول أشھر الماركات العالمیة لتلبیة جمیع احتیاجات المتسوقین.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.3864687,36.5921652 \n");
            }
            else if (data.equals("تبوك بارك")) {
                sendMessage.setText("\n\n تبوك بارك: یعتبر المول الأكبر في منطقة تبوك و یقدم علامات تجاریة تتواجد لأول مرة في المنطقة.یحتوي على منافذ تجاریة و مطاعم و ملاھي للأطفال و الذي بدوره یخلق ٣٠٠٠ وظیفة متنوعة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.429449,36.5727825 \n");
            }
            else if (data.equals("المكان مول")) {
                sendMessage.setText("\n\n المكان مول: یضم العدید من العلامات التجاریة، ویتكون من بدروم وطابقین ضخمین، ویعتبر من افضل الاماكن\n" +
                        "السیاحیة في تبوك.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.4049055,36.54533230000001 \n");
            }
            // الأنشطة - تبوك
            else if (data.equals("سفاري تبوك")) {
                sendMessage.setText("\n\n سفاري تبوك وادي الديسه (يوم واحد)\n الوصول إلى الموقع المحدد\n الالتقاء والانتقال إلى وادي الديسه (٢٥٠ كم) \n الوصول وبدء استكشاف الوادي (ساعة واحدة)\n تناول الغداء في الموقع\n إكمال استكشاف الوادي (٤ ساعات)\n العودة إلى تبوك وتناول العشاء\n الذهاب إلى الموقع المحدد ونهاية خدماتنا\n\n للتواصل: 00966565060801 \n\n Instagram: https://instagram.com/tourzable?utm_medium=copy_link \n\n تصفح عبر: https://tourzable.com/ar/home-search?city=20&date=2021-07-29\n \n\n" + "\n \n");
            }

            // مدينة مكة المكرمة
            // الأماكن السياحية - مكة
            if (data.equals("الحكير تايم الترفيهي")){
                sendMessage.setText(  " \n\n مركز الحكير تايم الترفيهي: يحتوي على عدد كبير من الألعاب المشوقة الموزعة بين ساحاته الخارجية و صالاته الداخلية على مساحته البالغة  ١٧٠ ألف متر، منها : الدولاب الكبير والبندول ، بالإضافة إلى القطار السريع.  \n\n"+ "\n https://goo.gl/maps/2Zdhq1jRcexwwLxf7 \n");

            }
            else if(data.equals("جامع الراجحي")){
                sendMessage.setText("\n\n جامع الراجحي: مسجد كبير تمتلكه شركة سليمان بن عبد العزيز الراجحي الوقفية التابعة لشركة أوقاف سليمان الراجحي القابضة .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.3817017,39.8739757 \n" );
            }

            else if(data.equals("مصنع كسوة الكعبة المشرفة")){
                sendMessage.setText("\n\n مصنع كسوة الكعبة المشرفة: يضم المصنع العديد من الأقسام المتخصصة في صباغة غزل الحرير، وعمليات النسيج، والتطريز والتجميع ، حيث تمر الكسوة على عدة مراحل. \n\n" + "\nhttps://www.google.com/maps/search/?api=1&query=21.43472659999999,39.7567548 \n" );
            }
            // التراث والثقافة - مكة
            else if(data.equals("متحف الدينار الإسلامي")){
                sendMessage.setText("\n\n متحف الدينار الإسلامي: هو متحف في مكة المكرمة يهتم بالنقود الإسلامية ، بالإضافة لوجود مقتنيات تاريخية وتراثية أخرى.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7764602,46.6980979 \n" );
            }

            else if(data.equals("متحف التراث الانساني")){
                sendMessage.setText("\n\n متحف التراث الإنساني: يقوم المتحف بشراء وبيع القطع الأثرية وتأجيرها وإقامه الاحتفالات والمهرجانات التراثيه ، كما يقوم بتنسيق الزيارات الجماعية والفردية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.404524,39.87898939999999 \n" );
            }

            else if(data.equals("متحف أبو بكر العامودي")){
                sendMessage.setText("\n\n متحف أبو بكر العامودي للتراث: المتحف يهدف إلى التعريف بالتراث السعودي من مختلف مناطق المملكة بشكل عام، وعرض التراث المكي بشكل خاص ، وما يحتويه من معالم تاريخية ، وحضارية .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.3531099,39.6284985 \n" );
            }
            else if(data.equals("متحف مكة للتراث والآثار")){
                sendMessage.setText("\n\n متحف مكة للتراث والآثار: هو متحف لتاريخ وحضارة مكة المكرمة على درجة الخصوص.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.4461466,39.807936 \n" );
            }
            else if(data.equals("متحف عمارة الحرمين الشريفين")){
                sendMessage.setText("\n\n متحف عمارة الحرمين الشريفين: هو معرض يعنى بالحرمين الشريفين ، والتطور الذي شهدته عمارتهما على مدى العصور، ويتكون المعرض من سبع قاعات تشتمل على مجسمين للحرمين الشريفين وعدد من المقتنيات المختلفة من مخطوطات وغيرها.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.433782,39.754361 \n" );
            }

            else if(data.equals("متحف أم القرى")){
                sendMessage.setText("\n\n متحف أم القرى: ينقسم إلى قسمين قسم في الساحة الخارجية ، وقسم داخل المبنى ، القسم الخارجي : يضم نموذج لمساكن مكة المكرمة قديماً .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5811888,39.2183456 \n" );
            }
            else if(data.equals("متحف الفلك وعلوم الفضاء")){
                sendMessage.setText("\n\n متحف الفلك وعلوم الفضاء في برج الساعة: يتكون المتحف من أربعة طوابق مخصصة للكون وهي : طابق الشمس ، طابق القمر ، طابق قياس الوقت  ، وطابق الساعة، ويحتوي على إطلالة بانوراميه على الحرم المكي الشريف.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.419671,39.8256859 \n" );
            }

            // التسوق - مكة
            else if(data.equals("مكة مول")){
                sendMessage.setText("\n\n مكة مول: يحتوي على أكبر المحلات التجارية والعالمية، والعديد من المطاعم ذات الشهرة العالمية، ويلبي جميع احتياجات الزوار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.3910788,39.8845888 \n" );
            }
            else if(data.equals("الضيافة مول")){
                sendMessage.setText("\n\n الضيافة مول : واحد من أشهر أماكن التسوق التي توجد في مدينة مكة ، وأهم ما يميز المركز هو أنه يحتوي على مجموعة كبيرة من المحلات التجارية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.4415874,39.8006328 \n" );
            }
            else if(data.equals("الحجاز مول")){
                sendMessage.setText("\n\n الحجاز مول : يُعد أحد أقدم المراكز التجارية ، كما يمثل السوق أحد أشهر الوجهات لقاصدي سوق الذهب ،  والمجوهرات ، والأقمشة بالإضافة إلى الملابس ، حيث يضم علامات تجارية رائدة في عالم الذهب والمجوهرات والأقمشة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.4235506,39.7821848 \n" );
            }
            else if(data.equals("مجمع وقف الملك عبدالعزيز")){
                sendMessage.setText("\n\n مجمع وقف الملك عبدالعزيز في برج الساعة : يميز وقف الملك عبدالعزيز هو القرب من المسجد الحرام ، واتصاله المباشر بساحات الحرم الخارجية ، وتتربع على قمة الوقف أعلى وأكبر ساعة فـي العالم تحتوي على أكبر شعار للمملكة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.4182719,39.8254191 \n" );
            }
            else if(data.equals("مجمع اعمار جبل عمر")){
                sendMessage.setText("\n\n مجمع اعمار جبل عمر : شُيِّد مشروع جبل عمر بتصميم فريد وخدمات خاصة تتناسب مع قدسية المكان، لتمنح حجاج ومعتمري وزوَّار بيت الله الحرام والكعبة المشرَّفة الراحة والسكينة والهدوء.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.4208518,39.8182189 \n" );
            }

            // معالم التاريخ الإسلامي - مكة
            else if(data.equals("عين زبيدة")){
                sendMessage.setText("\n\n عين زبيدة: عين عذبة الماء غزيرة وإحدى روائع أوقاف المسلمين، أمرت بإنشائها الأميرة زبيدة بنت أبي الفضل جعفر بن أبي جعفر المنصور العباسية الهاشمية، زوجة هارون الرشيد.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.4427464,44.20451720000001 \n" );
            }
            else if(data.equals("مسجد الشجرة")){
                sendMessage.setText("\n\n مسجد الشجرة: تعود تسمية مسجد الشجرة بهذا الاسم إلى المكان الذي شهد قصة أن شجرة في ذات الموقع قدمت إلى الرسول - صلى الله عليه وسلم - وسلمت عليه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.5124925,49.9904634 \n" );
            }
            else if(data.equals("مسجد الراية")){
                sendMessage.setText("\n\n مسجد الراية: سمي بهذا الاسم لأنه تم بناءه في الموضع الذي غز فيه رسول الله رايته يوم فتح مكة في شهر رمضان من العام الثامن للهجرة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.4802423,39.6034072 \n" );
            }
            else if(data.equals("مسجد نمره")){
                sendMessage.setText("\n\n مسجد نمره: واحد من أهم المعالم في مشعر عرفات، وبه يصلي عشرات الآلاف من ضيوف الرحمن حجاج البيت الحرام صلاة الظهر وصلاة العصر في يوم عرفة جمعاً وقصرا ً اقتداء بالنبي محمد  - صلى الله عليه وسلم -. \n\n" + "\n  https://www.google.com/maps/search/?api=1&query=21.3528786,39.96675 \n" );
            }
            else if(data.equals("مسجد البيعة")){
                sendMessage.setText("\n\n مسجد البيعة: مسجد بناه أبو جعفر المنصور سنة ١٤٤ هـ  في المكان الذي اجتمع فيه النبي محمد مع الأنصار حيث بايعوه بيعة العقبة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.424687,39.8674858 \n" );
            }
            else if(data.equals("غار حراء")){
                sendMessage.setText("\n\n غار حراء: هو الغار الذي كان يختلي فيه رسول الله محمد  -صلى الله عليه وسلم - ،  قبل البعثة ونزول القرآن عليه بواسطة المَلَك جبريل ، وهو المكان الذي نزل الوحي فيه لأول مرة على النبي -صلى الله عليه وسلم - .\n\n" + "\n  https://www.google.com/maps/search/?api=1&query=21.6149603,39.132285 \n" );
            }
            else if(data.equals("مسجد الجن")){
                sendMessage.setText("\n\n مسجد الجن: سمي بهذا الاسم لأن العسس يجتمعون عنده ليلاً ، ويقال الموضع الذي خطه الرسول- صلى الله عليه وسلم - لابن مسعود ليلة استمع إليه الجن، وأن الجن بايعوا الرسول -صلى الله عليه وسلم - .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.4334258,39.82893809999999 \n" );
            }
            else if(data.equals("مسجد التنعيم")){
                sendMessage.setText("\n\n مسجد التنعيم: منه يحرم أهالي مكة للحج والعمرة ،  اكتسب شهرته من كونه بُني في الموضع الذي أحرمت منه أم المؤمنين عائشة بنت أبي بكر بالعمرة في حجة الوداع سنة ٩ للهجرة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.4679915,39.8011712 \n" );
            }
            else if(data.equals("غار ثور")){
                sendMessage.setText("\n\n غار ثور: في فترة الهجرة النبوية من مكة المكرمة إلى المدينة المنورة ، أوى إلى الغار النبي محمد -صلى الله عليه وسلم -   و أبو بكر الصديق  – رضي الله عنه -  وهما في طريقهما إلى المدينة المنورة ، حتى ذهاب قريش عنهما التي كانت تطاردهما ثم تابعا طريقهما بعد ذلك.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.377189,39.8497564 \n" );
            }
            else if(data.equals("بيت الله الحرام")){
                sendMessage.setText("\n\n بيت الله الحرام : هو أعظم مسجد في الإسلام ، تتوسطه الكعبة المشرفة التي هي أول بيت وضع للناس على وجه الأرض ليعبدوا الله فيه تبعاً للعقيدة الإسلامية، وهذه هي أعظم وأقدس بقعة على وجه الأرض عند المسلمين.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.42287139999999,39.8257347 \n" );
            }
            else if(data.equals("قصر بن سليمان التاريخي")){
                sendMessage.setText("\n\n قصر بن سليمان التاريخي: يشتهر هذا القصر كواحد من المعالم التاريخية والأثرية المهمة في مكة المكرمة والذي شُيّد قبل ثمانين عام، ولا يزال القصر يحافظ على هيئته وتصميمه المذهل نظراً لبنائه من المواد القوية والصلبة.\n\n" + "\n  https://www.google.com/maps/search/?api=1&query=21.4295324,39.8159669 \n" );
            }
            else if(data.equals("قصر السقاف التاريخي")){
                sendMessage.setText("\n\n قصر السقاف التاريخي: من المباني القديمة بمكة ، حاملاً طابعاً إسلامياً في المعمار لاحتوائه على الكثير من العناصر الفنية ، والزخرفات الإسلامي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.4397823,39.83787150000001 \n" );
            }

            // جدة

            //الأماكن السياحية - جدة
            else if(data.equals("بلاجيو")){
                sendMessage.setText("\n\n بلاجيو: منتجع يضم مطعم مجهز على أحدث طراز يقدم جميع أنواع الأطعمة المفضلة إليك، ويوفر جميع أنواع المشروبات التي تفضل تناولها بمذاق لذيذ.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.3962411,39.3224178 \n" );
            }
            else if(data.equals("مرسى الأحلام")){
                sendMessage.setText("\n\n مرسى الاحلام: يقع على ساحل البحر الأحمر وهو واحد من بين فروع مرسى الأحلام التي توجد في المملكة، وهو عبارة عن مرسى كبيرة الحجم يتم بها تقديم أفضل وأجود الخدمات، وقد تم وضع لمسة من الهدوء على المكان حتى يتناسب مع العائلات ومحبى الهدوء والاستمتاع بالبحر ويحيط بها الأمواج من جميع الاتجاهات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.736824,39.122902 \n" );
            }
            else if(data.equals("كنز ابحر")){
                sendMessage.setText("\n\n كنز ابحر: يتميز بإطلالة ساحرة على البحر، وبتقديم ألذ المأكولات والمشروبات بخدمة مميزة وبجلسات هادئة تمتزج مع الحدائق والأشجار الخضراء الجميلة بمساحاتها الشاسعة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.7319403,39.1173972 \n" );
            }
            else if(data.equals("جزيرة الشراع")){
                sendMessage.setText("\n\n جزيرة الشراع: تقع على الواجهة البحرية لكورنيش جدة وتضم أحواض سباحة رائعة للأطفال من جميع الأعمار. \n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.6252935,39.1044821 \n" );
            }
            else if(data.equals("ممشى شارع التحلية")){
                sendMessage.setText("\n\n ممشى شارع التحلية: هو مشروع مشترك لبناء مركز تجاري متعدد الطوابق ، يركز على خدمات الطعام والشراب على طريق التحلية ، ويحتوي المركز التجاري.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5461936,39.1305989 \n" );
            }
            else if(data.equals("ممشى شارع فلسطين")){
                sendMessage.setText("\n\n ممشى شارع فلسطين: ممشى لممارسة رياضة المشي في شارع فلسطين بجدة. \n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5201597,39.15659160000001 \n" );
            }
            else if(data.equals("الواجهة البحرية الوسطى")){
                sendMessage.setText("\n\n الواجهة البحرية الوسطى: يعد كورنيش جدة بشواطئه الرملية الذهبية الممتدة وممراته الخلابة ، أحد أبرز كنوز المدينة ومعالمها حيث تتميّز مساحات الواجهة البحريَّة الممتدة والمفتوحة بكونها وجهةً مفضلةً لنزهة العائلات، ولعب الأطفال في الحدائق ومرشَّات النوافير، ويمكن للبالغين الاشتراك في مجموعةٍ مختارةٍ من الرياضات المائيَّة على الشاطئ، واستئجار الدراجات الهوائيَّة وركوبها، أو التنزُّه في الرصيف.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5461936,39.1305989 \n" );
            }
            else if(data.equals("اعمار سكوير جدة")){
                sendMessage.setText("\n\n اعمار سكوير جدة: يعد إعمار سكوير المنطقة التجارية لمشروع باب جدة متعدد الاستخدامات الذي تطوره إعمار الشرق الأوسط وهو يوفر للعملاء تجربة مكاتب تجارية غير مسبوقة تجمع بين المرافق العصرية الفاخرة وبيئة الأعمال فائقة الحداثة وتتوزع المباني حول ساحة الهلال، وتتميز بإطلالة على الساحة ونافورة الماء التفاعلية والمتاجر الفاخرة، إضافة إلى المطاعم.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5092179,39.20341069999999 \n" );
            }
            else if(data.equals("فقيه اكواريوم")){
                sendMessage.setText("\n\n فقيه اكواريوم : يعتبر فقيه اكواريوم أحد اجمل اماكن السياحة في جدة  ، يضم عدة احواض مائية منها :  انواع مختلفة من الاسماك ، منها الصغير ،  ومنها الكبير كأسماك القرش ،  واسد البحر ،  والفقمة، ويعتبر من اهم حدائق جدة الترفيهية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5722338,39.109632 \n" );
            }
            else if(data.equals("كورنيش جدة")){
                sendMessage.setText("\n\n كورنيش جدة: أحد أهم معالم السياحة في جدة، يمتد على طول ساحل البحر الأحمر، على الجانب الغربي لمدينة جدة. وهو من أكبر الواجهات البحرية، يتميز بوجود الكثير من المراكز التجارية، الملاهي، المطاعم، المنتزهات، الفنادق العالمية الرائعة والمنتجعات السياحية الفاخرة. كما يوجد به نافورة جدة المُبهرة.\n\n" + "\n https://goo.gl/maps/fjXm65rJxQc74BRm6 \n" );
            }
            else if(data.equals("نافورة الملك فهد")){
                sendMessage.setText("\n\n نافورة الملك فهد: تُشاهَد نافورة الملك فهد، الواقعة على ساحل البحر الأحمر، من كل مكان في جدة، كما هي من المعالم السياحية الأكثر شعبية في المدينة. وبفضل ارتفاعها، الذي يبلغ 312 مترًا، حيث إنها أطول نافورة في العالم، توجد أماكن كثيرة يمكن مشاهدة عرض نافورة الملك فهد منها، ولكن الكورنيش هو أفضل المواقع.\n\n" + "\n https://goo.gl/maps/7Z8bMduXcRg7nGeu8 \n" );
            }
            else if(data.equals("غواصين بحر الصحراء")){
                sendMessage.setText("\n\n غواصين بحر الصحراء: يٌعد منتجع غواصين بحر الصحراء واحد من أهم و أفضل عشرة سواحل للغوص في العالم، حيث يُمكنك تعلم الغوص من خلال أمهر الغواصين المُختصين.\n\n" + "\n https://goo.gl/maps/2azbuk7S8H1o5BBJ7 \n" );
            }
            else if(data.equals("متحف جدة المفتوح")){
                sendMessage.setText("\n\n متحف جدة المفتوح للمجسمات: يضم المتحف ٢٠ مجسماً فنياً من أعمال كبار الفنانين التشكيليين العالميين.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5334615,39.1575469 \n" );
            }
            else if(data.equals("سوق الجمعة التراثي")){
                sendMessage.setText("\n\n سوق الجمعة التراثي: يجتذب السوق أعداداً غفيرة من الزوار، وبدت أنشطته مكتظة بالجماهير التي توزعت على المحال التجارية البالغة أكثر من   ٣٠ دكاناً ، ونحو ٤٠ دكاناً متفرقة على جنبات السوق ، بالإضافة إلى أنشطة أخرى تفوق ٢٠ نشاطاً ذات طابع تراثي ولها جاذبية خاصة تشعر الجمهور بأجواء الأسواق الشعبية القديمة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7708723,46.7644143  \n" );
            }
            else if(data.equals("الواجهة البحرية الشمالية")){
                sendMessage.setText("\n\n الواجهة البحرية الشمالية:  تتميّز مساحات الواجهة البحريَّة الممتدة والمفتوحة بكونها وجهةً مفضلةً لنزهة العائلات، ولعب الأطفال في الحدائق ومرشَّات النوافير.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.4986759,50.130284 \n" );
            }
            else if(data.equals("كيدزانيا")){
                sendMessage.setText("\n\n كيدزانيا جدة: هي مدينة متكامله بنيت خصيصا للأطفال تقع في مول العرب البوابة ٦ الدور الثاني، إلى جانب الألعاب والمرح سيتمكن الطفل من ممارسة وتعلم الكثير من الأعمال، سيمكنه العمل كطبيب أو ضابط شرطة وكثير من الوظائف الأخرى، يوجد بها مناطق للراحة والطعام والتسوق والهدايا التذكارية.\n\n" + "\n https://goo.gl/maps/KczBQKio9Qq4zc5DA \n" );
            }
            //المنتزهات والترفيه - جدة

            else if(data.equals("سماش")){
                sendMessage.setText("\n\n سماش: هو الوجهة الجديدة للترفيه و الرياضة ، وهو المكان المفضل لمحبي ألعاب الرياضة و الواقع الافتراضي و الألعاب الحركية و الالكترونية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7687375,46.7154866 \n" );
            }
            else if(data.equals("جنغل لاند")){
                sendMessage.setText("\n\n جنغل لاند: من أهم الأماكن الترفيهية في جدة ، تتميز بأنها غابة ترفيهية بتصميم مستوحاه من القارة الأفريقية بلمسات وألوان الأدغال وتصاميم أفريقية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7737198,46.713522 \n" );
            }
            else if(data.equals("اكوا بارك")){
                sendMessage.setText("\n\n اكوا بارك: أحد افضل منتزهات جدة ،  يأتيها العديد من الزوار سواء من السكان المحليين أو السياح من مختلف البلدان ،  وتتميز بمرافق خدمية ممتازة ومتطورة ، لقضاء وقت ممتع سواء للكبار أو الصغار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2455334,40.3634072 \n" );
            }
            else if(data.equals("منتزه الأمواج")){
                sendMessage.setText("\n\n منتزه الأمواج : تضم مجموعة متنوعة من الألعاب الإلكترونية و الكهربائية الرائعة ، وتُعتبر من الاماكن الترفيهية التي تُناسب جميع أفراد الاسرة بمختلف الأعمار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5992976,39.2862801 \n" );
            }
            else if(data.equals("مون تون")){
                sendMessage.setText("\n\n مون تون: صالة مغلقة مُخصصة للأطفال في الصيرفي مول وهي مليئة بالألعاب الشيقة و المُثيرة مثل: التسلق على الحائط، ألعاب الفيديو جيمز، و ألعاب كهربائية، و لعبة سباق السيارات، و غيرها الكثير من الألعاب الآمنة تماماً على الأطفال.\n\n" + "\n \n" );
            }
            else if(data.equals("اوكتو")){
                sendMessage.setText("\n\n اوكتو: ألعاب ترفيهية، وفعاليات وتجارب جديدة تتناسب مع مختلف الأعمار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.595196,39.229232 \n" );
            }
            else if(data.equals("ان تن سو")){
                sendMessage.setText("\n\n ان تو سو:  أفضل مكان للمراهقين في التمتع ، لديها طاولات السنوكر، ومحطات اللعب وسباق السيارات، وهناك أيضاً مجموعة واسعة من الألعاب الصعبة، ومنطقة البولينج ومنطقة ترفيهيَّة للاستمتاع بالوجبات الخفيفة والمشروبات.\n\n" + "\n  \n" );
            }
            else if(data.equals("ايس لاند")){
                sendMessage.setText("\n\n ايس لاند : أول مركز متخصص للترفيه لكافة الأعمار، به ألعاب إلكترونيَّة وبولينج، بالإضافة إلى التزلج على الجليد.\n\n" + "\n https://goo.gl/maps/SoLWHrJEGZ4Rh3eU9\n \n" );
            }
            else if(data.equals("مون تون")){
                sendMessage.setText("\n\n مون تون: ملاهي يوجد بها أماكن مثاليَّة للأطفال، حيث يمكنهم التمتع بركوب الألعاب المختلفة، والأنشطة البدنيَّة، وألعاب الكمبيوتر.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5608944,39.1862566 \n" );
            }
            else if(data.equals("هابي لاند عطا")){
                sendMessage.setText("\n\n هابي لاند عطا الله: مدينة تحتوي على قسم خاص بالنسبة للأطفال من  ٣ إلى ٧ سنوات ، ومنطقة العمل المتميزة للبالغين، ولديها ألعاب داخليَّة وخارجيَّة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.6178999,39.1085014  \n" );
            }
            else if(data.equals("مدينة فن تايم")){
                sendMessage.setText("\n\n مدينة فن تايم الترفيهية : هو مركز الترفيه العائلي، مخصص للأطفال الصغار، وهناك أيضاً العديد من أكشاك الطعام المتاحة لبيع البيتزا والسندويشات والكعك.\n\n" + "\n  https://www.google.com/maps/search/?api=1&query=21.593133,39.106782  \n" );
            }
            else if(data.equals("كيدزانيا")){
                sendMessage.setText("\n\n كيدزانيا جدة: هي مدينة متكامله بنيت خصيصا للأطفال تقع في مول العرب البوابة ٦ الدور الثاني، إلى جانب الألعاب والمرح سيتمكن الطفل من ممارسة وتعلم الكثير من الأعمال، سيمكنه العمل كطبيب أو ضابط شرطة وكثير من الوظائف الأخرى، يوجد بها مناطق للراحة والطعام والتسوق والهدايا التذكارية.\n\n" + "\n https://goo.gl/maps/KczBQKio9Qq4zc5DA \n" );
            }
            else if(data.equals("تشيكي تشيز")){
                sendMessage.setText("\n\n تشكي تشيز: مركز ترفيهي للأطفال (ملاهي، مدينة ألعاب، مطعم) في آن واحد.\n\n" + "\n https://goo.gl/maps/7gxqvHjEtCx4CJig9 \n" );
            }
            else if(data.equals("مدينة الشلال")){
                sendMessage.setText("\n\n مدينة الشلال الترفيهية: حديقة لديها مناطق الترفيه المختلفة مع المناظر الطبيعيَّة الخلابة، وتحوي ألعاب الأطفال وقاعة البولينج.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.567957,39.111062 \n" );
            }
            else if(data.equals("مدينة الملك عبدالله")){
                sendMessage.setText("\n\n مدينة الملك عبدالله: تقع مدينة الملك عبد الله الاقتصادية على بعد 100 كم شمال جدة بمحاذاة ساحل البحر الأحمر وتتميز بكونها مدينة حديثة ووجهة سياحية واعدة، ويمكن هناك قضاء وقت ممتع على الممشى الشاطئي المناسب للدراجات أو شاطئ يام ذي الرمال الناعمة الذي يقدم مجموعة متنوعة من الرياضات المائية.\n\n" + "\n https://goo.gl/maps/xcir4pKqLobZ26fm9 \n" );
            }
            else if(data.equals("حديقة الإرادة")){
                sendMessage.setText("\n\n حديقة الإرادة لذوي الاحتياجات الخاصة : حديقة مزودة بنظام ري آلي، كما تم تهيئتها بـ ٣٠ جلسة و ألعاب للأطفال ، و مسرح للعروض التعليمية والثقافية وجدارية للرسم، ومنطقة مفتوحة ذكية مزوّدة بشبكة واي فاي للإنترنت وملعب تم تنفيذه بمواصفات خاصة .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5315114,39.1763891 \n" );
            }
            else if(data.equals("نادي الغربية للطيران")){
                sendMessage.setText("\n\n نادي الغربية للطيران الشراعي: يقدم رحلات على الهيلوكوبتر وطيران شراعي ، موقع النادي مميز وقريب من البحر الذي يتيح لك نظرة بانوراميه على مدينة جدة. \n" +
                        "موقع نادي الغربية: western-sky.club\n\n\n" + "\n https://goo.gl/maps/uZSy7nAeyvRD6V3g8 \n \n" );
            }

            // التسوق - جدة
            else if(data.equals("الأندلس مول")){
                sendMessage.setText("\n\n الأندلس مول: يتميز المول بوجود مختلف الماركات الشهيرة ، و ردهة المطاعم ، وملاهي للأطفال،  وسوبر ماركت ، و ذلك يوجد فعاليات تقام في داخل المول.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5069508,39.2179026 \n" );
            }
            else if(data.equals("برستيج مول")){
                sendMessage.setText("\n\n برستيج مول: يشمل المركز محلات أزياء لمصمّمين بارزين، و أيضاً يضم كافيهات ومطاعم عالمية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5656065,39.12502680000001 \n" );
            }
            else if(data.equals("اويسس مول")){
                sendMessage.setText("\n\n اويسس مول: مبنى اويسس مول يتألف من أحد عشر طابقاً ، يضم مختلف الفعاليات السياحية والتجارية ، يمكن التسوق في  اويسس مول بكل راحة وقضاء وقت ممتع بين جنباته.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5120508,39.1946211 \n" );
            }
            else if(data.equals("هيفاء مول")){
                sendMessage.setText("\n\n هيفاء مول: هو مجمع تجاري بتصميم حديث، يحتوي على محلات ومطاعم ومقاهي مميزة ومتنوعة التي تناسب جميع أفراد العائلة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5274311,39.1773201 \n" );
            }
            else if(data.equals("جدة مول")){
                sendMessage.setText("\n\n جدة مول: يعتبر من أهم وأرقى المراكز التجارية في مدينة جدة ،  لما ينفرد به من موقع متميز في اهم احياء بجدة ( شارع التحلية ) ،  بالإضافة الى التصميم الخارجي والداخلي للمركز بالشكل الذى يعطى حرية من التحرك.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5487135,39.1495404 \n" );
            }
            else if(data.equals("أنا غير مول")){
                sendMessage.setText("\n\n أنا غير مول : من افخم مولات جدة بشكل عام، علاوةً عن احتوائه مجموعة مميزة من أشهر الماركات المحلية والعالمية، وباقة من أرقى المطاعم والكافيهات والمرافق الخدمية الحديثة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5513948,39.143573 \n" );
            }
            else if(data.equals("بولفار")){
                sendMessage.setText("\n\n بولفار: يتمتع بتصميمٍ معماري مبتكر، تم استلهامه من مجمعات مدينة فلوريدا الأمريكية ليحاكي أشهر مراكز الموضة فيها ، حيث يرسّخ مفهوماً جديداً وعصرياً للتسوق من خلال ممراته وجاداته ذات المناظر الطبيعية الهادئة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5697675,39.12451250000001 \n" );
            }
            else if(data.equals("البلد")){
                sendMessage.setText("\n\n سوق البلد: تعرض منطقة البلد القديمة بفنها المعماري الغالب عليه المباني من الطوب والخشب، ويشتهر السوق بكثرة دكاكينه الكبيرة والصغيرة التي تكتظ عن آخرها بالأقمشة بمختلف أنواعها وألوانها، إلى جانب الملابس والهدايا، مما يجعل منه أحد أفضل الأسواق الشعبية في جدة.\n\n" + "\n https://goo.gl/maps/eAiqfMJApN8Jc7xKA \n" );
            }
            else if(data.equals("البساتين مول")){
                sendMessage.setText("\n\n البساتين مول: يشتهر بالعصرية وفخامة التصميم المعماري، أما من حيث المكونات التسوقية الداخلية؛ فهو مُشتمل على فروع لماركات عالمية شهيرة بجانب العلامات التجارية المحلية، إلى جانب مجموعة عريضة من المطاعم والكافيهات صاحبة السُمعة الحسنة.\n\n" + "\n https://goo.gl/maps/67wMeHQHSWRyCLsX8 \n" );
            }
            else if(data.equals("التحلية مول")){
                sendMessage.setText("\n\n التحلية مول: أحد مولات جده الفخمه والحديثة النشأة نوعًا ما القائمة بالشارع الأهم والأبرز بمدينة جدة، شارع التحلية، يحتوي على أعدادًا كبيرة من المحلات التجارية والمطاعم والكافيهات المحلية والعالمية، بالإضافة إلى مساحات أمامية شجرية.\n\n" + "\n https://goo.gl/maps/bJBPjsxGKo9LTNm19 \n" );
            }
            else if(data.equals("رد سي مول")){
                sendMessage.setText("\n\n الردسي مول: هو أحد أكبر المراكز التجارية بمدينة جدة فهو يمتلك فندق حائز على خمسة نجوم، يحتوي  تشكيلة واسعة من الماركات العالمية، و المطاعم و وسائل الترفيه للشباب و الأطفال.\n\n" + "\n https://goo.gl/maps/GFBjKZiyu5s3MbKb6 \n" );
            }
            else if(data.equals("مول العرب")){
                sendMessage.setText("\n\n مول العرب: من أهم المراكز في جده حيث يتميز بمساحته الهائلة التي تحتوي على طابقين، والعديد من المطاعم والمقاهي المميزة.\n\n" + "\n https://goo.gl/maps/gda13cseu4GZHJRR8 \n" );
            }
            else if(data.equals("عزيز مول")){
                sendMessage.setText("\n\n عزيز مول: هو مجمع تجاري ذو طابقين يحتوي على جميع المستلزمات العائلية، ومحلات تجارية ذات ميزة عالمية ترفيهية للأجواء العائلية الممتعة ومنطقة مخصصة للمطاعم.\n\n" + "\n https://goo.gl/maps/VZae6pe6R67pCNkf8 \n" );
            }
            else if(data.equals("الياسمين مول")){
                sendMessage.setText("\n\n الياسمين مول: هو مجمّع تجاري ذو طراز عصري يوفر للزائرين والمقيمين خدمات متطورة، ومطاعم وكافيهات متنوعة ومناسبة للأجواء العائلية.\n\n" + "\n https://goo.gl/maps/CGSjd2dtA6EHvo647 \n" );
            }
            else if(data.equals("صيرفي ميجا مول")){
                sendMessage.setText("\n\n صيرفي میجا مول: يضم كل ما يحتاجه الزائر من ماركات عالمية، محلات تجارية وهایبر مارکت، بالإضافة إلى توفیر طابق كامل لأكبر مركز ألعاب وترفيه للأطفال وللكبار ويضم العديد من محلات ومتاجر الماركات العالمية الشهيرة.\n\n" + "\n https://goo.gl/maps/rKeiJYq6Scspmria6 \n" );
            }
            else if(data.equals("لو شاتو مول")){
                sendMessage.setText("\n\n لو شاتو مول: تقدم محلات لو شاتو أزياء نسائية ورجالية ذات ألوان وتصاميم مميزة وبجميع المقاسات بالإضافة إلي تشكيلات واسعة من الأحذية والحقائب والإكسسوارات.\n\n" + "\n https://goo.gl/maps/9w1qpcoZ58EqNZKa6 \n" );
            }
            else if(data.equals("ستارز أفينيو")){
                sendMessage.setText("\n\n ستارز افينيو: يعتبر من المولات المهمة حيث اشتهر بالماركات النادرة من محلات المجوهرات العمالية، محلات ملابس، الأحذية، الشنط، المكياج، كما انه يحتوي على العديد من المقاهي والكافيهات العالمية والمحلية.\n\n" + "\n https://goo.gl/maps/4fjuK8ZCqZQaD4Cq6 \n" );
            }
            else if(data.equals("سوق حراء الدولي")){
                sendMessage.setText("\n\n سوق حراء الدولي: من أكبر المجمعات التجارية، يحتوي على عدد كبير من المحلات، والمتاجر لبضائع ومنتجات محلية، وعالمية، إضافة للكثير من المطاعم، ومرافق الخدمات، وصالات الألعاب، والترفيه، وتناول الأطعمة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.6157401,39.15407330000001 \n" );
            }
            else if(data.equals("مركز الخياط")){
                sendMessage.setText("\n\n مركز الخياط: من أكثر الوجهات الراقية لزوار شارع التحلية وهو واحد من أول المراكز والتي تعتبر من أفضل الوجهات الرئيسية لماركات الأزياء الفاخرة.\n\n" + "\n https://goo.gl/maps/u63NakkvzQUTH6a16 \n" );
            }
            else if(data.equals("مركز الكورنيش")){
                sendMessage.setText("\n\n مركز الكورنیش: هو أحد أعرق وأقدم مراكز التسوق في مدينة جدة في المملكة العربية السعودية، والذي يعتبر بوابة التجارة لكامل مدينة مكة المنورة ويتكون من 8 طوابق، كل طابق منه يقدم العديد من الخدمات المميزة والبضائع الفريدة وبالتأكيد بأسعار مغرية.\n\n" + "\n https://goo.gl/maps/8ur73vvbJTLYnoA28 \n" );
            }
            else if(data.equals("السلام مول")){
                sendMessage.setText("\n\n السلام مول: يحتوي على مزيج من محلات التجزئة المتطورة والمرافق الترفيهية، حيث يضم أكثر من ٣٥٠ متجرًا تحت سقف واحد، وهايبرماركت، ومطاعم، ومقاهي، ومحلات ذات نشاطات متعددة، ومحلات تجارية لعلامات تجارية عالمية.\n\n" + "\n  https://goo.gl/maps/SDA3qLfuEa6dyY5j6 \n" );
            }
            // الطبيعة والبيئة - جذة
            else if(data.equals("أكوا بارك")){
                sendMessage.setText("\n\n اكوا بارك: أحد افضل منتزهات جدة ،  يأتيها العديد من الزوار سواء من السكان المحليين أو السياح من مختلف البلدان ،  وتتميز بمرافق خدمية ممتازة ومتطورة ، لقضاء وقت ممتع سواء للكبار أو الصغار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2455334,40.3634072 \n" );
            }
            else if(data.equals("فقيه أكواريوم")){
                sendMessage.setText("\n\n فقيه اكواريوم : يعتبر فقيه اكواريوم أحد اجمل اماكن السياحة في جدة، يضم عدة احواض مائية منها :  انواع مختلفة من الاسماك ، منها الصغير ،  ومنها الكبير كأسماك القرش ،  واسد البحر ،  والفقمة، ويعتبر من اهم حدائق جدة الترفيهية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5722338,39.109632 \n" );
            }
            else if(data.equals("كورنيش جدة")){
                sendMessage.setText("\n\n كورنيش جدة: أحد أهم معالم السياحة في جدة، يمتد على طول ساحل البحر الأحمر، على الجانب الغربي لمدينة جدة. وهو من أكبر الواجهات البحرية، يتميز بوجود الكثير من المراكز التجارية، الملاهي، المطاعم، المنتزهات، الفنادق العالمية الرائعة والمنتجعات السياحية الفاخرة. كما يوجد به نافورة جدة المُبهرة.\n\n" + "\n https://goo.gl/maps/fjXm65rJxQc74BRm6 \n" );
            }
            else if(data.equals("نافورة الملك فهد")){
                sendMessage.setText("\n\n نافورة الملك فهد: تُشاهَد نافورة الملك فهد، الواقعة على ساحل البحر الأحمر، من كل مكان في جدة، كما هي من المعالم السياحية الأكثر شعبية في المدينة. وبفضل ارتفاعها، الذي يبلغ 312 مترًا، حيث إنها أطول نافورة في العالم، توجد أماكن كثيرة يمكن مشاهدة عرض نافورة الملك فهد منها، ولكن الكورنيش هو أفضل المواقع.\n\n" + "\n https://goo.gl/maps/7Z8bMduXcRg7nGeu8 \n" );
            }
            else if(data.equals("غواصين بحر الصحراء")){
                sendMessage.setText("\n\n غواصين بحر الصحراء: يٌعد منتجع غواصين بحر الصحراء واحد من أهم و أفضل عشرة سواحل للغوص في العالم، حيث يُمكنك تعلم الغوص من خلال أمهر الغواصين المُختصين.\n\n" + "\n https://goo.gl/maps/2azbuk7S8H1o5BBJ7 \n" );
            }
            else if(data.equals("منتزه ذهبان")){
                sendMessage.setText("\n\n منتزه ذهبان البحري : يحتوي على مساحات طبيعية واسعة تطل على البحر، مزودة بجميع المرافق والخدمات، التي تجذب إليها الزوار و السكان المحليين، فيعُد هذا المنتزه وجهة ترفيهية للعائلة.\n\n" + "\n https://goo.gl/maps/x61DUL1L8G8AETZj8 \n" );
            }
            else if(data.equals("الحديقة المائية")){
                sendMessage.setText("\n\n الحديقة المائية: تُعد مكان حيوي للسياحة في عروس البحر الأحمر وتُعتبر هذه الحديقة الرائعة مركزًا ترفيهيًا، وتتمتع بألعاب مُثيرة، ومسابح مختلفة، ومرافق حديثة ومتطورة.\n\n" + "\n https://goo.gl/maps/pPrs8yy5itwYsdUAA \n" );
            }
            // التراث والثقافة - جدة
            else if(data.equals("البلد")){
                sendMessage.setText("\n\n سوق البلد: تعرض منطقة البلد القديمة بفنها المعماري الغالب عليه المباني من الطوب والخشب، ويشتهر السوق بكثرة دكاكينه الكبيرة والصغيرة التي تكتظ عن آخرها بالأقمشة بمختلف أنواعها وألوانها، إلى جانب الملابس والهدايا، مما يجعل منه أحد أفضل الأسواق الشعبية في جدة.\n\n" + "\n https://goo.gl/maps/eAiqfMJApN8Jc7xKA \n" );
            }
            else if(data.equals("جدة التاريخية")){
                sendMessage.setText("\n\n جدة التاريخية: تعرف محلياً بإسم جدة البلد ،  لديها عدداً من المعالم والمباني الأثرية والتراثية، مثل آثار سور جدة ، وحاراتها التاريخية ، كما يوجد بها عدد من المساجد التاريخية ، إضافة إلى الأسواق التاريخية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.4888583,39.1857913 \n" );
            }
            else if(data.equals("متحف درويش سلامه")){
                sendMessage.setText("\n\n متحف درويش سلامه: حول درويش سلامه بيته إلى ورشة عمل كبيرة لصنع مجسمات البيوت التراثية التي انتشرت داخل البيت وخارجه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.527099,39.1596019 \n" );
            }
            else if(data.equals("متحف الفنون المنزلية")){
                sendMessage.setText("\n\n متحف الفنون المنزلية: يحتوي المتحف على مجموعة من الأثاث الأثري الذي يصل عمره إلى ما يزيد عن ٧٠ سنة ، وعند الدخول إلى متحف الفنون المنزلية ، و يتوسطها مجسّم للحرمين الشريفين.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.52092069999999,39.1550775 \n" );
            }
            else if(data.equals("مدينة الطيبات")){
                sendMessage.setText("\n\n مدينة الطيبات للعلوم والمعرفة: هي مدينة أنشئت للعلوم والمعرفة عام  ١٤٠٨ هـ  ، وبلغ عدد المباني فيها ١٢ مبنى مجهزًا بأحدث وأفضل محتويات المكتبات العلمية والمتاحف المتخصصة،  وتضم المدينة معالم حضارية للعالم وتاريخ المملكة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5812175,39.1769051 \n" );
            }
            else if(data.equals("متحف عبدالرؤوف")){
                sendMessage.setText("\n\n متحف عبدالرؤوف حسن خليل: هو عبارة عن متحف لعرض المقتنيات الأثرية على ثلاثة قطاعات ، وتكمن أهميته في عرض المحتويات الأثرية التي يرجع تاريخ بعضها إلى عهد قديم جداً.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5487586,39.16799109999999 \n" );
            }

            // الطائف
            //الأماكن السياحية - الطائف
            else if(data.equals("جبل لبنان")){
                sendMessage.setText("\n\n جبل لبنان: يُعد جبل لبنان وجهة سياحية للسياح في بالطائف، حيث يعتبر هذا الجبل أعلى قمة في جبال الهدا، ويتميز بنسمات الهواء الباردة والارتفاع الشاهق إضافة إلى إطلالته على طريق الكر السياحي وطريق وادي نعمان.\n\n" + "\n https://goo.gl/maps/T6jV21a1LWTyWo94A \n" );
            }
            else if(data.equals("وادي وج")){
                sendMessage.setText("\n\n وادي وج: وادي يقع في محافظة الطائف ويسمى بـ وادي المحرم بالهدا.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.3960552,40.5454436 \n" );
            }
            else if(data.equals("منتزه الردف")){
                sendMessage.setText("\n\n منتزه الردف: متنزه تم تصميمه وإنشاؤه ليلبي احتياجات الزوار المحليين والدوليين ، ويتوسط المتنزه بركة النوافير التي تتراقص على أنغام الموسيقى المحلية والعالمية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2297589,40.42487859999999 \n" );
            }
            else if(data.equals("فوهة الوعبة")){
                sendMessage.setText("\n\n فوهة الوعبة البركانية: حفرة عميقة في الأرض،  بقطر دائري يبلغ ٣ كيلومترات وبعمق ٣٨٠ متراً ، وهي الأكبر من نوعها في الشرق الأوسط.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=22.9010939,41.1391637 \n" );
            }
            else if(data.equals("جبال الهدا والشفا")){
                sendMessage.setText("\n\n جبال الهدا والشفا: تشتهر الجبال  بطبيعتها الجميلة، وتعتبر من أهم المصائف الموجودة بالمملكة العربية السعودية، حيث يقصدها السياح باستمرار من جميع الدول.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.3608564,40.2963659 \n" );
            }
            else if(data.equals("مزرعة الفراولة")){
                sendMessage.setText("\n\n مزرعة الفراولة: لتعيش تجربة قطف الفراولة بكل تفاصيلها وأيضا تتضمن المزرعة ماهو اكثر من ذلك كبحيرة البط وبحيرة الأسماك ومتاجر مختلفة وجلسات للاستمتاع بالمكان.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.34696539999999,40.2926027 \n" );
            }
            else if(data.equals("جبل دكا")){
                sendMessage.setText("\n\n جبل دكا: يعد جبل دكا أكبر جبال مدينة الطائف غرب المملكة العربية السعودية، ويقع هذا الجبل على بعد 20 كيلو متراً جنوب غربي الطائف، ويطل على مركز الشفا السياحي.\n\n" + "\n https://goo.gl/maps/hWSa4xqvRNTMqEg6A \n" );
            }
            else if(data.equals("حديقة الردف")){
                sendMessage.setText("\n\n حديقة الردف: هي من الحدائق الهامة التي تقع في المملكة، حيث انها تقع على مساحة تتعدى خمسمائة ألف متر مربع، وتصميم الحديقة من التصميمات الرائعة، فتم تصميمه بطرق مبتكرة كثيرة ويوجد بها الكثير من الخدمات الرياضية والترفيهية وأيضا التثقيفية التي يتم تقديمها لأهل المدينة وأيضا للزوار.\n\n" + "\n https://goo.gl/maps/PLL1Yxn6321ZJJQ59 \n" );
            }
            else if(data.equals("تلفريك الهدا")){
                sendMessage.setText("\n\n تلفريك الهدا: يعتبر الأكبر من نوعه على مستوى الشرق الاوسط ويستخدم التلفريك كحلقة وصل بين اعلى قمة في قرية الكر السياحية الى اسفل الجبل وتصل العربات الى ارتفاع يزيد عن ٢ كيلو متر مما يمنح الركاب فرصة جيدة  لمشاهدة طبيعة المنطقة وجبالها.\n\n" + "\n https://goo.gl/maps/Mk8WMenBa5HD8gKZ8 \n" );
            }
            else if(data.equals("وادي ذي غزال")){
                sendMessage.setText("\n\n وادي ذي غزال: يشتهر الوادي بطبيعته الخلابة، يمكنك الاستمتاع داخل وادي ذي غزالة بشلالات المياه المتعددة التي يشتهر بها، وصخوره الرائعة، ومجموعة الأشجار الخضرة والورود ذات الروائح العطرة.\n\n" + "\n https://goo.gl/maps/cExwRZGHFgHF2oAp8 \n" );
            }
            else if(data.equals("مزرعة ومصنع بن سلمان")){
                sendMessage.setText("\n\n مزرعة ومصنع بن سلمان: الورد الطائفي يهذب النّفس والرّوح، بإمكانك التعرف عليه أكثر في مزرعة بن سلمان للورد الطائفي بحيث تتميز المزرعة بتقديم إفطار وعشاء تقليدي للزوار ويوجد فيها جلسات عربية في الهواء الطلق.\n\n" + "\n https://goo.gl/maps/mQZgexGD2sGenhWbA \n" );
            }
            else if(data.equals("مصنع بيت الورد")){
                sendMessage.setText("\n\n مصنع بيت لورد الطائفي: يشتهر هذا المصنع  بزراعة الورد الطائفي الذي يستخدم في صناعة ماء عطر الورد ودهن الورد وغيرها.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.34696539999999,40.2926027 \n" );
            }
            else if(data.equals("مصنع الكمال للورد")){
                sendMessage.setText("\n\n مصنع الكمال للورد: تقع مصانع الورود في منطقة الهدا، كما أنها مفتوحة للزوار لمشاهدة طرق التقطير التقليدية وكيفية صناعة العطور من هذه الورود؛ حيث يتم تجميع الورود من المزارع وضخها في مصانع تقطير الورد واستخلاص العطور.\n\n" + "\n https://goo.gl/maps/xyNioHW6qMzFuike7 \n" );
            }
            else if(data.equals("مصنع الشيوخ للورد")){
                sendMessage.setText("\n\n مصنع الشيوخ للورد الطائفي: يعد من أهم وأفضل مصانع إنتاج عطر الورد في محافظة الطائف . يتميز ببعض المنتجات ( عطر الورد الملكي - موية الورد - المرشات - وغيرها ) ويوجد أيضاً كوفي باسم كوفي مصنع الشيوخ وكذلك جلسات مطلة على مزارع الورد.\n\n" + "\n https://goo.gl/maps/4KYMaZEzQ6fdXRwq8 \n" );
            }
            else if(data.equals("مزرعة راشد القرشي")){
                sendMessage.setText("\n\n مزرعة راشد القرشي: هي لإنتاج دهن وماء الورد الطائفي، وتتضمن جلسات حول المزرعة وكافيه..\n\n" + "\n https://goo.gl/maps/VGmoys85S7np5mYQ6 \n" );
            }
            else if(data.equals("معمل سالم بن مشيهيب")){
                sendMessage.setText("\n\n معمل سالم بن مشيهيب: مزرعة للورد الطائفي والفواكه الموسمية، يوجد بها متجر يبيع العطور وماء الورد، وأيضا جلسات في المزرعة مع تقديم القهوة أو الفطور.\n\n" + "\n https://goo.gl/maps/FzuQztkbjuR9pNmW9 \n" );
            }
            else if(data.equals("لعبة التوبوجان")){
                sendMessage.setText("\n\n لعبة التوبوجان: يُمكنك القيام بتجربة تحبس الأنفاس مع لعبة التوبوجان، المُمتدة بطول يصل إلى 1500 متر، والتي تأخذك في جولة حول المنتزه على أطراف الجبل الأخضر، حيث يسير على طريق ذو انخفاضات وارتفاعات كثيرة، لتعيش تجربة رائعة.\n\n" + "\n https://goo.gl/maps/GSwS361M9CuuAWge6 \n" );
            }
            else if(data.equals("قرية الكر السياحية")){
                sendMessage.setText("\n\n قرية الكر السياحية \"التليفريك\": يعتبر تلفريك الطائف الأكبر من نوعه على مستوى منطقة الشرق الأوسط، ويستخدم التلفريك كحلقة وصل بين أعلى قمة في قرية الكر السياحية إلى أسفل الجبل ضمن رحلة مسافتها تقارب ٤ كيلومترات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.3568821,40.2282492 \n" );
            }
            else if(data.equals("تنال للنزل السياحية")){
                sendMessage.setText("\n\n تنال للنزل السياحية: منتجع في الشفا تضم فلل وشاليهات متنوعة مقهى و كوفي شوب ألعاب مائية للأطفال جلسات حدائق مفتوحة على مدار الساعة.\n\n" + "\n https://goo.gl/maps/7tMgpm5FXka5MMdt7 \n" );
            }
            else if(data.equals("مصنع القاضي للورد")){
                sendMessage.setText("\n\n مصنع القاضي للورد الطائفي: تستطيع أن تشم عبق الماضي من خلال المجلس التراثي ، والذي يطلق عليه اسم (الديوان) وتلتمس جمال المكان، ويكتمل الاستمتاع بالتمتع برائحة عطر القاضي المشهور ، وماء الورد ، وماء الزهر، وماء الكادي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2728186,40.4085922 \n" );
            }
            //المنتزهات والترفيه - الطائف
            else if(data.equals("حديقة الملك فيصل")){
                sendMessage.setText("\n\n حديقة الملك فيصل: تتضمن الحديقة العديد من المساحات الخضراء المناسبة للنزهات، وأكثر من ٣٠ لعبة من ألعاب الترفيه المتنوعة التي تناسب كافة الأعمار .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.3690488,40.45139760000001 \n" );
            }
            else if(data.equals("منتزه الطائف الوطني")){
                sendMessage.setText("\n\n منتزه الطائف الوطني: يعتبر من أهم المناطق السياحية في السعودية المميزة بطبيعتها الجميلة ، يبرز المتنزه كمحمية طبيعية محاطة بالجبال التي تكسوها الأشجار الكثيفة والمساحات الخضراء الشاسعة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2932561,40.4941168 \n" );
            }
            else if(data.equals("منتزه الملك عبدالله")){
                sendMessage.setText("\n\n منتزه الملك عبدالله: يضم المتنزه العديد من المرافق المميزة، و٥٣ ألف متر مربع من المساحات الخضراء، و٣ نوافير مائية، وبحيرتين اصطناعيتين ، كما يتضمن المتنزه مساحات واسعة تضم مسارات عديدة لمحبي رياضة المشي، وعدد من ملاعب الأطفال.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2704725,40.45406929999999 \n" );
            }
            else if(data.equals("حديقة الحيوانات")){
                sendMessage.setText("\n\n حديقة الحيوانات: تتضمن الحديقة العديد من أنواع الحيوانات المفترسة والأليفة، وبعض الطيور البرية والجارحة، كما تضم بعض المرافق الأخرى ، مثل : المطاعم ، والمقاهي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.230296,40.4293432 \n" );
            }
            else if(data.equals("منتزه الشلال")){
                sendMessage.setText("\n\n  منتزه الشلال: يُمكن للعائلات والأصدقاء الاستمتاع بالمنتزه وذلك بقضاء وقت مُمتع في مدينة الملاهي الواسعة والمُجهزة بأفضل الألعاب الكهربائية الحديثة ذات أمان عالي والتي تنقل عنصر الإثارة والتشويق للزوّار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2894343,40.3875446 \n" );
            }
            else if(data.equals("منتزه الملك فهد")){
                sendMessage.setText("\n\n منتزه الملك فهد: يتضمن المتنزه أسواق ومحلات تجارية متكاملة، ومجموعة لا بأس بها من المقاهي والمطاعم، وجلساتٍ مصممة بأشكال هندسية مميزة ، ويتوسط المتنزه بحيرة اصطناعية ، وهي محاطة بالشلالات المائية والنوافير التي تزيد من روعة جمالها.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2944167,40.3832648 \n" );
            }
            else if(data.equals("الحكير تايم")){
                sendMessage.setText("\n\n الحكير تايم: ملاهي تقدم لجميع الأطفال والأشخاص متعة كبيرة وحقيقة، وذلك حيث أنه يوجد الكثير من الألعاب الرائعة والمخصصة لجميع الأطفال.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.245795,40.414769 \n" );
            }
            else if(data.equals("منتزه الردف")){
                sendMessage.setText("\n\n منتزه الردف: متنزه تم تصميمه وإنشاؤه ليلبي احتياجات الزوار المحليين والدوليين ، ويتوسط المتنزه بركة النوافير التي تتراقص على أنغام الموسيقى المحلية والعالمية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2297589,40.42487859999999 \n" );
            }
            else if(data.equals("منتزه روابي لاند")){
                sendMessage.setText("\n\n منتزه روابي لاند: تعد ملاهي روابي لابد من أكثر الملاهي الرائعة التي توجد في الطائف ، وتعمل على توفير الكثير من المرافق الترفيهية الرائعة والمتنوعة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.3148405,40.3602105 \n" );
            }
            else if(data.equals("منتزه الجبل الأخضر")){
                sendMessage.setText("\n\n منتزه الجبل الأخضر: واحدة من أفضل وأهم الملاهي التي توجد في الطائف ، حيث أنها مليئة ومحاطة بالطبيعة و بها عدد كبير من الألعاب الممتعة لجميع الكبار والأطفال.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.3393455,40.3428657 \n" );
            }
            else if(data.equals("تنال للنزل السياحية")){
                sendMessage.setText("\n\n تنال للنزل السياحية: منتجع في الشفا تضم فلل وشاليهات متنوعة مقهى و كوفي شوب ألعاب مائية للأطفال جلسات حدائق مفتوحة على مدار الساعة.\n\n" + "\n https://goo.gl/maps/7tMgpm5FXka5MMdt7 \n" );
            }

            // الطبيعة والبيئة - الطائف
            else if(data.equals("منتزه الشفا بارك")){
                sendMessage.setText("\n\n منتزه الشفا بارك: يحتوي على جلسات عائلية و مسطحات خضراء، العاب هوائية، العاب مائية، مسرح للطفل، مع إمكانية الطبخ و الشواء، توفر القهوة والشاهي والوجبات السريعة.\n\n" + "\n https://goo.gl/maps/7iuCjaXjdTYuNnnp9 \n" );
            }
            else if(data.equals("مزرعة الفراولة")){
                sendMessage.setText("\n\n مزرعة الفراولة: لتعيش تجربة قطف الفراولة بكل تفاصيلها وأيضا تتضمن المزرعة ماهو اكثر من ذلك كبحيرة البط وبحيرة الأسماك ومتاجر مختلفة وجلسات للاستمتاع بالمكان.\n\n" + "\n https://goo.gl/maps/iZYXNtE7pWCv4uKP7 \n" );
            }
            else if(data.equals("تلفريك الهدا")){
                sendMessage.setText("\n\n تلفريك الهدا: يعتبر الأكبر من نوعه على مستوى الشرق الاوسط ويستخدم التلفريك كحلقة وصل بين اعلى قمة في قرية الكر السياحية الى اسفل الجبل وتصل العربات الى ارتفاع يزيد عن ٢ كيلو متر مما يمنح الركاب فرصة جيدة  لمشاهدة طبيعة المنطقة وجبالها.\n\n" + "\n https://goo.gl/maps/Mk8WMenBa5HD8gKZ8 \n" );
            }
            else if(data.equals("لعبة التوبوجان")){
                sendMessage.setText("\n\n لعبة التوبوجان: يُمكنك القيام بتجربة تحبس الأنفاس مع لعبة التوبوجان، المُمتدة بطول يصل إلى 1500 متر، والتي تأخذك في جولة حول المنتزه على أطراف الجبل الأخضر، حيث يسير على طريق ذو انخفاضات وارتفاعات كثيرة، لتعيش تجربة رائعة.\n\n" + "\n https://goo.gl/maps/GSwS361M9CuuAWge6 \n" );
            }
            else if(data.equals("مصنع الشيوخ للورد")){
                sendMessage.setText("\n\n مصنع الشيوخ للورد الطائفي: يعد من أهم وأفضل مصانع إنتاج عطر الورد في محافظة الطائف . يتميز ببعض المنتجات ( عطر الورد الملكي - موية الورد - المرشات - وغيرها ) ويوجد أيضاً كوفي باسم كوفي مصنع الشيوخ وكذلك جلسات مطلة على مزارع الورد.\n\n" + "\n https://goo.gl/maps/4KYMaZEzQ6fdXRwq8 \n" );
            }
            else if(data.equals("مصنع الكمال للورد")){
                sendMessage.setText("\n\n مصنع الكمال للورد: تقع مصانع الورود في منطقة الهدا، كما أنها مفتوحة للزوار لمشاهدة طرق التقطير التقليدية وكيفية صناعة العطور من هذه الورود؛ حيث يتم تجميع الورود من المزارع وضخها في مصانع تقطير الورد واستخلاص العطور.\n\n" + "\n https://goo.gl/maps/xyNioHW6qMzFuike7 \n" );
            }
            else if(data.equals("مزرعة راشد القرشي")){
                sendMessage.setText("\n\n مزرعة راشد القرشي: هي لإنتاج دهن وماء الورد الطائفي، وتتضمن جلسات حول المزرعة وكافيه..\n\n" + "\n https://goo.gl/maps/VGmoys85S7np5mYQ6 \n" );
            }
            else if(data.equals("معمل سالم بن مشيهيب")){
                sendMessage.setText("\n\n معمل سالم بن مشيهيب: مزرعة للورد الطائفي والفواكه الموسمية، يوجد بها متجر يبيع العطور وماء الورد، وأيضا جلسات في المزرعة مع تقديم القهوة أو الفطور.\n\n" + "\n https://goo.gl/maps/FzuQztkbjuR9pNmW9 \n" );
            }
            else if(data.equals("مزرعة ومصنع بن سلمان")){
                sendMessage.setText("\n\n مزرعة ومصنع بن سلمان: الورد الطائفي يهذب النّفس والرّوح، بإمكانك التعرف عليه أكثر في مزرعة بن سلمان للورد الطائفي بحيث تتميز المزرعة بتقديم إفطار وعشاء تقليدي للزوار ويوجد فيها جلسات عربية في الهواء الطلق.\n\n" + "\n https://goo.gl/maps/mQZgexGD2sGenhWbA \n" );
            }
            // التراث والثقافة - الطائف
            else if(data.equals("سوق عكاظ التاريخي")){
                sendMessage.setText("\n\n سوق عكاظ التاريخي: يقدم السوق قيمة معرفية من خلال الندوات الثقافية،  والأمسيات الشعرية والأدبية، إضافة لتنظيم عدد من المسابقات والفعاليات الأدبية على مستوى العالم العربي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.47365259999999,40.6461575 \n" );
            }
            else if(data.equals("متحف أصالة الماضي")){
                sendMessage.setText("\n\n متحف اصالة الماضي: يقع المتحف بجوار سكن المالك ويتكون المبنى من دورين، الدور الأرضي : يوجد به مجلس الضيافة ودورات المياه والمستودع ،  أما الدور الثاني : فيوجد به المتحف.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2432424,40.4472184 \n" );
            }
            else if(data.equals("متحف الشريف")){
                sendMessage.setText("\n\n متحف الشريف: مبنى شعبي كبير ، تبلغ مساحته ٥٠٠٠ متر مربع ، ويحوي مجموعة كبيرة من القطع التراثية بجميع أنواعها، ووظائفها، ومادتها، والتي تمثل تراث منطقة الطائف.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2432424,40.4472184 \n" );
            }
            else if(data.equals("متحف قصر شبرا")){
                sendMessage.setText("\n\n متحف قصر شبرا التاريخي: يتميز المتحف بطراز معماري مزج بين الطابعين الروماني والإسلامي مع أساليب العمارة التقليدية لمنطقة الحجاز، والعمارة الإسلامية التي تظهر في الأعمدة والأقواس والرواشين والأبواب والشبابيك، وأسقفه المزينة بالنقوش الخشبية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2862529,40.4149913 \n" );
            }
            else if(data.equals("سد معاوية")){
                sendMessage.setText("\n\n سد معاوية بن ابي سفيان بسيسد: سد أثري قديم يقع جنوب شرقي الطائف في منطقة محفوظة طبيعياً.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2932786,40.4943455 \n" );
            }
            else if(data.equals("سد السملقي")){
                sendMessage.setText("\n\n سد السملقي: هو أحد السدود التاريخية في محافظة الطائف ، حيث يقع على بعد ٢٥ كم تقريباً بوادي جفن ببلاد ثماله جنوب شرق مدينة الطائف.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.1294498,40.5123305 \n" );
            }
            else if(data.equals("مسجد عبدالله ابن")){
                sendMessage.setText("\n\n مسجد عبدالله ابن العباس: من أشهر مساجد مدينة الطائف الجبلية، سمي بذلك لأنه يقع بجوار مقبرة حبر هذه الأمة وفقيهها الصحابي الجليل عبد الله بن عباس.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2718023,40.4092557 \n" );
            }
            else if(data.equals("قصر الدهلوي التراثي")){
                sendMessage.setText("\n\n قصر الدهلوي التراثي : يعتبر من أقدم القصور الاثرية في الطائف ، يتكون من ثلاثة أدوار بنيت على نسق الهندسة المعمارية المحلية الحجازية التي تراعي فنون الهندسة العثمانية والفنون الإسلامية في إنشاء القصور.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2726652,40.4002677 \n" );
            }
            else if(data.equals("بيت الكاتب التاريخي")){
                sendMessage.setText("\n\n بيت الكاتب التاريخي:  بيت تاريخي سمي بـ \" قصر النيابة\" لأن الملك فيصل بن عبدالعزيز آل سعود كان يقيم فيه أثناء فترة الصيف، واختارته دارة الملك عبدالعزيز ليكون مقرًا لمركز تاريخ الطائف.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2689872,40.399459 \n" );
            }
            else if(data.equals("مسجد القابل")){
                sendMessage.setText("\n\n مسجد القابل: من أكثر ما يميز هذا المسجد هو منارته تعتبر غاية في الجمال فشكلها اسطواني متدرج، ويمكن رؤية مجموعة من المعالم التاريخية والاثرية بالطائف من موقعه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.9620577,41.49809750000001 \n" );
            }
            else if(data.equals("مسجد الكوع التراثي")){
                sendMessage.setText("\n\n مسجد الكوع التراثي: يعتبر من المساجد الأثرية في مدينة الطائف، وقد طلي هذا المسجد مؤخراً بطلاء أبيض اللون، كما أنه يخلو تماماً من الزخرفة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2569991,40.3868695 \n" );
            }
            else if(data.equals("سد عكرمة التاريخي")){
                sendMessage.setText("\n\n سد عكرمة التاريخي: يعتبر هذا السد أول السدود المنفذة بالمملكة، وكان له دور إيجابي كبير في حماية مدينة الطائف من أخطار السيول .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2436049,40.3585365 \n" );
            }
            else if(data.equals("طريق كرا التاريخي")){
                sendMessage.setText("\n\n طريق كرا التاريخي:  طريق جبل كرا، أو طريق الهدا هو أحد الطرق الملتوية في السعودية وأعلاها، حيث تصل نهايته في قمة مركز الهدا عند نقطة ارتفاع تزيد عن ٢٠٠٠ متر فوق مستوى سطح البحر.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.35738079999999,40.2433903 \n" );
            }
            else if(data.equals("سوق البلد بوسط")){
                sendMessage.setText("\n\n سوق البلد بوسط الطائف التاريخي:  من أقدم الأسواق في منطقة الحجاز ، ويمتاز بتنوع معروضات المحلات التجارية، التي تتراوح ما بين المشغولات اليدوية والمنتوجات الحيوانية والمنتجات الحديثة بأشكالها.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2722593,40.4063291 \n" );
            }
            // التسوق - الطائف
            else if(data.equals("مجمع الطائف الدولي")){
                sendMessage.setText("\n\n مجمع الطائف الدولي: يضم السوق اكثر من ٣٠٠ محل تجاري ، حيث يوجد به كافة المستلزمات من ملابس وحقائب واحذية واكسسوارات وايضاً الادوات المنزلية والكهربائية، وتعتبر محلات ملابس النسائية الاكثر تواجداً في هذا السوق.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.3331805,40.5344163 \n" );
            }
            else if(data.equals("تيرا مول")){
                sendMessage.setText("\n\n تيرا مول: مركز تجاري ، تمتزج فيه الأجواء الجميلة والنوافير الراقصة ، حيث يضم السوق أفضل الماركات التجارية العالمية وأفضل المطاعم الفاخرة بالإضافة إلى منطقة الترفيه للأطفال.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.27925849999999,40.4447641 \n" );
            }
            else if(data.equals("جوري مول")){
                sendMessage.setText("\n\n جوري مول: مركز تجاري يضم مزيج مذهل من مرافق التجزئة والترفيه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.27706209999999,40.4447566 \n" );
            }
            else if(data.equals("مجمع قلب الطائف")){
                sendMessage.setText("\n\n مجمع قلب الطائف: أكبر مجمع تجاري، ترفيهي، سكني بمدينة الطائف كما يحوي على صالة ضخمة للمطاعم وكذلك صالة تزلج بمساحة ٨٠٠ متر مربع.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.286755,40.418701 \n" );
            }
            else if(data.equals("فالي سنتر")){
                sendMessage.setText("\n\n فالي سنتر: مجمع تجاري كبير يتكون من فندق إيريديوم ،  وسوبرماركت،  وسوق تجاري، ومجمع مطاعم به العديد من الاسماء التجارية العالمية، كما توجد به قاعة للسينما.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.2649904,40.4155942 \n" );
            }
            else if(data.equals("العبيكان مول")){
                sendMessage.setText("\n\n العبيكان مول: أكبر المجمعات التجارية في مدينة الطائف ، ويمتاز بوجود العديد من المرافق التجارية والترفيهية لجميع أفراد العائلة وأيضا يوجد منطقة واسعة للألعاب الترفيهية المناسبة للأطفال، وأيضا شاطئ الألعاب الرملية الذي يعتبر أكبر شاطئ للألعاب في مدينة الطائف.\n\n" + "\n https://goo.gl/maps/U7DraaXogBQyjzG8A \n" );
            }
            else if(data.equals("المصيف مول")){
                sendMessage.setText("\n\n المصيف مول: الوجهة الرئيسية للكثير من الماركات كما يقدم تجربة في التسوق; فريدة من نوعها، وخلق بيئة رائعة للتسوق والترفيه التي تناسب جميع العائلة.\n\n" + "\n https://goo.gl/maps/p88VZhxprWmCWmJB9 \n" );
            }
            else if(data.equals("سوق عكاظ")){
                sendMessage.setText("\n\n سوق عكاظ التاريخي: يقدم السوق قيمة معرفية من خلال الندوات الثقافية،  والأمسيات الشعرية والأدبية، إضافة لتنظيم عدد من المسابقات والفعاليات الأدبية على مستوى العالم العربي.\n\n" + "\n https://goo.gl/maps/8czDcMfvXvrdifNu7 \n" );
            }
            // الأماكن السياحية - القنفذة
            else if(data.equals("وادي شسع")){
                sendMessage.setText("\n\n وادي شسع: يتميز الوادي بجمال الطبيعة الخلابة والإرث الحضاري ومن أشهر الأماكن السياحية في السعودية  ، ويبرز بتنوع فريد بزراعة الأشجار البرية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.1907235,41.51775009999999 \n" );
            }
            else if(data.equals("كورنيش القنفذة")){
                sendMessage.setText("\n\n كورنيش القنفذة: يتميز الكورنيش العديد من المميزات منها :  جلسات عائلية، ٦ مواقع العاب أطفال، مسطحات خضراء، ساحة للمهرجانات، نافورة راقصة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.1404925,41.07088299999999\n \n" );
            }
            else if(data.equals("جزيرة جبل الصبايا")){
                sendMessage.setText("\n\n جزيرة جبل الصبايا: هي إحدى الجزر في البحر الأحمر تقع جنوب محافظة القنفذة، وتعد من أهم المعالم الأثرية التاريخية، حيث تعد الجزيرة الوحيدة من بين  ٦٨ جزيرة كانت مأهولة بالسكان إلى ما قبل ٦٥ عاماً تقريباً.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=18.5814655,41.0646026 \n" );
            }
            else if(data.equals("بحيرة سد وادي")){
                sendMessage.setText("\n\n بحيرة سد وادي قنونا: يعد من أكبر أودية تهامة السعودية، يمتاز هذا الوادي بغزارة مياهه وعذوبتها وبكثرة بساتينه وتنوع محاصيله الزراعية التي منها القمح والدخن والسمسم والتي كانت تنتج بكميات تجارية سابقاً، ويشتهر كذلك بزراعة النخيل.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.5135446,42.7305178 \n" );
            }
            // الأماكن السياحية - رابغ
            else if(data.equals("جزيرة الرمال")){
                sendMessage.setText("\n\n جزيرة الرمال: كورنيش بحري توجد به جلسات مظلات ومسطحات خضراء.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=22.7906701,39.0189623 \n" );
            }
            else if(data.equals("مرسى القوارب واليخوت")){
                sendMessage.setText("\n\n مرسى القوارب واليخوت بالبيلسان:  تجربة فريدة من نوعها لمحبي اليخوت ، حيث به نطاقًا واسعًا من النشاطات وخدمات الضيافة منها : تأجير اليخوت، و أيضاً خدمات إضافية مثل : الصيد، و الغوص،  للحجز  التواصل من خلال البريد الالكتروني.   Info@baylasunmarina.com \n\n" + "\n https://www.google.com/maps/search/?api=1&query=22.4060856,39.08382409999999 \n" );
            }
            else if(data.equals("حديقة جمان بارك")){
                sendMessage.setText("\n\n حديقة جمان بارك: حديقة تناسب كل أفراد العائلة غنية بالمساحات الخضراء المبهجة، حيث بها  ملعب الغولف المصغّر، ملاعب التنس والكرة الطائرة، ملاعب الأطفال، وغيرها.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=22.4053134,39.0818184 \n" );
            }
            else if(data.equals("منتزه الالعاب المائية")){
                sendMessage.setText("\n\n منتزه الألعاب المائية اكوافن: منتزه للألعاب المائية، المكان المثالي لمحبي النشاطات المائية والتحدي لقضاء أروع اللحظات لكل أفراد العائلة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=22.396262,39.0836433 \n" );
            }
            else if(data.equals("حديقة الفنون الخضراء")){
                sendMessage.setText("\n\n حديقة الفنون الخضراء: تقدم الحديقة لزوارها أجواءً ممتعة في مساحة من الإبداع، تجمع بين جمال الطبيعة والأعمال الفنية المختلفة، تم تشكيل الأعمال الفنية من النباتات والأشجار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=22.40046,39.078578 \n" );
            }
            else if(data.equals("كورنيش البيلسان")){
                sendMessage.setText("\n\n كورنيش البيلسان: كورنيش و ممشى في \" مدينة  الملك عبدالله الاقتصادية \" ، حيث يوفر العديد من الأنشطة منها : السباحة،  ايجار الدراجات الهوائية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=22.4027004,39.076487 \n" );
            }
            // حائل
            // الأماكن السياحية - حائل
            else if(data.equals("جبل سلمى")){
                sendMessage.setText("\n\n جبل سلمى : يبعد عن مدينة حائل بنحو 60 كم، ويمتد من الشمال الشرقي وأعلى قمة فيه تبلغ 1200 م عن سطح البحر.\n\n" + "\n https://www.google.com/maps/search/api=1&query=24.7533561,46.8035514 \n" );
            }
            else if(data.equals("جبل أجا")){
                sendMessage.setText("\n\n جبل أجا : سلسلة تمتد من الجنوب الغربي إلى الشمال الشرقي، وتتخلل هذا الجبل شعاب كثيرة وداخلها بعض القرى الصغيرة والعيون والنخيل، وله قمم شامخة .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7378058,46.8239582 \n" );
            }
            else if(data.equals("صخرة أبو الهول")){
                sendMessage.setText("\n\n صخرة أبو الهول الحائلي : تقع صخرة أبو الهول في قرية أبا الحيران، وهو يشبه تمثال أبو الهول حارس الإهرامات بمصر بشكل كبير ومذهل.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.1626274,46.43811669999999 \n" );
            }
            else if(data.equals("منتزه السمراء")){
                sendMessage.setText("\n\n منتزه السمراء :  يتميز بوجود المساحات الخضراء الشاسعة حيث يمكن ممارسة الرياضة و التنزه و الجلوس مع العائلة والأصدقاء واقامة حفلات الشواء، ويوجد أعلى الجبل مناظر تخطف الأنفاس حيث يمكنك رؤية المدينة بأكملها و يوجد بالمنتزه نوافير و اماكن لصيد الاسماك .\n\n" + "\n \n" + "https://www.google.com/maps/search/?api=1&query=27.5221691,41.72044159999999 \n" );
            }
            else if(data.equals("بوليفارد حائل")){
                sendMessage.setText("\n\n بوليفارد حائل: مجمع تجاري يقع على أهم الشوارع التجارية حركة وتنمية مخصصة للمطاعم والمقاهي بالإضافة إلى المساحات التجارية الخارجية.\n\n" + "\n https://www.google.com/maps/place/27%C2%B027'47.9%22N+41%C2%B039'22.3%22E/@27.4632929,41.6561946,15z \n" );
            }
            else if(data.equals("منتزه أجا بارك")){
                sendMessage.setText("\n\n منتزه أجا بارك: منتزه يخدم العائلات والأفراد، يتوفر به مرافق عدة كالشاليهات، مسابح، وجلسات، ألعاب كهربائية، دراجات نارية، ركوب الخيل ومسرح أطفال، كما يوجد مقاهي شعبية وأخرى.وأماكن تقديم الطعام. ويقام فيه فعاليات عدة من حين إلى آخر.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.5631687,41.6882217 \n" );
            }
            else if(data.equals("منتزه المغواة")){
                sendMessage.setText("\n\n منتزه المغواه : يتميز بموقعه وسط الجبال و البحيرات التي تعطيه جوا لطيفا وهادئا، و مناظر طبيعية خلابة، كما يوجد به سوق شعبي لعرض السلع التراثية، و التحف ويوجد به ألعاب ترفيهية للأطفال و أماكن للجلوس، و مساحات خضراء شاسعة، و يقام به الكثير من الفعاليات و المهرجانات .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.5533568,41.65044109999999 \n" );
            }
            else if(data.equals("منتزه مشار")){
                sendMessage.setText("\n\n منتزه مشار : يقع في أحضان جبال أجا يتميز بغطائه النباتي من أشجار الطلح وغيرها، وبالأودية والشعاب التي تمر به وفيه جلسات مميزة للعائلات ومواقع للشواء وأماكن مخصصة للعب للأطفال كما يمكنك مزاولة بعض الرياضات الخفيفة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.570371,41.6186456 \n" );
            }

            // التسوق - حائل
            else if(data.equals("سلمى مول")){
                sendMessage.setText("\n\n سلمى مول : يحتوي علي عدد كبير من المحلات التجارية يصل إلي 60 محلا تجاريا متنوعا ما بين الملابس والإكسسوارات والأحذية و الساعات و غيرها الكثير، و يوجد عدداً من المقاهي والمطاعم حيث يمكنك تناول وجبات لذيذة وقضاء وقت ممتع مع العائلة او الاصدقاء، ويحتوي ايضا على مركز ترفيهي للأطفال .\n\n" + "\n https://www.google.com/maps/place/27%C2%B029'33.5%22N+41%C2%B041'55.4%22E/@27.4926432,41.6987301,15z \n" );
            }
            else if(data.equals("جراند مول")){
                sendMessage.setText("\n\n جراند مول : يتكون المول من دورين وفي أجنحة كل دور محلات تجارية لبيع الملابس بأنواعها وأخرى مختصة بالعطورات ومساحيق التجميل والمجوهرات والأثاث المنزلي، المول عصري ورحب والممرات فيه واسعة ومفتوحة بين الدورين وتنتشر بها كشكات للقهوة والعصائر والأكلات الخفيفة .\n\n" + "\n https://www.google.com/maps/place/27%C2%B028'26.6%22N+41%C2%B040'38.5%22E/@27.474067,41.6773622,15z \n" );
            }
            else if(data.equals("المصنع الوطني للدلال")){
                sendMessage.setText("\n\n المصنع الوطني للدلال: لصناعة دلال القهوة من النحاس الأصفر أو الأحمر، وتُصنع الدلال بأشكال وألوان وأحجام عديدة، كما أن عليها نقوشا مختلفة للزينة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.530104,41.7055097 \n" );
            }
            else if(data.equals("الحديقة مول")){
                sendMessage.setText("\n\n الحديقة مول : يتكون من 3 طوابق و يضم عدد كبير جدا من المحلات التجارية المتنوعة، و التي تحمل مختلف العلامات التجارية سواء العالمية أو المحلية ويبلغ عددها 49 محلا متنوعا ما بين الملابس النسائية، وملابس الرجال، والأطفال و الإكسسوارات والأحذية والحقائب، ومستحضرات التجميل  وغيرها .كما يوجد مركز ترفيهي عائلي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.5542747,41.681457 \n" );
            }
            else if(data.equals("سوق الحرف حائل")){
                sendMessage.setText("\n\n سوق الحرف والصناعات اليدوية : سوق شعبي يفوح برائحة الماضي الأصيل لبيع المنتجات المصنوعه يدويا.\n\n" + "\n  https://www.google.com/maps/search/?api=1&query=20.0109734,41.462112 \n" );
                // التراث والثقافة - حائل

            }else if(data.equals("منازل حاتم الطائي")){
                sendMessage.setText("\n\n منازل حاتم الطائي الأثرية : يعد قصر حاتم الطائي من أهم المواقع الثقافية؛ نظراً لارتباط اسمه بسيرة حاتم الطائي وبقبيلة طيء التي عاشت في هذا المكان، إضافة إلى ذلك يمكن للزائرمشاهدة قبر حاتم الطائي وقبر ابنته ابجانب القصر، ويمكن مشاهدة مكان موقد النار الذي كان حاتم الطائي يضيئه ليلاً لإرشاد الضيوف إلى بيته.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.4658415,41.7003317 \n" );
            }
            else if(data.equals("متحف حائل الإقليمي")){
                sendMessage.setText("\n\n متحف حائل الإقليمي : متحف مملوك لهيئة المتاحف السعودية، ويقع المتحف في مدينة حائل، صالة المدخل: تحتوي على آية قرآنية توضح علاقة الدين بالدراسات الآثارية، ونبذة مختصرة عن آثار السعودية، وعرض صور لأهم المعالم الأثرية والتاريخية بالسعودية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.4773092,41.69785069999999 \n" );
            }
            else if(data.equals("قلعة أعيرف التاريخية")){
                sendMessage.setText("\n\n قلعة أعيرف التاريخية : تقع قلعة أعيرف التاريخية في قلب مدينة حائل فوق قمة جبل يشرف على المدينة، والذي تنسب إليه تسميه القلعة بهذا الاسم. يُعتقد أن القلعة قد بنيت في عام 1840. وتمتاز بموقعها الذي يسهل رؤيتها من كافة أنحاء المدينة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.5170707,41.7034705 \n" );
            }
            else if(data.equals("متحف لقيت للماضي أثر")){
                sendMessage.setText("\n\n متحف لقيت للماضي أثر : يحتوي علی المعروضات المتفردة بنوعية تراثية محددة، كل منها ينقلك لتاريخ وأحداث حقب زمنية بقيت شواهدها في هذا المتحف، لتنبئ الأجيال بفخامة تاريخنا وروعته بكل ما فيه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.5160904,41.70268730000001 \n" );
            }
            else if(data.equals("قلعة القشلة التاريخية")){
                sendMessage.setText("\n\n قلعة القشلة التاريخية: هو قصر تاريخي بني في عهد الملك عبد العزيز آل سعود، ثم أضيف إليه المسجد ومبنى السجن وبعض الملحقات الأخرى واستخدم القصر منذ إنشائه وحتى سنة 1375 للهجرة كمقرٍ للحامية العسكرية في المنطقة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.5192058,41.6942615 \n" );
            }
            else if(data.equals("المطعم والمتحف التراثي")){
                sendMessage.setText("\n\n المطعم والمتحف التراثي : هو مطعم تراثي مِن الدرجةِ الأولى، عبارة عن متحف مبني بالطين، ومسقوف بخشب الأثل ومكون من طابقين، و 35 غرفة، وعلى السطح توجد جلسات ليلية تُطلع على معالم حائل السياحية، والأثرية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.5218204,41.6957095 \n" );
            }
            else if(data.equals("متحف ومقهى أجا")){
                sendMessage.setText("\n\n متحف ومقهى أجا و سلمى : مُتحف ومقهى تراثي يهتم بالموروث الشعبيّ ويضم العديد من التراثيات والصور القديمة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.48585450000001,41.66536989999999 \n" );
            }
            else if(data.equals("متحف الضويلي للتراث")){
                sendMessage.setText("\n\n متحف الضويلي للتراث : يقع المتحف داخل بناء حديث يتكون من دورين تضم ضمن تقسيماتها صالة عرض للقطع النادرة والثمينة وكذلك عدة أقسام ذات أسقف مقببه حيث يتم عرض جميع المقتنيات تحت تلك القباب.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.5525775,41.6734669 \n" );
            }
            // الحائط
            // الأماكن السياحية - الحائط
            else if(data.equals("حرة بني رشيد")){
                sendMessage.setText("\n\n حرة بني رشيد البركانية بالجبل الرأس الأبيض : وتتكون من سلسلة جبال بركانية سوداء اللون على درجة كبيرة من الارتفاع، وهي مجموعة حرار تختلف عن بعضها من حيث الشكل، إلا أنها تتكون من صخور سوداء صعبة المسالك إلا من طرق خاصة بها تسمى بالمنقار، ويقع بالوسط منها جبل أبيض اللون يسمى بالرأس الأبيض.\n\n" + "\n https://www.google.com/maps/place/25%C2%B040'08.2%22N+39%C2%B056'47.6%22E/@25.6817543,39.9398034,13z \n" );
            }
            // التراث والثقافة - الحائط
            else if(data.equals("نقوش راطا")){
                sendMessage.setText("\n\n نقوش راطا والمنجور : تم اكتشاف الموقع الاثري في راط والمنجور، وهذان الموقعان بما يحتويانه من نقوش ورسومات صخرية متنوعة، يعدان من أقدم المواقع الأثرية المكتشفة كون أن هذه الرسومات التاريخية تعود لنمط حضاري واحد مستندا في ذلك إلى التشابه الكبير بين ما تضمه هذه المواقع من رسومات ونقوش صخرية .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.4140851,49.660449 \n" );
            }
            else if(data.equals("سوق الحائط القديم")){
                sendMessage.setText("\n\n سوق الحائط القديم : هذا السوق يعد وجهة سياحية مميزة حيث يلتقي السائح والزائر للحائط بكم هائل من جمال المكان وتنوع الحرف وجودتها ومناسبة سعرها.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.98234399999999,40.4750976 \n" );
            }
            else if(data.equals("قرية فدك الاثرية")){
                sendMessage.setText("\n\n قرية فدك الأثرية :  تعد إحدى أقدم المدن في شبة الجزيرة العربية واشتهرت بالعيون وزراعة النخيل. اشتهرت بأسوارها وقلاعها وحصونها التي اعتبرت شاهد على حضارتها حيث يعتبر سورها الكبير أضخم سور في مملكتنا الغالية .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.9784488,40.4701248 \n" );
            }
            else if(data.equals("نقوش الشويمس")){
                sendMessage.setText("\n\n نقوش الشويمس : منطقة الشويمس منطقة إدارية تضم نقوش وكتابات أثرية منحوته على الصخور الصلبة وتشمل هذي النقوش رسوما لأشكال آدمية وحيوانية يرجع تاريخها إلى أكثر من 10 آلاف سنة قبل الميلاد وهي من الحقبة الثمودية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.1550566,40.2552345 \n" );
            }
            // الشنان
            // التراث والثقافة - الشنان
            else if(data.equals("مدينة فيد الاثرية")){
                sendMessage.setText("\n\n مدينة فيد الأثرية التاريخية : تعتبر فيد من المدن التاريخية القديمة، حيث تعود لعصر ما قبل الإسلام، وهناك دلائل أثرية مازالت باقية،من أهمها مجموعة من الرسوم الصخرية والنقوش والكتابات القديمة التي عُمِلت على واجهات الجبال المجاورة لمدينة فيد.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.1136271,42.5264409 \n" );
            }
            else if(data.equals("قصر الفيصل التاريخي")){
                sendMessage.setText("\n\n قصر الفيصل التاريخي بالسبعان : في بلدة السبعان الواقعة (جنوب شرق مدينة حائل 65 كلم) يظل القصر صامدا متماسكة أجزاؤه على الرغم من تقادم السنين التي مرت عليه، وهذا يعود إلى إحكام بنائه.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.0437358,41.9769238 \n" );
            }
            else if(data.equals("قصر العنفان التاريخي")){
                sendMessage.setText("\n\n قصر العنفان التاريخي بالسبعان: ييضم مسجداً يوجد في أسفله ما يعرف بـ «الخلوة» وفي المقابل تبقى حيطان القصر التي تحيط بالقصر متماسكة صامدة على الرغم من عدم ترميمها على مدار السنوات الماضية، ولا يوجد فيها إلا مدخل واحد يفضي إلى ساحة القصر وأقسامة يدخل من خلالها أهل القصر والضيوف وركائبهم لتحط رحالها فيها.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.0398675,41.974602 \n" );
            }
            else if(data.equals("مركز عبداللطيف جميل")){
                sendMessage.setText("\n\n مركز عبداللطيف جميل للتراث والآثارفي فيد : تم تصميم هذا المتحف على غرار قلعة فيد والقصور الصحراوية الأخرى، يتم عرض الآثار التي استخرجت من المواقع الأثرية القريبة من مدينة فيد التاريخية. تم الكشف عن الجدران السوداء من الصخور البركانية وترميمها بعناية، لإعطاء الزوار لمحة عن القلعة والمنازل التي شيدت هنا قديماً.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5977993,39.1962978 \n" );
            }
            // جبه
            // التراث والثقافة - جبه
            else if(data.equals("متحف قصر النايف")){
                sendMessage.setText("\n\n متحف قصر النايف التراثي : المتحف عبارة عن دور أرضي واسع مقسم إلى سبعة أجزاء مختلفة المساحات يضم ما يقارب 2165 قطعة تقريبا. وتشمل المقتنيات أدوات القهوة، وبعض الملابس والحلي وأدوات الزينة النسائية القديمة وكذلك أدوات الخياطة والمصنوعات الجلدية، كما يشمل مجموعة من الاسلحة وأدوات الحرب.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.0309493,40.9400851 \n" );
            }
            else if(data.equals("متحف العيادة التراثي")){
                sendMessage.setText("\n\n متحف العيادة التراثي : متحف تراثي يتكون من بيت طيني قديم ومسجد تراثي, ويوجد العديد من الفعاليات التراثية داخل المزرعة, ومنها تقديم الهجانة عرضًا للهجن, كما يمكن الاطلاع على آلية السقيا قديمًا عبر ضخ الماء.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.02807799999999,40.93608849999999 \n" );
            }
            else if(data.equals("نقوش جبل")){
                sendMessage.setText("\n\n نقوش جبل أم سنمان: سمي جبل أم سنمان بهذا الاسم نسبة لشكله كونه يشبه إلى حد كبير الناقة ذات السنامين وهي مستقرة في الأرض. وتتميز رسوم ونقوش هذين الجبلين بمشاهد غنية للحياة اليومية للإنسان والحيوان اللذين استوطنا هذه المنطقة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=28.0129468,40.914825 \n" );
            }
            // نجران
            // الأماكن السياحية - نجران
            else if(data.equals("منتزه النافورة الراقصة")){
                sendMessage.setText("\n\n منتزه النافورة الراقصة: يحتوي على المسطحات الخضراء الواسعة ، واماكن مخصصة للجلوس كما تحتوي على اماكن العاب للأطفال، ويتميز بوجود نافورة تعدُّ الأجمل في العالم تعمل على غرار نافورة دبي ونافورة لاس فيغاس.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.879102,44.2055331 \n" );
            }
            else if(data.equals("محمية عروق بني معارض")){
                sendMessage.setText("\n\n محمية عروق بني معارض: تتميز بمجموعة من النظم البيئية الصحراوية المتمثلة في البيئات الرملية والهضاب الجيرية وتتخللها بعض الأودية التي تنتشر بها النباتات الحولية وشبة الحولية والمعمرة مما أضفى عليها طبيعة خلابة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.33693809999999,45.9039661 \n" );
            }
            else if(data.equals("قرية مدماك")){
                sendMessage.setText("\n\n قرية مدماك التراثية السياحية: قرية سياحية نموذجية يوجد بها: مطعم، كوفي، ضيافة مناسبات خاصة، صالة مؤتمرات وفعاليات، متجر للتراثيات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.5416473,44.279293 \n" );
            }
            else if(data.equals("غابة سقام")){
                sendMessage.setText("\n\n غابة سقام: تعد من الأماكن الأروع والأجمل التي توجد في الجهة الجنوبية في منطقة نجران ويعد من المنتزهات السياحية .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.4924426,44.21032779999999 \n" );
            }
            // التسوق - نجران
            else if(data.equals("سوق الحرف نجران")){
                sendMessage.setText("\n\n سوق الحرف والصناعات اليدوية: يحتوي السوق على العديد من الصناعات التي تعكس ذوق ومهارة الحرفيين, وتنوع ثقافاتهم, وأذواقهم.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=20.0109734,41.462112 \n" );
            }
            else if(data.equals("نجران سيتي سنتر")){
                sendMessage.setText("\n\n نجران سيتي سنتر: يضم عددا كبيرا جدا من المحلات التجارية و التي تحمل اسم الماركات العالمية أو المحلية .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.5388886,44.2144386 \n" );
            }
            else if(data.equals("سوق الجنابي والخناجر")){
                sendMessage.setText("\n\n سوق الجنابي والخناجر الشعبي: يشتهر ببيع الخناجربالإضافة إلى جانب المصنوعات الجلدية وهناك أيضًا محلات بيع المشغولات الفضية التراثية، طواحين ومتاجر بيع الحبوب الطازجة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.4899148,44.1288001 \n" );
            }
            // التراث والثقافة - نجران
            else if(data.equals("قصر أبو ساق")){
                sendMessage.setText("\n\n قصر أبو ساق كحيلان الأثري: قصر قديم مبني على الطراز النجراني، مكون من سبعة أدوار تحيط به المزارع والخضره من جميع الاتجاهات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.5810831,44.440914 \n" );
            }
            else if(data.equals("متحف شعيب دحضه")){
                sendMessage.setText("\n\n متحف شعيب دحضه: يحتوي على الأدوات الحجرية والدلائل الأثرية الذي تثبت قِدم الاستيطان البشري في منطقة نجران، والتي تعود إلى أكثر من مليون سنة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.516542,44.1551704 \n" );
            }
            else if(data.equals("قرية ال منجم")){
                sendMessage.setText("\n\n قرية آل منجم التراثيه: وهي من أقدم القرى بالمنطقة، ويحيط بها سور ضخم مع 3 بوابات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=21.5598339,39.222683 \n" );
            }
            else if(data.equals("مدينة الأخدود الاثرية")){
                sendMessage.setText("\n\n مدينة الأخدود الأثرية: قرية أثرية تاريخية، تستقبلك العظام الهشة والرماد الكثيف الشاهد على المحرقة الهائلة التي حدثت فيها، وبقايا الرسوم القديمة بنقوشها المختلفة، كاليد البشرية، المنحوتة على الصخور، والأحجار الكبيرة، والرحى العملاقة وبقايا المسجد أحد أبرز تلك الآثار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.4774955,44.1793098 \n" );
            }
            else if(data.equals("متحف نجران الإقليمي")){
                sendMessage.setText("\n\n متحف نجران الإقليمي: يعد رمزاً حضارياً وتحفة معمارية تحتضنها مدينة الأخدود الأثرية، زيّن فناءه الخارجي بمجسم كبير لبيت الطين النجراني القديم الذي يسمى “الدرب”. يضم ستة قاعات للعروض المتحفية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.4777482,44.175515 \n" );
            }
            else if(data.equals("قصر العان الاثري")){
                sendMessage.setText("\n\n قصر العان الأثري: يعد قصر العان الأثري ‘’سعدان’’ الذي يقف شامخًا على قمة جبل العان، من أقدم وأشهر القصور الطينية التراثية، ويتكون القصر من 4 أدوار على طراز بناء مميز يعكس هوية وطابع المجتمع النجراني.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.4804079,44.0959695 \n" );
            }
            else if(data.equals("قلعة رعوم الاثرية")){
                sendMessage.setText("\n\n قلعة رعوم الأثرية: يعد مزارا هاما لكل من يعشقون تسلق الجبال، و من يبحثون عن المعالم التراثية ، والأماكن القديمة ببيوتها المبنية من الطين، ولمن يودون الاستمتاع بمشاهدة الطبيعة الساحرة .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=17.4691614,44.0874414 \n" );
            }
            else if(data.equals("قصر الامارة التاريخي")){
                sendMessage.setText("\n\n قصر الاماره التاريخي: . يُعد القصر من أشهر المباني التراثية مصمم على شكل قلعة ذات أسوار عالية أقيمت في أركانه الأربعة أبراج دائرية للمراقبة. ويوجد به مسجد وبئر قديمة يعود تاريخها إلى ما قبل الإسلام. القصر مبني من الطين اللبن والقش وسعف النخيل في حين تم بناء الجزء السفلي منه باللبن المحروق والجزء العلوى بالحجارة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.0234615,37.2650617 \n" );
            }
            // الأماكن السياحية - بريدة
            else if(data.equals("محمية تلنتس للطيور")){
                sendMessage.setText("\n\n محمية تلنتس للطيور: حديقة نباتية حيث يوجد بها بحيرة وطيور مختلفة بأنواعها ، و أيضاً يوجد به كافيه لقضاء جو ممتع مع العائلة.  \n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.2621144,43.9954457 \n" );
            }
            else if(data.equals("مدينة التمور ببريدة")){
                sendMessage.setText("\n\n مدينة التمور ببريدة: هو سوق موسمي يقام كل عام عندما تنضج التمور في المنطقة، ويبدأ عادة مع بداية شهر أغسطس ويستمر لشهرين إلى ثلاثة شهور.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.3123631,43.9817238 \n" );
            }
            else if(data.equals("منتزه الملك خالد")){
                sendMessage.setText("\n\n منتزه الملك خالد: يستقطب منتزه مركز الملك خالد الحضاري بمدينة بريدة ، من بعد عصر كل يوم وحتى منتصف الليل العديد من الجمهور خاصة الأسر .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=19.6197804,41.8754679 \n" );
            }
            else if(data.equals("مزرعة الصباخ السياحية")){
                sendMessage.setText("\n\n مزرعة الصباخ السياحية: هي مزرعة قديمة و وجهة سياحية للنزهات الممتعة ، والتجول بين البساتين المليئة بأشجار النخيل والخضروات العديدة ، والتي تجذب عدد كبير من الناس لشراء الخضروات والفاكهة الطازجة التي تقطف مباشرة للمشترين وبأسعار مميزة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.3592309,43.98181200000001 \n" );
            }
            else if(data.equals("مزرعة السليم السياحية")){
                sendMessage.setText("\n\n مزرعة السليم السياحية: إحدى المزارع السياحية ضمن برنامج السياحة الزراعية الريفية ، فهي منتجع حضاري بنكهة الماضي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.3281914,43.9112914 \n" );
            }
            else if(data.equals("منتجع الديرة الريفي")){
                sendMessage.setText("\n\n منتجع بريدة الريفي: يفتح أبوابه للزوار وذلك بمناسبة إقامة مهرجان تمور بريدة، والذي يشمل إقامة العديد من الفعاليات الزراعية وتواجد عروض تراثية وشعبية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=27.814107,41.63915459999999 \n" );
            }
            else if(data.equals("منتزه الملك عبدالله الوط")){
                sendMessage.setText("\n\n منتزه الملك عبدالله الوطني: هو منتزه يطل على مدينة بريده بإطلاله رائعة وذلك لتماشيه مع طبوغرافية الأرض الطبيعية  ، و الجمع بين فكرتي المنتزه البري والمنتزه الحضري ، حيث يوفر للمنتزهين دكات جلوس مطلة على المدينة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.3905054,44.0165497 \n" );
            }
            // التسوق - بريدة
            else if(data.equals("النخيل موول")){
                sendMessage.setText("\n\n النخيل مول:  أكبر مجمّع تجاري في مدينة بريدة، ويوجد فيه العديد من المعارض العالمية والمطاعم والمقاهي المتنوعة، بالإضافة إلى مساحة ترفيهية للأطفال.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7679338,46.71491289999999 \n" );
            }
            else if(data.equals("مركز النخلة التجاري")){
                sendMessage.setText("\n\n مركز النخلة التجاري: يعد مركز النخلة واجهة حضارية اقتصادية ستثري مسيرة التمور بمدينة بريدة ، وذلك نظراً للدور المؤمل أن يلعبه المركز في مجالات العرض والتدريب ونشر ثقافة تجارة النخيل بشكل عام.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7685876,46.7112563 \n" );
            }
            else if(data.equals("العثيم موول")){
                sendMessage.setText("\n\n العثيم مول: من افضل مولات منطقة القصيم ، توجد به اسواق عالمية وكذلك بعض المطاعم ، وبه العاب للأطفال ويوجد به مسرح للفعاليات الصيفية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.326675,43.989752 \n" );
            }
            else if(data.equals("مجمع الفايزي")){
                sendMessage.setText("\n\n مجمع الفايزي: من مولات بريدة الهادئة و الممتعة و الأنيقة في آن معاً ، علاوة على ذلك ، فإن إطلالة المطاعم والكافيات العلوية جميلة جداً على مدينة بريدة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.3549112,43.9546996 \n" );
            }
            else if(data.equals("النخيل بلازا")){
                sendMessage.setText("\n\n النخيل بلازا: يضم هذا المول مزيجاً متنوعاً من المحلات التجارية التي يصل عددها إلى ٢٠٠ محل ومتجر من مختلف الماركات والعلامات التجارية الشهيرة عالمياً والمرغوبة محلياً أيضاً.  \n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.3688038,43.9618772 \n" );
            }
            else if(data.equals("العمري سنتر")){
                sendMessage.setText("\n\n العمري سنتر: من المجمعات التجارية المميزة في بريدة ، كما أن المول يشغل مساحة أكثر من ٣٠ ألف متر مربع مليئة بالمحلات والمتاجر والمرافق التي تلبي احتياجات المتسوقين على كافة الأصعدة والمستويات.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.3931948,43.9390917 \n" );
            }
            // التراث والثقافة - بريدة
            else if(data.equals("متحف قصر الدبيخي")){
                sendMessage.setText("\n\n متحف قصر الدبيخي: مبني طيني على طراز البيوت التراثية النجدية القديمة ،  المتحف كان قصرًا لأسرة الدبيخي حتى رحلوا عنه إلى بيت حديث عام ١٣٩٨ هـ .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.3339957,43.93909170000001 \n" );
            }
            else if(data.equals("متحف العقيلات")){
                sendMessage.setText("\n\n متحف العقيلات: يختص المتحف بتراث العقيلات كصورهم ووثائقهم ومخطوطاتهم ومقتنياتهم ، العقيلات هي حركة تجارية تنطلق من نجد وخصوصًا القصيم نحو البلاد المتاخمة للجزيرة العربية ، يبلغ تاريخها قبل نحو  ٣٠٠عام وانتهت بترسيم الحدود.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.2987029,43.9945498 \n" );
            }
            else if(data.equals("متحف بريده")){
                sendMessage.setText("\n\n متحف بريدة: هو متحف يعرض جانب من تراث المنطقة ويحوي العديد من المقتنيات ويضم قاعات تاريخية وعلمية وثقافية وجناح لرجال العقيلات. \n\n" + "\n https://www.google.com/maps/place/26%C2%B021'00.3%22N+43%C2%B057'27.5%22E/@26.35007,43.9576397,15z \n" );
            }
            else if(data.equals("متحف المجحدي")){
                sendMessage.setText("\n\n متحف المجحدي للتراث والسيارات الكلاسيكية: يضم النخبه والعديد من السيارات الكلاسيكية. \n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.2628483,43.9989807 \n" );
            }
            // عنيزة
            // الأماكن السياحية - عنيزة
            else if(data.equals("مزرعة العبيد السياحية")){
                sendMessage.setText("\n\n مزرعة العبيد السياحية: مزرعة خالد العبيد  ، من اهم المزارع و ذلك بسبب حدوث ( مشروع التين ) الذي توسع و وصل للعالمية خلال مهرجان التين في القصيم .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.0850128,43.9757518 \n" );
            }
            else if(data.equals("مزرعة فلايح عنيزة")){
                sendMessage.setText("\n\n مزرعة فلايح عنيزه السياحية: مزرعة تعد ذات مذاق خاص ومتنوع ، إذ توفر فلايح عنيزة القديمة متعة التظلل بأشجار النخيل الكثيرة المنتشرة وسط سواقي المياه ، ومتعة التسوق للمحاصيل والخضروات الطازجة من الحقول وقطفها مباشرة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.0900762,43.9722617 \n" );
            }
            else if(data.equals("منتزه حايط الحركان")){
                sendMessage.setText("\n\n منتزه حايط الحركان التراثي الريفي: منطقة حائط حركان تقام فيه عدد من الفعاليات الترفيهية والأسواق الشعبية ينطلق شباب وشابات الوطن متسابقين للتفنن في تقديم كل ما يحتاجه السائح.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.0901109,43.9718664 \n" );
            }
            else if(data.equals("مزرعة الزنيدي السياحية")){
                sendMessage.setText("\n\n مزرعة الزنيدي السياحية: مزار سياحي تراثي عريق يمتزج مع جمال المزروعات الخضراء البديعة التي تكسو المكان ، لتوفر رحلة ممتعة في الهواء الطلق ، وتوفير الأجواء المناسبة للرحلات الجماعية في معظم أوقات العام.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.2713149,44.7430393 \n" );
            }
            // التراث والثقافة - عنيزة
            else if(data.equals("متحف الصالحي")){
                sendMessage.setText("\n\n متحف الصالحي: عبارة عن منزل طيني يعود تاريخه إلى أكثر من ستين عامًا ، ويتكون المتحف من ثلاثة ادوار مقامة على مساحة  ٣٠٠ م ، يضم المتحف العديد من المقتنيات والأدوات التراثية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.0833976,43.9627492 \n" );
            }
            else if(data.equals("متحف الحمدان")){
                sendMessage.setText("\n\n متحف الحمدان: المتحف عبارة عن مزرعة كبيرة بها عدد كبير من المباني التراثية ، تم عرض مقتنيات ذلك المتحف داخل غرف تلك المباني وفي الممرات التي بينها وذلك بأسلوب عرض منسق.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.1422113,43.96812000000001 \n" );
            }
            else if(data.equals("متحف محمد النعيم")){
                sendMessage.setText("\n\n متحف محمد النعيم: عبارة عن بيت شعبي مسقوف بالخرسانة ، يتكون من ٤ غرف وصالة عرض ، ويشمل جميع أنشطة الحياة واحتياجات الإنسان في ذلك الزمان، ويحتوي المتحف على مجموعة كبيرة من القطع التراثية.\n\n" + "\n https://www.google.com/maps/place/26%C2%B004'47.9%22N+43%C2%B059'42.2%22E/@26.079975,43.9950611,15z \n" );
            }
            else if(data.equals("بيت البسام التراثي")){
                sendMessage.setText("\n\n بيت البسام التراثي: هو أحد المنازل التراثية في عنيزة، وهو عبارة عن قصر طيني يمثل طراز العمارة القديمة فيها، بأسقف من شجر الأثل وجريد النخل، كما أنه يضم أقساماً عدّة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.089394,43.96741899999999 \n" );
            }
            else if(data.equals("سوق المسوكف التراثي")){
                sendMessage.setText("\n\n سوق المسوكف التراثي: شُيِّد سوق المسوكف الشعبي على الطراز القديم، ويتكون على عدد من المحلات التجارية وعدد من المحلات المعروفة بالدكاكين .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.089212,43.9670897 \n" );
            }
            else if(data.equals("قلعة الربيعي الاثرية")){
                sendMessage.setText("\n\n قلعة الربيعي الاثرية: من أجمل المعالم السياحية التراثية بعنيزة  ، نظراً لجمال تصميم مبانيها التي تكونت من الحجر الصخري و الطين و الخشب و جريد النخل  الذي زين القلعة و القبو و المقاصير (الأبراج) و المتحف الخاص بالقطع الأثرية و التراثية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.1009573,43.83745199999999 \n" );
            }
            // التسوق - عنيزة
            else if(data.equals("سوق التمور")){
                sendMessage.setText("\n\n سوق التمور: موسم عنيزة للتمور مصحوب بفعاليات ، حيث تتركز الفعاليات في مواقع مخصصة لرواد الأعمال من الشباب والشابات وتقع في محيط مجمع عنيزة التجاري.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.75571589999999,46.6660481 \n" );
            }
            else if(data.equals("العثيم مووول")){
                sendMessage.setText("\n\n العثيم مول: يعد من أبرز المشاريع الاستثمارية في عنيزة ، ويقام على مساحة تستوعب أكثر  من ١٠٢متجراً ،  بمساحات مختلفة بالإضافة إلى سلسلة من المطاعم المتميزة ،  ومدينة سفوري لاند الترفيهية ، وهايبر ماركت العثيم.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.1062406,43.99470609999999 \n" );
            }
            else if(data.equals("عنيزه مول")){
                sendMessage.setText("\n\n عنيزة مول: مجمع تجاري يقع في وسط محافظة عنيزة ،  ويتضمن المجمع أماكن ترفيه والعاب أطفال ، ومنطقة خاصة للمطاعم والمقاهي وكذلك مناطق مخصصة للعائلات وعادة ما تقام الأنشطة المحلية في المحافظة داخل المجمع.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.0925574,43.97405139999999 \n" );
            }
            // الرس
            // التسوق - الرس
            else if(data.equals("صحارى مووول")){
                sendMessage.setText("\n\n صحارى مول: يُعتبر من مولات الرس المُتميزة بموقعه الرائع ،  فهو يُقدم كل ما يحتاجه الزوّار من مستلزمات الحياة اليومية، حيث أنه يمتلك مجموعة من المتاجر العالمية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.7400274,46.682203 \n" );
            }
            else if(data.equals("الديرة موول")){
                sendMessage.setText("\n\n الديرة مول: يُعد من أفضل مولات الرس التي تُوفر للزائرين مُتعة التسوق والترفيه، حيث يحتوي مول الديرة بالرس على العديد من المطاعم والكافيهات التي تُقدم خدماتها الرائعة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.8689526,43.5087019 \n" );
            }
            else if(data.equals("الواحة مول")){
                sendMessage.setText("\n\n الواحة مول: يُعتبر من أفخم مولات الرس ، ويُعد أول مول تجاري تم إنشاءه على مستوى عالمي في المدينة، فهو يعتبر أكبر مول في الرس من حيث عدد المتاجر العالمية .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.897044,43.4714627 \n" );
            }
            // التراث والثقافة - الرس
            else if(data.equals("متحف راشد الغفيلي")){
                sendMessage.setText("\n\n متحف راشد الغفيلي للتراث : متحف يوجد به مجموعة واسعة من قطع تحمل في طيّاتها رحيق الماضي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6381497,46.7522824 \n" );
            }
            else if(data.equals("متحف دار الاجداد")){
                sendMessage.setText("\n\n متحف دار الأجداد: يقع المتحف داخل منزل شعبي كبير يحتوي على قاعات كبيرة وردهات وغرف ، وقد تم عرض محتويات المتحف التراثية داخل تلك الأماكن، وتتكون محتويات المتحف التراثية من أدوات القهوة كالدلال المتنوعة وطواحين القهوة وغيرها .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.8639418,43.5064096 \n" );
            }
            else if(data.equals("برج الشنانه الاثري")){
                sendMessage.setText("\n\n برج الشنانه الاثري: برج الشنانه هو الصرح الأثري الذي يحكي قصة البطولة التي أبداها أهل الرس وقوة بأسهم في التصدي للعدوان وكان شاهدا ًعلى شجاعتهم.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.8340878,43.4398704 \n" );
            }
            // المذنب
            // التراث والثقافة - المذنب
            else if(data.equals("متحف الفوزان")){
                sendMessage.setText("\n\n متحف الفوزان: محمية ومتحف الدكتور فوزان بن ابراهيم الفوزان ، موقع يقصده السياح ومحبي التراث والمهتمين بالنباتات والأشجار ، حيث تحوي المحمية اكثر من ٥٠٠٠ شجرة منوعة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.8550834,44.2397522 \n" );
            }
            else if(data.equals("متحف الطيور")){
                sendMessage.setText("\n\n متحف الطيور:عبارة عن مكان مغلق ويوجد به أشجار جميلة وأنواع من الطيور الفاتنة  ، الموقع مميز وممتع لكافة الأعمار.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.8624738,44.2289618 \n" );
            }
            else if(data.equals("قرية المذنب التراثية")){
                sendMessage.setText("\n\n قرية المذنب التراثية: هي قرية تراثية قديمة تؤكد العمق التاريخي للمذنب.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.8568978,44.22421060000001 \n" );
            }
            else if(data.equals("دار الحسياني للتراث")){
                sendMessage.setText("\n\n دار الحسياني للتراث: مبنى مستقل مبني على الطراز القديم التراثي ، و هو عبارة عن ساحة كبيرة يوجد بها مجموعة من الغرف بالإضافة إلى صالة لعرض السيارات القديمة .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.8688855,44.210317 \n" );
            }
            // البكيرية
            // التراث والثقافة - البكيرية
            else if(data.equals("مسجد الشيخ محمد بن")){
                sendMessage.setText("\n\n مسجد الشيخ محمد بن عبدالوهاب التاريخي: هو مسجد تاريخي ، يقع في مركز الهلالية التي تعتبر روضاً ومرعى خصباً، والمسجد مبني من الطين بطريقة العروق وهي الطريقة السائدة في البناء بالطين.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6297618,46.6945267 \n" );
            }
            else if(data.equals("متحف ومحمية الراجحي")){
                sendMessage.setText("\n\n متحف ومحمية الراجحي: المتحف متخصص بالمقتنيات الاثرية والتراثية النادرة ، والذي يحتوي على نماذج تحاكي اساليب الحياة القديمة ، والمحمية من الطيور المهاجرة وطيور الزينة .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.6041574,46.7130961 \n" );
            }
            else if(data.equals("مقصورة الراجحي الاثرية")){
                sendMessage.setText("\n\n مقصورة الراجحي الاثرية: اخذت المقصورة الشكل المربع ذو برج واحد وجدران سميكة، ، بنيت المقصورة للسكن وحصن متكامل الخدمات وهو مجهز بمستلزمات الحياة اليومية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.1489266,43.6703606 \n" );
            }
            else if(data.equals("مقصورة السويلم الاثرية")){
                sendMessage.setText("\n\n مقصورة السويلم الاثرية: معلماً سياحياً بارزاً في محافظة البكيرية  ، وهي  عبارة عن قصر أثري كبير يتبعه عدد من الملاحق ، وتتكون المقصورة من دورين الدور لأرضي مخصص للطعام والمخازن ، والدور الثاني كان مخصصاً للسكن.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.1522517,43.6655137 \n" );
            }
            // البدائع
            // الأماكن السياحية - البدائع
            else if(data.equals("منتزه المم")){
                sendMessage.setText("\n\n منتزه المملكة : هذا المنتزه يتميز انه يحاكي أرض المملكة بجميع مناطقها ، مما يمكِّن الزائر لها من التعرف على المعالم السياحية لها، وهو يتنزه في جنبات هذه الحديقة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=25.9472411,43.7390768 \n" );
            }
            else if(data.equals("مزرعة الحبردي السياحية")){
                sendMessage.setText("\n\n مزرعة الحبردي السياحية: هي واحدة من أهم المزاراع الحاصلة على عضوية مشروع السياحة الزراعية بمحافظة البدائع، وتعتبر المزرعة بمناظرها الخلابة وبحيرتها الاصطناعية .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.0545055,43.7847461 \n" );
            }
            // عيون الجواء
            // الأماكن السياحية - عيون الجواء
            else if(data.equals("منتزه شبة الجزيرة")){
                sendMessage.setText("\n\n منتزه شبه الجزيرة: منتزه متميز بتصميمه يوجد به ممرات وجسور مائيه وألعاب للأطفال ، فهو وجهة سياحية ممتعة للقضاء أمتع الأوقات مع العائلة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.4844387,43.6415108 \n" );
            }
            else if(data.equals("جامع ومجمع الملك ف")){
                sendMessage.setText("\n\n جامع ومجمع الملك فهد: من أحدث الجوامع وأميزها بتصميمه الهندسي وبشكله الخارجي الفريد وبعناصره ومحتوياته الداخلية المتعددة، حيث بني الجامع على طراز إسلامي فريد ومتميز.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.4915992,43.6349019 \n" );
            }
            // التراث والثقافة - عيون الجواء
            else if(data.equals("بلدة روضة الجواء")){
                sendMessage.setText("\n\n بلدة روضة الجواء التراثية: تتميز البلدة التاريخية في عيون الجواء بمنطقة القصيم بتصميمها المتميز، وتكامل عناصرها المعمارية مما يؤهلها لتكون نموذجاً للقرية النجدية المتكاملة.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=24.5519058,46.76476659999999  \n" );
            }
            else if(data.equals("قرية عيون الجواء")){
                sendMessage.setText("\n\n قرية عيون الجواء التراثية: قرية تراثية يوجد بها فعاليات تستهدف الأسرة والشباب بمختلف الأعمار، بهدف تعزيز الأجواء التنشيطية للسياحة المحلية، والتعريف بالتراث الحضاري.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.5051839,43.6265578 \n" );
            }
            else if(data.equals("صخرة عنتر وعبلة")){
                sendMessage.setText("\n\n صخرة عنتر و عبلة التاريخية: هي إحدى الشواهد التي تُشير إلى تاريخ عنترة بن شدّاد، وهي عبارة عن صخرةٍ كبيرةٍ من الحجر الرمليّ المتأثر بعوامل التعرية ، ويوجد على الصخرة العديد من رسوم الحيوانات، والنقوش الثمودية والنبطية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.5509357,43.5952883 \n" );
            }
            // رياض الخبراء
            // التراث والثقافة - رياض الخبراء
            else if(data.equals("قرية رياض الخبراء")){
                sendMessage.setText("\n\n قرية رياض الخبراء التراثية: يوجد بالقرية العديد من الفعاليات التي نفذت في الساحات المفتوحة وبالقرب من المسجد القديم داخل البلدة القديمة ، فيما فتحت المحلات التجارية القديمة أبوابها أمام الزوار وتواجد الحرفيين والباعة لبيع الهدايا التذكارية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.0533267,43.5414667 \n" );
            }
            else if(data.equals("متحف العبري للسيارات")){
                sendMessage.setText("\n\n متحف العبري للسيارات الكلاسيكية والتراث: يتكون المتحف من قاعة رئيسية ووحدتين وسواني متكاملة وساحة كبيرة، ويشمل العرض مجموعة من المقتنيات التراثية كالأسلحة والعملات والوثائق وأدوات الضيافة والقهوة العربية.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=23.5017727,40.8848522 \n" );
            }
            else if(data.equals("البلدة القديمة بالخبراء")){
                sendMessage.setText("\n\n البلدة القديمة بالخبراء: بنيت البلدة قبل أكثر من ٢٠٠ عام من الطين الحر، ما جعلها قوية في وجه الزمن وعوامل التعرية، وتضم أكثر من ٤٠٠ منزل،  بُنيت بالشكل الدائري وهي تشبه بناء بغداد في العصر العباسي.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=29.2954781,34.9508977 \n" );
            }
            // القصيباء
            // التراث والثقافة - القصيباء
            else if(data.equals("قصر المشقوق الاثري")){
                sendMessage.setText("\n\n قصر المشقوق الاثري: هو قصر مُحاط ببساتين مِن النخيل الكثيرة حتى أنه قد وصل في وقت مِن الأوقات عدد النخل الذي يُحاوط ذلك القصر إلى ٢٠٠٠ نخلة .\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.900302,43.587656 \n" );
            }
            else if(data.equals("قصر عنتر بن شداد")){
                sendMessage.setText("\n\n قصر عنتر بن شداد التاريخي: عبارة عن مبنى يعرف بقلعة عنترة بن شداد العبسي، وهو مبني على شكل قصر له أبراج وبني من الحجارة والجص.\n\n" + "\n https://www.google.com/maps/search/?api=1&query=26.8731486,43.5636446 \n" );
            }
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}

