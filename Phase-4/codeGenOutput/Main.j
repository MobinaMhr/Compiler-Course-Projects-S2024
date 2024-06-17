.class public Main
		.super java/lang/Object
.method public static main([Ljava/lang/String;)V
		.limit stack 128
		.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
		.end method
		ldc 50
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		istore 0
		ldc 60
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		istore 1
		iload0
		iload1
		nullnullimul
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		idiv
		istore 2
		iload0
		iload1
		iload2
		getstatic java/lang/System/out Ljava/io/PrintStream;
		nullnullnullimul
		iadd
		invokevirtual java/io/PrintStream/println(I)V
.method public <init>()V
		.limit stack 128
		.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		nullnullnullnullreturn
		.end method
