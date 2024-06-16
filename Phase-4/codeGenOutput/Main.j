.class Main
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 128
.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
.end method
.method public start(Ljava/lang/Boolean;Ljava/lang/Integer;)V
.limit stack 128
.limit locals 128
		aload 1
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifne Label_4
		ldc 1
		goto Label_5
		Label_4:
		ldc 0
		Label_5:
		ifne Label_2
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		ldc 100
		if_icmple Label_6
		ldc 1
		goto Label_7
		Label_6:
		ldc 0
		Label_7:
		ifne Label_2
		ldc 0
		goto Label_3
		Label_2:
		ldc 1
		Label_3:
		ifeq Label_0
		aload 1
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifeq Label_8
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		ldc 30
		idiv
		invokevirtual java/io/PrintStream/println(I)V
		goto Label_9
	Label_8:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		ldc 30
		imul
		invokevirtual java/io/PrintStream/println(I)V
	Label_9:
		goto Label_1
	Label_0:
	Label_1:
		new Fptr
		dup
		aload 0
		ldc "itList"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 6
		aload 6
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		return
.end method
.method public itList()V
.limit stack 128
.limit locals 128
		new Fptr
		dup
		aload 0
		ldc "printRecursive"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 1
		aload 1
		new List
		dup
		new List
		dup
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 2
		aload 2
		ldc "ata"
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		ldc "souri"
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		ldc "javad"
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		ldc "nemati"
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		ldc "darabi"
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokespecial List/<init>(LList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		return
.end method
.method public printRecursive(LList;Ljava/lang/Integer;)V
.limit stack 128
.limit locals 128
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		ldc 5
		if_icmpne Label_12
		ldc 1
		goto Label_13
		Label_12:
		ldc 0
		Label_13:
		ifeq Label_10
		return
		goto Label_11
	Label_10:
	Label_11:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast java/lang/String
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		new Fptr
		dup
		aload 0
		ldc "printRecursive"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 4
		aload 4
		new List
		dup
		aload 1
		invokespecial List/<init>(LList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 4
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 4
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		return
.end method
.method public <init>()V
.limit stack 128
.limit locals 128
		aload 0
		invokespecial java/lang/Object/<init>()V
		new Fptr
		dup
		aload 0
		ldc "start"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 1
		aload 1
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		ldc 300
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		return
.end method