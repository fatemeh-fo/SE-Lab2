به نام خدا

# آشنایی با اصول شئ‌گرایی (موسوم به اصول SOLID)

## بخش دوم: دستور آزمایش

### گام ۱: افزودن یک روش پیام رسانی دیگر

	تغییراتی را که در کد فعلی برنامه می‌دهید، در جدول زیر ثبت کنید و در نهایت تعداد کل تغییرات را اعلان کنید.
    - توجه: مواردی که به عنوان تغییرات باید اعلان شود شامل این موارد هستند:
      1. ساخت کلاس جدید
      2. افزودن تابع جدید به کلاس و یا واسط (برای توابع جدید صرفا اعلام تغییر کنید)
      3. هر خطوط پیاپی‌ای که در تابع main و برای افزودن یک قابلیت جدید اضافه می‌کنید. به عنوان مثال اگر سه خط را به منظور تشخیص نوع پیام اضافه می‌کنید، آن سه خط را در قالب یک تغییر اعلام کنید (البته جزییات آن را در ستون «شرحی کوتاه از تغییر» توضیح دهید).

| شرحی کوتاه از تغییر | عنوان تغییر |‌ محل اعمال تغییرات (کلاس/واسط) | ردیف|
|--:|--:|:--:|:--:|
| ساخت یک کلاس public که از MessageService ارث میبرد | ساخت کلاس سرویس مسج‌دهی تلگرام| TelegramMessageService| ۱ |
| اضافه کردن تابع sendSmsMessage در TelegramMessageService با بدنه خالی | افزودن تابع با بدنه خالی sendSmsMessage به TelegramMessageService | TelegramMessageService| ۲ |
| اضافه کردن تابع sendEmailMessage در TelegramMessageService با بدنه خالی | افزودن تابع با بدنه خالی sendEmailMessage به TelegramMessageService | TelegramMessageService| ۳ |
| اضافه کردن کلاس public به نام TelegramMessage که از Message ارث  میبرد و دارای دو field به نامهای sourceId و targetId هست. | ساخت کلاس TelegramMessage | TelegramMessage | ۴ |
| افزودن تابع void sendTelegramMessage(TelegramMessage message) به MessageService | افزودن تابع sendTelegramMessage به واسط MessageService | MessageService | ۵ |
| اضافه کردن تابع sendTelegramMessage در EmailMessageSevice با بدنه خالی | پیاده‌‌سازی تابع sendTelegramMessage با بدنه‌ی خالی | EmailMessageSevice | ۶ |
| اضافه کردن تابع sendTelegramMessage در SmsMessageSevice با بدنه خالی | پیاده‌‌سازی تابع sendTelegramMessage با بدنه‌ی خالی | SmsMessageSevice | ۷ |
| بررسی شروع شدن sourceId و targetId با حرف '@' و درصورت قبولی، پرینت کردن جمله‌ی حاوی پیام تایید ارسال | پیاده‌سازی تابع sendTelegramMessage در TelegramMessageService | TelegramMessageSevice | ۸ |
| دریافت آیدی مبدا و مقصد و محتویات پیغام تلگرامی و اجرای کلاس TelegramMessageService | افزودن امکان ارسال پیام تلگرامی | Main | ۹ |

مجموع تعداد تغییرات: ۹

### گام ۲: تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID
در خصوص این برنامه‌ای که نوشته شده بود و شما یک قابلیت به آن اضافه کردید، بر اساس اصول SOLID موارد نقض و یا محقق شدن هر کدام از آن اصول را بیان کنید. در بیان موارد تحقق و نقض، علت تحقق و یا نقض را نیز به صورت کامل توضیح دهید:

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>

در خصوص هرکدام از موارد نقض هرکدام از اصول، یک راهکار را به منظور رفع آن مشکل ارایه داده و در جدول زیر ثبت نمایید:

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>

### گام ۳: اصلاح موارد نقض
در نهایت، بر اساس تحلیلی که انجام داده‌اید و راه حل‌هایی که در بخش قبل ارایه کردید، کد را اصلاح کرده و بر روی مخزن گیت‌هاب و در پوشه‌ای مجزا از گام قبل commit و push کنید. انتظار می‌رود که تمامی راه حل‌های پیشنهادی خود را بر روی این نسخه اعمال کنید و تمامی بهبودهایی که انجام می‌دهید، در جداول بخش قبل موجود باشد.

### گام ۴: بررسی مجدد تغییرات مورد نیاز
فرض کنید که گام 1 را برای کد اصلاح شده (پس از انجام گام‌های ۲ و ۳) اجرا کرده‌اید.
1. در این صورت از انجام کدام یک از تغییرات ثبت شده در جدول گام ۱ معاف خواهید شد؟
2. تعداد تغییرات مورد نیاز، چند تغییر خواهد شد؟

### گام ۵: جمع بندی
در این بخش، بیان کنید که از این گام چه نتیجه‌ای گرفته‌اید؟ و به نظر شما به کارگیری صحیح اصول SOLID در گام‌های ۳ و ۴ چه مزایایی را نسبت به حالتی دارد که این اصول رعایت نشده‌بود؟

## نحوه ارسال پروژه:
1.	گام ۱ را انجام داده و سپس کد نوشته شده‌ی خود را (با رعایت محدودیت‌های گفته شده در گام) در یک پوشه به نام Step_1_Non_SOLID ذخیره کنید و در مخزن گام ۲ قرار دهید. موارد توضیحی بایستی در بخش README مخزن قرار گیرد.
2.	گام ۲ (که بخش تحلیلی است) در فایل README مربوط به مخزن گام ۲ آورده شود (تمام جداول با فرمت داده شده و عناوین هرکدام از سوالات پرسیده شده بایستی در README آورده شود).
3.	گام ۳ که شامل بهبود است، بایستی به صورت جداگانه در پوشه دیگری به نام Step_3_With_SOLID قرار داده شود و در مخزن موجود باشد.
4.	گام ۴ نیز در قالب توضیحات در README مخزن آورده شود.
5.	گام ۵ (که نتیجه گیری است) در README مخزن آورده شود.
