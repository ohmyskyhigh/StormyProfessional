# Stormy

NullPointerException returns when running the app

07-08 09:25:03.003 1540-1558/system_process E/KernelUidCpuTimeReader: Failed to read uid_cputime
                                                                      java.io.FileNotFoundException: /proc/uid_cputime/show_uid_stat: open failed: ENOENT (No such file or directory)
                                                                          at libcore.io.IoBridge.open(IoBridge.java:452)
                                                                          at java.io.FileInputStream.<init>(FileInputStream.java:76)
                                                                          at java.io.FileInputStream.<init>(FileInputStream.java:103)
                                                                          at java.io.FileReader.<init>(FileReader.java:66)
                                                                          at com.android.internal.os.KernelUidCpuTimeReader.readDelta(KernelUidCpuTimeReader.java:71)
                                                                          at com.android.internal.os.BatteryStatsImpl.updateCpuTimeLocked(BatteryStatsImpl.java:8031)
                                                                          at com.android.server.am.BatteryStatsService.updateExternalStats(BatteryStatsService.java:1366)
                                                                          at com.android.server.am.BatteryStatsService$BatteryStatsHandler.handleMessage(BatteryStatsService.java:125)
                                                                          at android.os.Handler.dispatchMessage(Handler.java:102)
                                                                          at android.os.Looper.loop(Looper.java:148)
                                                                          at android.os.HandlerThread.run(HandlerThread.java:61)
                                                                          at com.android.server.ServiceThread.run(ServiceThread.java:46)
                                                                       Caused by: android.system.ErrnoException: open failed: ENOENT (No such file or directory)
                                                                          at libcore.io.Posix.open(Native Method)
                                                                          at libcore.io.BlockGuardOs.open(BlockGuardOs.java:186)
                                                                          at libcore.io.IoBridge.open(IoBridge.java:438)
                                                                          at java.io.FileInputStream.<init>(FileInputStream.java:76) 
                                                                          at java.io.FileInputStream.<init>(FileInputStream.java:103) 
                                                                          at java.io.FileReader.<init>(FileReader.java:66) 
                                                                          at com.android.internal.os.KernelUidCpuTimeReader.readDelta(KernelUidCpuTimeReader.java:71) 
                                                                          at com.android.internal.os.BatteryStatsImpl.updateCpuTimeLocked(BatteryStatsImpl.java:8031) 
                                                                          at com.android.server.am.BatteryStatsService.updateExternalStats(BatteryStatsService.java:1366) 
                                                                          at com.android.server.am.BatteryStatsService$BatteryStatsHandler.handleMessage(BatteryStatsService.java:125) 
                                                                          at android.os.Handler.dispatchMessage(Handler.java:102) 
                                                                          at android.os.Looper.loop(Looper.java:148) 
                                                                          at android.os.HandlerThread.run(HandlerThread.java:61) 
                                                                          at com.android.server.ServiceThread.run(ServiceThread.java:46) 
07-08 09:25:03.004 1540-1558/system_process E/KernelWakelockReader: neither /proc/wakelocks nor /d/wakeup_sources exists
