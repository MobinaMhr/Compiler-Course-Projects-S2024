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
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 2
		aload 2
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		ldc 10
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		ldc 7
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		ldc 100034
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		astore 1
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "list length : "
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
		invokevirtual java/util/ArrayList/size()I
		invokevirtual java/io/PrintStream/println(I)V
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 3
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "list a :"
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		Label_0:
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		aload 1
		invokevirtual java/util/ArrayList/size()I
		if_icmpge Label_3
		ldc 0
		goto Label_4
		Label_3:
		ldc 1
		Label_4:
		ifeq Label_2
		Label_2:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		iadd
		dup
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 3
		goto Label_0
		Label_1:
		return
		.end method
