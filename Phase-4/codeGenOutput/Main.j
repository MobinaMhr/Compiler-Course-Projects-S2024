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
		ldc 60
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		ldc 60
		ldc 50
		isub
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 3
		ldc 1
		ineg
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 3
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		return
		.end method
