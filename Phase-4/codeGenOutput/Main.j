.class public Main
		.super java/lang/Object
.method public static main([Ljava/lang/String;)V
		.limit stack 128
		.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
		.end method
.method public <init>()V
		.limit stack 128
		.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		ldc 50
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 1
		ldc 61
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		isub
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 3
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "Hello World!\n"
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "cur value c : "
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		ldc 1
		ineg
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 3
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "MINUS 1 :"
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "DIVIDE by 2 :"
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		ldc 2
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		swap
		idiv
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 3
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "MULTIPLY by 3 :"
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		ldc 3
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		imul
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 3
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "MOD 4 :"
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		ldc 4
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		swap
		irem
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 3
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		return
		.end method
