Overloading:
        - في الكلاس SimpleLocation تم استخدام Overloading في دالة distanceTo، حيث توجد دالتان بنفس الاسم:
        1) distanceTo(SimpleLocation other)
        2)distanceTo(double lat, double lon)
كلا الدالتين تحسبان المسافة لكن بتواقيع مختلفة — هذا هو مفهوم Overloading (تعدد تعريف الدوال بنفس الاسم لكن بمعاملات مختلفة داخل نفس الكلاس).

Overriding:
        - في المثال أعلاه استخدمنا الوراثة بإنشاء class Point extends SimpleLocation وقمنا بعمل @Override على دالة toString().
هذا يُمثّل Overriding: إعادة تعريف دالة متوارثة من الكلاس الأب بطريقة مختلفة في الكلاس الابن.

الفرق بين Overloading و Overriding:
        - Overloading (تعدد تعريف الدوال): يحدث داخل نفس الكلاس أو عبر وراثة أيضاً لكنه يعتمد على اختلاف المعاملات (parameter list). الاستدعاء يُحدد بحسب توقيع الدالة في وقت الترجمة (compile time).
        - Overriding (إعادة تعريف): يحدث عند وجود دالة في الكلاس الأب ونقوم بإعادة تعريفها في الكلاس الابن بنفس التوقيع (نفس الاسم ونفس المعاملات). التنفيذ يتم اختيارُه في وقت التشغيل (runtime) حسب نوع الكائن (Polymorphism).